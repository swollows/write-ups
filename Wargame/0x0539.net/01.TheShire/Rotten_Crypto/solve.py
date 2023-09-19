import string

ENC_FLAG = "pvkq{6ovmywoc3ro6a1vnapm18zha}"
DEC_FLAG = ''

for elem in ENC_FLAG:
    if elem == '{' or elem == '}':
        DEC_FLAG += elem
        continue
    elif string.digits.find(elem) > -1:
        DEC_FLAG += chr(ord(elem) + 65)
    elif elem == 'a' or elem == 'c' or elem == 'h':
        DEC_FLAG += chr(ord(elem) - 49)
    else:
        DEC_FLAG += chr(ord(elem) - 10)

print(DEC_FLAG)