from sys import argv
import socket
import struct
import pow

def solve_pow(sock):
    header = recv_until(sock, b'\n')
    if b'proof-of-work: disabled' in header:
        return
    recv_until(sock, b'python3 ')
    recv_until(sock, b' solve ')
    data = recv_until(sock, b'\n')
    recv_until(sock, b'Solution? ')
    solution = pow.solve_challenge(data.decode('ascii')[:-1])
    sock.sendall(solution.encode()+b'\n')
    recv_until(sock, b'Correct\n')

def recv_until(s, d):
    buf = b''
    while not buf.endswith(d):
      buf += s.recv(1)
    return buf


if len(argv) < 4:
    print("python3 submit.py solution.inp host port")
    exit(1)

with open(argv[1], "rb") as f:
    input_bytes = f.read()

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect((argv[2], int(argv[3])))

print("Solving pow")
solve_pow(s)

print("Sending recording")
s.send(struct.pack(">I", len(input_bytes)))
s.send(input_bytes)

print("Waiting for server's response")
data = b""
while True:
    d = s.recv(1024)
    if not d:
        break
    data += d
s.close()
print(data.decode("utf-8").strip())
