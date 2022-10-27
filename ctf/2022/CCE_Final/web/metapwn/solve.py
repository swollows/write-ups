import requests

URL = "http://15.165.249.5:1929"
URI = "/edit"
POST_DATA = {"username":"admin_"}

resp = requests.post(URL + URI, data=POST_DATA)

print(resp.text)