import binascii
from hashlib import sha256
import requests

def hash2(left: str, right: str) -> str:
    left_bytes = bytes.fromhex(left)[::-1]
    right_bytes = bytes.fromhex(right)[::-1]

    combined = left_bytes + right_bytes

    return sha256(sha256(combined).digest()).digest()[::-1].hex()

def make_tx_hash(seed: bytes):
    return sha256(seed).digest()[::-1].hex()

def calculate_merkle_root(tx_hashes):
    if len(tx_hashes) == 1:
        return tx_hashes[0]
    
    new_tx_hashes = []
    for i in range(0, len(tx_hashes)-1, 2):
        new_tx_hashes.append(hash2(tx_hashes[i], tx_hashes[i+1]))
    
    if len(tx_hashes) % 2 == 1:
        new_tx_hashes.append(hash2(tx_hashes[-1], tx_hashes[-1]))
        
    return calculate_merkle_root(new_tx_hashes)

URL = "http://host1.dreamhack.games:17982/"

resp = requests.get(URL)

RESULT = resp.text.split("\n")

merkle_root = RESULT[0].split("('merkle_root:', '")[1].split("')")[0]

tx_list = RESULT[1].split("tx list:")[1].strip()
tx_list = eval(tx_list)

missed_hash_keyword = '????????????????????????????????????????????????????????????????'

print(f'merkle_root: {merkle_root}')
print(f'tx_list: {tx_list}')

missed_hash_idx = tx_list.index(missed_hash_keyword)
print(f'missed_index: {missed_hash_idx}')

for i in range(0x10000):
    missed_tx_hash = make_tx_hash(bytes.fromhex(f'{i:04x}'))
    tx_list[missed_hash_idx] = missed_tx_hash

    temp = calculate_merkle_root(tx_list)

    if temp == merkle_root:
        print(f'seed: {i:04x}')
        print(f'Expected Merkle Root: {merkle_root}')
        print(f'Calculated Merkle Root: {temp}')
        print(f'Answer: {missed_tx_hash}')

        resp = requests.get(URL + 'check/' + missed_tx_hash)
        print(resp.text)
        break
    elif i == 0xFFFF:
        print(f'Expected Merkle Root: {merkle_root}')
        print(f'{binascii.unhexlify(merkle_root)}')
        print('Failed...')

