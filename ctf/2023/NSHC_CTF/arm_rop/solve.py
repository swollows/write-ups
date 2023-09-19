from pwn import *

e = ELF('./mail')
rop = ROP(e)

libc = ELF('./libc-2.27.so')

print(e.symbols)
print(e.plt)
print(e.got)