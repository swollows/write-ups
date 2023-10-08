from pwn import *

e = ELF('./chall')
rop = ROP(e)

# Local
#r = process('./chall')
#libc = e.libc

print(hex(e.symbols['secret_function']))