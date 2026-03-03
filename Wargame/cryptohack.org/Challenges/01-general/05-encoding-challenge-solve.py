# Encoding Challenge write-up
# 1. decode base64 to b64decode() function
# 2. decode hex to bytes.fromhex() function
# 3. decode rot13 to codecs.decode(SOMETHING, "rot13") function
# 4. decode bigint to long_to_bytes() function
# 5. decode ord list to chr() function
# 6. repeat 100 times

from Crypto.Util.number import *
from pwn import *
import base64
import codecs
import json

HOST = "socket.cryptohack.org"
PORT = 13377

r = remote(HOST, PORT)

for i in range(100):
    MSG = r.recvuntil(b'\n', drop=True)
    DATA = json.loads(MSG.decode("utf-8"))

    TYPE = DATA["type"]
    ENC_ANS = DATA["encoded"]

    print(i, TYPE, ENC_ANS, type(ENC_ANS))

    if (TYPE == "base64"):
        ANS = (base64.b64decode(ENC_ANS)).decode("utf-8")
    elif (TYPE == "hex"):
        ANS = (bytes.fromhex(ENC_ANS)).decode("utf-8")
    elif (TYPE == "rot13"):
        ANS = codecs.decode(ENC_ANS, "rot13")
    elif (TYPE == "bigint"):
        ANS = long_to_bytes(int(ENC_ANS, 16)).decode("utf-8") 
    elif (TYPE == "utf-8"):
        ANS = "".join([chr(elem) for elem in ENC_ANS]) 
    else:
        print("Something is wrong... Try again")
        exit()

    r.sendline(bytes(json.dumps({"decoded":ANS}), "utf-8"))

FLAG = json.loads((r.recvuntil(b'\n', True)).decode("utf-8"))["flag"]

print(FLAG)
