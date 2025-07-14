#!/usr/bin/env python3
import struct
import hashlib
import sys

def decrypt_data(data, key):
    """A.c 클래스의 g 함수를 Python으로 포팅"""
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

def calculate_sha256(text):
    """SHA256 해시 계산"""
    return hashlib.sha256(text.encode('utf-8')).hexdigest()

def find_flag_in_data(data):
    """복호화된 데이터에서 L3AK{ 플래그를 찾음"""
    # 1. 직접 문자열 검색
    try:
        data_str = data.decode('latin-1', errors='replace')
        if 'L3AK{' in data_str:
            start = data_str.find('L3AK{')
            end = data_str.find('}', start)
            if end != -1:
                return data_str[start:end+1]
    except:
        pass
    
    # 2. ASCII 가능한 문자들만 연결해서 검색
    ascii_chars = []
    for b in data:
        if 32 <= b <= 126:
            ascii_chars.append(chr(b))
        else:
            ascii_chars.append('.')
    
    ascii_str = ''.join(ascii_chars)
    if 'L3AK{' in ascii_str:
        start = ascii_str.find('L3AK{')
        # }를 찾되, 점(.)이 아닌 문자들만 포함
        end_search = ascii_str[start:]
        clean_flag = ''
        in_flag = False
        for c in end_search:
            if c == 'L' and not in_flag:
                in_flag = True
                clean_flag = c
            elif in_flag:
                if c == '}':
                    clean_flag += c
                    return clean_flag
                elif c != '.':
                    clean_flag += c
    
    # 3. 7바이트 단위로 파싱해서 검색
    try:
        objects = []
        i = 0
        while i + 7 <= len(data):
            a = data[i] & 0xff
            b = data[i + 1] & 0xff
            c = data[i + 2] & 0xff
            d = struct.unpack('<I', data[i + 3:i + 7])[0]
            objects.append((a, b, c, d))
            i += 7
        
        # 모든 바이트를 연결
        all_bytes = []
        for obj in objects:
            a, b, c, d = obj
            all_bytes.extend([a, b, c])
            all_bytes.extend([(d >> j) & 0xff for j in range(0, 32, 8)])
        
        # L3AK{ 패턴 검색
        flag_chars = []
        for b in all_bytes:
            if 32 <= b <= 126:
                flag_chars.append(chr(b))
        
        flag_str = ''.join(flag_chars)
        if 'L3AK{' in flag_str:
            start = flag_str.find('L3AK{')
            end = flag_str.find('}', start)
            if end != -1:
                return flag_str[start:end+1]
    except:
        pass
    
    return None

def main():
    target_hash = "f3bdd9f68a198756b96c5cf8207db63a11507e50fb0d29be609ff678ef721935"
    
    # data.enc 파일 읽기
    with open('/Users/jonathan/write-ups/ctf/2025/l3akctf-2025/mobile/pricelessl3ak/resources/assets/data.enc', 'rb') as f:
        encrypted_data = f.read()
    
    print(f"암호화된 데이터 크기: {len(encrypted_data)} bytes")
    print(f"목표 해시: {target_hash}")
    
    # 더 넓은 키 범위 시도
    found_flags = []
    
    # 1. 0부터 1000000까지 (1백만)
    print("1백만 개의 키 시도 중...")
    for key in range(1000000):
        if key % 100000 == 0:
            print(f"진행상황: {key}/1000000")
        
        try:
            decrypted = decrypt_data(encrypted_data, key)
            flag = find_flag_in_data(decrypted)
            
            if flag:
                print(f"\n🔑 키 {key} (0x{key:08x})에서 플래그 후보 발견: {flag}")
                
                # SHA256 해시 확인
                if calculate_sha256(flag) == target_hash:
                    print(f"🎉 정답 플래그 발견: {flag}")
                    print(f"키: {key} (0x{key:08x})")
                    print(f"해시: {calculate_sha256(flag)}")
                    return
                
                found_flags.append((key, flag))
        except:
            continue
    
    # 2. 특수한 값들 시도
    special_keys = [
        # 큰 값들
        0x10000000, 0x20000000, 0x40000000, 0x80000000,
        0x00100000, 0x00200000, 0x00400000, 0x00800000,
        0x00010000, 0x00020000, 0x00040000, 0x00080000,
        0x00001000, 0x00002000, 0x00004000, 0x00008000,
        # 매직 넘버들
        0xDEADBEEF, 0xCAFEBABE, 0xFEEDFACE, 0xDEADC0DE,
        0x12345678, 0x87654321, 0x11111111, 0x22222222,
        0x33333333, 0x44444444, 0x55555555, 0x66666666,
        0x77777777, 0x88888888, 0x99999999, 0xAAAAAAAA,
        0xBBBBBBBB, 0xCCCCCCCC, 0xDDDDDDDD, 0xEEEEEEEE,
        0xFFFFFFFF, 0xFFFFFFFC, 0xFFFFFFF8, 0xFFFFFFF0,
        # 문자열 기반 키들
        0x4C33414B,  # "L3AK"
        0x50524943,  # "PRIC"
        0x454C4553,  # "ELES"
        0x534C3341,  # "SL3A"
        0x42414E47,  # "BANG"
        0x42414E4E,  # "BANN" (BANGO의 일부)
        0x42414E4F,  # "BANO"
        0x42414E47,  # "BANG"
        0x42494E47,  # "BING"
        0x42494E4E,  # "BINN" (BINGO의 일부)
        0x42494E4F,  # "BINO"
        0x42494E47,  # "BING"
        0x464C4147,  # "FLAG"
        0x43544600,  # "CTF"
        0x48415348,  # "HASH"
        0x32353600,  # "256"
        0x32303235,  # "2025"
        0x31333337,  # "1337"
        0x31333338,  # "1338"
        0x31333339,  # "1339"
        0x34393139,  # "4919"
        0x34393230,  # "4920"
        0x34393231,  # "4921"
    ]
    
    print(f"특수 키 {len(special_keys)}개 시도 중...")
    for key in special_keys:
        try:
            decrypted = decrypt_data(encrypted_data, key)
            flag = find_flag_in_data(decrypted)
            
            if flag:
                print(f"\n🔑 키 {key} (0x{key:08x})에서 플래그 후보 발견: {flag}")
                
                # SHA256 해시 확인
                if calculate_sha256(flag) == target_hash:
                    print(f"🎉 정답 플래그 발견: {flag}")
                    print(f"키: {key} (0x{key:08x})")
                    print(f"해시: {calculate_sha256(flag)}")
                    return
                
                found_flags.append((key, flag))
        except:
            continue
    
    # 결과 출력
    if found_flags:
        print(f"\n발견된 플래그 후보들:")
        for key, flag in found_flags:
            hash_val = calculate_sha256(flag)
            print(f"키 {key} (0x{key:08x}): {flag} -> {hash_val}")
    else:
        print("플래그를 찾지 못했습니다.")

if __name__ == "__main__":
    main() 