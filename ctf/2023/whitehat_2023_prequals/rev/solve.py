import requests

HEADER = {'User-Agent' : 'K4T4L0G'}
resp = requests.post('https://penxmlformats.org/o.php', headers=HEADER)

print(resp.text)