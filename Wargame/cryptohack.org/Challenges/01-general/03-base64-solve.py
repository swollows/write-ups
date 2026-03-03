# Base64 write-up
# 1. convert hex string to bytes
# 2. encode bytes to base64
# 3. decode base64 bytes to base64 utf-8

import base64

ENC_FLAG = "72bca9b68fc16ac7beeb8f849dca1d8a783e8acf9679bf9269f7bf"

FLAG = base64.b64encode(bytes.fromhex(ENC_FLAG)).decode("utf-8")

print(FLAG)
