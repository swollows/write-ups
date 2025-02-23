from dotenv import dotenv_values
from web3 import Web3
import requests
import json

# 문제에서 사용하는 각종 정보 추출
MAIN_URL = "http://localhost:8000"

START_URL = f"{MAIN_URL}/start"

resp = requests.get(START_URL)

JSON_OBJECT = json.loads(resp.text)

MID_URL = JSON_OBJECT['message'].split('/')[1]
INFO_URL = f"{MAIN_URL}/{MID_URL}/info"
FLAG_URL = f"{MAIN_URL}/{MID_URL}/flag"
RPC_URL = f"{MAIN_URL}/{MID_URL}/rpc"

resp = requests.get(INFO_URL)

JSON_OBJECT = json.loads(resp.text)

CONTRACT_ADDRESS = JSON_OBJECT["message"]["level_contract_address"]
USER_PRIV_KEY = JSON_OBJECT["message"]["user_private_key"]
USER_ADDRESS = JSON_OBJECT["message"]["user_address"]

print(JSON_OBJECT)

'''
# 스마트 컨트랙트 ABI 설정
ABI = [
    {
        "inputs": [],
        "stateMutability": "nonpayable",
        "type": "constructor"
    },
    {
        "inputs": [],
        "name": "deposit",
        "outputs": [],
        "stateMutability": "nonpayable",
        "type": "function"
    },
    {
        "inputs": [],
        "name": "getResult",
        "outputs": [
            {
                "internalType": "string",
                "name": "",
                "type": "string"
            }
        ],
        "stateMutability": "view",
        "type": "function"
    },
    {
        "inputs": [],
        "name": "runVote",
        "outputs": [],
        "stateMutability": "nonpayable",
        "type": "function"
    },
    {
        "inputs": [
            {
                "internalType": "address",
                "name": "voter",
                "type": "address"
            }
        ],
        "name": "register",
        "outputs": [],
        "stateMutability": "payable",
        "type": "function"
    }
]

# 스마트 컨트랙트 연결
web3 = Web3(Web3.HTTPProvider(RPC_URL))

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=ABI)

# submit 함수의 input 매개변수에 31337을 전달
tx = contract.functions.submit(31337).build_transaction({
    'from' : USER_ADDRESS,
    'nonce' : web3.eth.get_transaction_count(USER_ADDRESS),
})

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIV_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}")

# 플래그 출력
resp = requests.get(FLAG_URL)

JSON_OBJECT = json.loads(resp.text)
FLAG = JSON_OBJECT["message"].replace("\n", "")

print(FLAG)
'''