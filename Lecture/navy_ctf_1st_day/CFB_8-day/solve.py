# -*- coding: utf-8 -*-
from pwn import *

r = remote('202.182.110.129', 7777)

'''
for i in range(2560):
    print('[+] Attack count = ' + str(i))
    r.sendafter(b'> ', b'1\n')
    r.sendafter(b'IV > ', b'\x00'*16 + b'\n')
    r.sendafter(b'> ', b'2\n')
'''

while 1:
    r.sendlineafter(b'> ', b'1')
    r.sendlineafter(b'IV > ', b'0'*32)
    r.sendlineafter(b'> ', b'2')
    r.sendlineafter(b'CT > ', b'0'*32)
    x = r.recvline()
    if x.find(b'Try again!') < -1:
        print(x.decode('utf-8'))
        break


# https://nakedsecurity.sophos.com/2020/09/17/zerologon-hacking-windows-servers-with-a-bunch-of-zeros/