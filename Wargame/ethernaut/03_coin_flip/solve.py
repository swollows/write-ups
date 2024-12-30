from web3 import Web3
import time

# 풀이
# 1. 

# 문제에서 사용하는 각종 정보 추출
def parse_env_to_dict(env_file_path):
    env_dict = {}

    # Read the .env file line by line
    with open(env_file_path, "r") as file:
        for line in file:
            # Strip whitespace and ignore comments or empty lines
            line = line.strip()
            if not line or line.startswith("#"):
                continue

            # Split key and value on the first '='
            key, _, value = line.partition("=")
            key = key.strip()
            value = value.strip()

            # Remove quotes from the value if present
            if (value.startswith('"') and value.endswith('"')) or (value.startswith("'") and value.endswith("'")):
                value = value[1:-1]

            # Add to dictionary
            env_dict[key] = value

    return env_dict

ENV_PATH = "../.env"

dict_output = parse_env_to_dict(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']

CONTRACT_ADDRESS = '0x25B523D2B08e2E164B772C3580a8d7EFC71A9A4C'
PRIVATE_KEY = '0x' + dict_output['USER_ADDRESS_PRIVATE_KEY']

web3 = Web3(Web3.HTTPProvider(RPC_URI))

PA = web3.eth.account.from_key(PRIVATE_KEY)
USER_ADDRESS = PA.address

CONTRACT_ABI = [
    {
        "type": "constructor",
        "inputs": [],
        "stateMutability": "nonpayable"
    },
    {
        "type": "function",
        "name": "consecutiveWins",
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
        "signature": "0xe6f334d7"
    },
    {
        "type": "function",
        "name": "flip",
        "inputs": [
            {
                "name": "_guess",
                "type": "bool",
                "internalType": "bool"
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
        "signature": "0x1d263f67"
    }
]

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=CONTRACT_ABI)

FACTOR = 57896044618658097711785492504343953926634992332820282019728792003956564819968
TOTAL_WINS = contract.functions.consecutiveWins().call()
SUCCEEDED_BLOCK_NUM = 0

print(f"Current Total Wins on Start: {TOTAL_WINS}")

with open('./succeeded_block_num', mode='r') as f:
    TMP = int(f.read(), base=10)
    if TMP != 0:
        SUCCEEDED_BLOCK_NUM = TMP

while True:
    BEFORE_WINS = contract.functions.consecutiveWins().call()
    LAST_BLOCK_NUMBER = web3.eth.get_block_number() - 1
    LAST_HASH = web3.eth.get_block(LAST_BLOCK_NUMBER)['hash']

    BLOCK_VALUE = int.from_bytes(LAST_HASH, byteorder='big')

    if SUCCEEDED_BLOCK_NUM == LAST_BLOCK_NUMBER:
        continue
    
    COIN_FLIP = BLOCK_VALUE // FACTOR
    GUESS = COIN_FLIP == 1 if True else False
    
    print(f"Last Block Number : {LAST_BLOCK_NUMBER}")
    print(f"Block Value : {BLOCK_VALUE}")
    print(f"Block Value // Factor : {COIN_FLIP}")
    print(f"_guess : {GUESS}")

    # flip 함수 호출하여 동전 면 맞추기
    data = {
        'from': USER_ADDRESS,
        'value': 0,
        'gas': web3.to_wei("0.000000000001", 'ether'),
        'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
    }

    # 트랜젝션 서명 및 전송
    tx = contract.functions.flip(GUESS).build_transaction(data)
    signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
    tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

    print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

    # 트랜잭션 결과 확인
    tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
    print(f"Transaction Receipt: {tx_receipt}")

    TOTAL_WINS = contract.functions.consecutiveWins().call()
    print(f"Current Total Wins: {TOTAL_WINS}")

    if BEFORE_WINS < TOTAL_WINS:
        SUCCEEDED_BLOCK_NUM = web3.eth.get_block_number() - 1
        with open('./succeeded_block_num', mode='w') as f:
            f.write(str(SUCCEEDED_BLOCK_NUM))
    elif TOTAL_WINS == 10:
        print("Clear! You wins Coin Flip 10 times!")
        exit(0)