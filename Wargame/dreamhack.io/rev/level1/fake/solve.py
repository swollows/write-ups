import sys

ENC_FLAG = [
    0x59, 0x54, 0x68, 0x56, 0x5F, 0x5B, 0x5B, 0x4A,
    0x68, 0x41, 0x04, 0x45, 0x52, 0x06, 0x44, 0x50,
    0x65, 0x7A, 0x74, 0x4C, 0x64, 0x73
]

FLAG = ""

def sub_1521():
    print(ENC_FLAG)
    sub_12C5()
    print(ENC_FLAG)
    sub_123F()
    print(ENC_FLAG)
    return sub_11E9(0x37)

def sub_12C5():
    for i in range(len(ENC_FLAG)):
        mid = len(ENC_FLAG) // 2
        if i >= mid: break
        temp = ENC_FLAG[i]
        ENC_FLAG[i] = ENC_FLAG[len(ENC_FLAG) - i - 1]
        ENC_FLAG[len(ENC_FLAG) - i - 1] = temp

def sub_123F():
    for i in range(len(ENC_FLAG), 2):
        temp = ENC_FLAG[i]
        ENC_FLAG[i] = ENC_FLAG[i + 2]
        ENC_FLAG[i + 2] = temp

def sub_11E9(num):
    for i in range(len(ENC_FLAG)):
        ENC_FLAG[i] ^= num

sub_1521()

FLAG = [chr(elem) for elem in ENC_FLAG]
print(f"Flag is {''.join(FLAG)}")