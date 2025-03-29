import base64
import sys
import hashlib
from pwn import remote, context

#context.log_level = 'debug'

if len(sys.argv) <= 1:
    print("Usage: python3 client.py <filepath>")
    exit()

try:
    elf = base64.b64encode(open(sys.argv[1], "rb").read())
except:
    print("[-] Error!")
    exit()


REMOTE_IP = "127.0.0.1"
REMOTE_PORT = 4321

r = remote(REMOTE_IP, REMOTE_PORT)

def solvepow(x, target):
    x = bytes.fromhex(x)
    target = bytes.fromhex(target)
    for i in range(256**3):
        if hashlib.md5(x + i.to_bytes(3, "big")).digest() == target:
            return x.hex()+hex(i)[2:]

line = r.recvuntil(b"\n")
x = line.split(b" = ")[1][:26].decode("utf-8")
target = line.split(b" = ")[2][:32].decode("utf-8")
r.sendlineafter(b"Give me X: ", bytes(solvepow(x, target), "utf-8"))

r.sendlineafter(b"> ", elf)

r.interactive()