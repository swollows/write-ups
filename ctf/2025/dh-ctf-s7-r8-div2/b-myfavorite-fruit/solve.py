from pwn import *

p = process('./main')

ANS_LIST = [b'banana', b'strawberry', b'erwin', b'mandarin', b'melon']

for ans in ANS_LIST:
    sleep(1)
    p.sendline(ans)
    sleep(1)

p.recvuntil(b'Here is the flag: ')

print(p.recvuntil(b'\n', drop=True))