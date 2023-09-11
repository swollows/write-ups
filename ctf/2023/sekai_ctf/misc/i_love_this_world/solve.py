import json
f = open('flag_data.json')

flag = ''
data = json.load(f)

for elem01 in data['library']:
    for elem02 in elem01['notes']:
        flag += elem02['lyrics']

print(flag)

f.close()