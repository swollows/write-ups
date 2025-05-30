FROM ubuntu:22.04

# 패키지 업데이트 및 필요한 패키지 설치
RUN apt-get update && apt-get install -y \
    python3 \
    python3-pip \
    openssh-server \
    sudo \
    && rm -rf /var/lib/apt/lists/*

# SSH 서비스 설정
RUN mkdir /var/run/sshd
RUN echo 'root:password' | chpasswd
RUN sed -i 's/#PermitRootLogin prohibit-password/PermitRootLogin yes/' /etc/ssh/sshd_config
RUN sed -i 's/#PasswordAuthentication yes/PasswordAuthentication yes/' /etc/ssh/sshd_config

# Flask 설치
RUN pip3 install flask

# 플래그 파일 생성
RUN echo 'flag{fake_flag}' > /flag
RUN chmod 644 /flag

# 작업 디렉토리 설정
WORKDIR /app

# 애플리케이션 파일 복사
COPY main.py /app/

# SSH 호스트 키 생성
RUN ssh-keygen -A

# 포트 노출
EXPOSE 8080 22

# 시작 스크립트 생성
RUN echo '#!/bin/bash\n\
service ssh start\n\
python3 /app/main.py' > /start.sh && chmod +x /start.sh

# 컨테이너 시작 시 실행할 명령
CMD ["/start.sh"] 