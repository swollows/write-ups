#!/bin/sh
rm bot/register.lock
rm -rf db-data/*
export EXTERNAL_IP=$(hostname -I | awk '{print $1}')
echo $EXTERNAL_IP:1929 > ./bot/url.txt
docker-compose build
docker-compose up -d

