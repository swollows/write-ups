from Crypto.Cipher import AES
import sys
from hashlib import sha512
import random
import os 
import secrets
import string
MAX_TRIES = lambda x: len(x)*40
TEXT_FILE = "text.txt"
def getText(n=10)->str:
    lines = []
    with open(TEXT_FILE, "r") as f:
        lines = f.readlines()
    #print(len(lines), "lines loaded from text file.")
    out = ""
    for _ in range(n):
        line =secrets.choice(lines)
        line =line.split(" ",1)[1]
        out += line.strip()
    #out = "abc"*100 + "bcd"*100+"A"
    out = "".join(filter(lambda x: x in string.ascii_letters,out))
    return out

class PadServer:
    
    def __init__(self,text):
        self.queries = [0]
        self.key =  os.urandom(16)
        self.cipher = AES.new(self.key, AES.MODE_CBC)
        self.chall = text.encode("utf-8")
        for i in range(random.randint(0,4)):
                self.chall += chr(ord("A")+(os.urandom(1)[0] % 26)).encode()


        self.iv = os.urandom(16)
        #print(f"Padding is : {self.pad(self.chall).hex()}")
    def cutq(self):
        self.queries+=[0]
    def get_chall(self):
        aes = AES.new(self.key, AES.MODE_CBC, self.iv)
        return self.iv+aes.encrypt(self.pad(self.chall))
    def pad(self, s):
        padbit = 16 - len(s) % 16
        padding = bytes([padbit] * padbit)
        return s + padding
    def unpad(self, s):
        padbit = s[-1]
        padding = s[-padbit:]
        if set(padding) == {padbit}:
            return s[:-s[-1]]
        else:
            return None
    def decrypt(self, ciphertext):
        cipher = AES.new(self.key, AES.MODE_CBC, self.iv)
        plaintext = cipher.decrypt(ciphertext)

        return plaintext

    def oracle(self, ciphertext):
        self.queries[-1] += 1
        plaintext = self.decrypt(ciphertext)
        #print("oracle request decrypts to ", plaintext.hex())
        if self.unpad(plaintext) == None:
            return False
        else:
            return True

def getFlag():
    with open("/flag", "r") as f:
        return f.read().strip()
def xor(a:bytes,b:bytes)->bytes:

    ml  = max(len(a),len(b))
    a = a.ljust(ml, b'\x00')
    b = b.ljust(ml, b'\x00')
    return bytes(x ^ y for x, y in zip(a, b))

if __name__ == "__main__":
    print("Welcome to the Pad Server!")
    FLAG =getFlag()
    text =getText()
    oracle =PadServer(text)
    MAX_TRIES = MAX_TRIES(text)
    tries = 0
    print(xor(sha512(text[:-3].encode("utf-8")).digest(),FLAG.encode()).hex())

    print(oracle.get_chall().hex())
    while tries < MAX_TRIES:
        ciph = bytes.fromhex(input("speak to the oracle: "))
        if len(ciph) % 16 != 0:
            print("Ciphertext must be a multiple of 16 bytes.")
            continue
        print("Oracle says: ", oracle.oracle(ciph))
        tries+=1

