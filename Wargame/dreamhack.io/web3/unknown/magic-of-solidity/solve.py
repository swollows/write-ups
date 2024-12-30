from pwn import *
from web3 import Web3, HTTPProvider
from bs4 import BeautifulSoup
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from requests import Session
from requests.adapters import HTTPAdapter
import requests
import json

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

def crawl_serving_address(URL):
    RESULT = ""

    try : 
      service = Service(executable_path="/chromedriver-linux64/chromedriver")
      options = webdriver.ChromeOptions()
      for _ in [
          "--headless",
          "--window-size=1920x1080",
          "--disable-gpu",
          "--no-sandbox",
          "--disable-dev-shm-usage",
      ]:
          options.add_argument(_)

      driver = webdriver.Chrome(service=service, options=options)
      driver.implicitly_wait(3)
      driver.set_page_load_timeout(3)
      driver.get(URL)  # 접속할 웹 페이지 URL
      time.sleep(2)

      # 메시지 결과 크롤링
      h2_elements = driver.find_elements(By.CLASS_NAME, "subtitle")
      RESULT = h2_elements[0].text.replace("Serving from ", "")

    except Exception as e:
        driver.quit()
        print(e)
        exit()

    # 브라우저 닫기
    driver.quit()

    return RESULT

# 풀이
# 1. 

# 문제에서 사용하는 각종 정보 추출
# TEST ADDRESS
ADDR = "10.8.0.1"
APP_URL = f"http://{ADDR}:8080"       # 3번째 링크 (DApp)
PROXY_URL = f"http://{ADDR}:8545"     # 2번째 링크 (테스트넷 RPC)
PROB_URL = f"http://{ADDR}:20000"     # 1번째 링크 (문제 풀이용)
PROB_HOST = ADDR                      # NC 통신용 주소
PROB_PORT = 20000                     # NC 통신용 포트

'''
# REAL URL
ADDR = "host3.dreamhack.games"
APP_URL = f"http://{ADDR}:13441"       # 3번째 링크 (DApp)
PROXY_URL = f"http://{ADDR}:22382"     # 2번째 링크 (테스트넷 RPC)
PROB_URL = f"http://{ADDR}:8564"     # 1번째 링크 (문제 풀이용)
PROB_HOST = ADDR                      # NC 통신용 주소
PROB_PORT = 8564                     # NC 통신용 포트
'''

ENV_PATH = "./magic_of_solidity/.env"

SERVING_ADDRESS = crawl_serving_address(APP_URL)

print(f"Serving Address: {SERVING_ADDRESS}")

# Example usage
dict_output = parse_env_to_dict(ENV_PATH)

PRIVATE_KEY = "0x" + dict_output["ALLOC_ADDRESS_PRIVATE_KEY"]

# 컨트랙트용 계정 주소 생성
r = remote(PROB_HOST, PROB_PORT)

r.sendlineafter(b'[-] input your choice: ', b'1')

ACCOUNT_ADDRESS = r.recvuntil(b'\n', drop=True).replace(b"[+] deployer account: ", b"")
TOKEN = r.recvuntil(b'\n', drop=True).replace(b"[+] token: ", b"")

r.close()

print(f"Account Address: {ACCOUNT_ADDRESS}")
print(f"Token: {TOKEN}")

# 전단계에서 생성한 계정 주소를 이용해서 테스트넷 이더리움 전송 후 TxHash 정보 수신
API_CLAIM_URL = f'{APP_URL}/api/claim'

DATA = {
    'address': ACCOUNT_ADDRESS
}

resp = requests.post(API_CLAIM_URL, data=DATA)

TX_HASH = resp.text.replace("TxHash: ", "")

print(TX_HASH)

print("Deploy Contract after 10s...")
sleep(10)

# 컨트랙트 배포
r = remote(PROB_HOST, PROB_PORT)

r.sendlineafter(b'[-] input your choice: ', b'2')
r.sendlineafter(b'[-] input your token: ', TOKEN)

CONTRACT_ADDRESS = r.recvuntil(b'\n', drop=True).replace(b"[+] contract address: ", b"").decode()
TRANSACTION_HASH = r.recvuntil(b'\n', drop=True).replace(b"[+] transaction hash: ", b"").decode()

r.close()

print(f"Contract Address: {CONTRACT_ADDRESS}")
print(f"Transaction Hash: {TRANSACTION_HASH}")

print("Transaction Contract after 5s...")
sleep(5)

# RPC 연결 후 컨트랙트 호출
PROXIES = {
    "http": PROXY_URL
}

# 스마트 컨트랙트 ABI 설정
CHALL_ABI = [
  {
    "inputs": [],
    "stateMutability": "nonpayable",
    "type": "constructor"
  },
  {
    "inputs": [],
    "name": "isSolved",
    "outputs": [
      {
        "internalType": "bool",
        "name": "",
        "type": "bool"
      }
    ],
    "stateMutability": "view",
    "type": "function"
  },
  {
    "inputs": [],
    "name": "solve",
    "outputs": [],
    "stateMutability": "nonpayable",
    "type": "function"
  }
]

CRACK_ME_ABI = [
  {
    "inputs": [],
    "stateMutability": "nonpayable",
    "type": "constructor"
  },
  {
    "inputs": [
      {
        "internalType": "uint256",
        "name": "",
        "type": "uint256"
      }
    ],
    "name": "c",
    "outputs": [
      {
        "internalType": "uint256",
        "name": "",
        "type": "uint256"
      }
    ],
    "stateMutability": "view",
    "type": "function"
  },
  {
    "inputs": [
      {
        "internalType": "uint256",
        "name": "n",
        "type": "uint256"
      }
    ],
    "name": "getValue",
    "outputs": [
      {
        "internalType": "uint256",
        "name": "",
        "type": "uint256"
      }
    ],
    "stateMutability": "view",
    "type": "function"
  },
  {
    "inputs": [
      {
        "internalType": "uint256",
        "name": "offset",
        "type": "uint256"
      },
      {
        "internalType": "uint256",
        "name": "value",
        "type": "uint256"
      }
    ],
    "name": "setValue",
    "outputs": [],
    "stateMutability": "nonpayable",
    "type": "function"
  }
]

# Session 생성
session = Session()
session.proxies.update(PROXIES)
session.mount("http://", HTTPAdapter())

# 스마트 컨트랙트 연결
web3 = Web3(Web3.HTTPProvider(PROXY_URL, session=session))

# 연결 확인
if web3.is_connected():
    print("Connected to Geth!")
else:
    print("Failed to connect to Geth.")

contract = web3.eth.contract(address=CONTRACT_ADDRESS, abi=ABI)

ANSWER = "HelloChainFlag"
CHAIN_ID = web3.eth.chain_id

value = web3.to_wei(0.1, 'ether')

# 가스 가격과 기본 한도
gas_price = web3.eth.gas_price
gas_limit = 1000000

# 계정 잔액 확인
balance_wei = web3.eth.get_balance(SERVING_ADDRESS)
balance_ether = web3.from_wei(balance_wei, 'ether')

# 필요한 총 금액 계산
gas_cost = gas_price * gas_limit
total_cost = gas_cost + value

print(f"Balance : {balance_wei}")
print(f"Total Cost : {total_cost}")

transaction = {
    'chainId' : CHAIN_ID,
    'from' : SERVING_ADDRESS,
    'gasPrice' : web3.to_wei('20', 'gwei'),
    'gas' : gas_price,
    'nonce' : web3.eth.get_transaction_count(SERVING_ADDRESS),
}

estimated_gas = web3.eth.estimate_gas(transaction)

print(f"Estimate gas : {estimated_gas}")

# setGreeting 함수의 _greeting 매개변수에 "HelloChainFlag"을 전달
tx = contract.functions.setGreeting(ANSWER).build_transaction(transaction)

# 트랜젝션 서명 및 전송
signed_tx = web3.eth.account.sign_transaction(tx, PRIVATE_KEY)
tx_hash = web3.eth.send_raw_transaction(signed_tx.raw_transaction)

print(f"Transaction Hash: {web3.to_hex(tx_hash)}")

# 트랜잭션 결과 확인
tx_receipt = web3.eth.wait_for_transaction_receipt(tx_hash)
print(f"Transaction Receipt: {tx_receipt}")

GREET_AFTER_TRANSACTION_RETURN = contract.functions.greet().call()

print(f"After Send Transaction : {GREET_AFTER_TRANSACTION_RETURN}")

# 플래그 획득
r = remote(PROB_HOST, PROB_PORT)

r.sendlineafter(b'[-] input your choice: ', b'3')
r.sendlineafter(b'[-] input your token: ', TOKEN)

# FLAG 얻기
FLAG = r.recvuntil(b'\n', drop=True).replace(b'[+] flag: ', b'').decode()

r.close()

print(f"Flag: {FLAG}")