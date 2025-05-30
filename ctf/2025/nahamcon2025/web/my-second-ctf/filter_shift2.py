#!/usr/bin/env python3
# -*- coding: utf-8 -*-

def filter_shift2_only():
    """Extract only shift 2 results from wordlist.txt"""
    try:
        with open("wordlist.txt", "r", encoding="utf-8") as f:
            all_words = [line.strip() for line in f.readlines()]
        
        # 원본 단어 개수 (102개)
        original_word_count = 102
        
        # Shift 2는 103번째부터 204번째 단어 (인덱스로는 102부터 203까지)
        shift2_start_index = original_word_count * 1  # shift 1이 0-101, shift 2가 102-203
        shift2_end_index = original_word_count * 2
        
        shift2_words = all_words[shift2_start_index:shift2_end_index]
        
        # 새로운 wordlist.txt에 shift 2 결과만 저장
        with open("wordlist.txt", "w", encoding="utf-8") as f:
            for word in shift2_words:
                f.write(word + "\n")
        
        print(f"Shift 2 결과만 남겼습니다.")
        print(f"총 {len(shift2_words)}개의 단어가 wordlist.txt에 저장되었습니다.")
        print(f"첫 10개 단어: {shift2_words[:10]}")
        print(f"마지막 10개 단어: {shift2_words[-10:]}")
        
    except FileNotFoundError:
        print("wordlist.txt 파일을 찾을 수 없습니다.")
    except Exception as e:
        print(f"오류가 발생했습니다: {e}")

if __name__ == "__main__":
    filter_shift2_only() 