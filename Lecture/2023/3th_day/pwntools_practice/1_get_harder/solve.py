from pwn import *

r = process('./get_harder')
#r = remote('34.64.219.95', 19502)
flag = b''

#sleep(10)

try:
    while True:
        r.recvn(100)
        flag += r.recvn(4)
except:
    print(flag)