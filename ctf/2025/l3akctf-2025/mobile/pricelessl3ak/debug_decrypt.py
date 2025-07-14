#!/usr/bin/env python3
import struct
import hashlib
import sys

def decrypt_data(data, key):
    """
    A.c 클래스의 g 함수를 Python으로 포팅
    """
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

def parse_decrypted_data(data):
    """
    A.c 클래스의 j 함수를 Python으로 포팅
    """
    objects = []
    i = 0
    
    while i + 7 <= len(data):
        a = data[i] & 0xff
        b = data[i + 1] & 0xff
        c = data[i + 2] & 0xff
        d = struct.unpack('<I', data[i + 3:i + 7])[0]  # little endian int
        
        objects.append((a, b, c, d))
        i += 7
    
    return objects

def analyze_decrypted_data(data, key):
    """
    복호화된 데이터를 다양한 방법으로 분석
    """
    print(f"\n=== 키 {key} (0x{key:08x}) 분석 ===")
    
    # 1. 첫 50바이트를 hex로 출력
    print(f"첫 50바이트 (hex): {data[:50].hex()}")
    
    # 2. ASCII 문자만 추출
    ascii_chars = []
    for i, b in enumerate(data[:200]):
        if 32 <= b <= 126:
            ascii_chars.append(chr(b))
        else:
            ascii_chars.append('.')
    print(f"첫 200바이트 (ASCII): {''.join(ascii_chars)}")
    
    # 3. 객체 파싱
    try:
        objects = parse_decrypted_data(data)
        if objects:
            print(f"파싱된 객체 수: {len(objects)}")
            print(f"첫 5개 객체: {objects[:5]}")
            
            # 4920 값 찾기
            for i, obj in enumerate(objects[:20]):
                if obj[3] == 4920:
                    print(f"4920 값 발견! 객체 {i}: {obj}")
                    if i < len(objects) - 1:
                        print(f"다음 객체: {objects[i+1]}")
            
            # 모든 바이트를 연결해서 문자열 검색
            all_bytes = []
            for obj in objects:
                a, b, c, d = obj
                all_bytes.extend([a, b, c])
                all_bytes.extend([(d >> i) & 0xff for i in range(0, 32, 8)])
            
            # L3AK 패턴 검색
            ascii_str = ''.join(chr(b) if 32 <= b <= 126 else '.' for b in all_bytes)
            if 'L3AK' in ascii_str:
                print(f"L3AK 패턴 발견: {ascii_str}")
            
    except Exception as e:
        print(f"객체 파싱 오류: {e}")
    
    # 4. 다른 인코딩 시도
    try:
        # UTF-8로 시도
        utf8_str = data.decode('utf-8', errors='replace')
        if 'L3AK' in utf8_str:
            print(f"UTF-8 L3AK 패턴: {utf8_str}")
    except:
        pass
    
    # 5. 문자열 패턴 검색
    data_str = data.decode('latin-1', errors='replace')
    if 'L3AK' in data_str:
        print(f"Latin-1 L3AK 패턴: {data_str}")
    
    print("-" * 50)

def main():
    # data.enc 파일 읽기
    with open('/Users/jonathan/write-ups/ctf/2025/l3akctf-2025/mobile/pricelessl3ak/resources/assets/data.enc', 'rb') as f:
        encrypted_data = f.read()
    
    print(f"암호화된 데이터 크기: {len(encrypted_data)} bytes")
    
    # 몇 가지 키로 디버깅
    test_keys = [
        0, 1, 2, 3, 4, 5, 10, 100, 1000, 1337, 4919, 4920, 4921,
        0x1337, 0x31337, 0x539, 0x0539, 2025,
        0x10000000, 0x20000000, 0x40000000, 0x80000000,
        0x00000001, 0x00000002, 0x00000004, 0x00000008,
        0xDEADBEEF, 0xCAFEBABE, 0xFEEDFACE, 0xDEADC0DE,
    ]
    
    for key in test_keys:
        try:
            decrypted = decrypt_data(encrypted_data, key)
            analyze_decrypted_data(decrypted, key)
        except Exception as e:
            print(f"키 {key} 복호화 실패: {e}")
    
    # 특별한 패턴 검색
    print("\n=== 특별한 패턴 검색 ===")
    for key in range(1, 10000):
        try:
            decrypted = decrypt_data(encrypted_data, key)
            data_str = decrypted.decode('latin-1', errors='replace')
            if 'L3AK{' in data_str:
                print(f"키 {key}에서 L3AK{{ 발견!")
                analyze_decrypted_data(decrypted, key)
                break
        except:
            continue

if __name__ == "__main__":
    main() 