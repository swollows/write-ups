XOR_KEY = b'\x10\x20\x30'
SERIAL = b"\x5B\x13\x49\x77\x13\x5E\x7D\x13"

NAME = ""

idx = 0

for elem in SERIAL:
    if idx == 3: idx = 0
    NAME += chr(elem ^ XOR_KEY[idx])
    idx += 1

print(f"Name: {NAME}")