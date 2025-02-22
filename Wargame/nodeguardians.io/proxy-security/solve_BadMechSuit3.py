from collections import defaultdict
from web3 import Web3
from dotenv import dotenv_values

def find_keys_with_same_value(d):
    value_to_keys = defaultdict(list)  # 값을 키 리스트로 매핑

    # 딕셔너리를 순회하며 값별로 키들을 그룹화
    for key, value in d.items():
        value_to_keys[value].append(key)

    # 값이 동일한 키들을 출력
    for value, keys in value_to_keys.items():
        if len(keys) > 1:  # 같은 값이 있는 경우만 출력
            print(f"Value: {value}, Keys: {keys}")

ENV_PATH = "../.env"

dict_output = dotenv_values(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']

CONTRACT_ADDRESS = '0x3AD274cCD678573bD65371382535747Ca25DdF85'
PRIVATE_KEY = '0x' + dict_output['USER_ADDRESS_PRIVATE_KEY']

web3 = Web3(Web3.HTTPProvider(RPC_URI))

# 연결 확인
if web3.is_connected():
    print("Connected to Network!\n")
else:
    print("Failed to connect to Network.\n")
    
PA = web3.eth.account.from_key(PRIVATE_KEY)
USER_ADDRESS = PA.address

BADMECHSUIT3_ABI = [
    {
        "stateMutability":"nonpayable",
        "type":"fallback"
    },
    {
        "inputs":[
            {
                "internalType":"uint128",
                "name":"x",
                "type":"uint128"
            },
            {
                "internalType":"uint128",
                "name":"y",
                "type":"uint128"
            }
        ],
        "name":"shootTrustyRockets",
        "outputs":[
            {
                "internalType":"bytes32",
                "name":"",
                "type":"bytes32"
            }
        ],
        "stateMutability":"view",
        "type":"function"
    },
    {
        "inputs":[
            {
                "internalType":"uint8",
                "name":"mode",
                "type":"uint8"
            }
        ],
        "name":"upgradeTo",
        "outputs":[],
        "stateMutability":"nonpayable",
        "type":"function"
    }
]

MULTISUITLOGIC_ABI = [
    {
        "inputs": [
            {
                "internalType": "uint32",
                "name": "x",
                "type": "uint32"
            },
            {
                "internalType": "uint8",
                "name": "y",
                "type": "uint8"
            }
        ],
        "name": "castPoisonKnives",
        "outputs": [
            {
                "internalType": "bytes32",
                "name": "",
                "type": "bytes32"
            }
        ],
        "stateMutability": "view",
        "type": "function"
    },
    {
        "inputs": [
            {
                "internalType": "bool",
                "name": "x",
                "type": "bool"
            },
            {
                "internalType": "bool",
                "name": "y",
                "type": "bool"
            }
        ],
        "name": "crackElectricWhip",
        "outputs": [
            {
                "internalType": "bytes32",
                "name": "",
                "type": "bytes32"
            }
        ],
        "stateMutability": "view",
        "type": "function"
    },
    {
        "inputs": [
            {
                "internalType": "uint8",
                "name": "_mode",
                "type": "uint8"
            }
        ],
        "name": "initialize",
        "outputs": [],
        "stateMutability": "nonpayable",
        "type": "function"
    },
    {
        "inputs": [
            {
                "internalType": "uint32",
                "name": "x",
                "type": "uint32"
            }
        ],
        "name": "lungeGiantBlade",
        "outputs": [
            {
                "internalType": "bytes32",
                "name": "",
                "type": "bytes32"
            }
        ],
        "stateMutability": "view",
        "type": "function"
    },
    {
        "inputs": [],
        "name": "mode",
        "outputs": [
            {
                "internalType": "uint8",
                "name": "",
                "type": "uint8"
            }
        ],
        "stateMutability": "view",
        "type": "function"
    },
    {
        "inputs": [
            {
                "internalType": "uint16",
                "name": "x",
                "type": "uint16"
            }
        ],
        "name": "throwIronAxe",
        "outputs": [
            {
                "internalType": "bytes32",
                "name": "",
                "type": "bytes32"
            }
        ],
        "stateMutability": "view",
        "type": "function"
    },
    {
        "inputs": [
            {
                "internalType": "uint32",
                "name": "x",
                "type": "uint32"
            }
        ],
        "name": "tossFireBombs",
        "outputs": [
            {
                "internalType": "bytes32",
                "name": "",
                "type": "bytes32"
            }
        ],
        "stateMutability": "view",
        "type": "function"
    }
]

FUNC_SELECTOR_LIST = [
    "shootTrustyRockets(uint128,uint128)",
    "throwIronAxe(uint16)",
    "crackElectricWhip(bool,bool)",
    "castPoisonKnives(uint32,uint8)",
    "lungeGiantBlade(uint32)",
    "tossFireBombs(uint32)"
]

FUNC_SELECTOR_HASH_DICT = {}

for elem in FUNC_SELECTOR_LIST:
    FUNC_SELECTOR_HASH_DICT[elem] = Web3.keccak(text=elem)[:4].hex()

find_keys_with_same_value(FUNC_SELECTOR_HASH_DICT)

contract_badmechsuit3 = web3.eth.contract(address=CONTRACT_ADDRESS, abi=BADMECHSUIT3_ABI)
contract_multisuitlogic = web3.eth.contract(address=CONTRACT_ADDRESS, abi=MULTISUITLOGIC_ABI)

data = {
    'from' : USER_ADDRESS,
    'gas' : '0',
    'nonce' : web3.eth.get_transaction_count(USER_ADDRESS),
}

tx = contract_multisuitlogic.functions.castPoisonKnives(1, 1).build_transaction(data)

print(f"castPoisionKnives selector data : {tx["data"]}")

tx = contract_badmechsuit3.functions.shootTrustyRockets(1, 1).build_transaction(data)

print(f"shootTrustyRockets selector data : {tx["data"]}\n")


tx = contract_badmechsuit3.functions.upgradeTo(3).build_transaction(data)

gas = web3.eth.estimate_gas(tx)

tx.update({'gas': gas})

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}")