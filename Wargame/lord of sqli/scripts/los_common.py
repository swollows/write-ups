#-*-coding:utf-8-*-
"""
LoS(Lord of SQLi) 공용 헬퍼.

- BASE_URL/PHPSESSID 환경 상수
- session(): 인증 쿠키가 박힌 requests.Session
- fetch_tasks(): static/json.js 에서 task 목록 가져오기
- backup_php(idx, task): chall 페이지의 PHP 소스를 prob/<idx>_<name>.php 로 저장
- chall_url(task): "./chall/foo_<hash>.php" 를 절대 URL 로 변환
"""
from __future__ import annotations

import html
import json
import re
from pathlib import Path
from typing import List, Dict

import requests
from bs4 import BeautifulSoup

ROOT = Path(__file__).resolve().parent.parent
PROB_DIR = ROOT / "prob"
POC_DIR = ROOT / "poc"
PROB_DIR.mkdir(exist_ok=True)
POC_DIR.mkdir(exist_ok=True)

BASE_URL = "https://los.rubiya.kr"
PHPSESSID = "enansfnhb3kl7nujargiovosn7"
TRUE_RESULT = "<h2>Hello admin</h2>"


def session() -> requests.Session:
    s = requests.Session()
    s.cookies.set("PHPSESSID", PHPSESSID, domain="los.rubiya.kr", path="/")
    s.headers.update({
        "User-Agent": "Mozilla/5.0 LoS-PoC",
        "Referer": f"{BASE_URL}/gate.php",
    })
    return s


def chall_url(task: Dict) -> str:
    link = task["link"]
    if link.startswith("http://") or link.startswith("https://"):
        return link
    return f"{BASE_URL}/{link.lstrip('./')}"


def fetch_tasks(s: requests.Session | None = None) -> List[Dict]:
    s = s or session()
    r = s.get(f"{BASE_URL}/static/json.js")
    r.raise_for_status()
    data = json.loads(r.text)
    tasks = data["data"]
    # 마지막 AllClear 항목은 메타이므로 인덱스만 부여하고 그대로 둔다.
    for i, t in enumerate(tasks, 1):
        t["idx"] = i
    return tasks


def _strip_php_html(html_blob: str) -> str:
    """highlight_file() 출력 HTML 에서 PHP 소스만 추출 (br→줄바꿈, nbsp→공백)."""
    # highlight_file 은 줄바꿈을 <br /> 로 표기하므로 텍스트화 전에 \n 으로 치환
    normalized = re.sub(r"<br\s*/?>", "\n", html_blob, flags=re.I)
    soup = BeautifulSoup(normalized, "html.parser")
    code = soup.find("code")
    text = code.get_text("", strip=False) if code else soup.get_text("\n", strip=False)
    text = html.unescape(text)
    text = text.replace("\xa0", " ")
    # 들여쓰기를 탭처럼 보이게 — highlight_file 은 보통 2-space 들여쓰기 사용
    return text.strip("\n") + "\n"


def fetch_php_source(s: requests.Session, task: Dict) -> str:
    """chall 페이지에서 query 줄과 PHP 소스를 합쳐 반환."""
    if not task.get("link"):
        return ""
    target = chall_url(task)
    # cthulhu 등은 modsec.rubiya.kr 같은 다른 도메인을 쓰므로 쿠키를 그 도메인에도 심는다.
    s.cookies.set("PHPSESSID", PHPSESSID, domain="modsec.rubiya.kr", path="/")
    r = s.get(target)
    r.raise_for_status()
    raw = r.text
    soup = BeautifulSoup(raw, "html.parser")
    # 상단 query 줄
    query_line = ""
    strong = soup.find("strong")
    if strong:
        query_line = f"// query : {strong.get_text(strip=True)}\n"
    php = _strip_php_html(raw)
    return query_line + php


def backup_php(s: requests.Session, task: Dict) -> Path | None:
    if not task.get("link"):
        return None
    src = fetch_php_source(s, task)
    out = PROB_DIR / f"{task['idx']:02d}_{task['descrip']}.php"
    out.write_text(src, encoding="utf-8")
    return out


def is_clear(text: str) -> bool:
    return "Clear!" in text


def is_hello_admin(text: str) -> bool:
    return TRUE_RESULT in text
