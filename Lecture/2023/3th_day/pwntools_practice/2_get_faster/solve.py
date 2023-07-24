from pwn import *

#r = process('./get_faster')
r = remote('34.64.219.95', 19503)
answer = None

r.recvline()

for i in range(10):
    answer = r.recvuntil(b'\n', drop='\n')
    r.sendline(answer)

r.recvuntil(b':\n')
print(r.recvuntil(b'}'))