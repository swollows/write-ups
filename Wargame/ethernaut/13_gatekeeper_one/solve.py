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

CONTRACT_ADDRESS = '0xeC4cFde48EAdca2bC63E94BB437BbeAcE1371bF3'
ATTACKER_ADDRESS = ''
LEVEL_ADDRESS = '0x' + dict_output['ETHERNAUT_LEVEL13_ADDRESS']
PRIVATE_KEY = '0x' + dict_output['USER_ADDRESS_PRIVATE_KEY']

web3 = Web3(Web3.HTTPProvider(RPC_URI))

# 연결 확인
if web3.is_connected():
    print("Connected to Seth!")
else:
    print("Failed to connect to Seth.")
    
PA = web3.eth.account.from_key(PRIVATE_KEY)
USER_ADDRESS = PA.address

CONTRACT_ABI = [
    {
        "type": "function",
        "name": "enter",
        "inputs": [
            {
                "name": "_gateKey",
                "type": "bytes8",
                "internalType": "bytes8"
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
        "signature": "0x3370204e"
    },
    {
        "type": "function",
        "name": "entrant",
        "inputs": [],
        "outputs": [
            {
                "name": "",
                "type": "address",
                "internalType": "address"
            }
        ],
        "stateMutability": "view",
        "constant": true,
        "signature": "0x9db31d77"
    }
]

ATTACKER_ABI = []

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=CONTRACT_ABI)
attacker = web3.eth.contract(address=ATTACKER_ADDRESS, abi=ATTACKER_ABI)

print("---- BEFORE TRANSACTION ----")


tx = attacker.enter(_gateKey).build_transaction({
    "from": USER_ADDRESS,
    "gas": 8191,
    "gasPrice": w3.to_wei(0.000001, "ether"),
    "nonce": web3.eth.get_transaction_count(from_address),
})

signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.rawTransaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")
receipt = web3.eth.wait_for_transaction_receipt(tx_hash)

contract_address = receipt.contractAddress
print(f"Contract deployed at: {contract_address}\n")

print("---- AFTER TRANSACTION ----")