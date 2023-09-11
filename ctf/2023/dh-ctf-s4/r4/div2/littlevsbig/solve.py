from pwn import *

r = remote('host3.dreamhack.games', 23025)

r.recvuntil(b'Input: ')
r.sendline(b'hmrd):kc')

r.interactive()