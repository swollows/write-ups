from web3 import Web3
from web3.contract.utils import BadFunctionCallOutput
import os

rpc_url = os.environ["RPC_URL"]
contract_address = os.environ["LEVEL_CONTRACT_ADDRESS"]

ABI = [
    {
        "type": "function",
        "name": "ping",
        "inputs": [],
        "outputs": [{"name": "", "type": "string"}],
        "stateMutability": "pure",
    }
]


def verify():
    w3 = Web3(Web3.HTTPProvider(rpc_url))
    assert w3.is_connected(), "RPC server must be connectable"

    contract = w3.eth.contract(address=contract_address, abi=ABI)
    try:
        result = contract.functions.ping().call()
        assert result == "pong"
        return False
    # Failed to ping. Something is wrong
    except BadFunctionCallOutput:
        return True


if __name__ == "__main__":
    if verify():
        exit(0)
    exit(1)
