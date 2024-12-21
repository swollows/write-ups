from web3 import Web3, HTTPProvider
from bs4 import BeautifulSoup
from requests import Session
from requests.adapters import HTTPAdapter
import requests
import json

# 풀이
# 1. 

# 문제에서 사용하는 각종 정보 추출
APP_URL = "http://localhost:8080" # 3번째 링크
PROXY_URL = "http://localhost:8545" # 2번째 링크
PROB_URL = "http://localhost:20000" # 1번째 링크
ETH_URL = "http://ethereum:8545"

AUTHORIZATION_KEY = "authorization"

PROXIES = {
    "http": PROXY_URL
}

API_INFO_URL = f'{APP_URL}/api/info'

resp = requests.get(API_INFO_URL)

JSON_OBJECT = json.loads(resp.text)

SERVING_ACCOUNT = JSON_OBJECT["account"]

# 스마트 컨트랙트 ABI 설정
ABI = [
    {
      "inputs": [
        {
          "internalType": "string",
          "name": "_greeting",
          "type": "string"
        }
      ],
      "stateMutability": "nonpayable",
      "type": "constructor"
    },
    {
      "inputs": [],
      "name": "greet",
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
      "name": "isSolved",
      "outputs": [
        {
          "internalType": "bool",
          "name": "",
          "type": "bool"
        }
      ],
      "stateMutability": "view",
      "type": "function"
    },
    {
      "inputs": [
        {
          "internalType": "string",
          "name": "_greeting",
          "type": "string"
        }
      ],
      "name": "setGreeting",
      "outputs": [],
      "stateMutability": "nonpayable",
      "type": "function"
    }
]

# Session 생성
session = Session()
session.proxies.update(PROXIES)
session.mount("http://", HTTPAdapter())

# 스마트 컨트랙트 연결
web3 = Web3(Web3.HTTPProvider(PROXY_URL, session=session))

# 연결 확인
if web3.is_connected():
    print("Connected to Geth!")
else:
    print("Failed to connect to Geth.")
  
# 네트워크 ID 확인
network_id = web3.net.version
print(f"Connected to network ID: {network_id}")

# RPC 모듈 정보 확인
resp = web3.provider.make_request("rpc_modules", [])
modules = resp.get("result", {})

print("RPC Modules:")
for module, version in modules.items():
    print(f"- {module}: {version}")

# Web3 클라이언트 버전 확인
web3_client_ver = web3.client_version
print(f"Web3 Client Version: {web3_client_ver}")

# 트랜잭션 결과 확인
tx_hash = "0x30406d912a22ec20495907a16feebb910bdacba27db40b8aa91894a0edfa730d"
transact_result = web3.eth.get_transaction_receipt(tx_hash)
print(f"Transaction Result: {transact_result}")

# 트랜잭션 횟수 확인
transact_count = web3.eth.get_transaction_count(SERVING_ACCOUNT, block_identifier='latest')
print(f'Transaction Count: {transact_count}')

'''
# 현재 조회하는 주소에서 특정 저장소 슬롯 데이터 조회하기
UINT256_Zero_SHA3 = web3.solidity_keccak(['uint256'], [0])
UINT256_One_SHA3 = web3.solidity_keccak(['uint256'], [0])

IDX_0_DATA = ""
IDX_1_DATA = ""

for i in range(3):
    Zero_SHA3_HEX = "0x" + UINT256_Zero_SHA3.hex()
    One_SHA3_HEX = "0x" + UINT256_One_SHA3.hex()
'''

code = web3.eth.get_code(SERVING_ACCOUNT, block_identifier='latest')
print(f'Code: {code}')

'''
contract = web3.eth.contract(address=SERVING_ACCOUNT, abi=ABI)

ANSWER = "HelloChainFlag"

# 
GREET_RETURN = contract.functions.isSolved().call()

print(GREET_RETURN)
#SET_GREETING_RETURN = contract.functions.setGreeting(ANSWER).call()

# 답안 1.
# 확인한 데이터로 FLAG 호출
#FLAG = contract.functions.isSolved().call()

#print(FLAG)
'''