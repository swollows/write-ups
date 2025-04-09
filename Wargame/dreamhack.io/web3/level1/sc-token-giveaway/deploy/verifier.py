from web3 import Web3
import os

rpc_url = os.environ["RPC_URL"]
contract_address = os.environ["LEVEL_CONTRACT_ADDRESS"]
user_address = os.environ["USER_ADDRESS"]

ABI = [
    {
        "type": "function",
        "name": "amoTokenBalance",
        "inputs": [{"name": "", "type": "address"}],
        "outputs": [{"name": "", "type": "uint"}],
        "stateMutability": "view",
    }
]


def verify():
    w3 = Web3(Web3.HTTPProvider(rpc_url))
    assert w3.is_connected(), "RPC server must be connectable"

    contract = w3.eth.contract(address=contract_address, abi=ABI)
    user_balance = contract.functions.amoTokenBalance(user_address).call()
    return user_balance >= 1000

if __name__ == "__main__":
    if verify():
        exit(0)
    exit(1)
