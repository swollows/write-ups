FROM python:3.12.11-alpine3.22

RUN apk --no-cache add socat

ARG FLAG=FLAG{Congrats_on_solving_now_do_on_remote}
RUN echo "$FLAG" > /flag

WORKDIR /app
COPY src/* ./

EXPOSE 31337
ENTRYPOINT ["socat", "-v", "tcp-listen:31337,reuseaddr,fork", "EXEC:'python3 ./challenge.py',stderr"]
