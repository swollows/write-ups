from web3 import Web3
import os

rpc_url = os.environ["RPC_URL"]
contract_address = os.environ["LEVEL_CONTRACT_ADDRESS"]
user_address = os.environ["USER_ADDRESS"]

ABI = [
    {
        "type": "function",
        "name": "proxyOwner",
        "inputs": [],
        "outputs": [{"name": "", "type": "address"}],
        "stateMutability": "view",
    }
]


def verify():
    w3 = Web3(Web3.HTTPProvider(rpc_url))
    assert w3.is_connected(), "RPC server must be connectable"

    contract = w3.eth.contract(address=contract_address, abi=ABI)
    return user_address == contract.functions.proxyOwner().call()

if __name__ == "__main__":
    if verify():
        exit(0)
    exit(1)
