PLAIN_STRING = "label"
XOR_KEY = 13

ENC_STRING = ''.join([chr(ord(idx) ^ XOR_KEY) for idx in PLAIN_STRING])

FLAG = "crypto{" + ENC_STRING + "}"

print(FLAG)