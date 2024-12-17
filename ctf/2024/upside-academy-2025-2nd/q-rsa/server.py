import http.server
import ssl
from subprocess import check_output
from time import time, sleep
from Crypto.Util.number import *

pvkey = b""
N = 0


def encrypted_log(data):
    p = bytes_to_long(data) + int(time())
    e = 1337
    c = pow(p, e, N)
    print(c)


def log(data):
    print(data)


class SimpleHTTPRequestHandler(http.server.SimpleHTTPRequestHandler):
    def do_GET(self):
        if self.path == "/private_key":
            encrypted_log(pvkey)

        log(self.path)
        super().do_GET()


if __name__ == "__main__":
    port = 4443
    httpd = http.server.HTTPServer(("localhost", port), SimpleHTTPRequestHandler)

    context = ssl.SSLContext(ssl.PROTOCOL_TLS_SERVER)
    context.load_cert_chain("./certificate.pem", "./key.pem")
    context.set_ciphers("TLS_RSA_WITH_AES_128_GCM_SHA256")
    context.options |= ssl.OP_NO_TLSv1_3
    httpd.socket = context.wrap_socket(httpd.socket, server_side=True)

    x = check_output("openssl rsa -noout -modulus -in key.pem", shell=True)
    N = int(x.split(b"Modulus=")[1].strip(), 16)

    x = check_output("openssl rsa -noout -text -in key.pem", shell=True)
    p1 = (
        x.split(b"prime1:")[1]
        .split(b"prime2:")[0]
        .strip()
        .replace(b"\n", b"")
        .replace(b"\t", b"")
        .replace(b" ", b"")
    )
    p1 = int(p1.replace(b":", b"").decode(), 16)
    p1 = long_to_bytes(p1)
    pvkey = p1

    log(f"HTTPS Server serving at https://localhost:{port}")
    httpd.serve_forever()
