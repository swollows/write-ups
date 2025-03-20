FLAG = "DH{"
byte_140003000 = ""
byte_140003000 += chr(0x49) + chr(0x60) + chr(0x67) + chr(0x74) + chr(0x63) + chr(0x67) + chr(0x42) + chr(0x66) + chr(0x80) + chr(0x78) + chr(0x69)
byte_140003000 += chr(0x69) + chr(0x7B) + chr(0x99) + chr(0x6D) + chr(0x88) + chr(0x68) + chr(0x94) + chr(0x9F) + chr(0x8D) + chr(0x4D) + chr(0xA5)
byte_140003000 += chr(0x9D) + chr(0x45)

for i in range(len(byte_140003000)):
    FLAG += chr(i ^ (ord(byte_140003000[i])) - (2 * i))

FLAG += "}"

print(FLAG)