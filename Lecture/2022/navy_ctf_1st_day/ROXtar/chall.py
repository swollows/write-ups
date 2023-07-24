flag = b'flag{XXXXXXXXXXXXXXXXXXX}'
flag_str = flag.decode('utf-8')
flag_list = [ord(idx) for idx in flag_str]

from os import urandom

def xor(x :bytes, y :bytes) -> bytes:
    return bytes([i^j for i,j in zip(x,y)])

def get_key(random :bytes) -> bytes:
    key = list(random)
    print(key)
    for i in range(len(key)):
        now = key[i]
        now += (not ((now&136)|(now&49)|(now&70))) + 0xDEAD
        now = now * 1337 + 31337
        now %= 256
        key[i] = now
    print(flag_list)
    print(key)

    return bytes(key)

def encrypt(text :bytes) -> bytes:
    return xor(get_key(urandom(len(text))),text).hex()

banner = '''============================
|           MENU           |
============================
| 1 | encrypt your message |
| 2 | get encrypted flag   |
============================
>>> '''

def main():
    while 1:
        inp = ''
        while len(inp) == 0: inp = input(banner).strip()
        if inp[0] == '1':
            plaintext = input('plaintext: ').encode()
            print(f'encrypted message: {encrypt(plaintext)}')
        elif inp[0] == '2':
            print(f'encrypted flag: {encrypt(flag)}')
        else:
            print('what?')

if __name__ == '__main__':
    main()
