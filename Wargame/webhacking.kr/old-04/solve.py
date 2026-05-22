import pickle
import requests
import re

URL = "https://webhacking.kr/challenge/web-04/"
COOKIES = {
    "PHPSESSID": "mpkd577e0q8p2jgb5na52aovld"
}

# 테이블 로드
with open("table.pkl", "rb") as f:
    table = pickle.load(f)

# 해시값 가져오기
session = requests.Session()
session.cookies.update(COOKIES)

resp = session.get(URL)
# 페이지에서 해시값 추출 (40자리 sha1)
match = re.search(r'[a-f0-9]{40}', resp.text)

if match:
    target = match.group()
    print(f"해시값: {target}")
    result = table.get(target)
    if result:
        print(f"found: {result}")

        DATA = {
            "key": str(result) + "salt_for_you"
        }

        # 정답 제출
        resp = session.post(URL, data=DATA)
        print(resp.text)
    else:
        print("not found")
else:
    print("해시값을 찾을 수 없음")
