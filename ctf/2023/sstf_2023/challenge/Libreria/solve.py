import requests

URL = "http://libreria.sstf.site/rest.php?cmd=requestbook&isbn=1000000000"

resp = requests.get(URL)

print(resp.text)