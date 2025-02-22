from web3 import Web3
from dotenv import dotenv_values

ENV_PATH = "../.env"

dict_output = dotenv_values(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']

CONTRACT_ADDRESS = '0x402b1203392b3baD715fEb606Bcb5f5dc307C417'
PRIVATE_KEY = '0x' + dict_output['USER_ADDRESS_PRIVATE_KEY']

web3 = Web3(Web3.HTTPProvider(RPC_URI))

# 연결 확인
if web3.is_connected():
    print("Connected to Network!")
else:
    print("Failed to connect to Network.")
    
PA = web3.eth.account.from_key(PRIVATE_KEY)
USER_ADDRESS = PA.address

BADMECHSUIT2_ABI = [
    {
        "inputs":[],
        "stateMutability":"nonpayable",
        "type":"constructor"
    },
    {
        "stateMutability":"nonpayable",
        "type":"fallback"
    },
    {
        "inputs":[],
        "name":"upgrade",
        "outputs":[],
        "stateMutability":"nonpayable",
        "type":"function"
    }
]

SUITLOGICV1_ABI = [
    {
        "inputs":[
            {
                "internalType":"uint256",
                "name":"times",
                "type":"uint256"
            }
        ],
        "name":"fireCrossbow",
        "outputs":[
            {
                "internalType":"bytes32",
                "name":"",
                "type":"bytes32"
            }
        ],
        "stateMutability":"nonpayable",
        "type":"function"
    },
    {
        "inputs":[],
        "name":"initialize",
        "outputs":[],
        "stateMutability":"nonpayable",
        "type":"function"
    }
]

SUITLOGICV2_ABI = [
    {
        "inputs":[],
        "name":"swingSword",
        "outputs":[
            {
                "internalType":"bytes32",
                "name":"",
                "type":"bytes32"
            }
        ],
        "stateMutability":"view",
        "type":"function"
    }
]

print("---- TRIGGER SuitLogicV1.fireCrossbow(8) ----")

contract_badmechsuit2 = web3.eth.contract(address=CONTRACT_ADDRESS, abi=SUITLOGICV1_ABI)

tx = contract_badmechsuit2.functions.fireCrossbow(8).build_transaction({
    'from' : USER_ADDRESS,
    'gas' : 30000,
    'nonce' : web3.eth.get_transaction_count(USER_ADDRESS),
})

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}\n")

print("---- CHANGE LOGIC CONTRACT SuitLogicV1 to V2 ----")

contract_badmechsuit2 = web3.eth.contract(address=CONTRACT_ADDRESS, abi=BADMECHSUIT2_ABI)

tx = contract_badmechsuit2.functions.upgrade().build_transaction({
    'from' : USER_ADDRESS,
    'gas' : '0',
    'nonce' : web3.eth.get_transaction_count(USER_ADDRESS),
})

gas = web3.eth.estimate_gas(tx)

tx.update({'gas': gas})

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}")