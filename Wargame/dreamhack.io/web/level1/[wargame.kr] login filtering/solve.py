from bs4 import BeautifulSoup
import requests

URL = "http://host3.dreamhack.games:15956/"
PAYLOAD = {'id': 'GUEST', 'ps': 'guest'}

resp = requests.post(URL, data=PAYLOAD)

FLAG = resp.text[resp.text.find("FLAG : "):resp.text.find("<!DOCTYPE html>")]

print(FLAG)