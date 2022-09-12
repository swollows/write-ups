def fixed_xor(string, key):
    string = list(bytes.fromhex(string))
    key = list(bytes.fromhex(key))

    return ''.join([chr(a ^ b) for (a, b) in zip(string, key)])

KEY = '1c0111001f010100061a024b53535009181c'
SAMPLE = '686974207468652062756c6c277320657965'

print('[+] BEFORE DATA : ', bytes.fromhex(SAMPLE).decode('utf-8'))
print('[+] AFTER DATA : ', fixed_xor(SAMPLE, KEY))