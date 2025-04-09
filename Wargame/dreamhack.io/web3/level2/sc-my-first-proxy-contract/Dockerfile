FROM dreamhackofficial/web3-base:latest@sha256:9c3f148a20a0ad309c400b3fc578a974f82692a33d49b5aa355d664ffc542032

COPY ./deploy/config.yaml /app/
COPY ./deploy/Contract.sol /app/src
COPY ./deploy/verifier.py /app/verifier.py
COPY ./deploy/flag.txt /app/flag.txt

RUN /app/build.sh
