'''
바이너리 디컴파일 결과 : https://dogbolt.org/?id=7a93c4c6-9e9a-46c0-824d-764b5dd615a6#Hex-Rays=161
'''

enc_flag = "C@qpl==Bppl@<=pG<>@l>@Blsp<@l@AArqmGr=B@A>q@@B=GEsmC@ArBmAGlA=@q"
xored_flag = ""

for elem in enc_flag:
    xored_flag += chr(ord(elem) ^ 0x3)

rev_flag = xored_flag[::-1]

flag = ""

for elem in rev_flag:
    flag += chr((ord(elem) & 0x7f) - 13)

print(flag)