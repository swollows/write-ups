from web3 import Web3
from dotenv import dotenv_values

ENV_PATH = "../.env"

dict_output = dotenv_values(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']

CONTRACT_ADDRESS = '0x6A0fB2213e7D03025c2a3a24410b96bA34E85f34'
PRIVATE_KEY = '0x' + dict_output['USER_ADDRESS_PRIVATE_KEY']

web3 = Web3(Web3.HTTPProvider(RPC_URI))

# 연결 확인
if web3.is_connected():
    print("Connected to Network!\n")
else:
    print("Failed to connect to Network.\n")
    
PA = web3.eth.account.from_key(PRIVATE_KEY)
USER_ADDRESS = PA.address

BADMECHSUIT1_ABI = [
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
        "inputs":[
            {
                "internalType":"address",
                "name":"_impl",
                "type":"address"
            }
        ],
        "name":"upgradeTo",
        "outputs":[],
        "stateMutability":"nonpayable",
        "type":"function"
    }
]

SUITLOGICV0_ABI = [
    {
        "inputs":[],
        "stateMutability":"nonpayable",
        "type":"constructor"
    },
    {
        "inputs":[],
        "name":"consumeFuel",
        "outputs":[],
        "stateMutability":"nonpayable",
        "type":"function"
    },
    {
        "inputs":[],
        "name":"throwFists",
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

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=SUITLOGICV0_ABI)

data = {
    'from' : USER_ADDRESS,
    'nonce' : web3.eth.get_transaction_count(USER_ADDRESS),
}

tx = contract.functions.consumeFuel().build_transaction(data)

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)

print(f"Transaction Receipt: {tx_receipt}\n")

