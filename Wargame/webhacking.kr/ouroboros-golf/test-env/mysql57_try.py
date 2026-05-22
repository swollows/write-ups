#!/usr/bin/env python3
"""Validate Ouroboros payloads directly against a local MySQL 5.7 container."""
import argparse
import re
import subprocess
import sys
import urllib.parse


CONTAINER = "ouro57"


def sql_quote(value: str) -> str:
    return "'" + value.replace("\\", "\\\\").replace("'", "\\'").replace("\0", "\\0") + "'"


def run_sql(sql: str) -> str:
    proc = subprocess.run(
        ["docker", "exec", "-i", CONTAINER, "mysql", "-uroot", "-prootpw", "-N", "-B", "--raw", "ouroboros"],
        input=sql,
        text=True,
        stdout=subprocess.PIPE,
        stderr=subprocess.PIPE,
        check=False,
    )
    if proc.returncode:
        return "ERR\t" + proc.stderr.strip().splitlines()[-1]
    return proc.stdout


def validate(payload: str) -> tuple[bool, str, str]:
    query = "select pw from prob_ouroboros where pw='" + payload + "'"
    sql = (
        "SET SESSION sql_mode='';\n"
        "SET @q:=" + sql_quote(query) + ";\n"
        "PREPARE s FROM @q;\n"
        "EXECUTE s;\n"
        "DEALLOCATE PREPARE s;\n"
    )
    out = run_sql(sql)
    if out.startswith("ERR\t"):
        return False, "", out
    first = out.splitlines()[0] if out.splitlines() else ""
    return first == payload, first, out


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("payload", nargs="?")
    parser.add_argument("--urlencoded", action="store_true")
    args = parser.parse_args()

    payload = args.payload if args.payload is not None else sys.stdin.read().rstrip("\n")
    ok, result, raw = validate(payload)
    length = len(payload.encode())
    points = (210 - length) * 5 if ok and length < 210 else 0
    status = "SOLVED" if ok else "FAIL"
    shown = urllib.parse.quote(payload, safe="") if re.search(r"[\x00-\x1f\x7f]", payload) else payload
    print(f"[{status}] len={length} points={points} payload={shown}")
    if args.urlencoded:
        print(urllib.parse.quote(payload, safe=""))
    if not ok:
        print("result=", repr(result))
        print(raw)
    return 0 if ok else 1


if __name__ == "__main__":
    raise SystemExit(main())
