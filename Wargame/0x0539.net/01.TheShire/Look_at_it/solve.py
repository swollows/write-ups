ENC_FLAG = "D7B9{9B7D_D7B9_DD77BB99}"
DEC_FLAG = ''

F_MINUS_D = ord('F') - ord('D')
L_MINUS_7 = ord('L') - ord('7')
A_MINUS_B = ord('A') - ord('B')
G_MINUS_9 = ord('G') - ord('9')

for elem in ENC_FLAG:
    if elem == '{' or elem == '}':
        elem = elem
    elif elem == 'D':
        elem = chr( ord(elem) + F_MINUS_D )
    elif elem == '7':
        elem = chr( ord(elem) + L_MINUS_7 )
    elif elem == 'B':
        elem = chr( ord(elem) + A_MINUS_B )        
    elif elem == '9':
        elem = chr( ord(elem) + G_MINUS_9 )

    DEC_FLAG += elem

print(DEC_FLAG)