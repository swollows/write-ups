from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

URL = "https://webhacking.kr/challenge/js-1"
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

    time.sleep(3)  # 이벤트가 실행되는 시간 대기

    # JavaScript로 함수 새로 작성해서 트리거하기
    trigger_script = """
    var answer = document.URL;
    answer = answer.indexOf(".kr");
    answer = answer * 30;
    return answer;
    """

    ANS = driver.execute_script(trigger_script)
    
    pw_field = driver.find_element(By.NAME, "input_pwd")
    pw_field.send_keys(str(ANS))

    button = driver.find_element(By.CSS_SELECTOR, "input[type='button']")
    button.click()

    time.sleep(3)  # 이벤트가 실행되는 시간 대기
    
    # 페이지 내용을 가져오기
    page_content = driver.page_source  # 전체 HTML 소스
    print(page_content)  # 출력

except Exception as e:
    driver.quit()
    print(e)
    exit()
driver.quit()