from pwn import *
import base64
import codecs
import json

r = remote('socket.cryptohack.org', 13377)

send_answer = {
    "decoded": "changeme"
}

for i in range(100):
    data = r.recvuntil(b'\n', drop='\n')
    data = json.loads(data)

    print(data['type'], data['encoded'])

    if data['type'] == 'base64':
        answer = base64.b64decode(data['encoded'].encode('utf-8')).decode('utf-8')
        print(answer)
    elif data['type'] == 'rot13':
        answer = codecs.decode(data['encoded'], 'rot-13')
        print(answer)
    elif data['type'] == 'bigint' or data['type'] == 'hex':
        answer = bytes.fromhex(data['encoded'].replace('0x', '')).decode('utf-8')
        print(answer)
    elif data['type'] == 'utf-8':
        answer = bytes(data['encoded']).decode('utf-8')
        print(answer)

    send_answer['decoded'] = answer
    r.sendline(json.dumps(send_answer).encode())

data = r.recvuntil(b'\n', drop='\n')
tmp = json.loads(data)
flag = tmp['flag']

print(flag)