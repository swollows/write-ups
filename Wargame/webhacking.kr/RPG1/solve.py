from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

URL = "https://webhacking.kr/challenge/new-11"
URI = "/"
PHPSESSID = '5m4vrbnhn9upeegf1mv0t1ccmn'

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
    driver.set_window_size(1920, 1080)
    driver.get(URL + URI)  # 접속할 웹 페이지 URL
    driver.add_cookie(COOKIES)

    # JavaScript로 onkeypress 이벤트 트리거
    trigger_script01 = """
        function triggerKeyPress() {
            const targetElement = document.activeElement || document.body;

            // keydown 이벤트 생성
            const keyDownEvent = new KeyboardEvent('keydown', {
                key: 'Enter',
                code: 'Enter',
                keyCode: 13,
                which: 13,
                bubbles: true,
                cancelable: true
            });

            // keyup 이벤트 생성
            const keyUpEvent = new KeyboardEvent('keyup', {
                key: 'Enter',
                code: 'Enter',
                keyCode: 13,
                which: 13,
                bubbles: true,
                cancelable: true
            });

            // keydown 이벤트 디스패치
            const keyDownDispatched = targetElement.dispatchEvent(keyDownEvent);

            if (keyDownDispatched) {
                console.log("keydown 이벤트 실행 완료");
            } else {
                console.error("keydown 이벤트 실행 실패");
            }

            // keyup 이벤트는 약간의 지연 후 디스패치 (자연스러운 전환을 위해)
            setTimeout(() => {
                const keyUpDispatched = targetElement.dispatchEvent(keyUpEvent);
                if (keyUpDispatched) {
                    console.log("keyup 이벤트 실행 완료");
                } else {
                    console.error("keyup 이벤트 실행 실패");
                }
            }, 100); // 100ms 지연 (필요시 조정 가능)
        }

        // 타이틀 화면에서 10초 대기 후 실행
        setTimeout(triggerKeyPress, 10000);
    """

    # Phase 1. Enter Game Scene
    print("Phase 1. Enter Game Scene")
    time.sleep(13)  # 이벤트가 실행되는 시간 대기

    print("Wait loading for 20s...")

    # 타이틀 화면 가져오기
    title_view_path = "./title_view.png"
    driver.save_screenshot(title_view_path)

    driver.execute_script(trigger_script01)

    print("Wait Enter to Game Screen for 20s...")
    time.sleep(12)  # 이벤트가 실행되는 시간 대기

    # 게임 진입 화면 가져오기
    game_view_path = "./game_view.png"
    driver.save_screenshot(game_view_path)

    print(f"중간 게임 화면이 {game_view_path}에 저장되었습니다.")

    trigger_script02 = """
        function triggerKeyPress() {
            const targetElement = document.activeElement || document.body;

            // keydown 이벤트 생성
            const keyDownEvent = new KeyboardEvent('keydown', {
                key: 'Enter',
                code: 'Enter',
                keyCode: 13,
                which: 13,
                bubbles: true,
                cancelable: true
            });

            // keyup 이벤트 생성
            const keyUpEvent = new KeyboardEvent('keyup', {
                key: 'Enter',
                code: 'Enter',
                keyCode: 13,
                which: 13,
                bubbles: true,
                cancelable: true
            });

            // keydown 이벤트 디스패치
            const keyDownDispatched = targetElement.dispatchEvent(keyDownEvent);

            if (keyDownDispatched) {
                console.log("keydown 이벤트 실행 완료");
            } else {
                console.error("keydown 이벤트 실행 실패");
            }

            // keyup 이벤트는 약간의 지연 후 디스패치 (자연스러운 전환을 위해)
            setTimeout(() => {
                const keyUpDispatched = targetElement.dispatchEvent(keyUpEvent);
                if (keyUpDispatched) {
                    console.log("keyup 이벤트 실행 완료");
                } else {
                    console.error("keyup 이벤트 실행 실패");
                }
            }, 100); // 100ms 지연 (필요시 조정 가능)
        }

        // selenium에서 약 3초 대기 후 실행
        this.$gamePlayer.setThrough(true);
        this.$gamePlayer.setDirection(8);
        this.$gamePlayer.moveForward();
        this.$gamePlayer.moveForward();
        this.$gamePlayer.moveForward();
        this.$gamePlayer.moveForward();
        this.$gamePlayer.moveForward();
        this.$gamePlayer.moveForward();
        this.$gamePlayer.setThrough(false);

        // 2초 대기 후 엔터키 입력 실행
        setTimeout(triggerKeyPress, 2000);
    """

    # Phase 2. Go to chest and Open Flag
    print("Phase 2. Go to chest and Open Flag")

    driver.execute_script(trigger_script02)

    time.sleep(5)  # 이벤트가 실행되는 시간 대기

    # 플래그 화면 가져오기
    flag_view_path = "./flag.png"
    driver.save_screenshot(flag_view_path)

    print(f"플래그 화면이 {flag_view_path}에 저장되었습니다.")

except Exception as e:
    driver.quit()
    print(e)
    exit()

# 브라우저 닫기
driver.quit()