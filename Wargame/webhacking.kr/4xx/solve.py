import socket
import requests
import json
import threading

with open('payload.json', 'r', encoding='utf-8') as f:
    PAYLOAD = json.load(f)

URL = "http://webhacking.kr:10022"
HOST = "webhacking.kr"
PORT = 10022

COOKIES = {
    "PHPSESSID": "0n7rge2jksvhu5np9cj6futrlk"
}

KEYS = {}

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    s.connect((HOST, PORT))
    s.send(PAYLOAD["400"].encode("utf-8"))
    
    # 응답 받기
    resp = b""
    while True:
        data = s.recv(4096)
        if not data:
            break
        resp += data

header_end = resp.find(b"\r\n\r\n")

if header_end != -1:
    body = resp[header_end + 4:]  # \r\n\r\n 이후부터 본문
    KEYS['400'] = body.decode('utf-8', errors='ignore').replace("400 Error!<br>\nyour key : ", "") # 본문 출력
else:
    print("본문을 찾을 수 없습니다.")

print(f"key1 (400): {KEYS['400']}")

resp = requests.get(url = URL + PAYLOAD['403'], cookies = COOKIES)

KEYS["403"] = resp.text.replace("403 Error!<br>\nyour key : ", "")

print(f"key2 (403): {KEYS['403']}")

resp = requests.get(url = URL + PAYLOAD['404'], cookies = COOKIES)

KEYS["404"] = resp.text.replace("404 Error!<br>\nyour key : ", "")

print(f"key3 (404): {KEYS['404']}")

resp = requests.request('TRACE', url = URL, cookies = COOKIES)

KEYS["405"] = resp.text.replace("405 Error!<br>\nyour key : ", "")

print(f"key4 (405): {KEYS['405']}")

# 408 에러는 잘 재현되지는 않음...
# Caido 프록시 통해서 요청하다보면 자연스럽게 터졌음...
KEYS["408"] = "KEY{e44fa3e1865a3839cbc0b658f1ae08cf}"

print(f"key5 (408): {KEYS['408']}")

resp = requests.get(url = URL + PAYLOAD["414"], cookies = COOKIES)

KEYS["414"] = resp.text.replace("414 Error!<br>\nyour key : ", "")

print(f"key6 (414): {KEYS['414']}")

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    s.connect((HOST, PORT))
    s.send(PAYLOAD['417'].encode("utf-8"))

    # 응답 받기
    resp = b""
    while True:
        data = s.recv(4096)
        if not data:
            break
        resp += data

header_end = resp.find(b"\r\n\r\n")

if header_end != -1:
    body = resp[header_end + 4:]
    KEYS['417'] = body.decode('utf-8', errors='ignore').replace("417 Error!<br>\nyour key : ", "")
else:
    print("본문을 찾을 수 없습니다.")

print(f"key7 (417): {KEYS['417']}")

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    s.connect((HOST, PORT))
    s.send(PAYLOAD['416'].encode("utf-8"))

    # 응답 받기
    resp = b""
    while True:
        data = s.recv(4096)
        if not data:
            break
        resp += data

header_end = resp.find(b"\r\n\r\n")

if header_end != -1:
    body = resp[header_end + 4:]
    KEYS['416'] = body.decode('utf-8', errors='ignore').replace("3f\r\n416 Error!<br>\nyour key : ", "").replace("\n0\r\n\r\n", "").replace("\r", "")
else:
    print("본문을 찾을 수 없습니다.")

print(f"key8 (416): {KEYS['416']}")

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    s.connect((HOST, PORT))
    s.send(PAYLOAD['412'].encode("utf-8"))

    # 응답 받기
    resp = b""
    while True:
        data = s.recv(4096)
        if not data:
            break
        resp += data

header_end = resp.find(b"\r\n\r\n")

if header_end != -1:
    body = resp[header_end + 4:]
    KEYS['412'] = body.decode('utf-8', errors='ignore').replace("412 Error!<br>\nyour key : ", "")
else:
    print("본문을 찾을 수 없습니다.")

print(f"key9 (412): {KEYS['412']}")

ANSWER = list(KEYS.values())
ANSWER_URI = "/?" 
CNT = 0

for elem in ANSWER:
    CNT += 1
    ANSWER_URI += "key" + str(CNT) + "=" + elem

    if CNT < 9:
        ANSWER_URI += "&"

resp = requests.get(url = URL + ANSWER_URI, cookies = COOKIES)

print(resp.text)
