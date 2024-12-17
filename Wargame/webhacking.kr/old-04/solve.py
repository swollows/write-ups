from bs4 import BeautifulSoup
import hashlib
import requests

URL = "https://webhacking.kr/challenge/web-04"
URI = "/"
PHPSESSID = 'bl8l650n93iq0apdgseavfnc39'

COOKIES = {
    'PHPSESSID' : PHPSESSID
}

session = requests.Session()

# 풀이
# 1. random 값 + "salt_for_you" 값이 sha1과 일치할때까지 bruteforcing
# 2. bruteforcing 성공 후 값 전송 

resp = session.get(URL + URI, cookies=COOKIES)

soup = BeautifulSoup(resp.content,"html.parser")
orig_hash = soup.find('b').contents[0].replace('\n', '')

for i in range(10000000,100000000):
    PAYLOAD = str(i) + 'salt_for_you'

    hash_object = hashlib.sha1(PAYLOAD.encode('utf-8'))
    calc_hash = hash_object.hexdigest()

    if orig_hash == calc_hash:
        print(f'Password is "{PAYLOAD}"')