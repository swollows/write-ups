from web3 import Web3

# 풀이
# 1. 

# 문제에서 사용하는 각종 정보 추출
def parse_env_to_dict(env_file_path):
    env_dict = {}

    # Read the .env file line by line
    with open(env_file_path, "r") as file:
        for line in file:
            # Strip whitespace and ignore comments or empty lines
            line = line.strip()
            if not line or line.startswith("#"):
                continue

            # Split key and value on the first '='
            key, _, value = line.partition("=")
            key = key.strip()
            value = value.strip()

            # Remove quotes from the value if present
            if (value.startswith('"') and value.endswith('"')) or (value.startswith("'") and value.endswith("'")):
                value = value[1:-1]

            # Add to dictionary
            env_dict[key] = value

    return env_dict

ENV_PATH = "../.env"

dict_output = parse_env_to_dict(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']

CONTRACT_ADDRESS = '0xF8b046D5D2D2401c4Ac750B6ce70f98bEF40D225'
PRIVATE_KEY = '0x' + dict_output['USER_ADDRESS_PRIVATE_KEY']

web3 = Web3(Web3.HTTPProvider(RPC_URI))

# 연결 확인
if web3.is_connected():
    print("Connected to Seth!")
else:
    print("Failed to connect to Seth.")
    
PA = web3.eth.account.from_key(PRIVATE_KEY)
USER_ADDRESS = PA.address

BADMECHSUIT3_ABI = [
    {
        "stateMutability":"nonpayable",
        "type":"fallback"
    },
    {
        "inputs":[
            {
                "internalType":"uint128",
                "name":"x",
                "type":"uint128"
            },
            {
                "internalType":"uint128",
                "name":"y",
                "type":"uint128"
            }
        ],
        "name":"shootTrustyRockets",
        "outputs":[
            {
                "internalType":"bytes32",
                "name":"",
                "type":"bytes32"
            }
        ],
        "stateMutability":"view",
        "type":"function"
    },
    {
        "inputs":[
            {
                "internalType":"uint8",
                "name":"mode",
                "type":"uint8"
            }
        ],
        "name":"upgradeTo",
        "outputs":[],
        "stateMutability":"nonpayable",
        "type":"function"
    }
]

MULTISUITLOGIC_ABI = [
    {
        "inputs": [
            {
                "internalType": "uint32",
                "name": "x",
                "type": "uint32"
            },
            {
                "internalType": "uint8",
                "name": "y",
                "type": "uint8"
            }
        ],
        "name": "castPoisonKnives",
        "outputs": [
            {
                "internalType": "bytes32",
                "name": "",
                "type": "bytes32"
            }
        ],
        "stateMutability": "view",
        "type": "function"
    },
    {
        "inputs": [
            {
                "internalType": "bool",
                "name": "x",
                "type": "bool"
            },
            {
                "internalType": "bool",
                "name": "y",
                "type": "bool"
            }
        ],
        "name": "crackElectricWhip",
        "outputs": [
            {
                "internalType": "bytes32",
                "name": "",
                "type": "bytes32"
            }
        ],
        "stateMutability": "view",
        "type": "function"
    },
    {
        "inputs": [
            {
                "internalType": "uint8",
                "name": "_mode",
                "type": "uint8"
            }
        ],
        "name": "initialize",
        "outputs": [],
        "stateMutability": "nonpayable",
        "type": "function"
    },
    {
        "inputs": [
            {
                "internalType": "uint32",
                "name": "x",
                "type": "uint32"
            }
        ],
        "name": "lungeGiantBlade",
        "outputs": [
            {
                "internalType": "bytes32",
                "name": "",
                "type": "bytes32"
            }
        ],
        "stateMutability": "view",
        "type": "function"
    },
    {
        "inputs": [],
        "name": "mode",
        "outputs": [
            {
                "internalType": "uint8",
                "name": "",
                "type": "uint8"
            }
        ],
        "stateMutability": "view",
        "type": "function"
    },
    {
        "inputs": [
            {
                "internalType": "uint16",
                "name": "x",
                "type": "uint16"
            }
        ],
        "name": "throwIronAxe",
        "outputs": [
            {
                "internalType": "bytes32",
                "name": "",
                "type": "bytes32"
            }
        ],
        "stateMutability": "view",
        "type": "function"
    },
    {
        "inputs": [
            {
                "internalType": "uint32",
                "name": "x",
                "type": "uint32"
            }
        ],
        "name": "tossFireBombs",
        "outputs": [
            {
                "internalType": "bytes32",
                "name": "",
                "type": "bytes32"
            }
        ],
        "stateMutability": "view",
        "type": "function"
    }
]

contract_badmechsuit3 = web3.eth.contract(address=CONTRACT_ADDRESS, abi=BADMECHSUIT3_ABI)
contract_multisuitlogic = web3.eth.contract(address=CONTRACT_ADDRESS, abi=MULTISUITLOGIC_ABI)
'''
tx = contract_suitlogicv1.functions.fireCrossbow(9).build_transaction({
    'from' : USER_ADDRESS,
    'nonce' : web3.eth.get_transaction_count(USER_ADDRESS),
})

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")
'''
tx = contract_badmechsuit3.functions.upgradeTo(3).build_transaction({
    'from' : USER_ADDRESS,
    'nonce' : web3.eth.get_transaction_count(USER_ADDRESS),
})

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

tx = contract_multisuitlogic.functions.

'''
tx = contract.functions.consumeFuel().build_transaction({
    'from' : USER_ADDRESS,
    'nonce' : web3.eth.get_transaction_count(USER_ADDRESS),
})

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")
'''
'''
# 숫자 1에 대한 SHA3 해시 구하기
UINT256_One_SHA3 = web3.solidity_keccak(['uint256'], [1])

# 숫자 1에 대한 SHA3 해시를 16진수 문자열로 변환
UINT256_One_SHA3_to_HEXSTR = "0x" + UINT256_One_SHA3.hex()

# 구한 해시 바이트 배열을 부호없는 정수로 변환한 값에 +1 한 값을 다시 SHA3 해시 문자열로 변환
# (솔리디티는 빅엔디안 방식 사용)
UINT256_One_SHA3_plus_One_to_HEXSTR = (int.from_bytes(UINT256_One_SHA3, byteorder="big") + 1).to_bytes(len(UINT256_One_SHA3), 'big', signed=False).hex()

# 1번 읽어올때 32바이트씩 읽어옴
FUEL01 = web3.eth.get_storage_at(CONTRACT_ADDRESS, UINT256_One_SHA3_to_HEXSTR)

# 플래그의 길이는 32바이트가 넘어가므로 첫번째 호출한 해시에서 +1한 값으로 두번째 호출
FUEL02 = web3.eth.get_storage_at(CONTRACT_ADDRESS, UINT256_One_SHA3_plus_One_to_HEXSTR)

print(FUEL01 + FUEL02)
'''

'''
BEFORE_OWNER = contract.functions.owner().call({'from': USER_ADDRESS})

if BEFORE_OWNER != USER_ADDRESS:
    print("Contract's Owner is not changed!")
else:
    print("Contract's Owner is already changed!")
    exit(0)

RESULT = contract.functions.getContribution().call()

print(RESULT)
print(BEFORE_OWNER)

RESULT = contract.functions.contributions(BEFORE_OWNER).call()

print(RESULT)

data = {
    'from': USER_ADDRESS,
    'to': CONTRACT_ADDRESS,
    'value': web3.to_wei(0.0001, 'ether'),
    'gasPrice': web3.eth.gas_price,
    'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
    'chainId': web3.eth.chain_id,
    'gas': 100000,
}

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(data, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}")

# 소유주 변경 확인
AFTER_OWNER = contract.functions.owner().call({'from': USER_ADDRESS})

if AFTER_OWNER != USER_ADDRESS:
    print("Contract's Owner has not changed!")
    exit(0)
else:
    print("Contract's Owner has changed!")

# 잔액 인출
tx = contract.functions.withdraw().build_transaction({
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

'''