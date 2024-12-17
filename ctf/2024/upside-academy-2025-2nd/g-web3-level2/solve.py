from web3 import Web3
import os
import requests
import json

ans1 = 31337
ans2 = ""

SHA3_256_HASHED = [
    "0x32cefdcd8e794145c9af8dd1f4b1fbd92d6e547ae855553080fc8bd19c4883a0",
    "0x2304e88f144ae9318c71b0fb9e0f44bd9e0c6c58fb1b5315a35fd8b4b2a444ab",
    "0x60a73bfb121a98fb6b52dfb29eb0defd76b60065b8cf07902baf28c167d24daf",
    "0xea00237ef11bd9615a3b6d2629f2c6259d67b19bb94947a1bd739bae3415141c",
    "0xf1918e8562236eb17adc8502332f4c9c82bc14e19bfc0aa10ab674ff75b3d2f3",
    "0xa8982c89d80987fb9a510e25981ee9170206be21af3c8e0eb312ef1d3382e761"
]

for elem in SHA3_256_HASHED:
    for data in range(256):
        KECCAK_HASH = Web3.to_hex(Web3.solidity_keccak(['bytes'], [hex(data)]))

        if elem == KECCAK_HASH:
            ans2 += hex(data).replace("0x", '')
            break

# 풀이
# 1. Web3의 RPC 통신을 통해서 submit이라는 함수에 input 변수를 전송할 수 있도록 API 구성
# 2. 문제에서 제공하는 해당 스마트 컨트랙트 관련 정보 수집
# 3. 문제 통과 조건 (giveMeFlag 함수)
#    1) ans1 매개변수가 31337 일것
#    2) ans2 매개변수 데이터가 6바이트 길이의 바이트 문자열이며 각 자리를 keccak256 함수에 해시와 했을때 동일할 것
#    3) tx.origin과 msg.sender

# 문제에서 사용하는 각정 정보 추출
MAIN_URL = "http://host3.dreamhack.games:22113"

START_URL = f"{MAIN_URL}/start"

resp = requests.get(START_URL)

JSON_OBJECT = json.loads(resp.text)

MID_URL = JSON_OBJECT['message'].split('/')[1]
INFO_URL = f"{MAIN_URL}/{MID_URL}/info"
RESET_URL = f"{MAIN_URL}/{MID_URL}/reset"
FLAG_URL = f"{MAIN_URL}/{MID_URL}/flag"
RPC_URL = f"{MAIN_URL}/{MID_URL}/rpc"

resp = requests.get(INFO_URL)

JSON_OBJECT = json.loads(resp.text)

CONTRACT_ADDRESS = JSON_OBJECT["message"]["level_contract_address"]
USER_PRIV_KEY = JSON_OBJECT["message"]["user_private_key"]
USER_ADDRESS = JSON_OBJECT["message"]["user_address"]

# 스마트 컨트랙트 연결
web3 = Web3(Web3.HTTPProvider(RPC_URL))

with open("./solidity/compiled_code.json", "r") as f:
    tmp = f.read()
    JSON_OBJECT = json.loads(tmp)

# 스마트 컨트랙트 ABI 설정
ABI = json.loads(JSON_OBJECT["contracts"]["ExternalContract.sol"]["ExternalContract"]["metadata"])["output"]["abi"]
BYTECODE = JSON_OBJECT["contracts"]["ExternalContract.sol"]["ExternalContract"]["evm"]["bytecode"]["object"]

# 스마트 컨트랙트 인스턴스 생성
contract = web3.eth.contract(bytecode=BYTECODE, abi=ABI)

# giveMeFlag 함수의 매개변수 ans1에 31337, ans2에 0x757073696465을 전달
# 사용자 주소를 활용해서 컨트랙트  호출
tx = contract.functions.callGiveMeFlag(ans1, bytes.fromhex(ans2)).build_transaction({
    'from' : USER_ADDRESS,
    'to' : USER_ADDRESS,
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

print(resp.text)

'''
JSON_OBJECT = json.loads(resp.text)
FLAG = JSON_OBJECT["message"].replace("\n", "")

print(FLAG)
'''