from pwn import *

p = remote('13.125.44.4', 20001)

p.sendline(b'SCAN')
p.sendline(b'0')
result = p.recvuntil(b'>', drop=True)
print(result)

p.sendafter(b'Enter a command : ', b'ATTACK')
p.sendline(b'0')
result = p.recvuntil(b'>', drop=True)
print(result)