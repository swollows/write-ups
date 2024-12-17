import re
from flask import Flask, render_template, request
from subprocess import check_output, PIPE

app = Flask(__name__)

@app.route("/")
def index():
    return render_template("index.html")

@app.route("/check")
def check():
    pvkey = request.args.get('pvkey', None)
    if not pvkey:
        return "Invalid input."

    m = re.match("^0x[a-f0-9]{64}$", pvkey)

    if not m:
        return "Invalid input. not 0x[a-f0-9]{64}"

    # cast wallet address --private-key
    print(m.group(0))
    stdout = check_output(['/home/ubuntu/.foundry/bin/cast', 'wallet', 'address', '--private-key', m.group(0)]).decode().strip()
    print(stdout)
    if stdout.lower().startswith("0xf00f"):
        return "DH{}"
    else:
        return f"Try again ...<br>\noutput: {stdout}"



    return render_template("index.html")

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=8088, debug=False)
