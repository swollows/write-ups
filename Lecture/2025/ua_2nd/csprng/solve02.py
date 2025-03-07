import requests
import hashlib
import string
import itertools

UPPER = string.ascii_uppercase

URL = "https://bkdbkdbkd.pythonanywhere.com/qqqqq2?userid="

def score(x):
    if type(x) == str:
        x = x.encode()
    h = hashlib.sha256(x).digest()
    return 10000 - sum(h)

# 모든 가능한 6글자 영어 대문자 순열 생성
all_permutations = list(itertools.permutations(UPPER, 6))

# 순열을 문자열로 변환
all_permutation_strings = [''.join(p) for p in all_permutations]

# 생성된 순열 개수 출력
print(f"생성된 순열 개수: {len(all_permutation_strings)}")

# 점수가 가장 높은 순열 찾기
BEST_PERMUTATION = max(all_permutation_strings, key=score)
BEST_SCORE = score(BEST_PERMUTATION)

print(f"가장 높은 점수의 순열: {BEST_PERMUTATION}")
print(f"점수: {BEST_SCORE}")

resp = requests.get(url=URL + BEST_PERMUTATION)

print(BEST_PERMUTATION)
print(resp.text)