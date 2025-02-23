FROM dreamhackofficial/web3-base:latest

COPY ./deploy/config.yaml /app/
COPY ./deploy/Contract.sol /app/src
COPY ./deploy/verifier.py /app/verifier.py
COPY ./deploy/flag.txt /app/flag.txt

RUN /app/build.sh
