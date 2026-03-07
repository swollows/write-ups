# XOR Starter write-up
# 1. xor ENC_FLAG to 13

ENC_FLAG = "label"

FLAG = "crypto{" + ''.join([chr(ord(elem) ^ 13) for elem in ENC_FLAG])+ "}"

print(FLAG)
