FROM ubuntu:latest

RUN apt-get update
RUN apt-get install python3 python3-dev python3-pip -y
RUN python3 -m pip install flask

RUN adduser web

WORKDIR /home/web
COPY ./app.py /home/web
RUN echo "__FLAG_HERE__" > /home/web/flag

EXPOSE 5001
USER web

CMD ["python3","-u","/home/web/app.py"]