# Favorite Byte write-up
# 1. Using "crypto{" as oracle of flag plain text
# 2. Do brute force and find which number can convert first 7 bytes to "crypto{"
# 3. If you find, do xor to ENC_FLAG with that byte

ENC_FLAG = "73626960647f6b206821204f21254f7d694f7624662065622127234f726927756d"
ENC_FLAG = bytes.fromhex(ENC_FLAG)

FLAG_FORMAT = "crypto{"
FLAG = ""
TMP = ""

for SECRET in range(1, 256):
    for elem in ENC_FLAG[:7]:
        TMP += chr(elem ^ SECRET)

    if (TMP == "crypto{"):
        FLAG = "".join([chr(elem ^ SECRET) for elem in ENC_FLAG])
        break
    else:
        TMP = ""

print(FLAG)
