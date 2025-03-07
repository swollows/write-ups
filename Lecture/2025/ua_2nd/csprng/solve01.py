import requests
import time
import hashlib
import string

URL = "https://bkdbkdbkd.pythonanywhere.com/q1"
PRINTABLE_STRING = string.printable

resp = requests.get(url=URL)

x = round(time.time(), 2)

is_all_printable = True

cnt = 0

PRINTED_HASH = bytes.fromhex(resp.text)

print(f"PRINTED HASH : {hex(int.from_bytes(PRINTED_HASH))}")
print(f"EXPECTED TIMESTAMP : {x}")

for s in range(0, 100):
    CALCULATED_TIMESTAMP = (x * 100 - s) / 100
    TEMP_HASH = hashlib.sha256(str(CALCULATED_TIMESTAMP).encode()).digest()

    ret = ''

    for i in range(32):
        TEMP = PRINTED_HASH[i] ^ TEMP_HASH[i]
        is_all_printable = 0x20 <= TEMP and TEMP <= 0x7f if True else False
        ret += hex(TEMP)[2:].zfill(2)

    if is_all_printable:
        cnt += 1
        print(bytes.fromhex(ret))