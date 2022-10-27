import pickle

with open('mem.pkl', 'rb') as f:
    data = pickle.load(f)

out = []
for v in data:
    if not v:
        continue
    print(hex(v)[2:].zfill(8), end='')

