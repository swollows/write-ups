import requests

headers={'API-KEY':'dxbnpizvkhwtuxeo'}

url = 'http://host3.dreamhack.games:15381/api/memo'

res = requests.get(url, headers=headers)

print(res.text)