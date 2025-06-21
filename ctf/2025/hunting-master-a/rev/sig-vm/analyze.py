#!/usr/bin/env python3

def analyze_ans():
    ans = [0x48, 0xab, 0x13a, 0x26b,  # H
           0x45, 0xfb, 0x1a6, 0x30f,  # E
           0x7a, 0xd1, 0x186, 0x36b,  # z
           0x71, 0xf9, 0x18a, 0x39f,  # q
           0x75, 0xfd, 0x19e, 0x353,  # u
           0x75, 0xed, 0x1c6, 0x3ff]  # u

    print("=== ANS 배열 분석 ===")
    
    # 각 그룹별 분석
    for i in range(0, len(ans), 4):
        group = ans[i:i+4]
        char = chr(group[0])
        print(f"\n그룹 {i//4} ({char}):")
        print(f"값들: {[hex(x) for x in group]}")
        
        # 차이값 분석
        diffs = [group[j] - group[j-1] for j in range(1, len(group))]
        print(f"차이값: {[hex(x) for x in diffs]}")
        
        # 비트 연산 분석
        shifts_left = []
        shifts_right = []
        for j in range(1, 4):
            for shift in range(1, 9):
                if (group[0] << shift) & 0xFFFFFFFF == group[j]:
                    shifts_left.append((j, shift))
                if (group[0] >> shift) & 0xFFFFFFFF == group[j]:
                    shifts_right.append((j, shift))
        if shifts_left:
            print(f"왼쪽 시프트 가능성: {shifts_left}")
        if shifts_right:
            print(f"오른쪽 시프트 가능성: {shifts_right}")
        
        # 곱셈/나눗셈 분석
        for j in range(1, 4):
            for mul in range(1, 10):
                if group[0] * mul == group[j]:
                    print(f"곱셈 관계 발견: {hex(group[0])} * {mul} = {hex(group[j])}")

def find_pattern():
    # 첫 번째 값들로 문자열 만들기
    ans = [0x48, 0x45, 0x7a, 0x71, 0x75, 0x75]  # H, E, z, q, u, u
    flag = ''.join(chr(x) for x in ans)
    print(f"\n추정되는 문자열: {flag}")
    
    # 가능한 플래그 형식 추정
    print("\n가능한 플래그 형식:")
    print(f"1. HEzquu")
    print(f"2. FLAG{{HEzquu}}")
    print(f"3. flag{{HEzquu}}")

if __name__ == "__main__":
    analyze_ans()
    find_pattern() 