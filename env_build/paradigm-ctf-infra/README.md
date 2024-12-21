# WSL2 + Ubuntu 22.04.03 LTS 환경이라는 가정하에 작성
# 1. WSL2에 Paradigm CTF Infra 저장소 클론하기
cd ~
git clone https://github.com/paradigmxyz/paradigm-ctf-infrastructure

# 2. 로컬에서 이미지 빌드하기
1) 다운로드 받은 저장소 위치로 이동
cd ~/paradigm-ctf-infrastructure

2) paradigmctf.py 폴더 위치로 이동
cd ./paradigmctf.py

3) 2)번 위치에서 docker compose up 명령어 실행
docker compose up

# 3. kCTF를 이용하여 CTF 구동 환경 구축
1) kctf 활성화
cd ~/paradigm-ctf-infrastructure
curl -sSL https://kctf.dev/sdk_1_0_0 | tar xz
source kctf/activate

2) 클러스터 생성
kctf cluster create --type kind local-cluster --start

3) 도커 이미지 빌드
(cd paradigmctf.py; docker build  . -t "gcr.io/paradigmxyz/infra/paradigmctf.py:latest")

4) 빌드한 이미지 연결
kind load docker-image --name "${CLUSTER_NAME}" "gcr.io/paradigmxyz/infra/paradigmctf.py:latest"

5) 모든 리소스 생성
kubectl apply -f kubernetes/ctf-server.yaml

6) 로컬 접근 가능하도록 anvil proxy 포트포워딩 설정
kcubectl port-forward service/anvil-proxy 8545:8545 &

# 4. challenge 구동
1) 구동하려는 Challenge의 Template 폴더 접속 (ex> ~/paradigm-ctf-infrastructure/templates/eth-pwn)
cd ~/paradigm-ctf-infrastructure/templates/eth-pwn

2) 배포가능한 Challenge 목록 확인
kctf chal list

3) Challenge 배포
kctf chal start <챌린지 이름>

4) Challenge 서버 포트포워딩 (반드시 해당 챌린지의 폴더에서만 실행할 것)
kctf chal debug port-forward --port 1337 --local-port 1337&

5) 포트포워딩 후 Challenge 정상 접속 여부 확인
nc 127.0.0.1 1337