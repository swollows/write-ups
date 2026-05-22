from pwn import *

with open('md5collgen/msg1.bin', 'rb') as f:
    col1 = f.read()

with open('md5collgen/msg2.bin', 'rb') as f:
    col2 = f.read()

KEYWORD = b"Give me a document to store\n"

r = remote("socket.cryptohack.org", 13389)

r.sendlineafter(KEYWORD, col1)
r.sendlineafter(KEYWORD, col2)

r.interactive()
