import string
import re

PROB = '1b37373331363f78151b7f2b783431333d78397828372d363c78373e783a393b3736'
PROB = list(bytes.fromhex(PROB))

for i in range(256):
    arr = ''.join([chr(idx ^ i) for idx in PROB])
    result_dict = {arr : hex(i)}

    if re.match('['+string.printable+']', arr):
        print(result_dict)