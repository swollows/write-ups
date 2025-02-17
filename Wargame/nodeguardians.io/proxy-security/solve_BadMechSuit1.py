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

CONTRACT_ADDRESS = '0xB039d95F150Fa028aaa87Dae85DA09cd1284520E'
PRIVATE_KEY = '0x' + dict_output['USER_ADDRESS_PRIVATE_KEY']

web3 = Web3(Web3.HTTPProvider(RPC_URI))

# 연결 확인
if web3.is_connected():
    print("Connected to Seth!")
else:
    print("Failed to connect to Seth.")
    
PA = web3.eth.account.from_key(PRIVATE_KEY)
USER_ADDRESS = PA.address

BADMECHSUIT1_ABI = [
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
        "inputs":[
            {
                "internalType":"address",
                "name":"_impl",
                "type":"address"
            }
        ],
        "name":"upgradeTo",
        "outputs":[],
        "stateMutability":"nonpayable",
        "type":"function"
    }
]

SUITLOGICV0_ABI = [
    {
        "inputs":[],
        "stateMutability":"nonpayable",
        "type":"constructor"
    },
    {
        "inputs":[],
        "name":"consumeFuel",
        "outputs":[],
        "stateMutability":"nonpayable",
        "type":"function"
    },
    {
        "inputs":[],
        "name":"throwFists",
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

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=SUITLOGICV0_ABI)

tx = contract.functions.consumeFuel().build_transaction({
    'from' : USER_ADDRESS,
    'nonce' : web3.eth.get_transaction_count(USER_ADDRESS),
})

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")