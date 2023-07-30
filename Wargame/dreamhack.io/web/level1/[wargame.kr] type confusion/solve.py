import requests

URL = "http://host1.dreamhack.games:24360/index.php"
PAYLOAD = {"json": '{"key": 0}'}

resp = requests.post(URL, data=PAYLOAD)
print(resp.text)