from pwn import *
from Crypto.Hash import SHA512
import sys
import string

# BLOCK_SIZE for AES
BLOCK_SIZE = 16
POSSIBLE_CHARS = string.ascii_letters.encode()

def xor(a: bytes, b: bytes) -> bytes:
    return bytes(x ^ y for x, y in zip(a, b))

def oracle_attack(ciphertext: bytes, p: remote) -> bytes:
    """
    Performs an optimized padding oracle attack using known plaintext constraints.
    """
    iv = ciphertext[:BLOCK_SIZE]
    ct_blocks = [ciphertext[i:i+BLOCK_SIZE] for i in range(BLOCK_SIZE, len(ciphertext), BLOCK_SIZE)]
    
    ct_blocks.insert(0, iv)
    
    plaintext = b''
    
    for block_index in range(len(ct_blocks) - 1, 0, -1):
        prev_block = ct_blocks[block_index - 1]
        current_block = ct_blocks[block_index]
        
        intermediate_state = bytearray(BLOCK_SIZE)
        decrypted_block = bytearray(BLOCK_SIZE)

        progress = log.progress(f"Decrypting block {block_index}/{len(ct_blocks)-1}")

        for byte_index in range(BLOCK_SIZE - 1, -1, -1):
            padding_val = BLOCK_SIZE - byte_index
            progress.status(f"byte {padding_val}/{BLOCK_SIZE}")
            padding_craft = bytearray([i ^ padding_val for i in intermediate_state])
            
            found = False
            
            # Determine the search space for the guess 'g'.
            is_last_block = (block_index == len(ct_blocks) - 1)
            
            # For non-last blocks, we assume plaintext is ASCII letters.
            # For the last block (containing padding), we do a full bruteforce.
            guess_candidates_g = []
            if not is_last_block:
                for pt_char_code in POSSIBLE_CHARS:
                    g = (pt_char_code ^ prev_block[byte_index]) ^ padding_val
                    guess_candidates_g.append(g)
            else:
                guess_candidates_g = range(256)

            for g in guess_candidates_g:
                craft_block = bytearray(b'\x00' * byte_index) + bytes([g]) + padding_craft[byte_index+1:]
                test_ct = craft_block + current_block
                
                p.sendlineafter(b"speak to the oracle: ", test_ct.hex().encode())
                response = p.recvline()

                if b"True" in response:
                    # False positive check for robustness
                    if byte_index > 0:
                        craft_block_verify = craft_block[:]
                        craft_block_verify[byte_index-1] ^= 0x01
                        test_ct_verify = craft_block_verify + current_block
                        p.sendlineafter(b"speak to the oracle: ", test_ct_verify.hex().encode())
                        response_verify = p.recvline()
                        if b"False" in response_verify:
                            continue # False positive, try next guess

                    found = True
                    intermediate_byte = g ^ padding_val
                    decrypted_block[byte_index] = intermediate_byte ^ prev_block[byte_index]
                    break

            if not found:
                # If our ASCII-only assumption failed for a non-last block,
                # we must fallback to full bruteforce for that specific byte.
                if not is_last_block:
                    log.warning("ASCII assumption failed for a byte. Falling back to full bruteforce.")
                    for g in range(256):
                        if g in guess_candidates_g: continue # Don't repeat guesses
                        
                        craft_block = bytearray(b'\x00' * byte_index) + bytes([g]) + padding_craft[byte_index+1:]
                        test_ct = craft_block + current_block
                        p.sendlineafter(b"speak to the oracle: ", test_ct.hex().encode())
                        response = p.recvline()

                        if b"True" in response:
                            if byte_index > 0:
                                craft_block_verify = craft_block[:]
                                craft_block_verify[byte_index-1] ^= 0x01
                                test_ct_verify = craft_block_verify + current_block
                                p.sendlineafter(b"speak to the oracle: ", test_ct_verify.hex().encode())
                                response_verify = p.recvline()
                                if b"False" in response_verify:
                                    continue
                            found = True
                            intermediate_byte = g ^ padding_val
                            decrypted_block[byte_index] = intermediate_byte ^ prev_block[byte_index]
                            break

            if not found:
                progress.failure("Failed to find byte")
                log.error("Failed to find byte, something is wrong.")
                sys.exit(1)

            intermediate_state[byte_index] = intermediate_byte

        plaintext = decrypted_block + plaintext
        progress.success(f"Decrypted: {bytes(decrypted_block)}")
        
    return plaintext

def solve():
    while True:
        try:
            context.log_level = 'info'
            p = remote("newville-of-forceful-glory.gpn23.ctf.kitctf.de", 443, ssl=True)
            
            p.recvuntil(b"Welcome to the Pad Server!\n")
            xored_flag = bytes.fromhex(p.recvline().strip().decode())
            log.info(f"Received XORed Flag: {xored_flag.hex()}")
            
            challenge_ct = bytes.fromhex(p.recvline().strip().decode())
            log.info(f"Received Challenge Ciphertext (len={len(challenge_ct)}): {challenge_ct.hex()}")

            padded_chall = oracle_attack(challenge_ct, p)
            
            p.close()
            log.info("Connection closed. Starting local computation.")

            pad_len = padded_chall[-1]
            chall = padded_chall[:-pad_len]
            log.success(f"Decrypted chall: {chall}")

            for i in range(5):
                log.info(f"Trying with suffix length: {i}")
                if i == 0:
                    text = chall
                else:
                    text = chall[:-i]

                key_material = text[:-3]
                h = SHA512.new(key_material).digest()
                
                flag = xor(h, xored_flag)
                
                try:
                    decoded_flag = flag.decode()
                    if decoded_flag.startswith("GPNCTF{") and decoded_flag.endswith("}"):
                        log.success(f"Found FLAG: {decoded_flag}")
                        return # Exit the solve function and the loop
                except UnicodeDecodeError:
                    pass
            # If no flag found after trying all suffixes, restart the process
            log.warning("Flag not found with this challenge. Retrying...")

        except (EOFError, ConnectionResetError):
            log.warning("Connection closed by server. Retrying with a new session...")
            if 'p' in locals() and p:
                p.close()
            continue
        except Exception as e:
            log.error(f"An unexpected error occurred: {e}")
            if 'p' in locals() and p:
                p.close()
            break


if __name__ == "__main__":
    solve() 