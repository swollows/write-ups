
# A very simple Flask Hello World app for you to get started with...

from flask import Flask, request
import os
import sys
import time
import hashlib
import string
import random

app = Flask(__name__)

@app.route('/')
def m():
    return 'hihi'

@app.route("/q1", methods=['GET'])
def q1():
#    FLAG1 = b'*** REDACTED ***'
    with open('./flag01', 'rb') as f:
        FLAG1 = f.read()
    assert(len(FLAG1) == 32)
    assert(FLAG1.decode().isprintable())
    t = round(time.time(),2)
    h = hashlib.sha256(str(t).encode()).digest()
    ret = ''
    for i in range(32):
        ret += hex(h[i] ^ FLAG1[i])[2:].zfill(2)
    return ret

@app.route("/q2", methods=['GET'])
def q2():
    with open('./flag02', 'rb') as f:
        FLAG2 = f.read()
#    FLAG2 = b'*** REDACTED ***'
    def score(x):
        if type(x) == str:
            x = x.encode()
        h = hashlib.sha256(x).digest()
        return 10000 - sum(h)

    userid = request.args.get('userid', default = 'guest', type = str)

    T = 100000

    my_score = score(userid)

    for i in range(T):
        computer_score = score(''.join(sorted(random.sample(string.ascii_uppercase, k=6))))
        if my_score < computer_score:
            return f"hi {userid}, you loooose :("

    return FLAG2