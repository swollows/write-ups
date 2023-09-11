FLAG_HEX = "73626960647f6b206821204f21254f7d694f7624662065622127234f726927756d"
FLAG_BYTES = bytes.fromhex(FLAG_HEX)
RESULT = []

for i in range(0x100):
    RESULT.append(''.join([chr(idx ^ i) for idx in FLAG_BYTES]))

for STRING in RESULT:
    non_ascii = 0
    for idx in STRING:
        if ord(idx) < 0x20 or ord(idx) > 0x7E:
            non_ascii = 1
            break
    if non_ascii == 0:
        print(STRING)