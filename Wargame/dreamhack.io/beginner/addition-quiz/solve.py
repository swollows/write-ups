from pwn import *

# Remote
r = remote('host3.dreamhack.games', 11351)

for i in range(50):
    PROB = r.recvuntil(b'=', drop=True, timeout=10)
    print(PROB)
    r.recvuntil(b'?\n')
    ANS = bytes(str(eval(PROB)), 'utf-8')
    print(ANS)
    r.sendline(ANS)

r.interactive()