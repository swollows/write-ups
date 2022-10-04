import requests

URL = "http://bottle-poem.ctf.sekai.team"
URI = "/sign"

resp = requests.get(URL + URI, cookies={"name":"admin"})

print(resp.text)