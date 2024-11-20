from Crypto.Util.number import getPrime, isPrime, bytes_to_long
from gmpy2 import invert, mpz
from flag import FLAG

def getSafePrime(n):
    while True:
        p1 = getPrime(n)
        p1 = 122925338396977892377812264658939951801210314312238212067059595148447406166769716855936119104014353481162826500622396956338370238037713303129667973570418205129792800094492802512333202767609745542480301632710243676880179931490273979269048908687034938065216226244568368994455058377505090061149006930577060428653
        p2 = 2*p1 + 1
        if isPrime(p2):
            return p1, p2

while True:
    p1, p2 = getSafePrime(1024)
    q1 = getPrime(1024)
    q2 = getPrime(1024)
    e = 0x10001
    if (p1 - 1) * (q1 - 1) % e == 0:
        continue
    if (p2 - 1) * (q2 - 1) % e == 0:
        continue
    N1 = p1 * q1
    N2 = p2 * q2
    break

FLAG1 = bytes_to_long(FLAG[ : len(FLAG)//2])
FLAG2 = bytes_to_long(FLAG[len(FLAG)//2 : ])


PHI1 = (p1 - 1) * (q1 - 1)
PHI2 = (p2 - 1) * (q2 - 1)
d1 = invert(e, PHI1)
d2 = invert(e, PHI2)

# RSA encryption 1
FLAG1_enc = pow(FLAG1, e, N1)
print(f"{N1 = }")
print(f"{e = }")
print(f"{FLAG1_enc = }")

FLAG1_dec = pow(FLAG1_enc, d1, N1)
print(f"{FLAG1_dec = }")

#RSA encryption 2
FLAG2_enc = pow(FLAG2, e, N2)
print(f"{N2 = }")
print(f"{e = }")
print(f"{FLAG2_enc = }")

FLAG2_dec = pow(FLAG2_enc, d2, N2)
print(f"{FLAG2_dec = }")