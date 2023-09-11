XOR_KEY = "02398482aeb7d9fe98bf7dc7cc_ITDWWGMFNY"
XOR_KEY_LEN = len(XOR_KEY)

with open("defcon-flag.png.XORed", "rb") as p:
    data = p.read()

decodedata = []

for idx in range(len(data)):
    decodedata.append(data[idx] ^ ord(XOR_KEY[idx % XOR_KEY_LEN]))

with open("defcon-flag.png", "wb") as p:
    p.write(bytes(decodedata))