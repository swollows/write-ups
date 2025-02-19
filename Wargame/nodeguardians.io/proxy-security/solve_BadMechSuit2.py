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

CONTRACT_ADDRESS = '0xb1833D0AB482998fd6e8A91ba4223485827C168b'
PRIVATE_KEY = '0x' + dict_output['USER_ADDRESS_PRIVATE_KEY']

web3 = Web3(Web3.HTTPProvider(RPC_URI))

# 연결 확인
if web3.is_connected():
    print("Connected to Network!")
else:
    print("Failed to connect to Network.")
    
PA = web3.eth.account.from_key(PRIVATE_KEY)
USER_ADDRESS = PA.address

BADMECHSUIT2_ABI = [
    {
        "inputs":[],
        "stateMutability":"nonpayable",
        "type":"constructor"
    },
    {
        "stateMutability":"nonpayable",
        "type":"fallback"
    },
    {
        "inputs":[],
        "name":"upgrade",
        "outputs":[],
        "stateMutability":"nonpayable",
        "type":"function"
    }
]

SUITLOGICV1_ABI = [
    {
        "inputs":[
            {
                "internalType":"uint256",
                "name":"times",
                "type":"uint256"
            }
        ],
        "name":"fireCrossbow",
        "outputs":[
            {
                "internalType":"bytes32",
                "name":"",
                "type":"bytes32"
            }
        ],
        "stateMutability":"nonpayable",
        "type":"function"
    },
    {
        "inputs":[],
        "name":"initialize",
        "outputs":[],
        "stateMutability":"nonpayable",
        "type":"function"
    }
]

SUITLOGICV2_ABI = [
    {
        "inputs":[],
        "name":"swingSword",
        "outputs":[
            {
                "internalType":"bytes32",
                "name":"",
                "type":"bytes32"
            }
        ],
        "stateMutability":"view",
        "type":"function"
    }
]

contract_badmechsuit2 = web3.eth.contract(address=CONTRACT_ADDRESS, abi=BADMECHSUIT2_ABI)

tx = contract_badmechsuit2.functions.upgrade().build_transaction({
    'from' : USER_ADDRESS,
    'nonce' : web3.eth.get_transaction_count(USER_ADDRESS),
})

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")