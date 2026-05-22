#-*-coding:utf-8-*-
"""
poc/*.py 를 모두(또는 일부) 실행해서 Stage Clear 여부를 표로 출력한다.

사용:
  python scripts/run_poc.py            # 전체
  python scripts/run_poc.py 1 2 7      # 특정 번호만
  python scripts/run_poc.py --from 19  # 19번부터 끝까지
"""
import argparse
import re
import subprocess
import sys
import time
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
POC_DIR = ROOT / "poc"


def discover() -> list[tuple[int, Path]]:
    items = []
    for p in POC_DIR.glob("*.py"):
        m = re.match(r"(\d+)\.\s+(.+)", p.name)
        if not m:
            continue
        items.append((int(m.group(1)), p))
    items.sort()
    return items


def run_one(idx: int, path: Path, timeout: int = 600) -> tuple[bool, float, str]:
    t0 = time.time()
    try:
        r = subprocess.run(
            [sys.executable, path.name],
            cwd=str(POC_DIR),
            capture_output=True,
            text=True,
            timeout=timeout,
        )
        out = (r.stdout or "") + "\n" + (r.stderr or "")
    except subprocess.TimeoutExpired as e:
        out = (e.stdout or "") + (e.stderr or "") + "\n[TIMEOUT]"
    dt = time.time() - t0
    ok = "Stage Clear" in out
    return ok, dt, out


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("only", nargs="*", type=int, help="실행할 문제 번호 (없으면 전체)")
    ap.add_argument("--from", dest="start", type=int, default=None)
    ap.add_argument("--to", dest="end", type=int, default=None)
    ap.add_argument("--timeout", type=int, default=600)
    ap.add_argument("--verbose", "-v", action="store_true")
    args = ap.parse_args()

    items = discover()
    if args.only:
        sel = set(args.only)
        items = [(i, p) for i, p in items if i in sel]
    if args.start is not None:
        items = [(i, p) for i, p in items if i >= args.start]
    if args.end is not None:
        items = [(i, p) for i, p in items if i <= args.end]

    print(f"[+] {len(items)}개 PoC 실행 (timeout={args.timeout}s)\n")
    summary = []
    for idx, path in items:
        print(f"--- #{idx:02d} {path.stem} ---", flush=True)
        ok, dt, out = run_one(idx, path, args.timeout)
        tag = "PASS" if ok else "FAIL"
        last = "\n".join(out.strip().splitlines()[-5:])
        print(f"[{tag}] ({dt:5.1f}s) {path.name}")
        if args.verbose or not ok:
            print("  output(tail):")
            for line in last.splitlines():
                print("   |", line)
        summary.append((idx, path.name, ok, dt))
        print()

    print("=" * 60)
    print("RESULT SUMMARY")
    print("=" * 60)
    for idx, name, ok, dt in summary:
        tag = "PASS" if ok else "FAIL"
        print(f"  [{tag}] #{idx:02d} ({dt:6.1f}s) {name}")
    fails = [s for s in summary if not s[2]]
    print(f"\n총 {len(summary)}개 중 {len(summary)-len(fails)} 성공 / {len(fails)} 실패")
    return 1 if fails else 0


if __name__ == "__main__":
    sys.exit(main())
