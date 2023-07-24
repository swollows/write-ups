from bs4 import BeautifulSoup
import requests
import json


api_key = 'sepevapvtifhjhbb'
resp = requests.get(headers={"API-KEY": api_key}, url="http://host3.dreamhack.games:8409/api/memo")
flag = json.loads(resp.text)
print(flag['memo'][0]['memo'])