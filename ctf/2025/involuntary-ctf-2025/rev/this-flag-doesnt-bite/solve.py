ENC = [0x2d, 0x5a, 0x0b, 0x1c, 0x0e, 0x2f, 0x3d, 0x3e]
XOR = 0x69


for i in range(len(ENC)):
    ENC[i] = ENC[i] ^ XOR

FLAG = "".join([chr(i) for i in ENC])

print("!FLAG!{" + FLAG + "}!FLAG!")
