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

# 원본 단어 목록
words = [
    "admin", "login", "dashboard", "user", "account", "api", "config", "settings",
    "uploads", "files", "static", "assets", "images", "css", "js", "includes",
    "backup", "test", "staging", "dev", "cgi-bin", "logs", "private", "secure",
    "downloads", "public", "bin", "lib", "data", "home", "auth", "register",
    "search", "help", "support", "api/v1", "api/v2", "monitoring", "status",
    "forgot-password", "reset-password", "token", "oauth", "redirect", "analytics",
    "blog", "shop", "cart", "checkout", "sitemap", "id", "user", "username",
    "email", "password", "token", "ref", "redir", "redirect", "url", "next",
    "page", "q", "query", "search", "lang", "locale", "file", "path", "folder",
    "img", "image", "src", "type", "name", "title", "code", "key", "action",
    "mode", "submit", "value", "return", "from", "to", "role", "debug", "sort",
    "order", "dir", "category", "item", "msg", "message", "confirm", "hash",
    "session", "access", "status", "level", "error", "success"
]

def main():
    output_lines = []
    
    # 헤더 추가
    output_lines.append("="*80)
    output_lines.append("Caesar Cipher Results (Shift 1-26)")
    output_lines.append("="*80)
    output_lines.append("")
    
    # 각 shift 값에 대해 처리
    for shift in range(1, 27):
        output_lines.append(f"{'='*20} SHIFT {shift} {'='*20}")
        output_lines.append("")
        
        # 각 단어에 대해 Caesar cipher 적용
        for word in words:
            encrypted_word = caesar_cipher(word, shift)
            output_lines.append(f"{word:<20} -> {encrypted_word}")
        
        output_lines.append("")  # 구분을 위한 빈 줄
    
    # 파일에 저장
    with open("caesar_cipher_results.txt", "w", encoding="utf-8") as f:
        f.write("\n".join(output_lines))
    
    print("Caesar cipher 결과가 'caesar_cipher_results.txt' 파일에 저장되었습니다.")
    print(f"총 {len(words)}개의 단어를 1-26 shift로 변환했습니다.")

if __name__ == "__main__":
    main() 