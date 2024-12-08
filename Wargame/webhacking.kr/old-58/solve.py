import multiprocessing
import subprocess
import time
import os
import signal

def kill_proxy():
    # 명령어 실행 전 mitmdump 프로세스 살아있는지 여부 확인
    command = "ps -ef | grep 'proxy.py' | awk 'NR == 1 {print \"kill -9 \"$2}'"
    result = subprocess.run(command, shell=True, capture_output=True, text=True)

    subprocess.run(result.stdout, shell=True)

def run_proxy():
    """mitmdump를 데몬 프로세스로 실행"""
    print("Starting proxy.py in daemon mode...")
    subprocess.run(["mitmdump", "-s", "proxy.py", "--set", "listen_port=9090", "--quiet"])  # 또는 python3, 실행 환경에 따라 조정

def run_exploit():
    """exploit.py 실행"""
    print("Starting exploit.py...")
    subprocess.run(["python", "exploit.py"])  # 또는 python3

def terminate_proxy(proxy_process):
    """exploit.py 종료 후 mitmdump 종료"""
    print("Stopping mitmdump...")
    proxy_process.terminate()  # mitmdump 프로세스 종료

    # 종료된 프로세스 확인
    proxy_process.join() # 자식 프로세스가 종료될 때까지 기다림
    print("Process terminated and joined.")

if __name__ == "__main__":
    kill_proxy()

    # proxy.py 실행 (데몬 상태로)
    proxy_process = multiprocessing.Process(target=run_proxy)
    proxy_process.daemon = True  # 데몬 프로세스로 설정
    proxy_process.start()

    time.sleep(5)

    # exploit.py 실행
    run_exploit()  # 순차적으로 실행되도록 호출

    # exploit.py가 종료된 후 mitmdump 종료
    # (mitmdump는 데몬 프로세스라서 메인 프로세스 종료 시 자동으로 종료되지만 명시적으로 종료)
    terminate_proxy(proxy_process)

    # 플래그 결과 출력
    with open('./FLAG.txt', mode="r") as f:
        print(f.read())
    
    kill_proxy()
