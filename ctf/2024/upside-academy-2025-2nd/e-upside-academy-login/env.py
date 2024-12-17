#!/usr/bin/python3
import os

try:
    FLAG = open('./flag.txt', 'r').read().replace('\n','')
except:
    FLAG = 'DH{**FLAG**}'

SECRET_KEY = os.urandom(32)
