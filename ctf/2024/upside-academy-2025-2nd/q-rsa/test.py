from Crypto.Util.number import *

x = b'''Modulus=9F68307BA4AFDF98FFC8EC8BAC48AF254C20673D9821A886D52EDD901D800CA0417509A178178AF1A36BE5D4CB7C830B2AE13DE8B1015932F9CB6076FB28DC94A098138CBC494000EFDAEE10DD4DFC85E0332B94E9E2BCB83029EEC8922A00F2B51A2AEEC04AB8CD0AF1F96CD58B1F28B4EDFB4AE5BDB73925AA534632201804BD1304A1EF4B95CC6E33F589D04C07C7AB333DBDC3F4D54271012A3D2F09D663ADB54F2B2829B6DE64712ACBE5FE31099C14FAE7F3EDCA7418BC2944C27EB211BD6092450716F48AD3C5B32E75BC0C84B5D042EE380053DE9955E434EA7AF20EAD43D84A6854C125A8DC8BE3A268DE59CA6C6AAE18ACD7CD061404DDF6FEC703'''

N = int(x.split(b"Modulus=")[1].strip(), 16)

print(f"N : {N}")

x = b'''prime1:
    00:d3:7c:ff:98:9d:3b:92:30:8c:db:60:23:c5:
    5c:2c:da:dd:db:4a:fd:77:ac:fd:10:5d:8f:36:
    58:84:c5:4f:2c:db:bb:5c:fe:fd:30:13:97:69:
    4f:a6:39:3e:53:9b:6c:b9:1e:6f:1c:eb:16:4d:
    d2:72:dc:48:a9:60
prime2:
    00:ff:8b:42:31:b1:ff:7d:02:35:12:14:7b:de:
    fd:1a:da:1e:bb:b3:32:ed:b4:13:99:63:15:31:
    d6:1b:39:b6:39:71:87:cc:bd:13:4e:3f:15:15:
    85:80:da:a5:6b:9f:7b:8c:ea:c1:c5:da:9f:2a:
    68:ed:13:5e:4e:3d'''

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

print(p1)

p1 = bytes_to_long(p1)

print(p1)