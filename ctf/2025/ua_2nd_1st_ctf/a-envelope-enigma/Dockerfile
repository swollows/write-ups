# TEST
FROM dreamhackofficial/web3-base:latest@sha256:14b8fa846755b688895b0cf277fc32030a50c436576d68907693b4cc0e2604b5

COPY ./config.yaml /app/
COPY ./src/ /app/src/
COPY ./verifier.py /app/verifier.py
COPY ./flag.txt /app/flag.txt

RUN /app/build.sh