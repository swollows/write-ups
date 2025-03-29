FROM ubuntu:24.04

RUN apt-get clean
RUN rm -r /var/lib/apt/lists/*
RUN apt update -o Acquire::CompressionTypes::Order::=gz
RUN apt update -y && apt upgrade -y
RUN apt install qemu-system python3-pip cpio -y

RUN python3 -m pip config set global.break-system-packages true
RUN python3 -m pip install requests

RUN useradd --create-home --shell /bin/bash ctf

WORKDIR /home/ctf

ADD ./prob /home/ctf

RUN chmod +x bridge.py
RUN chmod +x run.sh
RUN chmod +x ynetd

WORKDIR /home/ctf
CMD ./ynetd -p 4321 "timeout 60 python3 bridge.py"

