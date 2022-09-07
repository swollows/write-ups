'''
from Crypto.Cipher import AES

key = b'ABCDABCDABCDABCD'
nonce = b'POWERNONCE123456' * 8
cipher = AES.new(key, AES.MODE_GCM, nonce=nonce)
enc1, tag1 = cipher.encrypt_and_digest(b"\0" * 1024)

flag = bytes.fromhex(input("> "))
cipher = AES.new(key, AES.MODE_GCM, nonce=flag)
enc2, tag2 = cipher.encrypt_and_digest(b"\0" * 1024)

if (enc1, tag1) == (enc2, tag2):
    print("CORRECT!")
    print(f"Flag: FLAG{{{flag.hex()}}}")
else:
    print("WRONG!")
'''

from Crypto.Cipher import AES

key = b'ABCDABCDABCDABCD'
nonce = b'POWERNONCE123456' * 8
cipher = AES.new(key, AES.MODE_GCM, nonce=nonce)
enc1, tag1 = cipher.encrypt_and_digest(b"\0" * 1024)




'''
flag = bytes.fromhex(input("> "))
cipher = AES.new(key, AES.MODE_GCM, nonce=flag)
enc2, tag2 = cipher.encrypt_and_digest(b"\0" * 1024)

if (enc1, tag1) == (enc2, tag2):
    print("CORRECT!")
    print(f"Flag: FLAG{{{flag.hex()}}}")
else:
    print("WRONG!")
'''