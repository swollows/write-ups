from base64 import b64encode as e, b64decode as d
from Crypto.Cipher import AES

IV = b'89:;<=>?010?>=<;'
IV_NUM = 8
SEC_KEY = b'RK<>^YLR{d~edcjR'
SEC_KEY_NUM = 13
ENC_PHONE = b'pJZe83qbE1EBt43YyM57M9zMjxNXn1MKlpwNckCX0vg='
ENC_PHONE_DECODED = d(ENC_PHONE)

def de_x(enc_data, num):
    result = []
    for i in range(len(enc_data)):
        result.append(enc_data[i] ^ num)
    
    return bytes(result)

REAL_IV = de_x(IV, IV_NUM)
REAL_SEC_KEY = de_x(SEC_KEY, SEC_KEY_NUM)

print('[+] Original SEC_KEY = ', REAL_IV)
print('[+] Original IV = ', REAL_SEC_KEY)
print('[+] Original Hijacking Phone num = ', ENC_PHONE_DECODED)
