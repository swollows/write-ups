from bs4 import BeautifulSoup
import requests

URL = "http://host3.dreamhack.games:11036/"
enc_ans = ""
dec_ans = ""
ANS = ""

# 1. GET ENCRYPTED ANSWER
resp = requests.get(URL)

soup = BeautifulSoup(resp.content,"html.parser")
code = soup.find('code')
enc_ans = code.contents[0]

# 2. DECRYPT FLAG
for elem in enc_ans:
    if elem == "_":
        dec_ans += 'b'
    else:
        dec_ans += elem

ANS = str(int(dec_ans, 16))
DATA = {'menu_input': ANS}

# 3. GET FLAG
resp = requests.post(URL, data=DATA)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('pre')
FLAG = pre.contents[0]

print(FLAG)