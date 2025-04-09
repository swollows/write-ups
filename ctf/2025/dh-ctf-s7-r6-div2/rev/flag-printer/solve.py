from pwn import *

ENC_CMD = "&-17"
DEC_CMD = ""
XOR = "\x42"

for elem in ENC_CMD:
    DEC_CMD += chr(ord(elem) ^ ord(XOR))

print(DEC_CMD)

r = remote("host3.dreamhack.games", 24494)

r.sendlineafter(b'> ', b'dosu print')

FLAG = r.recvuntil(b'}').decode()

print(FLAG)