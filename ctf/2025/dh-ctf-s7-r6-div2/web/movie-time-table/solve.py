import requests

URL = "http://host3.dreamhack.games:9301"
PATH = "/test"

resp = requests.post(url=URL+PATH)

print(resp.text)

resp = requests.get(url=URL)

print(resp.text)