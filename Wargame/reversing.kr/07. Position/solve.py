import string

char01 = ''
char02 = ''
char03 = ''
char04  = 'p'

FIRST = []
LAST = []

SERIAL = [
    [7, 6, 8, 7, 6],
    [7, 7, 7, 7, 6]
]

for elem01 in string.ascii_lowercase:
    v40 = int((ord(elem01) & 1) != 0) + 5
    v42 = int((ord(elem01) & 2) != 0) + 5
    v44 = int((ord(elem01) & 4) != 0) + 5
    v46 = int((ord(elem01) & 8) != 0) + 5
    v48 = int((ord(elem01) & 16) != 0) + 5

    for elem02 in string.ascii_lowercase:
        v32 = int((ord(elem02) & 1) != 0) + 1
        v34 = int((ord(elem02) & 2) != 0) + 1
        v8  = int((ord(elem02) & 4) != 0) + 1
        v36 = int((ord(elem02) & 8) != 0) + 1
        v38 = int((ord(elem02) & 16) != 0) + 1

        if v40 + v8 == SERIAL[0][0]:
            if v46 + v36 == SERIAL[0][1]:
                if v42 + v38 == SERIAL[0][2]:
                    if v44 + v32 == SERIAL[0][3]:
                        if v48 + v34 == SERIAL[0][4]:
                            char01 = elem01
                            char02 = elem02
                            FIRST.append(char01 + char02)
                            print('First 2 letter is ' + char01 + char02)
                            continue

for elem03 in string.ascii_lowercase:
    v41 = int((ord(elem03) & 1) != 0) + 5
    v43 = int((ord(elem03) & 2) != 0) + 5
    v45 = int((ord(elem03) & 4) != 0) + 5
    v47 = int((ord(elem03) & 8) != 0) + 5
    v49 = int((ord(elem03) & 16) != 0) + 5

    v33 = int((ord(char04) & 1) != 0) + 1
    v35 = int((ord(char04) & 2) != 0) + 1
    v21 = int((ord(char04) & 4) != 0) + 1
    v37 = int((ord(char04) & 8) != 0) + 1
    v39 = int((ord(char04) & 16) != 0) + 1

    if v41 + v21 == SERIAL[1][0]:
        if v47 + v37 == SERIAL[1][1]:
            if v43 + v39 == SERIAL[1][2]:
                if v45 + v33 == SERIAL[1][3]:
                    if v49 + v35 == SERIAL[1][4]:
                        char03 = elem03
                        LAST.append(char03 + char04)
                        print('Last 2 letter is ' + char03 + char04)
                        continue

print('FLAG is ')

for str01 in FIRST:
    for str02 in LAST:
        print(str01 + str02)