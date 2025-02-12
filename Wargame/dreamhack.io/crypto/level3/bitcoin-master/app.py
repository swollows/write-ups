#!/usr/bin/python3
from flask import Flask
import requests
import os
from time import time

from run import *

app = Flask(__name__)
app.secret_key = os.urandom(32)
mr = None
index = None
tx_hashes = None
lru_time = 0


@app.route("/")
def index():
    global mr, index, tx_hashes
    tx_hashes, mr, index, dat = main()
    return dat


@app.route("/check/<t>")
def checker(t):
    global tx_hashes, mr, index, lru_time
    if lru_time + 15 > time():
        return "nop~!"
    lru_time = time()
    if index is None or mr is None:
        return "none!"

    tx_hashes[index] = t
    if calculate_merkle_root(tx_hashes) == mr:
        from bitcoin import FLAG

        return FLAG
    else:
        return "STUDY AGAIN zz"


if __name__ == "__main__":
    app.run(host="0.0.0.0", port=8000)
