#!/usr/bin/env python3
import sys

#flag xor key
def flag_enc():
    with open('./flag', 'r') as f:
        flag = f.read()[3:-1]
        list = ['0b']
        for ch in flag:
            list.append(format(ord(ch), 'b').zfill(8))
        binf = "".join(list)
    with open('./key', 'r') as f:
        key = f.read()

    flag_enc = bin(int(binf, 2) ^ int(key, 2))
    print(f'flag_enc: {flag_enc}\n')

    return key

def key_gen(key):
    new_key = bin(int(key,2) ^ int('0b10010110101011100100111011100101101011110011001110000101111010111110010111100000111110000000010101101011001100010100010101111000111111100010001010110000010111110111110010001111110011110101001011111010100101010100001110010111111010001101111110011001010110011001010101010000001010100000101101001010010010100010100001011101011011010011010101111111010010100111011001100000101011100001010111111101000110011000110101111111010111001101111110011101101100011101001111111000010011010111100010111001100101011111101111111001',2))
    return new_key


def input_enc(key):
    p = input("Plain text : ")
    if (len(p) > 64) :
        print('Max length: 64')
    else :
        plist = ['0b']
        for ch in p:
            plist.append(format(ord(ch), 'b').zfill(8))
        binp = "".join(plist)
        key = key[0:len(binp)]

        input_enc = int(binp, 2) ^ int(key, 2)
        print(f'input_enc: {input_enc}\n')
        
        sys.exit()

def main():
    o_key = flag_enc()
    n_key = key_gen(o_key)
    input_enc(n_key)


if __name__ == '__main__':
    main()