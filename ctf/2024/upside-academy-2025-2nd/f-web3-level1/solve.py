from web3 import Web3
import requests
import json

# 풀이
# 1. Web3의 RPC 통신을 통해서 submit이라는 함수에 input 변수를 전송할 수 있도록 API 구성
# 2. 문제에서 제공하는 해당 스마트 컨트랙트 관련 정보 수집
# 3. submit이라는 함수에 input 변수가 31337이 되도록 트랜잭션 서명 및 전송
# 4. 앱 구동시 제공하는 /랜덤문자열/flag 위치에 GET 방식으로 접속하여 출력하는 플래그 확인

# 문제에서 사용하는 각종 정보 추출
MAIN_URL = "http://host3.dreamhack.games:16669"

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

# 스마트 컨트랙트 ABI 설정
ABI = [
  {
    "inputs": [{"internalType": "uint256", "name": "input", "type": "uint256"}],
    "name": "submit",
    "outputs": [],
    "stateMutability": "nonpayable",
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