import requests

URL = "http://host1.dreamhack.games:20158"
CSP_URI = "/verify"
PAYLOAD = "script-src 'sha256-l1OSKODPRVBa1/91J7WfPisrJ6WCxCRnKFzXaOkpsY4=' 'sha256-pasqAKBDmFT4eHoN2ndd6lN370kFiGUFyTiUHWhU7k8='"
DATA = {'csp': PAYLOAD}

resp = requests.post(URL + CSP_URI, data=DATA)

print(resp.text)