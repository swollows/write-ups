import os

from web3 import Web3

rpc_url = os.environ["RPC_URL"]
contract_address = os.environ["LEVEL_CONTRACT_ADDRESS"]
owner_private_key = os.environ["OWNER_PRIVATE_KEY"]
owner_address = os.environ["OWNER_ADDRESS"]
amovoter_address = os.environ["AMOVOTER_CONTRACT_ADDRESS"]
nandovoter_address = os.environ["NANDOVOTER_CONTRACT_ADDRESS"]


ABI = [
    {
        "type": "function",
        "name": "register",
        "inputs": [{"name": "", "type": "address"}],
        "outputs": [],
    },
    {"type": "function", "name": "runVote", "inputs": [], "outputs": []},
    {
        "type": "function",
        "name": "getResult",
        "inputs": [],
        "outputs": [{"name": "", "type": "string"}],
        "stateMutability": "view",
    },
]

def verify():
    w3 = Web3(Web3.HTTPProvider(rpc_url))
    assert w3.is_connected(), "RPC server must be connectable"

    contract = w3.eth.contract(address=contract_address, abi=ABI)

    nonce = w3.eth.get_transaction_count(owner_address)

    # 5 votes for Amo
    for _ in range(5):
        tx = contract.functions.register(amovoter_address).build_transaction(
            {
                "from": owner_address,
                "nonce": nonce,
                "value": w3.to_wei(1, "ether"),
            }
        )
        signed = w3.eth.account.sign_transaction(tx, private_key=owner_private_key)
        w3.eth.send_raw_transaction(signed.rawTransaction)
        nonce += 1

    # 10 votes for Nando!!!
    for _ in range(10):
        tx = contract.functions.register(nandovoter_address).build_transaction(
            {
                "from": owner_address,
                "nonce": nonce,
                "value": w3.to_wei(1, "ether"),
            }
        )
        signed = w3.eth.account.sign_transaction(tx, private_key=owner_private_key)
        w3.eth.send_raw_transaction(signed.rawTransaction)
        nonce += 1

    # Run vote
    tx = contract.functions.runVote().build_transaction(
        {"from": owner_address, "nonce": nonce}
    )
    signed = w3.eth.account.sign_transaction(tx, private_key=owner_private_key)
    w3.eth.send_raw_transaction(signed.rawTransaction)

    result = contract.functions.getResult().call()
    print(result)

    return result == "Boko"

if __name__ == "__main__":
    if verify():
        exit(0)
    exit(1)