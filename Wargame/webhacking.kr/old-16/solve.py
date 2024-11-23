from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

URL = "https://webhacking.kr/challenge/js-3"
URI = "/"
PHPSESSID = 'jl43tngbl1sca1cumqkf3dhm57'

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

    # JavaScript로 onkeypress 이벤트 트리거
    trigger_script = """
    document.body.dispatchEvent(new KeyboardEvent('keypress', {
        keyCode: 124,    // ASCII 코드
        which: 124,      // 동일한 ASCII 코드
        bubbles: true,  // 이벤트 버블링 활성화
        cancelable: true // 이벤트 취소 가능
    }));
    """
    driver.execute_script(trigger_script)

    time.sleep(5)  # 이벤트가 실행되는 시간 대기

    # 페이지 내용을 가져오기
    page_content = driver.page_source  # 전체 HTML 소스
    print(page_content)  # 출력

except Exception as e:
    driver.quit()
    print(e)
    exit()
driver.quit()