from Crypto.Util.number import *
from Cryptodome.Cipher import AES
from pwn import *

import base64
import hashlib
import random
import socket

r = remote('172.18.0.2', '10012')
r.recvuntil(b'Here are the two base values we will agree on:\n')

r.recvuntil(b'p: ')
P_byte = r.recvuntil(b'\n', drop=b'\n')
P = int(P_byte.decode('utf-8'))

r.recvuntil(b'g: ')
G_byte = r.recvuntil(b'\n', drop=b'\n')
G = int(G_byte.decode('utf-8'))

while True:
    a = getRandomRange(2, P-2)
    if GCD(a, P-1) == 1:
        break

A = pow(G, a, P)

r.recvuntil(b'Your computed value : ')
r.sendline(str(A))
r.recvuntil(b'Server computed value : ')

B_byte = r.recvuntil(b'\n', drop=b'\n')
B = int(B_byte.decode('utf-8'))

r.recvuntil(b'Digest the string of the shared key to MD5 bytes to build an AES-128-ECB-PKCS7 key to decrypt the following base64 encoded message:\n')
base64_flag = r.recvuntil(b'\n', drop=b'\n')

print('A : ' + str(A))
print('B : ' + str(B))
print('P : ' + str(P))
print('G : ' + str(G))
print(base64_flag)

shared_key = pow(B, a, P)

md5_hasher = hashlib.md5()
md5_hasher.update(str(shared_key).encode())
key_hash_bytes = md5_hasher.digest()

aes_cipher = AES.new(key_hash_bytes, AES.MODE_ECB)

encrypted_flag = base64.b64decode(base64_flag)
decrypted_flag = aes_cipher.decrypt(encrypted_flag)
print(decrypted_flag)