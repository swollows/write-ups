from web3 import Web3
import os

rpc_url = os.environ["RPC_URL"]
contract_address = os.environ["LEVEL_CONTRACT_ADDRESS"]

ABI = [
    {
        "type": "function",
        "name": "opened",
        "inputs": [],
        "outputs": [{"name": "", "type": "bool"}],
        "stateMutability": "view",
    }
]


def verify():
    w3 = Web3(Web3.HTTPProvider(rpc_url))
    assert w3.is_connected(), "RPC server must be connectable"

    contract = w3.eth.contract(address=contract_address, abi=ABI)
    opened = contract.functions.opened().call()
    return opened


if __name__ == "__main__":
    if verify():
        exit(0)
    exit(1)
