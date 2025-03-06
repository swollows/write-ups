from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager
from selenium import webdriver
import os
import time

URL = "file://" + os.getcwd() + "/jack-o-lantern.html"

try :
    service = Service(ChromeDriverManager().install())
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
    driver.get(URL)  # 접속할 웹 페이지 URL

    trigger_script = """
    for(var i = 0; i <= 10000; i++) {
        $('#jack-target').click();
    }
    """
    driver.execute_script(trigger_script)


    print("Attack Done. Flag will be saved in flag.png after 10 seconds.")
    print("Please wait...")
    
    time.sleep(10)  # 이벤트가 실행되는 시간 대기

    # 페이지 내용을 가져오기
    driver.save_screenshot("flag.png")

except Exception as e:
    driver.quit()
    print(e)
    exit()

driver.quit()