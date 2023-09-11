FLAG_HEX = "0e0b213f26041e480b26217f27342e175d0e070a3c5b103e2526217f27342e175d0e077e263451150104"
FLAG_BYTES = bytes.fromhex(FLAG_HEX)

SECRET_KEY = "myXORkey"
RESULT = []

flag_cnt = 0
key_cnt = 0

while flag_cnt != len(FLAG_BYTES):
    if key_cnt == len(SECRET_KEY):
        key_cnt = 0

    RESULT.append(chr( FLAG_BYTES[flag_cnt] ^ ord(SECRET_KEY[key_cnt]) ))
    flag_cnt += 1
    key_cnt += 1

FLAG = ''.join(RESULT)

print(FLAG)