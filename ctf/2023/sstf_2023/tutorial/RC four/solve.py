from binascii import unhexlify

Ciphertext = unhexlify('634c3323bd82581d9e5bbfaaeb17212eebfc975b29e3f4452eefc08c09063308a35257f1831d9eb80a583b8e28c6e4d2028df5d53df8')
Flagtext = unhexlify('624c5345afb3494cdd6394bbbf06043ddacad35d28ceed112bb4c8823e45332beb4160dca862d8a80a45649f7a96e9cb')

msg = b"RC4 is a Stream Cipher, which is very simple and fast."

l = min(len(Ciphertext), len(Flagtext))
r = ""
for (c1, m, c2) in zip(Ciphertext[:l], msg[:l], Flagtext[:l]):
    r += chr((c1 ^ m) ^ c2)

print(r)