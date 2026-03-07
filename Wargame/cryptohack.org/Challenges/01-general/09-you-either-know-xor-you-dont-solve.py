# You either know, XOR you don't write-up
# 1. brute force bytes using "crypto{" oracle to find XOR_KEY
# 2. If you find, you will know that "myXORke" on XOR_KEY is not enough
# 3. There is two ways to find the XOR_KEY
#   1) First, you can simply guessing that full XOR_KEY is "myXORkey"... but, if XOR_KEY length is more than 8.
#      Guessing XOR_KEY is more harder than you think...
#   2) Therefore, you need to brute force to find XOR_KEY in printable text and compare that all of FLAG plaintext has printable.

import string

ENC_FLAG = "0e0b213f26041e480b26217f27342e175d0e070a3c5b103e2526217f27342e175d0e077e263451150104"
ENC_FLAG = bytes.fromhex(ENC_FLAG)

XOR_KEY = ""
ORACLE = "crypto{"
FLAG = ""

def getXORkey():
    ret = ""

    for idx in range(len(ORACLE)):
        for x in range(1, 256):
            if (chr(x ^ ENC_FLAG[idx]) == ORACLE[idx]):
                ret += chr(x)
                continue

    return ret

def getFLAG(key):
    ret = ""

    for idx in range(len(ENC_FLAG)):
        ret += chr(ENC_FLAG[idx] ^ ord(key[idx % len(key)]))

    return ret

# PoC #1
XOR_KEY = getXORkey() + "y"

print(XOR_KEY)

for idx in range(len(ENC_FLAG)):
    FLAG += chr(ENC_FLAG[idx] ^ ord(XOR_KEY[idx % len(XOR_KEY)]))

    if (idx < 6) or (idx >= 6 and ORACLE == FLAG[:7]):
        continue
    else:
        print("Something is wrong...")
        exit(0)

print(FLAG)

# PoC #2
XOR_KEY = getXORkey()

for elem in string.printable:
   print(getFLAG(XOR_KEY + elem)) 
