#!/usr/bin/env python3
# -*- coding: utf-8 -*-

def extract_wordlist():
    """Extract transformed words from caesar_cipher_results.txt and save to wordlist.txt"""
    transformed_words = []
    
    try:
        with open("caesar_cipher_results.txt", "r", encoding="utf-8") as f:
            lines = f.readlines()
        
        for line in lines:
            line = line.strip()
            # "원본단어 -> 변환단어" 형태의 라인인지 확인
            if " -> " in line and not line.startswith("="):
                # "->" 뒤의 변환된 단어 추출
                parts = line.split(" -> ")
                if len(parts) == 2:
                    transformed_word = parts[1].strip()
                    transformed_words.append(transformed_word)
        
        # 중복 제거 (선택사항 - 중복을 유지하려면 이 줄을 주석처리)
        # transformed_words = list(set(transformed_words))
        
        # wordlist.txt에 저장
        with open("wordlist.txt", "w", encoding="utf-8") as f:
            for word in transformed_words:
                f.write(word + "\n")
        
        print(f"총 {len(transformed_words)}개의 변환된 단어를 wordlist.txt에 저장했습니다.")
        print(f"첫 10개 단어: {transformed_words[:10]}")
        
    except FileNotFoundError:
        print("caesar_cipher_results.txt 파일을 찾을 수 없습니다.")
    except Exception as e:
        print(f"오류가 발생했습니다: {e}")

if __name__ == "__main__":
    extract_wordlist() 