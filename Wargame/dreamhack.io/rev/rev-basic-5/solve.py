INPUT = [0] * 25

byte_140003000 = ""
byte_140003000 += chr(0xAD) + chr(0xD8) + chr(0xCB) + chr(0xCB) + chr(0x9D) + chr(0x97) + chr(0xCB) + chr(0xC4)
byte_140003000 += chr(0x92) + chr(0xA1) + chr(0xD2) + chr(0xD7) + chr(0xD2) + chr(0xD6) + chr(0xA8) + chr(0xA5)
byte_140003000 += chr(0xDC) + chr(0xC7) + chr(0xAD) + chr(0xA3) + chr(0xA1) + chr(0x98) + chr(0x4C) + chr(0x00)
byte_140003000 += chr(0x00)

#*(a1 + i) = byte_140003000[i] - *(a1 + i + 1)

for idx in range(23, -1, -1):
    INPUT[idx] = ord(byte_140003000[idx]) - INPUT[idx + 1]

FLAG = 'DH{' + ''.join([chr(elem) for elem in INPUT]) + '}'

print(FLAG)