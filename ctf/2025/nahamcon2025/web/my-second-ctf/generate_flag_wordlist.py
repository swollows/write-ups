#!/usr/bin/env python3
# -*- coding: utf-8 -*-

def caesar_cipher(text, shift):
    """Apply Caesar cipher with given shift to text"""
    result = ""
    for char in text:
        if char.isalpha():
            # 대문자와 소문자 구분
            if char.isupper():
                result += chr((ord(char) - ord('A') + shift) % 26 + ord('A'))
            else:
                result += chr((ord(char) - ord('a') + shift) % 26 + ord('a'))
        else:
            # 알파벳이 아닌 문자는 그대로 유지
            result += char
    return result

def generate_flag_wordlist():
    """Generate all possible shifts (1-26) of /flag.txt"""
    flag_path = "/flag.txt"
    all_shifts = []
    
    print(f"원본: {flag_path}")
    print("="*50)
    
    # 1부터 26까지 모든 shift 적용
    for shift in range(1, 27):
        shifted_path = caesar_cipher(flag_path, shift)
        all_shifts.append(shifted_path)
        print(f"Shift {shift:2d}: {shifted_path}")
    
    # wordlist_flag.txt에 저장
    with open("wordlist_flag.txt", "w", encoding="utf-8") as f:
        for path in all_shifts:
            f.write(path + "\n")
    
    print("="*50)
    print(f"총 {len(all_shifts)}개의 변환된 경로가 wordlist_flag.txt에 저장되었습니다.")

if __name__ == "__main__":
    generate_flag_wordlist() 