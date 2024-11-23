import ipaddress
import urllib.parse
import urllib.request
import urllib.error

name = '0:0:0:0:0:0:0:1'
try:
    address = ipaddress.ip_address(name)
    if address.version == 4:
        print("no...")
    else:
        print(f"address.version check passed! (is {address.version})")
        print(address.exploded)
except ValueError:
    print("no...")