from bs4 import BeautifulSoup
import requests

# Local
#URL = "http://localhost:8000"

# Remote
URL = "http://host3.dreamhack.games:14404//flag.php"

# 풀이
# 방법 1. flag.php 부분을 URI Encode로 강제로 바꿔서 브라우저에서 호출
# 방법 2. PHP에서 URL을 구분할때 //는 Host, /는 Path로 구분한다는 것을 응용해서 preg_match 필터 우회
#       . PAYLOAD : //flag.php (flag.php를 Host로 인식하게끔 우회 가능)