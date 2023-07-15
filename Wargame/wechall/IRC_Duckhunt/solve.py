import requests

sol_url = "https://irc.wechall.net/duck_hunt/level.php?username=SwolloW"
WC = "17998104-12786-VfKrTIjbSko90Xgs"

cookie = {'WC':WC}

resp = requests.get(url=sol_url, cookies=cookie)

print(resp.text)