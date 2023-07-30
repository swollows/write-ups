from bs4 import BeautifulSoup
import requests

URL = "http://host1.dreamhack.games:8943/"
PAYLOAD = "dreeeeee0am@gmail.com"
DATA = {'input_val': PAYLOAD}

resp = requests.post(URL, data=DATA)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('pre')
flag = pre.contents[0]
print(flag)