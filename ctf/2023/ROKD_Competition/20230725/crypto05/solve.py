from sympy import *
import sys

sys.setrecursionlimit(10**7)

# Given values
n = 245841236512478852752909734912575581815967630033049838269083
e = 1
c = 9327565722767258308650643213344542404592011161659991421

# Function to calculate the modular inverse of 'e' modulo 'm'
def mod_inverse(e, m):
    d = mod_inverse(e, m)
    if d < 0:
        d += m
    return d

# Find prime factors 'p' and 'q' of 'n'
print('Get P and Q')
#p, q = primefactors(n)
p = 416064700201658306196320137931
q = 590872612825179551336102196593

# Calculate the totient of 'n'
print('Get PHI')
phi_n = (p - 1) * (q - 1)
print(phi_n)

# Calculate the private key 'd'
print('Get d')
d = mod_inverse(e, phi_n)
print(d)

# Decrypt the ciphertext 'c' using the private key 'd'
print('Get plaintext')
decrypted_message = pow(c, d, n)

print("p =", p)
print("q =", q)
print("d =", d)
print("Decrypted message:", decrypted_message)
