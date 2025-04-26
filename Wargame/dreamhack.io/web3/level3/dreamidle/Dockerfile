FROM dreamhackofficial/web3-base:latest@sha256:b4ec08f62eec61beca32c10af48855adc19c56ff6402daa9c13d767299d685b5

RUN apt update && apt install --fix-missing -y

COPY ./deploy/config.yaml /app/
COPY ./deploy/DreamIdle.sol /app/src
COPY ./deploy/verifier.py /app/verifier.py
COPY ./deploy/flag.txt /app/flag.txt
COPY ./deploy/remappings.txt /app/remappings.txt

WORKDIR /app

RUN /app/build.sh


