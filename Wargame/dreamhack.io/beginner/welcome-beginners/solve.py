from pwn import *

# Remote
r = remote('host3.dreamhack.games', 15069)

print(r.recvuntil(b' : '))
r.send(b'Dreamhack')

r.interactive()