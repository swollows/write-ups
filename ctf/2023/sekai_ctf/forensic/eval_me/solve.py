import json

XOR_KEY='s3k@1_v3ry_w0w'
XOR_KEY_LEN = len(XOR_KEY)

FLAG = ''
ENC_LIST = []

f = open('./enc_data/%5c', 'r')

JSON_DATA = json.loads(f.readline())

ENC_LIST.append(int(JSON_DATA['data'], 16))

for i in range(2, 102, 2):
    f = open('./enc_data/%5c('+str(i)+')')
    
    JSON_DATA = json.loads(f.readline())

    ENC_LIST.append(int(JSON_DATA['data'], 16))

for idx in range(len(ENC_LIST)):
    FLAG += chr(ENC_LIST[idx] ^ ord(XOR_KEY[idx % XOR_KEY_LEN]))

print(FLAG)