# Bytes and Big Integers write-up
# 1. convert long to bytes using long_to_bytes() function
# 2. decode bytes to utf-8

from Crypto.Util.number import *

ENC_FLAG = 11515195063862318899931685488813747395775516287289682636499965282714637259206269

FLAG = long_to_bytes(ENC_FLAG).decode("utf-8")

print(FLAG)
