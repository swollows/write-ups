#!/usr/bin/env python3
import struct
import hashlib
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

def calculate_sha256(text):
    """SHA256 해시 계산"""
    return hashlib.sha256(text.encode('utf-8')).hexdigest()

def check_success_condition(objects):
    """
    X.b 클래스의 성공 조건을 확인
    p2a1672ac.f1492a == 4920이고 v1289a0d.f1497a가 true인지 확인
    """
    if not objects:
        return False
    
    # 첫 번째 객체가 4920인지 확인
    first_obj = objects[0]
    if first_obj[3] == 4920:  # f1492a == 4920
        # 두 번째 객체의 첫 번째 바이트가 1인지 확인 (v1289a0d.f1497a == true)
        if len(objects) > 1:
            second_obj = objects[1]
            if second_obj[0] == 1:  # 첫 번째 바이트가 1이면 true
                return True
        
        # 또는 첫 번째 객체 자체에서 확인
        if first_obj[0] == 1:
            return True
    
    return False

def extract_flag_from_objects(objects):
    """
    복호화된 객체들에서 플래그를 추출
    """
    flag_candidates = []
    
    # 방법 1: 모든 바이트를 ASCII로 변환
    all_bytes = []
    for obj in objects:
        a, b, c, d = obj
        all_bytes.extend([a, b, c])
        # d를 바이트로 분해
        all_bytes.extend([(d >> i) & 0xff for i in range(0, 32, 8)])
    
    # ASCII 가능한 문자들만 추출
    ascii_chars = []
    for b in all_bytes:
        if 32 <= b <= 126:
            ascii_chars.append(chr(b))
    
    flag_str = ''.join(ascii_chars)
    if 'L3AK{' in flag_str:
        # L3AK{로 시작하는 부분 추출
        start = flag_str.find('L3AK{')
        end = flag_str.find('}', start)
        if end != -1:
            flag_candidates.append(flag_str[start:end+1])
    
    # 방법 2: 각 객체의 int 값을 문자열로 변환
    for obj in objects:
        a, b, c, d = obj
        # d 값을 문자열로 변환해서 확인
        if d < 0x7FFFFFFF:  # 합리적인 범위
            try:
                flag_str = str(d)
                if 'L3AK' in flag_str:
                    flag_candidates.append(flag_str)
            except:
                pass
    
    return flag_candidates

def try_decrypt_with_key(data, key):
    """
    특정 키로 복호화를 시도합니다.
    """
    try:
        decrypted = decrypt_data(data, key)
        objects = parse_decrypted_data(decrypted)
        
        if not objects:
            return None, None
        
        # 성공 조건 확인
        if check_success_condition(objects):
            flags = extract_flag_from_objects(objects)
            return flags, objects
        
        # 성공 조건을 만족하지 않아도 L3AK{가 포함된 경우 확인
        flags = extract_flag_from_objects(objects)
        if flags:
            return flags, objects
            
    except Exception as e:
        pass
        
    return None, None

def main():
    target_hash = "f3bdd9f68a198756b96c5cf8207db63a11507e50fb0d29be609ff678ef721935"
    
    # data.enc 파일 읽기
    with open('/Users/jonathan/write-ups/ctf/2025/l3akctf-2025/mobile/pricelessl3ak/resources/assets/data.enc', 'rb') as f:
        encrypted_data = f.read()
    
    print(f"암호화된 데이터 크기: {len(encrypted_data)} bytes")
    print(f"목표 해시: {target_hash}")
    
    # Intent flags를 체계적으로 시도
    keys_to_try = []
    
    # 1. 0부터 100000까지 순차적으로
    for i in range(100000):
        keys_to_try.append(i)
    
    # 2. 일반적인 Android Intent flags
    android_flags = [
        0x10000000,  # FLAG_ACTIVITY_NEW_TASK
        0x20000000,  # FLAG_ACTIVITY_SINGLE_TOP
        0x40000000,  # FLAG_ACTIVITY_CLEAR_TOP
        0x80000000,  # FLAG_ACTIVITY_CLEAR_TASK
        0x08000000,  # FLAG_ACTIVITY_REORDER_TO_FRONT
        0x04000000,  # FLAG_ACTIVITY_RESET_TASK_IF_NEEDED
        0x02000000,  # FLAG_ACTIVITY_BROUGHT_TO_FRONT
        0x01000000,  # FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY
        0x00800000,  # FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS
        0x00400000,  # FLAG_ACTIVITY_PREVIOUS_IS_TOP
        0x00200000,  # FLAG_ACTIVITY_FORWARD_RESULT
        0x00100000,  # FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET
        0x00080000,  # FLAG_ACTIVITY_NEW_DOCUMENT
        0x00040000,  # FLAG_ACTIVITY_MULTIPLE_TASK
        0x00020000,  # FLAG_ACTIVITY_RETAIN_IN_RECENTS
        0x00010000,  # FLAG_ACTIVITY_LAUNCH_ADJACENT
        0x00008000,  # FLAG_ACTIVITY_MATCH_EXTERNAL
        0x00004000,  # FLAG_ACTIVITY_REQUIRE_NON_BROWSER
        0x00002000,  # FLAG_ACTIVITY_REQUIRE_DEFAULT
        0x00001000,  # FLAG_ACTIVITY_AUTO_REMOVE_FROM_RECENTS
        0x00000800,  # FLAG_ACTIVITY_TASK_ON_HOME
        0x00000400,  # FLAG_ACTIVITY_CLEAR_TASK
        0x00000200,  # FLAG_ACTIVITY_NO_ANIMATION
        0x00000100,  # FLAG_ACTIVITY_NO_USER_ACTION
        0x00000080,  # FLAG_ACTIVITY_SINGLE_INSTANCE
        0x00000040,  # FLAG_ACTIVITY_NO_HISTORY
        0x00000020,  # FLAG_ACTIVITY_RESET_TASK_IF_NEEDED
        0x00000010,  # FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY
        0x00000008,  # FLAG_ACTIVITY_BROUGHT_TO_FRONT
        0x00000004,  # FLAG_ACTIVITY_FORWARD_RESULT
        0x00000002,  # FLAG_ACTIVITY_PREVIOUS_IS_TOP
        0x00000001,  # FLAG_GRANT_READ_URI_PERMISSION
        0x00000002,  # FLAG_GRANT_WRITE_URI_PERMISSION
        0x00000004,  # FLAG_GRANT_PERSISTABLE_URI_PERMISSION
        0x00000008,  # FLAG_GRANT_PREFIX_URI_PERMISSION
        0x00000010,  # FLAG_DEBUG_LOG_RESOLUTION
        0x00000020,  # FLAG_FROM_BACKGROUND
        0x00000040,  # FLAG_ACTIVITY_BROUGHT_TO_FRONT
        0x00000080,  # FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET
        0x00000100,  # FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS
        0x00000200,  # FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY
        0x00000400,  # FLAG_ACTIVITY_MULTIPLE_TASK
        0x00000800,  # FLAG_ACTIVITY_NEW_DOCUMENT
        0x00001000,  # FLAG_ACTIVITY_NO_ANIMATION
        0x00002000,  # FLAG_ACTIVITY_NO_HISTORY
        0x00004000,  # FLAG_ACTIVITY_NO_USER_ACTION
        0x00008000,  # FLAG_ACTIVITY_PREVIOUS_IS_TOP
        0x00010000,  # FLAG_ACTIVITY_RESET_TASK_IF_NEEDED
        0x00020000,  # FLAG_ACTIVITY_SINGLE_TOP
        0x00040000,  # FLAG_ACTIVITY_TASK_ON_HOME
        0x00080000,  # FLAG_RECEIVER_REGISTERED_ONLY
    ]
    
    keys_to_try.extend(android_flags)
    
    # 3. 특수한 값들
    special_values = [
        4919, 4920, 4921,  # 코드에서 보인 값들
        1337, 31337,       # 일반적인 해커 문화
        2025,              # 연도
        0x1337, 0x31337,   # 16진수 버전
        0x539, 0x0539,     # 1337의 16진수
        0xDEADBEEF,        # 일반적인 매직 넘버
        0xCAFEBABE,        # 일반적인 매직 넘버
        0xFEEDFACE,        # 일반적인 매직 넘버
        0xDEADC0DE,        # 일반적인 매직 넘버
    ]
    
    keys_to_try.extend(special_values)
    
    print(f"총 {len(keys_to_try)}개의 키를 시도합니다...")
    
    found_flags = []
    
    for i, key in enumerate(keys_to_try):
        if i % 10000 == 0:
            print(f"진행상황: {i}/{len(keys_to_try)}")
        
        flags, objects = try_decrypt_with_key(encrypted_data, key)
        if flags:
            print(f"\n🔑 키 {key} (0x{key:08x})로 플래그 후보 발견!")
            for flag in flags:
                print(f"  플래그 후보: {flag}")
                
                # SHA256 해시 확인
                if calculate_sha256(flag) == target_hash:
                    print(f"🎉 정답 플래그 발견: {flag}")
                    print(f"키: {key} (0x{key:08x})")
                    print(f"해시: {calculate_sha256(flag)}")
                    return
                
                found_flags.append((key, flag))
    
    if found_flags:
        print(f"\n발견된 플래그 후보들:")
        for key, flag in found_flags:
            hash_val = calculate_sha256(flag)
            print(f"키 {key}: {flag} -> {hash_val}")
    else:
        print("플래그를 찾지 못했습니다.")

if __name__ == "__main__":
    main() 