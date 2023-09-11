FLAG = [0] * 24

byte_140003000 = ""
byte_140003000 += chr(0xAD) + chr(0xD8) + chr(0xCB) + chr(0xCB) + chr(0x9D) + chr(0x97) + chr(0xCB) + chr(0xC4) + chr(0x92) + chr(0xA1)
byte_140003000 += chr(0xD2) + chr(0xD7) + chr(0xD2) + chr(0xD6) + chr(0xA8) + chr(0xA5) + chr(0xDC) + chr(0xC7) + chr(0xAD)
byte_140003000 += chr(0xA3) + chr(0xA1) + chr(0x98) + chr(0x4C) + chr(0x00)
temp = 0

for i in range(len(byte_140003000) - 1, 0, -1):
    if i == len(byte_140003000) - 1:
        temp = ord(byte_140003000[i - 1]) - ord(byte_140003000[i])
        print(chr(ord(byte_140003000[i - 1]) - ord(byte_140003000[i])))
    else:
        temp = ord(byte_140003000[i - 1]) - temp
        print(chr(ord(byte_140003000[i]) - temp))