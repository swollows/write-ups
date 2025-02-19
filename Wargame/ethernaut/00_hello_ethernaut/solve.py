from web3 import Web3
from dotenv import dotenv_values
import requests
import json

# 풀이
# 1. info 함수부터 본 문제에서 실행할때마다 안내하는 함수 순서대로 실행하면 문제 해결 가능

ENV_PATH = "../.env"

dict_output = dotenv_values(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']

CONTRACT_ADDRESS = '0x61c36a8d610163660E21a8b7359e1Cac0C9133e1'
PRIVATE_KEY = '0x' + dict_output['USER_ADDRESS_PRIVATE_KEY']

web3 = Web3(Web3.HTTPProvider(RPC_URI))

# 연결 확인
if web3.is_connected():
    print("Connected to Network!")
else:
    print("Failed to connect to Network.")

PA = web3.eth.account.from_key(PRIVATE_KEY)
USER_ADDRESS = PA.address

CONTRACT_ABI = [
    {
        "type": "constructor",
        "inputs": [
            {
                "name": "_password",
                "type": "string",
                "internalType": "string"
            }
        ],
        "stateMutability": "nonpayable"
    },
    {
        "type": "function",
        "name": "authenticate",
        "inputs": [
            {
                "name": "passkey",
                "type": "string",
                "internalType": "string"
            }
        ],
        "outputs": [],
        "stateMutability": "nonpayable",
        "signature": "0xaa613b29"
    },
    {
        "type": "function",
        "name": "getCleared",
        "inputs": [],
        "outputs": [
            {
                "name": "",
                "type": "bool",
                "internalType": "bool"
            }
        ],
        "stateMutability": "view",
        "constant": True,
        "signature": "0x3c848d78"
    },
    {
        "type": "function",
        "name": "info",
        "inputs": [],
        "outputs": [
            {
                "name": "",
                "type": "string",
                "internalType": "string"
            }
        ],
        "stateMutability": "pure",
        "constant": True,
        "signature": "0x370158ea"
    },
    {
        "type": "function",
        "name": "info1",
        "inputs": [],
        "outputs": [
            {
                "name": "",
                "type": "string",
                "internalType": "string"
            }
        ],
        "stateMutability": "pure",
        "constant": True,
        "signature": "0xd4c3cf44"
    },
    {
        "type": "function",
        "name": "info2",
        "inputs": [
            {
                "name": "param",
                "type": "string",
                "internalType": "string"
            }
        ],
        "outputs": [
            {
                "name": "",
                "type": "string",
                "internalType": "string"
            }
        ],
        "stateMutability": "pure",
        "constant": True,
        "signature": "0x2133b6a9"
    },
    {
        "type": "function",
        "name": "info42",
        "inputs": [],
        "outputs": [
            {
                "name": "",
                "type": "string",
                "internalType": "string"
            }
        ],
        "stateMutability": "pure",
        "constant": True,
        "signature": "0x2cbd79a5"
    },
    {
        "type": "function",
        "name": "infoNum",
        "inputs": [],
        "outputs": [
            {
                "name": "",
                "type": "uint8",
                "internalType": "uint8"
            }
        ],
        "stateMutability": "view",
        "constant": True,
        "signature": "0xc253aebe"
    },
    {
        "type": "function",
        "name": "method7123949",
        "inputs": [],
        "outputs": [
            {
                "name": "",
                "type": "string",
                "internalType": "string"
            }
        ],
        "stateMutability": "pure",
        "constant": True,
        "signature": "0xf0bc7081"
    },
    {
        "type": "function",
        "name": "password",
        "inputs": [],
        "outputs": [
            {
                "name": "",
                "type": "string",
                "internalType": "string"
            }
        ],
        "stateMutability": "view",
        "constant": True,
        "signature": "0x224b610b"
    },
    {
        "type": "function",
        "name": "theMethodName",
        "inputs": [],
        "outputs": [
            {
                "name": "",
                "type": "string",
                "internalType": "string"
            }
        ],
        "stateMutability": "view",
        "constant": True,
        "signature": "0xf157a1e3"
    }
]

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=CONTRACT_ABI)

INFO_FUNC_RESULT = contract.functions.info().call({'from': USER_ADDRESS})

print(INFO_FUNC_RESULT)

INFO1_FUNC_RESULT = contract.functions.info1().call({'from': USER_ADDRESS})

print(INFO1_FUNC_RESULT)

INFO2_FUNC_RESULT = contract.functions.info2("hello").call({'from': USER_ADDRESS})

print(INFO2_FUNC_RESULT)

INFONUM_FUNC_RESULT = contract.functions.infoNum().call({'from': USER_ADDRESS})

print(INFONUM_FUNC_RESULT)

NUM_STR = str(INFONUM_FUNC_RESULT)

exec(f"INFO{NUM_STR}_FUNC_RESULT = contract.functions.info{NUM_STR}().call({{'from': USER_ADDRESS}})")

print(eval("INFO" + NUM_STR + "_FUNC_RESULT"))

THEMETHODNAME_FUNC_RESULT = contract.functions.theMethodName().call({'from': USER_ADDRESS})

print(THEMETHODNAME_FUNC_RESULT)

METHOD7123949_FUNC_RESULT = contract.functions.method7123949().call({'from': USER_ADDRESS})

print(METHOD7123949_FUNC_RESULT)

PASSWORD_FUNC_RESULT = contract.functions.password().call({'from': USER_ADDRESS})

print(PASSWORD_FUNC_RESULT)

tx = contract.functions.authenticate(PASSWORD_FUNC_RESULT).build_transaction({
    'from' : USER_ADDRESS,
    'nonce' : web3.eth.get_transaction_count(USER_ADDRESS),
})

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}")

GETCLEARED_FUNC_RESULT = contract.functions.getCleared().call({'from': USER_ADDRESS})

print(GETCLEARED_FUNC_RESULT)