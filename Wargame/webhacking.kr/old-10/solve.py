from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

URL = "https://webhacking.kr/challenge/code-1"
URI = "/"
PHPSESSID = '5m4vrbnhn9upeegf1mv0t1ccmn'

COOKIES = {
    'name' : 'PHPSESSID', 'value' : PHPSESSID
}

"""
    풀이
    1. #hackme 태그의 left 속성을 1599px로 변경 후 click을 2번 트리거하도록 자동화 스크립트 제작
"""

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
    driver.set_window_size(1920, 1080)
    driver.get(URL + URI)  # 접속할 웹 페이지 URL
    driver.add_cookie(COOKIES)

    element = driver.find_element(By.ID, "hackme")

    new_left_value = "1599px"
    driver.execute_script("arguments[0].style.left = arguments[1];", element, new_left_value)

    updated_left = driver.execute_script("return arguments[0].style.left;", element)
    print(f"Updated left value: {updated_left}")

    for i in range(2):
        element.click()
        print(i)
    
    html_source = driver.page_source

    print(html_source)

except Exception as e:
    driver.quit()
    print(str(e))
    exit()

# 브라우저 닫기
driver.quit()