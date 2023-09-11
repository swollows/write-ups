import base64

A_1 = ''
XOR_KEY = [16, 17, 33, 51, 68, 102, 51, 160, 144, 181, 238, 17]
XOR_RESULT = [74, 87, 77, 70, 29, 49, 117, 238, 241, 226, 163, 44]

print(len(A_1))
print(len(XOR_KEY))
print(len(XOR_RESULT))

for idx in range(12):
    A_1 += chr(XOR_KEY[idx] ^ XOR_RESULT[idx])

FLAG = base64.b64decode(A_1).decode('UTF-8')

print(A_1)
print(FLAG)


'''
		if ((A_1[0] ^ 16) != 74)
   		if ((A_1[1] ^ 17) != 87)
		if ((A_1[2] ^ 33) != 77)
		if ((A_1[3] ^ 51) != 70)
		if ((A_1[4] ^ 68) != 29)
		if ((A_1[5] ^ 102) != 49)
   		if ((A_1[6] ^ 51) != 117)
		if ((A_1[7] ^ 160) != 238)
		if ((A_1[8] ^ 144) != 241)
		if ((A_1[9] ^ 181) != 226)
		if ((A_1[10] ^ 238) != 163)
		if ((A_1[11] ^ 17) != 44)
'''