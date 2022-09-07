from Crypto.Cipher import AES
from Crypto.Util.number import *
from functools import reduce
import random

def xor(x,y):
    """Returns the exclusive or (xor) between two vectors"""
    return bytes(i^j for i,j in zip(x,y))
 
def intToList(number,listSize):
    """Convert a number into a byte list"""
    return [(number >> i) & 0xff
            for i in reversed(range(0,listSize*8,8))]
 
def listToInt(list):
    """Convert a byte list into a number"""
    return reduce(lambda x,y:(x<<8)+y,list)

def incr(m):
    """Increment the LSB 32 bits of input counter"""
    n = list(m)
    n12 = bytes(n[:12])
    ctr = listToInt(n[12:])
    if ctr == (1<<32)-1:
        return n12 + bytes(4)
    else:
        return n12 + bytes(intToList(ctr+1,4))

def multGF2(x,y):
    """Multiply two polynomials in GF(2^m)/g(w)
        g(w) = w^128 + w^7 + w^2 + w + 1
        (operands and result bits reflected)"""     
    (x,y) = map(lambda z:listToInt(list(z)),(x,y))
    z = 0
    while y & ((1<<128)-1):
        if y & (1<<127):
            z ^= x
        y <<= 1
        if x & 1:
            x = (x>>1)^(0xe1<<120)
        else:
            x >>= 1
    return bytes(intToList(z,16))
def GHASH (hkey,aad,ctext):
    """GCM's GHASH function"""
    def xorMultH (p,q):
        """Multiply (p^q) by hash key"""
 
        return bytes(multGF2(hkey,xor(p,q)))
     
    def gLen(s):
        """Evaluate length of input in bits and returns
           it in the LSB bytes of a 64-bit string"""
        return bytes(intToList(len(s)*8,8))  
   
    x = bytes(16)    
    aadP = aad + bytes((16-len(aad)%16)%16)
    ctextP = ctext + bytes((16-len(ctext)%16)%16)
    for i in range(0,len(aadP),16):
        x = xorMultH(x,aadP[i:i+16])
    for i in range(0,len(ctextP),16):
        g = x
        x = xorMultH(x,ctextP[i:i+16])
    return xorMultH(x,gLen(aad) + gLen(ctext))

H_i = b'\x97\r\x89F\xecNy\xdf\x0b{atLz\x97k'

def pow(x, y):
    number = x
    y -= 1
    while y:
        if y & 1:
            number = multGF2(number,x)
        y >>= 1
        x = multGF2(x,x)
    return number


# random.seed(1333713337)

# key = random.randbytes(16)
# nonce = random.randbytes(128)
key = b'ABCDABCDABCDABCD'
nonce = b'POWERNONCE123456' * 8
cipher = AES.new(key, AES.MODE_GCM, nonce=nonce)
enc1, tag1 = cipher.encrypt_and_digest(b"\0" * 1024)

aes = AES.new(key, AES.MODE_ECB)  
H = bytes(aes.encrypt(bytes(16)))

H_i = pow(H,340282366920938463463374607431768211456-2)

x = GHASH(H, bytes(), nonce)

a = (bytes(intToList(len(bytes(16))*8,16)))
r = multGF2(H_i, xor(a, multGF2(H_i,x)))
print(r.hex())