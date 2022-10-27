import pickle

with open('i-0aa_obj.pkl', 'rb') as f:
    data = pickle.load(f)
    print(data)