import requests

URL = "http://host3.dreamhack.games:23829/api/info"

resp = requests.post(URL)

print(resp.text)