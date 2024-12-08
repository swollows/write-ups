from bs4 import BeautifulSoup
import requests

URL = "https://webhacking.kr/challenge/code-2/"
URI = "/?val="
PAYLOAD = "1abcde_.121.141.65.137.a\tp\ta\ts\ts"
PHPSESSID = '2iti1mqblclscqcnp08irp82q2'

COOKIES = {
    'PHPSESSID' : PHPSESSID
}

# 풀이
# 1. $_SERVER[REMOTE_ADDR] == 나의 외부 IP
# 2. \t == 탭문자
# 3. [1-3] == 1 ~ 3 중 아무거나 하나
# 4. [a-f]{5} == a ~ f 사이의 연속된 5자 길이의 문자열
# 5. * == 아무거나
# 6. . == 말그대로 '.'

resp = requests.request(method='GET', url=URL + URI + PAYLOAD, cookies=COOKIES)

soup = BeautifulSoup(resp.content,"html.parser")
flag = soup.find('script').contents[0].replace('\n', '')

print(flag)
