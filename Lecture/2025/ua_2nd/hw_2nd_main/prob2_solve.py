from web3 import Web3
from eth_account import Account
import os
from dotenv import load_dotenv

# .env 파일에서 환경변수 로드
load_dotenv()

# Sepolia 테스트넷 연결
INFURA_URL = f"https://sepolia.infura.io/v3/{os.getenv('INFURA_PROJECT_ID')}"
w3 = Web3(Web3.HTTPProvider(INFURA_URL))

def send_transaction_with_message():
    # 개인키로 계정 생성
    private_key = os.getenv('PRIVATE_KEY')
    account = Account.from_key(private_key)
    
    # 수신자 주소
    recipient = "0xe49E7f883F41Ad49170b969fa379452622D5D7Ef"
    
    # 메시지 입력
    message = "jonathan"
    
    # 메시지를 16진수로 변환
    message_hex = message.encode('utf-8').hex()
    
    # 트랜잭션 생성
    transaction = {
        'nonce': w3.eth.get_transaction_count(account.address),
        'to': recipient,
        'value': w3.to_wei(0.05, 'ether'),  # 0.05 ETH
        'gasPrice': w3.eth.gas_price,
        'data': '0x' + message_hex,
        'chainId': 11155111  # Sepolia 체인 ID
    }
    
    # gas 예상치 계산
    gas_estimate = w3.eth.estimate_gas({
        'from': account.address,
        **transaction
    })
    
    # 예상 gas에 여유분을 추가 (약 10%)
    transaction['gas'] = int(gas_estimate * 1.1)
    
    try:
        # 트랜잭션 서명
        signed_txn = w3.eth.account.sign_transaction(transaction, private_key)
        
        # 트랜잭션 전송
        tx_hash = w3.eth.send_raw_transaction(signed_txn.raw_transaction)
        
        # 트랜잭션 영수증 대기
        tx_receipt = w3.eth.wait_for_transaction_receipt(tx_hash)
        
        print(f"트랜잭션이 성공적으로 전송되었습니다!")
        print(f"트랜잭션 해시: {tx_hash.hex()}")
        print(f"블록 번호: {tx_receipt['blockNumber']}")
        
    except Exception as e:
        print(f"오류 발생: {str(e)}")

if __name__ == "__main__":
    if w3.is_connected():
        print("Sepolia 테스트넷에 연결되었습니다.")
        send_transaction_with_message()
    else:
        print("네트워크 연결에 실패했습니다.")
