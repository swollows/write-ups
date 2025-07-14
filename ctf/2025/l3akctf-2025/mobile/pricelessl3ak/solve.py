#!/usr/bin/env python3
import struct
import sys

def decrypt_data(data, key):
    """
    A.c 클래스의 g 함수를 Python으로 포팅
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

def parse_decrypted_data(data):
    """
    A.c 클래스의 j 함수를 Python으로 포팅
    """
    objects = []
    i = 0
    
    while i + 7 <= len(data):
        # v27a8612b 객체 생성: (byte, byte, byte, int)
        a = data[i] & 0xff
        b = data[i + 1] & 0xff
        c = data[i + 2] & 0xff
        d = struct.unpack('<I', data[i + 3:i + 7])[0]  # little endian int
        
        objects.append((a, b, c, d))
        i += 7
    
    return objects

def try_decrypt_with_key(data, key):
    """
    특정 키로 복호화를 시도합니다.
    """
    try:
        decrypted = decrypt_data(data, key)
        
        # 1. 직접 ASCII 문자열로 변환해서 확인
        flag_str = ''
        for b in decrypted:
            if 32 <= b <= 126:
                flag_str += chr(b)
            else:
                flag_str += '.'
        
        if 'L3AK{' in flag_str:
            return flag_str, decrypted
        
        # 2. 객체 파싱 방식으로도 확인
        objects = parse_decrypted_data(decrypted)
        
        # 결과에서 플래그를 찾아봅니다
        flag_chars = []
        for obj in objects:
            a, b, c, d = obj
            # ASCII 범위의 문자들을 찾아봅니다
            if 32 <= a <= 126:
                flag_chars.append(chr(a))
            if 32 <= b <= 126:
                flag_chars.append(chr(b))
            if 32 <= c <= 126:
                flag_chars.append(chr(c))
            # d는 int 값이므로 ASCII 범위로 변환해봅니다
            if 32 <= d <= 126:
                flag_chars.append(chr(d))
        
        flag = ''.join(flag_chars)
        
        # L3AK{ 로 시작하는지 확인
        if 'L3AK{' in flag:
            return flag, objects
            
    except Exception as e:
        pass
        
    return None, None

def main():
    # data.enc 파일 읽기
    with open('/Users/jonathan/write-ups/ctf/2025/l3akctf-2025/mobile/pricelessl3ak/resources/assets/data.enc', 'rb') as f:
        encrypted_data = f.read()
    
    print(f"암호화된 데이터 크기: {len(encrypted_data)} bytes")
    print(f"첫 16바이트: {encrypted_data[:16].hex()}")
    
    # 더 넓은 범위의 키 시도
    keys_to_try = []
    
    # 0부터 10000까지
    for i in range(10000):
        keys_to_try.append(i)
    
    # 일반적인 Android Intent flags
    common_flags = [
        0x10000000,  # FLAG_ACTIVITY_NEW_TASK
        0x20000000,  # FLAG_ACTIVITY_SINGLE_TOP
        0x40000000,  # FLAG_ACTIVITY_CLEAR_TOP
        0x08000000,  # FLAG_ACTIVITY_REORDER_TO_FRONT
        0x04000000,  # FLAG_ACTIVITY_RESET_TASK_IF_NEEDED
        0x00000001,  # FLAG_GRANT_READ_URI_PERMISSION
        0x00000002,  # FLAG_GRANT_WRITE_URI_PERMISSION
        0x12345678,
        0xDEADBEEF,
        0x1337,
        0x31337,
        0x1234,
        0x4321,
        0x123456,
        0x654321,
    ]
    
    keys_to_try.extend(common_flags)
    
    # 16진수 패턴들
    hex_patterns = [
        0x50524943,  # "PRIC"
        0x454C4553,  # "ELES"
        0x534C3341,  # "SL3A"
        0x4B7B,      # "K{"
        0x7D,        # "}"
        0x4C33414B,  # "L3AK"
        0x42414E47,  # "BANG"
        0x42494E47,  # "BING"
        0x464C4147,  # "FLAG"
        0x43544600,  # "CTF"
    ]
    
    keys_to_try.extend(hex_patterns)
    
    # 큰 범위의 값들
    for i in range(0x10000, 0x20000, 0x1000):
        keys_to_try.append(i)
    
    print(f"총 {len(keys_to_try)}개의 키를 시도합니다...")
    
    for i, key in enumerate(keys_to_try):
        if i % 1000 == 0:
            print(f"진행상황: {i}/{len(keys_to_try)}")
        
        flag, objects = try_decrypt_with_key(encrypted_data, key)
        if flag:
            print(f"\n🎉 플래그 발견!")
            print(f"키: 0x{key:08x} ({key})")
            print(f"플래그: {flag}")
            if isinstance(objects, list):
                print(f"복호화된 객체들: {objects[:10]}")
            else:
                print(f"복호화된 데이터 (hex): {objects[:100].hex()}")
            return
    
    print("플래그를 찾지 못했습니다.")
    
    # 디버깅을 위해 몇 개의 키로 복호화 결과를 확인
    print("\n디버깅: 몇 개의 키로 복호화 결과 확인")
    for key in [0, 1, 1337, 0x1234]:
        try:
            decrypted = decrypt_data(encrypted_data, key)
            print(f"키 {key}: 처음 50바이트 = {decrypted[:50].hex()}")
            
            # ASCII 가능한 문자들 확인
            ascii_chars = []
            for b in decrypted[:200]:
                if 32 <= b <= 126:
                    ascii_chars.append(chr(b))
                else:
                    ascii_chars.append('.')
            print(f"키 {key}: ASCII 문자들 = {''.join(ascii_chars)}")
            
        except Exception as e:
            print(f"키 {key}: 오류 = {e}")

if __name__ == "__main__":
    main() 