from Crypto.Util.number import getPrime, GCD, bytes_to_long

FLAG = b"DH{????????????????????????}"
FLAG = bytes_to_long(FLAG)

while True:
    p = getPrime(1024)
    q = getPrime(1024)
    N = p * q

    # e = 0x10001 
    # assert GCD((p - 1)*(q - 1), e) == 1... Oh, COME ON.. Stop generating that stupid COMMON e.
    for e1 in range(0x100, 0x10001):
        if GCD(p - 1, e1) >= 0x100: # much better!
            break

    for e2 in range(0x100, 0x10001):
        if GCD(q - 1, e2) >= 0x100: # This is nice!!
            break

    if GCD(e1, e2) == 1: # UN-UN common == common :P
        break

print(f"{N = }")
print(f"{e1 = }")
print(f"{e2 = }")

FLAG_enc1 = pow(FLAG, e1, N)
FLAG_enc2 = pow(FLAG, e2, N)

print(f"{FLAG_enc1 = }")
print(f"{FLAG_enc2 = }")