import string
import re
import json

PROB_HEX_LIST = open('./prob', 'r').read().split('\n')
PROB_BYTE_LIST = [bytes.fromhex(idx) for idx in PROB_HEX_LIST]
RESULT = []

OnlyAscii = lambda s: re.match('^[\x00-\x7F]+$', s) != None

for i in range(len(PROB_BYTE_LIST)):
    RESULT.append([])
    for j in range(0x100):
        arr = ''.join([chr(idx ^ j) for idx in PROB_BYTE_LIST[i]])

        if OnlyAscii(arr):
            RESULT[i].append({arr : hex(j)})

with open('./result', 'w') as fp:
    for dict_list in RESULT:
        for idx in dict_list:
            fp.write(json.dumps(idx) + '\n')
    print('Done')