FROM ubuntu:22.04@sha256:b6b83d3c331794420340093eb706a6f152d9c1fa51b262d9bf34594887c2c7ac

ENV PROB_NAME prob
ENV PORT 13378

RUN apt-get update && apt-get install socat -y
RUN apt-get install gcc -y

RUN adduser ctf

WORKDIR /home/ctf/

COPY ./deploy/run.sh ./run.sh
# COPY ./deploy/setup.sh ./setup.sh
COPY ./deploy/${PROB_NAME} ./${PROB_NAME}
COPY ./deploy/flag ./flag

# RUN chmod +x ./setup.sh
RUN chmod +x ./run.sh
# RUN ./setup.sh

RUN chown -R root:ctf /home/ctf
RUN chmod -R 750 /home/ctf
RUN chmod 444 /home/ctf/flag

EXPOSE ${PORT}
CMD socat -T60 -t60 TCP-LISTEN:${PORT},reuseaddr,fork EXEC:./run.sh,stderr
