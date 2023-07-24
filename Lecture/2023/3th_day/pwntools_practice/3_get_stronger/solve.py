from pwn import *

#r = process('./get_stronger')
r = remote('34.64.219.95', 19504)
flag = b''

try:
    while True:
        r.recvuntil(b':')
        flag += r.recv(4)
except:
    print(flag)