# Do Zsteg and execute URL
import requests

resp = requests.get('http://potty-training.c.ctf-snyk.io/')

print(resp.text)

# SNYK{dd67edb70a28335068dd5ea9304007b69543357ff471b3144e3355bca34cb35d}