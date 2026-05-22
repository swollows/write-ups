#-*-coding:utf-8-*-
"""
gate.php 에서 문제 목록(이름, 해시, URL, 풀이 여부)을 수집해서
prob/_index.json 에 저장한다. 그리고 각 문제 페이지에 들어가서 본문(소스)도
prob/<번호>_<이름>.php 형태로 저장한다.

Selenium 으로 인증 쿠키를 주입하고, 페이지의 가시 텍스트에서 코드를 추출한다.
"""
import json
import os
import re
import time
from pathlib import Path

from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.by import By

ROOT = Path(__file__).resolve().parent.parent
PROB_DIR = ROOT / "prob"
PROB_DIR.mkdir(exist_ok=True)

PHPSESSID = "enansfnhb3kl7nujargiovosn7"
GATE_URL = "https://los.rubiya.kr/gate.php"

opts = Options()
opts.add_argument("--headless=new")
opts.add_argument("--window-size=1280,2400")
drv = webdriver.Chrome(options=opts)

try:
    drv.get("https://los.rubiya.kr/")
    drv.add_cookie({"name": "PHPSESSID", "value": PHPSESSID, "path": "/"})
    drv.get(GATE_URL)
    time.sleep(1.5)

    html = drv.page_source
    Path(ROOT / "prob" / "_gate.html").write_text(html, encoding="utf-8")

    # 링크 추출: chall/<name>_<hash>.php
    anchors = drv.find_elements(By.CSS_SELECTOR, "a")
    problems = []
    seen = set()
    pat = re.compile(r"chall/([a-z_]+)_([0-9a-f]{32})\.php", re.I)
    for a in anchors:
        href = a.get_attribute("href") or ""
        m = pat.search(href)
        if not m:
            continue
        name, h = m.group(1), m.group(2)
        if name in seen:
            continue
        seen.add(name)
        # 풀이 여부: gate에서 "solved" / 클래스/스타일 등으로 표시되지만,
        # 일단 이름과 해시만 수집한다.
        problems.append({"name": name, "hash": h, "url": href})

    # 본문 텍스트에서 등장 순서대로 1, 2, ... 번호 부여
    # (LOS gate 는 1~48 순서로 표시된다)
    text = drv.find_element(By.TAG_NAME, "body").text
    order = []
    for line in text.splitlines():
        line = line.strip()
        for p in problems:
            if p["name"] == line.lower():
                order.append(p["name"])
    # fallback: anchors 순서대로
    if len(order) < len(problems):
        order = [p["name"] for p in problems]

    name_to_idx = {n: i + 1 for i, n in enumerate(order)}
    for p in problems:
        p["idx"] = name_to_idx.get(p["name"], 0)
    problems.sort(key=lambda x: x["idx"])

    # 풀이 여부 판단: a.solved 클래스 사용 (los 가 .solved 로 표시)
    for p in problems:
        try:
            el = drv.find_element(By.PARTIAL_LINK_TEXT, p["name"])
            cls = el.get_attribute("class") or ""
            p["solved"] = "solved" in cls
        except Exception:
            p["solved"] = False

    print(f"[+] 발견된 문제: {len(problems)}개")
    for p in problems:
        mark = "O" if p["solved"] else "."
        print(f"  [{mark}] {p['idx']:02d} {p['name']:<20s} {p['hash']}")

    # 각 문제 페이지로 이동해 소스 백업
    for p in problems:
        idx = p["idx"]
        name = p["name"]
        out = PROB_DIR / f"{idx:02d}_{name}.php"
        if out.exists():
            print(f"[skip] {out.name}")
            continue
        try:
            drv.get(p["url"])
            time.sleep(1.0)
            # LOS는 페이지 본문에 PHP 소스가 그대로 박혀있다.
            body_text = drv.find_element(By.TAG_NAME, "body").text
            out.write_text(body_text, encoding="utf-8")
            print(f"[save] {out.name}  ({len(body_text)} bytes)")
        except Exception as e:
            print(f"[fail] {name}: {e}")

    (PROB_DIR / "_index.json").write_text(
        json.dumps(problems, indent=2, ensure_ascii=False), encoding="utf-8"
    )
    print("[+] prob/_index.json 저장 완료")

finally:
    drv.quit()
