from pwn import *

r = process('./sample_send_recv')

PAYLOAD = b'A'

for i in range(3):
    r.recvuntil(b'Enter input ' + str(i + 1).encode('utf-8') + b': ')
    r.sendline(PAYLOAD)
    r.recvuntil(b'You entered: ' + PAYLOAD)

r.recvuntil(b'flag')
r.recvline()
flag = r.recvline()

print(flag)