import string

FLAG = "DH{"
byte_140003000 = ""
byte_140003000 += chr(0x24) + chr(0x27) + chr(0x13) + chr(0xC6) + chr(0xC6) + chr(0x13) + chr(0x16) + chr(0xE6) + chr(0x47) + chr(0xF5)
byte_140003000 += chr(0x26) + chr(0x96) + chr(0x47) + chr(0xF5) + chr(0x46) + chr(0x27) + chr(0x13) + chr(0x26) + chr(0x26) + chr(0xC6)
byte_140003000 += chr(0x56) + chr(0xF5) + chr(0xC3) + chr(0xC3) + chr(0xF5) + chr(0xE3) + chr(0xE3)

for i in range(len(byte_140003000)):
    for elem in range(0x100):
        if ( ( ( elem << 4 ) & 0xF0 ) | (elem >> 4) ) == ord(byte_140003000[i]) :
            FLAG += chr(elem)
            break

FLAG += "}"

print(FLAG)