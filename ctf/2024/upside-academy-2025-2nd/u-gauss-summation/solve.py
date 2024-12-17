def gauss_sum(n):
    # 가우스 합계 공식은 수열의 합계 공식에서 파생
    # a1 = 1, d = 1 인 공차수열의 합계
    # Sn = n * {2 * a1 + (n - 1) * d} / 2
    #    = n * {2 * 1 + (n - 1) * 1} / 2
    #    = n * (2 + n - 1) / 2
    #    = n * (n + 1) / 2
    # S100000000 = 100000000 * (100000000 + 1) / 2
    return n * (n + 1) // 2

RESULT = gauss_sum(100000000)

FLAG = f'DH{{{RESULT}}}'

print(FLAG)