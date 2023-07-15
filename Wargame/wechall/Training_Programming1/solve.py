import requests
import base64

prob_url = "https://www.wechall.net/challenge/training/programming1/index.php?action=request"
sol_url = "https://www.wechall.net/challenge/training/programming1/index.php?answer="
WC = "17997040-12786-mEnfghCU61nlTFm5"

cookie = {'WC':WC}

resp = requests.get(prob_url, cookies=cookie)

ans = sol_url + resp.text

resp = requests.get(ans, cookies=cookie)

if resp.text.find('Your answer is correct'):
    print('Correct! Problem solved.')
else:
    print('Beep! Wrong answer! Try Again!')