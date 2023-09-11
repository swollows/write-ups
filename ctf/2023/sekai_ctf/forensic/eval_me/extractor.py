from pwn import *

r = remote('chals.sekai.team', 9000)

r.recvuntil(b'Do it 100 times within time limit and you get the flag :)\n\n')

prob = r.recvuntil('\n', drop=True)
print(prob)
r.sendline(str(eval(prob)).encode('utf-8'))

for i in range(99):
    r.recvuntil('correct\n')
    prob = r.recvuntil('\n', drop=True)
    print(prob)
    r.sendline(str(eval(prob)).encode('utf-8'))

r.interactive()