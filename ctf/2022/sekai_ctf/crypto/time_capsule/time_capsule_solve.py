import random 
import os
import itertools

ENC_FLAG = [0x96,0xBA,0xFC,0xA5,0x91,0x49,0x0A,0xCA,0x74,0xAA,0xDD,0x26,0x06,0x7B,0x2B,0x21,
            0xA0,0x13,0xB5,0xE6,0xEF,0x8B,0x11,0xAA,0x72,0x15,0x0A,0x7D,0xD9,0x53,0x8A,0x5E,
            0xAD,0x3A,0x1F,0x9A,0x0A,0xD0,0xC3,0x7B,0x1B,0x28,0xCA]

now = "1647241710.3846750"
random.seed(now)
key = [random.randrange(256) for _ in ENC_FLAG]

f = open("flag_list.txt", "w")

DEC_FLAG = ''.join([chr(m ^ k) for (m,k) in zip(ENC_FLAG, key)])

rand_nums = []
while len(rand_nums) != 8:
    tmp = int.from_bytes(os.urandom(1), "big")
    if tmp not in rand_nums:
        rand_nums.append(tmp)

result = list(itertools.permutations([0,1,2,3,4,5,6,7,8], 8))

def decrypt_stage_one(message, key):
    res = ''

    for i in key[::-1]:
        for j in range(i, len(message), len(key)):
            res += message[j]
    return res

tmp = DEC_FLAG

for idx_list in result:
    for _ in range(42):
        DEC_FLAG = decrypt_stage_one(DEC_FLAG, idx_list)
    f.write(DEC_FLAG + '\n')
    DEC_FLAG = tmp


print('END!')

f.close()
