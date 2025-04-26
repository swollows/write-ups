from flask import Flask, redirect, request, render_template
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from time import sleep
from os import urandom, environ
from urllib.parse import quote, urlparse, parse_qs
from base64 import b64decode, b64encode

app = Flask(__name__)
app.secret_key = urandom(32)

FLAG = environ.get("FLAG", "DH{fake_flag}")
PASSWORD = environ.get("PASSWORD", "1234")


def access_page(name, detail):
    try:
        user_info = f'admin:{PASSWORD}'
        encoded_user_info = b64encode(user_info.encode()).decode()
        service = Service(executable_path="/chromedriver-linux64/chromedriver")
        options = webdriver.ChromeOptions()
        for _ in [
            "headless",
            "window-size=1920x1080",
            "disable-gpu",
            "no-sandbox",
            "disable-dev-shm-usage",
        ]:
            options.add_argument(_)
        driver = webdriver.Chrome(service=service, options=options)
        driver.implicitly_wait(3)
        driver.set_page_load_timeout(3)
        driver.execute_cdp_cmd(
            'Network.setExtraHTTPHeaders',
            {'headers': {'Authorization': f'Basic {encoded_user_info}'}}
        )
        
        driver.execute_cdp_cmd('Network.enable', {})
        driver.get(f"http://127.0.0.1:8000/")
        driver.get(f"http://127.0.0.1:8000/intro?name={quote(name)}&detail={quote(detail)}")
        sleep(1)
    except Exception as e:
        print(e, flush=True)
        driver.quit()
        return False
    driver.quit()
    return True

@app.route("/", methods=["GET"])
def index():
    return redirect("/intro")

@app.route("/intro", methods=["GET"])
def intro():
    name = request.args.get("name")
    detail = request.args.get("detail")
    return render_template("intro.html", name=name, detail=detail)


@app.route("/report", methods=["GET", "POST"])
def report():
    if request.method == "POST":
        path = request.form.get("path")
        if not path:
            return render_template("report.html", msg="fail")

        else:
            parsed_path = urlparse(path)
            params = parse_qs(parsed_path.query)
            name = params.get("name", [None])[0]
            detail = params.get("detail", [None])[0]

            if access_page(name, detail):
                return render_template("report.html", message="Success")
            else:
                return render_template("report.html", message="fail")
    else:
        return render_template("report.html")



@app.route("/whoami", methods=["GET"])
def whoami():
    user_info = ""
    authorization = request.headers.get('Authorization')

    if authorization:
        user_info = b64decode(authorization.split('Basic ')[1].encode()).decode()
    else:
        user_info = "guest:guest"

    id = user_info.split(":")[0]
    password = user_info.split(":")[1]
    if ((id == 'admin') and (password == '[**REDACTED**]')):
        message = FLAG
        return render_template('whoami.html',id=id, message=message)
    else:
        message = "You are guest"
        return render_template('whoami.html',id=id, message=message)



if __name__ == "__main__":
    app.run(host="0.0.0.0", port=8000)
