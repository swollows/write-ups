
with open('./wordlist.txt', mode="w") as f:
    for i in range(10000000,100000000):
        PAYLOAD = str(i) + 'salt_for_you'
        f.write(PAYLOAD)
        print(i)