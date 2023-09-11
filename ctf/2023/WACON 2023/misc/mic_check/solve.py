import requests

URL = "http://58.225.56.196:5000/"

resp = requests.post(URL)

print(resp.text)