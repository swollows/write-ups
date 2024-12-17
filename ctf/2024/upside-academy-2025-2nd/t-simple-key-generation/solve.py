import requests

URL = "https://juno.zip"
URI = "/upside/check"
PAYLOAD = ""

with open('./answer.txt', mode="r") as f:
    PAYLOAD = f.read()

PARAMS = {'pvkey' : PAYLOAD}

resp = requests.get(URL + URI, params=PARAMS)

FLAG = resp.text

print(FLAG)