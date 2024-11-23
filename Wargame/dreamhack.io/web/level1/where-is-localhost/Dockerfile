FROM python:3.13-alpine3.20@sha256:c38ead8bcf521573dad837d7ecfdebbc87792202e89953ba8b2b83a9c5a520b6

RUN pip install flask

COPY contents /app
WORKDIR /app

EXPOSE 5000

CMD ["python", "main.py"]
