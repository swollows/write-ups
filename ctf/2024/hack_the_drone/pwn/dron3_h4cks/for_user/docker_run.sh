#!/bin/bash
docker build -t pwn-1 .
docker run -p 7810:7810/udp pwn-1
