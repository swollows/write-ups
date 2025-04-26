#!/usr/bin/env python3
from cipher import STREAM
import random


if __name__ == "__main__":
    with open("flag", "rb") as f:
        flag = f.read()

    assert flag[:3] == b'DH{' and flag[-1:] == b'}'

    seed = random.getrandbits(32)
    stream = STREAM(seed, 32)

    print(f"encrypted flag > {stream.encrypt(flag).hex()}")