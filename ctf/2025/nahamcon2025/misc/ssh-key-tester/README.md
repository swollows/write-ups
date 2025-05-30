# SSH Key Tester

SSH 키 쌍을 테스트하는 Flask 웹 애플리케이션입니다.

## 실행 방법

### Docker Compose 사용 (권장)

```bash
# 컨테이너 빌드 및 실행
docker-compose up --build

# 백그라운드에서 실행
docker-compose up -d --build
```

### Docker 직접 사용

```bash
# 이미지 빌드
docker build -t ssh-key-tester .

# 컨테이너 실행
docker run -d \
  --name ssh-key-tester \
  --privileged \
  -p 8080:8080 \
  -p 2222:22 \
  -v /tmp:/tmp \
  ssh-key-tester
```

## 자동화 스크립트 사용법

SSH 키 생성부터 테스트까지 자동으로 수행하는 스크립트가 제공됩니다:

```bash
# 필요한 Python 패키지 설치
pip install requests

# 자동화 스크립트 실행
python3 test_ssh_keys.py
```

### 자동화 스크립트 동작 과정:

1. **SSH 키 쌍 자동 생성**: `ssh-keygen`을 사용하여 RSA 2048비트 키 쌍 생성
2. **도커 환경에 키 전송**: POST 요청으로 생성된 키를 서버에 업로드
3. **결과 출력**: 각 단계의 성공/실패 여부와 상세 정보 표시

## 수동 사용법

1. 웹 브라우저에서 `http://localhost:8080` 접속
2. `id_rsa` (개인키)와 `id_rsa.pub` (공개키) 파일을 업로드
3. 키 쌍이 유효한지 테스트

## 포트

- `8080`: Flask 웹 애플리케이션
- `2222`: SSH 서비스 (호스트의 22번 포트와 충돌 방지)

## 주의사항

- 컨테이너는 `privileged` 모드로 실행되어야 SSH 서비스가 정상 작동합니다.
- 자동화 스크립트 실행 전에 도커 컨테이너가 실행 중인지 확인하세요.
- 테스트용으로만 사용하세요. 