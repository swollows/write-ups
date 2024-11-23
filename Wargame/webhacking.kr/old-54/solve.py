from bs4 import BeautifulSoup
import requests

URL = "https://webhacking.kr/challenge/bonus-14"
URI = "/?m="
PHPSESSID = 'jsm27523t35k3tpir7tgor97o2'

COOKIES = {
    'PHPSESSID' : PHPSESSID
}

HEADERS = {
#    'Accept': '*/*',
#    'Accept-Encoding': 'gzip, deflate, br, zstd',
#    'Accept-Language': 'ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6,zh;q=0.5',
#    'Connection': 'keep-alive',
#    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.6533.100 Safari/537.36',
#    'Host': 'webhacking.kr',
    'Referer': 'https://webhacking.kr/challenge/bonus-14/'
}

# 풀이
# 1. 페이지 접속 시 실행되는 JS 코드를 해석해보면 페이지의 JS 코드에서 ?m= 쿼리스트링을 통해서
#    플래그 호출하는 행위 확인 가능
# 2. 플래그 출력을 위한 정확한 동작을 위해서는 Header 정보를 프록시 도구나 개발자 도구의 네트워크
#    로그를 통해서 정확한 User-Agent 정보 확인 후 호출 시 플래그 정보 호출함.
# 3. FLAG를 호출하는데 사용하는 헤더 정보를 하나씩 소거해서 필요한 정보를 확인해보면 Referer 정보만
#    정확히 일치하면 호출하는 것을 확인할 수 있음.

FLAG = ""
idx = 0

while True:
    resp = requests.get(URL + URI + str(idx), cookies=COOKIES, headers=HEADERS)

    FLAG += resp.text

    if resp.text != "":
        idx += 1
    else:
        break

print(FLAG)