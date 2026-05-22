#!/usr/bin/env python3
from __future__ import annotations

import argparse
import os
from pathlib import Path
import queue
import re
import shutil
import signal
import socket
import subprocess
import sys
import threading
import time
from typing import TextIO


ROOT = Path(__file__).resolve().parent
DEFAULT_HOST = "127.0.0.1"
DEFAULT_PORT = 8000
TRYCLOUDFLARE_RE = re.compile(r"https://[-a-z0-9]+\.trycloudflare\.com")


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser(
        description="Start the BABY local server behind a Cloudflare Quick Tunnel.",
    )
    parser.add_argument("--host", default=DEFAULT_HOST, help="Local bind host.")
    parser.add_argument("--port", type=int, default=DEFAULT_PORT, help="Local server port.")
    parser.add_argument(
        "--cloudflared-bin",
        default="cloudflared",
        help="Path to the cloudflared binary.",
    )
    parser.add_argument(
        "--webhook-log",
        default=str(ROOT / "webhook.log"),
        help="Path where webhook requests are written as JSON lines.",
    )
    return parser.parse_args()


def ensure_port_available(host: str, port: int) -> None:
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as sock:
        sock.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
        try:
            sock.bind((host, port))
        except OSError as exc:
            raise SystemExit(f"Port {host}:{port} is not available: {exc}") from exc


def resolve_binary(name: str) -> str:
    resolved = shutil.which(name) if Path(name).name == name else name
    if not resolved:
        raise SystemExit(
            "cloudflared was not found. Install it with `brew install cloudflared` first."
        )
    return resolved


def stream_output(
    process: subprocess.Popen[str],
    log_file: TextIO,
    lines: queue.Queue[str],
) -> None:
    assert process.stdout is not None
    for line in process.stdout:
        log_file.write(line)
        log_file.flush()
        lines.put(line)


def start_cloudflared(
    cloudflared_bin: str,
    host: str,
    port: int,
) -> tuple[subprocess.Popen[str], TextIO, queue.Queue[str]]:
    log_file = (ROOT / "cloudflared.log").open("a", encoding="utf-8")
    lines: queue.Queue[str] = queue.Queue()
    target = f"http://{host}:{port}"
    process = subprocess.Popen(
        [
            cloudflared_bin,
            "tunnel",
            "--url",
            target,
            "--no-autoupdate",
            "--loglevel",
            "info",
        ],
        cwd=ROOT,
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
        start_new_session=True,
    )
    thread = threading.Thread(target=stream_output, args=(process, log_file, lines), daemon=True)
    thread.start()
    return process, log_file, lines


def read_cloudflare_url(process: subprocess.Popen[str], lines: queue.Queue[str]) -> str:
    deadline = time.monotonic() + 30
    seen_lines: list[str] = []

    while time.monotonic() < deadline:
        if process.poll() is not None:
            tail = "".join(seen_lines[-8:]).strip()
            raise SystemExit(
                f"cloudflared exited early with code {process.returncode}. "
                f"Check {ROOT / 'cloudflared.log'}.\n{tail}"
            )

        try:
            line = lines.get(timeout=0.5)
        except queue.Empty:
            continue

        seen_lines.append(line)
        match = TRYCLOUDFLARE_RE.search(line)
        if match:
            return match.group(0).rstrip("/")

    raise SystemExit(f"Could not read a trycloudflare.com URL. Check {ROOT / 'cloudflared.log'}.")


def start_server(host: str, port: int, public_url: str, webhook_log: str) -> subprocess.Popen[object]:
    env = os.environ.copy()
    env["BABY_HOST"] = host
    env["BABY_PORT"] = str(port)
    env["WEBHOOK_URL"] = f"{public_url}/webhook"
    env["WEBHOOK_LOG"] = webhook_log

    return subprocess.Popen(
        [sys.executable, str(ROOT / "server.py")],
        cwd=ROOT,
        env=env,
        start_new_session=True,
    )


def terminate(process: subprocess.Popen[object]) -> None:
    if process.poll() is not None:
        return

    try:
        os.killpg(process.pid, signal.SIGTERM)
    except ProcessLookupError:
        return
    except OSError:
        process.send_signal(signal.SIGTERM)

    try:
        process.wait(timeout=5)
    except subprocess.TimeoutExpired:
        try:
            os.killpg(process.pid, signal.SIGKILL)
        except OSError:
            process.kill()
        process.wait(timeout=5)


def main() -> None:
    args = parse_args()
    ensure_port_available(args.host, args.port)
    cloudflared_bin = resolve_binary(args.cloudflared_bin)

    cloudflared_process = None
    cloudflared_log = None
    server_process = None

    try:
        cloudflared_process, cloudflared_log, lines = start_cloudflared(
            cloudflared_bin,
            args.host,
            args.port,
        )
        public_url = read_cloudflare_url(cloudflared_process, lines)
        server_process = start_server(args.host, args.port, public_url, args.webhook_log)

        print()
        print(f"Local route:       http://{args.host}:{args.port}/")
        print(f"Cloudflare route:  {public_url}/")
        print(f"Payload JS:        {public_url}/script.js")
        print(f"Webhook URL:       {public_url}/webhook")
        print(f"Webhook log:       {args.webhook_log}")
        print(f"cloudflared log:   {ROOT / 'cloudflared.log'}")
        print()
        print("Press Ctrl-C to stop both the local server and Cloudflare Tunnel.")

        exit_code = server_process.wait()
        raise SystemExit(exit_code)
    except KeyboardInterrupt:
        print("\nStopping...")
    finally:
        if server_process is not None:
            terminate(server_process)
        if cloudflared_process is not None:
            terminate(cloudflared_process)
        if cloudflared_log is not None:
            cloudflared_log.close()


if __name__ == "__main__":
    main()
