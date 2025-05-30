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

def append_flag_to_wordlist():
    """Append shift 2 of '/flag.txt' to each word in wordlist.txt"""
    try:
        # /flag.txt를 shift 2로 변환
        flag_path = "/flag.txt"
        shifted_flag = caesar_cipher(flag_path, 2)
        
        print(f"원본: {flag_path}")
        print(f"Shift 2 결과: {shifted_flag}")
        
        # wordlist.txt 읽기
        with open("wordlist.txt", "r", encoding="utf-8") as f:
            words = [line.strip() for line in f.readlines()]
        
        # 각 단어 뒤에 shifted_flag 붙이기
        new_words = [word + shifted_flag for word in words]
        
        # 새로운 wordlist.txt에 저장
        with open("wordlist.txt", "w", encoding="utf-8") as f:
            for word in new_words:
                f.write(word + "\n")
        
        print(f"총 {len(new_words)}개의 단어에 '{shifted_flag}'를 붙였습니다.")
        print(f"첫 5개 예시:")
        for i in range(min(5, len(new_words))):
            print(f"  {new_words[i]}")
        
    except FileNotFoundError:
        print("wordlist.txt 파일을 찾을 수 없습니다.")
    except Exception as e:
        print(f"오류가 발생했습니다: {e}")

if __name__ == "__main__":
    append_flag_to_wordlist() 