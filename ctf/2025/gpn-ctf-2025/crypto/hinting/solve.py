#!/usr/bin/env python3

from math import gcd

n = int(
    0x8670a8ee2c22677ed695fbe8cbdaab6f5c96f9a318197a456d8e39ddb6a0ddb8b3914bd0c49dd5dd014c2fed7097cb14f2314e3c0f1b078ed6ec256ff03a29c8af5ae3bb3e61482c456e9876351bbdb46d942c1caca5bfbff504da8caef232f03ee41b075d0272497d8bdf5e71adc5b1b7c112b48344b56d4c5bcfac527b2690091ad4f0d3a39476dc90a4003d317a3a768219abdc480aa76fc0b1fae8c140918f1cd77b44288ef93761d3ded060459d90f416dd69cc7265db91cd9bb105e428797a8f00e187c306c2675d59facef40e785dd3832357ff6debed9ffcc3c3dd172cd27441db2e10815b641660b1b0af97474b275e0e5210be63580ef452f67229
)
e = 0x10001
c = int(
    0x7c6c71a64118d5617941dfc2f1a297fbff2d576b7b88963ee2be5c5dc4e8d02306aa948ce3c6068b6417b40639e246358b31d243d98dd367526d269c7c62a01f0f5b1e0ba34ebbb07519735cb6188f2cfea775e4f66501ebdf56e778c6372fb0ddef62c1cb72ac0d36b487c5a8d0f317d087e3f3eae099b871b67097a171eedda5b4b796dbe42b610d7d16bcbcc98b7327edc39bcb2745a7831d785010a6aaf1972e84c2f5c8739a143141a6414d417abeeb816fbee9bba2e490e7fec90ef614b2cc656146643be5bd4250b74d4f94efbd4ac33058eb653e917c2b23fb6cee9b7d25216d0127ec146c7063e08205892ad35dddbb30bfa48a1e56063a125bd3c2
)
V =(4, 2, 1, 2, 5, 4, 3, 0, 1, 2, 0, 5, 3, 3, 2, 1, 3, 1, 6, 1, 0, 1, 5, 4, 4, 2, 3, 6, 0, 0, 3, 1, 2, 5, 2, 4, 4, 1, 4, 1, 5, 5, 6, 5, 1, 6, 4, 1, 3, 1, 3, 3, 4, 5, 5, 1, 6, 0, 3, 2, 1, 0, 6, 0, 4, 2, 3, 4, 5, 5, 0, 1, 6, 2, 0, 2, 1, 1, 2, 6, 3, 0, 0, 0, 3, 5, 3, 2, 5, 2, 2, 2, 5, 0, 6, 4, 0, 5, 0, 2, 5, 1, 4, 2, 2, 1, 6, 0, 1, 0, 6, 0, 2, 2, 1, 3, 3, 2, 2, 5, 3, 5, 2, 4, 0, 2, 1, 4, 5, 4, 5, 2, 3, 6, 5, 4, 5, 6, 4, 6, 5, 0, 4, 6, 6, 6, 6, 6, 1, 5, 4, 3, 0, 3, 1, 1, 0, 0, 5, 6, 3, 4, 1, 6, 1, 4, 3, 6, 1, 4, 4, 5, 3, 4, 0, 5, 2, 6, 0, 0, 3, 2, 0, 3, 2, 3, 3, 0, 4, 1, 1, 6, 1, 3, 1, 6, 5, 6, 3, 0, 3, 1, 0, 1, 3, 2, 6, 3, 0, 6, 0, 5, 2, 6, 2, 4, 2, 1, 3, 1, 1, 4, 2, 2, 1, 1, 0, 4, 0, 5, 3, 2, 4, 6, 6, 5, 4, 5, 5, 0, 2, 0, 6, 0, 0, 3, 4, 3, 5, 3, 5, 3, 0, 2, 4, 5, 6, 3, 6, 6, 6, 3, 6, 6, 3, 6, 6, 6, 3, 2, 1, 2, 6, 2, 4, 6, 2, 1, 5, 4, 5, 5, 6, 3, 2, 6, 4, 3, 0, 0, 1, 0, 5, 3, 1, 4, 3, 5, 1, 2, 6, 4, 5, 1, 0, 2, 3, 6, 3, 1, 3, 4, 4, 3, 2, 0, 1, 0, 4, 1, 2, 6, 0, 5, 3, 6, 1, 0, 2, 6, 5, 0, 6, 5, 5, 5, 0, 2, 5, 3, 5, 3, 0, 2, 5, 5, 4, 2, 5, 2, 3, 6, 0, 2, 0, 3, 4, 2, 5, 3, 5, 4, 6, 2, 5, 0, 0)

L = len(V)



pow7 = 1
cands = [(0, 0)]

for k in range(L):
    pow7 *= 7
    n_mod = n % pow7
    nxt = []
    for p_low, q_low in cands:
        for a in range(7):
            b = (V[k] - a) % 7
            p_new = p_low + a * (pow7 // 7)
            q_new = q_low + b * (pow7 // 7)
            if (p_new * q_new) % pow7 == n_mod:
                nxt.append((p_new, q_new))
    if not nxt:
        cands = list(set(nxt))

for p_guess, q_guess in cands:
    g = gcd(n, p_guess)
    if 1 < g < n:
        p, q = g, n // g
        break
else:
    raise RuntimeError("factor not recovered")

assert p * q == n
print("[+] factorisation done")

phi  = (p - 1) * (q - 1)
d    = pow(e, -1, phi)
m    = pow(c, d, n)
flag = m.to_bytes((m.bit_length() + 7) // 8, "big")
print(flag.decode(errors="replace"))