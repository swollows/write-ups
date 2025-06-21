import base64
import hashlib
import pickle

COOKIE = ".eJyrViotTi1SsqpWKsrPSVWygnB1wFReYi5IJLg8PycnvzxYqbYWAG_1D_k.aFVB0w.tGQkuhVospMsKPShU_xzocEFlms"

data = pickle.loads(base64.b64decode(COOKIE))

value = data.get('value')

print(value)