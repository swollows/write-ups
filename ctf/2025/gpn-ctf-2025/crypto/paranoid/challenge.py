from aes import AES, pad
import secrets

MODULUS = 2 ** 128 + 51

class RNG:
    def __init__(self, initial, modulus, add, mul):
        self.modulus = modulus
        self.state = initial
        self.add = add
        self.mul = mul

    def next(self) -> int:
        out = self.state
        self.state = (self.state * self.mul + self.add) % self.modulus
        return out
    
    def reseed(self, seed):
        self.state += seed

    def get_iv(self) -> bytes:
        iv = self.next()
        
        return iv.to_bytes(16)

def main():
    with open("/flag") as file:
        FLAG = file.read().strip().encode()

    MUL = secrets.randbelow(MODULUS)
    ADD = secrets.randbelow(MODULUS)
    INITIAL = secrets.randbelow(MODULUS)

    rng = RNG(INITIAL, MODULUS, ADD, MUL)
    KEY = secrets.token_bytes(16)
    aes = AES(KEY)

    flag_ct = aes.encrypt_ctr(pad(FLAG), rng.get_iv())
    print(flag_ct.hex())

    try:
        while True:
            plaintext = bytes.fromhex(input("Give me something to encrypt (hex):"))
            if len(plaintext) > 2 ** 16:
                raise ValueError("nah")
            
            ciphertext = aes.encrypt_ctr(pad(plaintext), rng.get_iv())
            print(ciphertext.hex())
            rng.reseed(int.from_bytes(plaintext[:1]))
    except EOFError:
        pass # remote disconnected, exit
    except:
        print("terminated due to error")

if __name__ == "__main__":
    main()
