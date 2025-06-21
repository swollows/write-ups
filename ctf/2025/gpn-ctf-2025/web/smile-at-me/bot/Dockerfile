# docker network create internal
# docker build -t bot_service_image -f Dockerfile .
# docker run --rm --name bot_service --network internal --build-arg BASE_URL="http://challenge_service:9222" -p 3000:3000 bot_service_image

FROM node:21-slim AS deps

WORKDIR /app
COPY package.json package-lock.json* ./
RUN npm install --omit=dev --no-audit --no-fund --production=true

FROM node:21-slim

RUN apt-get update -y && \
    apt-get install -y --no-install-recommends \
        chromium \
        fonts-liberation \
        libappindicator3-1 \
        libasound2 \
        libatk-bridge2.0-0 \
        libcups2 \
        libdrm2 \
        libgbm1 \
        libgtk-3-0 \
        libnspr4 \
        libnss3 \
        libxcomposite1 \
        libxdamage1 \
        libxext6 \
        libxfixes3 \
        libxrandr2 \
        libxtst6 \
        xdg-utils && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

COPY flag /flag

RUN adduser --disabled-password --gecos "" bot

WORKDIR /bot
COPY --from=deps /app/node_modules ./node_modules
COPY app.js ./

RUN chown -R bot:bot /bot

USER bot
RUN npx puppeteer browsers install chrome

ARG BASE_URL
ENV BASE_URL=${BASE_URL}

CMD ["node", "app.js"]
