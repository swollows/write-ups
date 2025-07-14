#!/usr/bin/env python3
import hashlib
import struct

def parse_decrypt(data, key):
    """정확한 i.parse() 메소드 구현"""
    result = bytearray(data)
    
    # 1. XOR with previous byte (reverse order)
    for i in range(len(result) - 1, 0, -1):
        result[i] ^= result[i - 1]
    
    # 2. Bit rotation
    for i in range(len(result)):
        rotation = (i % 7) + 1
        byte_val = result[i] & 0xFF
        result[i] = ((byte_val << (8 - rotation)) | (byte_val >> rotation)) & 0xFF
    
    # 3. Arithmetic subtraction
    for i in range(len(result)):
        key_byte = key & 0xFF
        result[i] = (result[i] - ((i * 19 + key_byte) & 0xFF)) & 0xFF
    
    # 4. XOR with key bytes from different positions
    for i in range(len(result)):
        shift_amount = (i % 4) * 8
        key_byte = (key >> shift_amount) & 0xFF
        result[i] ^= key_byte
    
    return bytes(result)

def read_data(decrypted_data):
    """정확한 i.read() 메소드 구현"""
    objects = []
    pos = 0
    
    while pos + 7 <= len(decrypted_data):
        # 3 bytes + 1 int (little endian)
        byte1 = decrypted_data[pos] & 0xFF
        byte2 = decrypted_data[pos + 1] & 0xFF  
        byte3 = decrypted_data[pos + 2] & 0xFF
        int_val = struct.unpack('<I', decrypted_data[pos + 3:pos + 7])[0]
        
        objects.append((byte1, byte2, byte3, int_val))
        pos += 7
    
    return objects

def check_flag_format(data):
    """플래그 형식 확인"""
    try:
        text = data.decode('utf-8', errors='ignore')
        if 'L3AK{' in text:
            return text
    except:
        pass
    
    try:
        text = data.decode('latin-1')
        if 'L3AK{' in text:
            return text
    except:
        pass
    
    return None

def main():
    # data.enc 파일 읽기
    with open('ctf/2025/l3akctf-2025/mobile/pricelessl3ak/resources/assets/data.enc', 'rb') as f:
        encrypted_data = f.read()
    
    print(f"암호화된 데이터 크기: {len(encrypted_data)} bytes")
    
    # 타겟 해시
    target_hash = "f3bdd9f68a198756b96c5cf8207db63a11507e50fb0d29be609ff678ef721935"
    
    # 다양한 키 값들 시도
    key_candidates = []
    
    # 일반적인 Android Intent flags
    intent_flags = [
        0x10000000, 0x20000000, 0x40000000, 0x80000000,
        0x01000000, 0x02000000, 0x04000000, 0x08000000,
        0x00100000, 0x00200000, 0x00400000, 0x00800000,
        0x00010000, 0x00020000, 0x00040000, 0x00080000,
        0x00001000, 0x00002000, 0x00004000, 0x00008000,
        0x00000100, 0x00000200, 0x00000400, 0x00000800,
        0x00000010, 0x00000020, 0x00000040, 0x00000080,
        0x00000001, 0x00000002, 0x00000004, 0x00000008
    ]
    
    # 특별한 값들
    special_values = [
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
        1337, 4919, 4920, 4921, 2025,
        0xDEADBEEF, 0xCAFEBABE, 0xFEEDFACE, 0xDEADC0DE,
        0x1234, 0x5678, 0x9ABC, 0xDEF0
    ]
    
    # 문자열 기반 키들
    string_keys = ["L3AK", "PRIC", "ELES", "BANG", "BING", "FLAG"]
    for s in string_keys:
        key_candidates.append(int.from_bytes(s.encode(), 'little') & 0xFFFFFFFF)
        key_candidates.append(int.from_bytes(s.encode(), 'big') & 0xFFFFFFFF)
    
    key_candidates.extend(intent_flags)
    key_candidates.extend(special_values)
    key_candidates.extend(range(1000000))  # 0-999999 브루트포스
    
    print(f"총 {len(key_candidates)} 개의 키를 시도합니다...")
    
    for i, key in enumerate(key_candidates):
        if i % 10000 == 0:
            print(f"진행상황: {i}/{len(key_candidates)} ({i/len(key_candidates)*100:.1f}%)")
        
        try:
            # 복호화
            decrypted = parse_decrypt(encrypted_data, key)
            
            # 파싱
            objects = read_data(decrypted)
            
            if not objects:
                continue
            
            # 플래그 확인
            flag_text = check_flag_format(decrypted)
            if flag_text and 'L3AK{' in flag_text:
                print(f"\n=== 플래그 발견! ===")
                print(f"키: {key} (0x{key:x})")
                print(f"플래그: {flag_text}")
                
                # 해시 검증
                test_hash = hashlib.sha256(flag_text.encode()).hexdigest()
                print(f"해시: {test_hash}")
                print(f"타겟: {target_hash}")
                print(f"매치: {test_hash == target_hash}")
                
                if test_hash == target_hash:
                    print("\n🎉 정답입니다! 🎉")
                    return
            
            # 객체들에서 플래그 찾기 시도
            for obj in objects:
                # int 값을 바이트로 변환해서 확인
                int_bytes = struct.pack('<I', obj[3])
                flag_text = check_flag_format(int_bytes)
                if flag_text and 'L3AK{' in flag_text:
                    print(f"\n=== 객체에서 플래그 발견! ===")
                    print(f"키: {key} (0x{key:x})")
                    print(f"객체: {obj}")
                    print(f"플래그: {flag_text}")
                    
                    test_hash = hashlib.sha256(flag_text.encode()).hexdigest()
                    print(f"해시: {test_hash}")
                    if test_hash == target_hash:
                        print("\n🎉 정답입니다! 🎉")
                        return
                        
        except Exception as e:
            continue
    
    print("\n플래그를 찾지 못했습니다.")

if __name__ == "__main__":
    main() 