#!/usr/bin/env python3
import struct
import sys

def decrypt_data_reverse(data, key):
    """
    A.c 클래스의 g 함수를 역순으로 구현
    Java 코드에서는 암호화 과정이므로 역순으로 해야 복호화됩니다.
    """
    # 바이트 배열 복사
    result = bytearray(data)
    
    # 역순으로 처리
    # 4. XOR 연산 역순 (key 값과 XOR) - 동일한 연산
    for i in range(len(result)):
        key_byte = (key >> ((i % 4) * 8)) & 0xff
        result[i] ^= key_byte
    
    # 3. 산술 연산 역순 (덧셈으로 변경)
    for i in range(len(result)):
        result[i] = (result[i] + (((i * 19) + (key & 0xff)) & 0xff)) & 0xff
    
    # 2. 비트 로테이션 역순 (반대 방향으로 로테이션)
    for i in range(len(result)):
        shift = (i % 7) + 1
        b = result[i] & 0xff
        result[i] = ((b >> (8 - shift)) | (b << shift)) & 0xff
    
    # 1. XOR 연산 역순 (동일한 연산)
    for i in range(1, len(result)):
        result[i] ^= result[i - 1]
    
    return bytes(result)

def try_decrypt_with_key(data, key):
    """
    특정 키로 복호화를 시도합니다.
    """
    try:
        # 원래 방식
        decrypted1 = decrypt_data(data, key)
        
        # 역순 방식
        decrypted2 = decrypt_data_reverse(data, key)
        
        # 두 방식 모두 확인
        for method_name, decrypted in [("원래", decrypted1), ("역순", decrypted2)]:
            # 직접 ASCII 문자열로 변환해서 확인
            flag_str = ''
            for b in decrypted:
                if 32 <= b <= 126:
                    flag_str += chr(b)
                else:
                    flag_str += '.'
            
            if 'L3AK{' in flag_str:
                return f"{method_name}: {flag_str}", decrypted
        
    except Exception as e:
        pass
        
    return None, None

def decrypt_data(data, key):
    """
    A.c 클래스의 g 함수를 Python으로 포팅 (원래 방식)
    """
    # 바이트 배열 복사
    result = bytearray(data)
    
    # 1. XOR 연산 (각 바이트를 이전 바이트와 XOR)
    for i in range(len(result) - 1, 0, -1):
        result[i] ^= result[i - 1]
    
    # 2. 비트 로테이션 (각 바이트를 순환 시프트)
    for i in range(len(result)):
        shift = (i % 7) + 1
        b = result[i] & 0xff
        result[i] = ((b << (8 - shift)) | (b >> shift)) & 0xff
    
    # 3. 산술 연산 (각 바이트에서 계산된 값을 뺌)
    for i in range(len(result)):
        result[i] = (result[i] - (((i * 19) + (key & 0xff)) & 0xff)) & 0xff
    
    # 4. XOR 연산 (key 값과 XOR)
    for i in range(len(result)):
        key_byte = (key >> ((i % 4) * 8)) & 0xff
        result[i] ^= key_byte
    
    return bytes(result)

def main():
    # data.enc 파일 읽기
    with open('/Users/jonathan/write-ups/ctf/2025/l3akctf-2025/mobile/pricelessl3ak/resources/assets/data.enc', 'rb') as f:
        encrypted_data = f.read()
    
    print(f"암호화된 데이터 크기: {len(encrypted_data)} bytes")
    
    # 더 체계적인 키 범위 시도
    keys_to_try = []
    
    # 0부터 50000까지 (더 넓은 범위)
    for i in range(50000):
        keys_to_try.append(i)
    
    # 문자열을 int로 변환한 값들
    string_keys = [
        'L3AK', 'PRIC', 'ELES', 'FLAG', 'BANG', 'BING', 'CTF', 'ANDROID',
        'MOBILE', 'REVERSE', 'CRYPTO', 'DECODE', 'DECRYPT', 'CHALLENGE'
    ]
    
    for s in string_keys:
        # 문자열을 바이트로 변환해서 int로 해석
        key_bytes = s.encode('ascii')
        if len(key_bytes) <= 4:
            key = struct.unpack('<I', key_bytes.ljust(4, b'\x00'))[0]
            keys_to_try.append(key)
        
        # 각 문자의 ASCII 값을 합한 값
        ascii_sum = sum(ord(c) for c in s)
        keys_to_try.append(ascii_sum)
    
    print(f"총 {len(keys_to_try)}개의 키를 시도합니다...")
    
    for i, key in enumerate(keys_to_try):
        if i % 5000 == 0:
            print(f"진행상황: {i}/{len(keys_to_try)}")
        
        flag, decrypted = try_decrypt_with_key(encrypted_data, key)
        if flag:
            print(f"\n🎉 플래그 발견!")
            print(f"키: 0x{key:08x} ({key})")
            print(f"플래그: {flag}")
            print(f"복호화된 데이터 (hex): {decrypted[:100].hex()}")
            return
    
    print("플래그를 찾지 못했습니다.")

if __name__ == "__main__":
    main() 