#-*-coding:utf-8-*-
"""풀린 문제 + 현재 잠금해제된 문제(link 가 비어있지 않은 모든 task)에 대해
prob/<idx>_<name>.php 로 PHP 소스를 백업한다.
"""
from los_common import session, fetch_tasks, backup_php, PROB_DIR
import json

s = session()
tasks = fetch_tasks(s)

count = 0
for t in tasks:
    if t.get("descrip") == "AllClear":
        continue
    if not t.get("link"):
        print(f"[lock] {t['idx']:02d} {t['descrip']:<20s}  (잠금)")
        continue
    out = backup_php(s, t)
    print(f"[ok ] {t['idx']:02d} {t['descrip']:<20s}  -> {out.name}")
    count += 1

(PROB_DIR / "_index.json").write_text(
    json.dumps(tasks, indent=2, ensure_ascii=False), encoding="utf-8"
)
print(f"\n[+] {count}개 문제 PHP 소스 백업 완료")
