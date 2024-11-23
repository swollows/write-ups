from flask import Flask, render_template, request
import ipaddress
import urllib.parse
import urllib.request
import urllib.error

app = Flask(__name__)

try:
    with open('flag') as f:
        flag = f.read()
except FileNotFoundError:
    flag = 'flag{this_is_a_fake_flag}'

@app.route('/')
def form():
    return render_template('index.html')

@app.route('/vuln', methods=['POST'])
def vuln():
    name = request.form.get('vulntest')
    try:
        address = ipaddress.ip_address(name)
        if address.version == 4:
            return "no..."
        url = urllib.parse.urlparse(f"http://[{address.exploded}]:5000/localonly")
        if url.netloc != f'[{address.exploded}]:5000':
            print(url.netloc, f'[{address.exploded}]')
            return "no..."
        req = urllib.request.Request(url.geturl())
        # 이 시점에서 DNS Rebinding 기법으로 ::1 -> 127.0.0.1 변환
        return urllib.request.urlopen(req).read().decode('utf-8')
    except ValueError:
        return "no..."
    except urllib.error.URLError:
        return "connection refused"

@app.route('/localonly', methods=['GET'])
def localonly():
    addr = ipaddress.ip_address(request.remote_addr)
    if addr.is_loopback and addr.version == 4:
        return flag
    else:
        return 'not loopback'

if __name__ == '__main__':
    app.run('0.0.0.0', 5000)
