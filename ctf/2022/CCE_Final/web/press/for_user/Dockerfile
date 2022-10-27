FROM node:17.6

WORKDIR /app
COPY ./app /app

RUN apt update
RUN apt install gcc python3 python3-pip -y
RUN pip install pycryptodome

RUN mkdir /app/uploads && mkdir /app/secret
RUN chmod 777 /app/uploads
RUN python3 /app/generate.py
RUN npm install

COPY flag.txt /flag.txt
COPY readflag.c /tmp/readflag.c

RUN chmod 440 /flag.txt
RUN gcc /tmp/readflag.c -o /readflag
RUN chmod 2555 /readflag

RUN useradd -m app
USER app

CMD node index.js 