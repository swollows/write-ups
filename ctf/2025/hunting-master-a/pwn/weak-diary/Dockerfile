FROM ubuntu:22.04@sha256:77906da86b60585ce12215807090eb327e7386c8fafb5402369e421f44eff17e
RUN apt-get update -y
RUN apt-get install -y socat
RUN apt-get install -y build-essential gcc libasan6 ca-certificates
RUN adduser chall
WORKDIR /home/chall

USER chall
COPY ./chall ./chall
COPY ./flag ./flag

USER root
RUN chown -R root:root /home/chall
RUN chmod 755 /home/chall
RUN chmod 644 ./flag
RUN chmod 755 ./chall

CMD socat -T 300 TCP-LISTEN:15253,reuseaddr,fork EXEC:/home/chall/chall,stderr
EXPOSE 15253