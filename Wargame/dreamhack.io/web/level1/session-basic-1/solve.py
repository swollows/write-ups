import requests

HOST = "http://host3.dreamhack.games"
PORT = "11134"
LOGIN_URI = "/login"

URL = HOST + ":" + PORT + LOGIN_URI
LOGIN_DATA = {"username":"guest", "password":"guest"}

resp = requests.post(URL, data=LOGIN_DATA)
print(resp.cookies)