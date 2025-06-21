# docker network create internal
# docker build -t challenge_service_image -f Dockerfile .
# docker run --rm --name challenge_service --network internal --build-arg BOT_URL="http://bot_service:3000" -p 9222:9222 challenge_service_image

FROM python:3.12-slim AS build-deps

WORKDIR /app
COPY requirements.txt .
RUN pip install --no-cache-dir --upgrade pip && \
    pip install --no-cache-dir -r requirements.txt

FROM python:3.12-slim

WORKDIR /app

RUN adduser --disabled-password --gecos "" appuser
USER appuser

COPY --from=build-deps /usr/local/lib/python3.12/site-packages /usr/local/lib/python3.12/site-packages
COPY --chown=appuser:appuser . .

ARG BOT_URL
ENV BOT_URL=${BOT_URL}

EXPOSE 9222

CMD ["python", "app.py"]
