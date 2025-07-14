from pwn import *

p = remote("host3.dreamhack.games", 19809)

PLAINTEXT = int("7d1c4b0a", 16) # Little Endian...

p.recvuntil(b"Random number: ")
XORKEY = int(p.recvuntil(b"\n").decode("utf-8"), 16)

print(f"XORKEY: {hex(XORKEY)}")
print(f"PLAINTEXT: {hex(PLAINTEXT)}")

CIPHERTEXT = XORKEY ^ PLAINTEXT

print(f"CIPHERTEXT: {hex(CIPHERTEXT)}")

print(f"EXPECTED RESULT: {hex(XORKEY ^ CIPHERTEXT)}")

p.sendlineafter(b"Input? ", str(CIPHERTEXT).encode("utf-8"))

p.interactive()