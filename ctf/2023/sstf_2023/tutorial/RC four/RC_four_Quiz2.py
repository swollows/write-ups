'''
from Crypto.Cipher import ARC4
from binascii import hexlify
from secret import key, flag

def encrypt(data):
	return ARC4.new(key).encrypt(data)

ct = b""
for ch in flag:
	ct += encrypt(ch)

print("Ciphertext =", hexlify(ct).decode())
'''
'''
$ python3 challenge.py
Ciphertext = 6f47474c06086f47085c47085c404d08464d505c085b5c494f4d09
'''
from binascii import unhexlify

Ciphertext = unhexlify('6f47474c06086f47085c47085c404d08464d505c085b5c494f4d09')

for i in range(256):
    flag = ""
    for ch in Ciphertext:
        flag += chr(ch ^ i)
    else:
        print(i, flag)