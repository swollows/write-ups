from web3 import Web3
import os

rpc_url = os.environ["RPC_URL"]
contract_address = os.environ["LEVEL_CONTRACT_ADDRESS"]
owner_private_key = os.environ["OWNER_PRIVATE_KEY"]
owner_address = os.environ["OWNER_ADDRESS"]


ABI = [
    {
        "type": "function",
        "name": "king",
        "inputs": [],
        "outputs": [{"name": "", "type": "address"}],
        "stateMutability": "view",
    }
]


def verify():
    w3 = Web3(Web3.HTTPProvider(rpc_url))
    assert w3.is_connected(), "RPC server must be connectable"

    contract = w3.eth.contract(address=contract_address, abi=ABI)
    current_king = contract.functions.king().call()
    if current_king == owner_address:
        return False

    signed = w3.eth.account.sign_transaction(
        {
            "from": owner_address,
            "to": contract_address,
            "value": w3.to_wei(10, "ether"),
            "gas": 100000,
            "gasPrice": w3.to_wei(40, "gwei"),
            "nonce": w3.eth.get_transaction_count(owner_address),
        },
        private_key=owner_private_key,
    )
    w3.eth.send_raw_transaction(signed.rawTransaction)

    new_king = contract.functions.king().call()
    return current_king == new_king

if __name__ == "__main__":
    if verify():
        exit(0)
    exit(1)
