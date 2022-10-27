FROM ubuntu:22.04

RUN apt update && apt install python3 python3-pip wget -y
RUN python3 -m pip install --upgrade pip
RUn python3 -m pip install packaging
RUN python3 -m pip install selenium webdriver-manager
RUN wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
RUN apt install -y ./google-chrome-stable_current_amd64.deb

ENTRYPOINT ["sh", "/usr/src/app/run.sh"]
