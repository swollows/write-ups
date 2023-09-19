import requests

resp = requests.post('http://13.125.26.213:4444/upload')

print(resp.text)