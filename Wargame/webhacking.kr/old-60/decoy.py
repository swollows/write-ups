from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

URL = "https://webhacking.kr/challenge/web-37"
URI = "/?mode=auth"
PHPSESSID = '1'

COOKIES = {
    'name' : 'PHPSESSID', 'value' : PHPSESSID
}

try : 
    service = Service(executable_path="/chromedriver-linux64/chromedriver")
    options = webdriver.ChromeOptions()
    for _ in [
        "--headless",
        "--window-size=1920x1080",
        "--disable-gpu",
        "--no-sandbox",
        "--disable-dev-shm-usage",
    ]:
        options.add_argument(_)

    driver = webdriver.Chrome(service=service, options=options)
    driver.implicitly_wait(3)
    driver.set_page_load_timeout(3)
    driver.get(URL + URI)  # 접속할 웹 페이지 URL
    driver.add_cookie(COOKIES)

    # flag 파일로 이동하는 스크립트 실행
    trigger_script = """
        function flag() {
            var enco='';
            var enco2=126;
            var enco3=33;
            for(i=1;i<122;i++){
            enco=enco+String.fromCharCode(i,0);
            }
            function enco_(x){
            return enco.charCodeAt(x);
            }
            var flag = String.fromCharCode(enco_(240))+String.fromCharCode(enco_(220))+String.fromCharCode(enco_(232))+String.fromCharCode(enco_(192))+String.fromCharCode(enco_(226))+String.fromCharCode(enco_(200))+String.fromCharCode(enco_(204))+String.fromCharCode(enco_(222-2))+String.fromCharCode(enco_(198))+"~~~~~~"+String.fromCharCode(enco2)+String.fromCharCode(enco3);location.href="./"+flag+".php";
        }

        flag();
    """

    time.sleep(2)  # 이벤트가 실행되는 시간 대기

    driver.execute_script(trigger_script)

    time.sleep(2)  # 이벤트가 실행되는 시간 대기

    html_source = driver.page_source

    print(html_source)

except Exception as e:
    driver.quit()
    print(e)
    exit()

# 브라우저 닫기
driver.quit()