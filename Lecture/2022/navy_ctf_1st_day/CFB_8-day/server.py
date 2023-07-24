from Crypto.Cipher import AES
from os import urandom

cipher = AES.new(urandom(16), AES.MODE_CFB, urandom(16))

def reset(IV):
    global cipher
    cipher = AES.new(urandom(16), AES.MODE_CFB, IV)

def check(ct):
    return ct == cipher.decrypt(ct)

banner = '''
+--------------+
|     menu     |
+--------------+
| 1. RESET     |
| 2. CHECK     |
+--------------+
> '''

while 1:
    print(banner, end='', flush=True)
    inp = input()
    try:
        inp = int(inp)
    except ValueError:
        continue

    match inp:
        case 1:
            print("IV > ", end='', flush=True)
            try:
                IV = bytes.fromhex(input())
            except ValueError:
                print("What?")
                continue
            if len(IV) != 16:
                print('What?')
            else:
                reset(IV)
        case 2:
            print("CT > ", end='', flush=True)
            try:
                ct = bytes.fromhex(input())
            except ValueError:
                print("What?")
                continue
            if len(ct) % 16 != 0:
                print("What?")
            else:
                if check(ct):
                    with open('flag.txt', 'r') as f:
                        print(f.read())
                else:
                    print("Try again!")
        case _:
            print("What?")