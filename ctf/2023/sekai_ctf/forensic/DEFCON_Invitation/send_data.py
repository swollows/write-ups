import requests

URL = "http://20.106.250.46/sendUserData"
HEADERS = {
'Connection': 'Keep-Alive',
'Content-Type': 'application/json; Charset=UTF-8',
'Accept': '*/*',
'User-Agent': 'Mozilla/4.0 (compatible; Win32; WinHttp.WinHttpRequest.5)'
}
PAYLOAD = '{"username":"Administrator"}'

resp = requests.post(URL, json=PAYLOAD, headers=HEADERS)

print(resp.text)