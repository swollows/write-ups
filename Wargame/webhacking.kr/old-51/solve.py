import requests

URL = "https://webhacking.kr/challenge/bonus-13/"

COOKIES = {
    "PHPSESSID": "mpkd577e0q8p2jgb5na52aovld"
}

DATA = {
    "id": "admin",
    "pw": "129581926211651571912466741651878684928"
}

resp = requests.post(url = URL, cookies = COOKIES, data = DATA)

print(resp.text)
