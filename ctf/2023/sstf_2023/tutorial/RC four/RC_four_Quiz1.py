KeyStream_From_RC4 = "<y4)ky&=zuw(8*#3*<q4Quw)o+"
RC4_CipherText = "k6cv36tb1<9ogcplby#qpT"

LENGTH_KEY = len(KeyStream_From_RC4)
LENGTH_CIPHER = len(RC4_CipherText)
FLAG = ""

for i in range(LENGTH_CIPHER):
    FLAG += chr(ord(RC4_CipherText[i]) ^ ord(KeyStream_From_RC4[i % LENGTH_KEY]))

print(FLAG)