from web3 import Web3
import binascii

RPC_URI = "https://mainnet.infura.io/v3/5a182f472a374f20ba4a6a017230aca5"

w3 = Web3(Web3.HTTPProvider(RPC_URI))

TX_HASH = "0x133f23474a62319f75b58c07022619e6d30a33cb56505ae900114e47f63b4319"

tx = w3.eth.get_transaction(TX_HASH)

print(tx)