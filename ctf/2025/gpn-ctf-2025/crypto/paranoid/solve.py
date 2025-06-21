from pwn import *
from aes import unpad
import sys

# challenge.py와 동일한 값
MODULUS = 2**128 + 51

def get_iv(p, payload_hex):
    """서버에 데이터를 보내고 IV를 추출하는 함수"""
    p.sendline(payload_hex)
    response = p.recvuntil(b"Give me something to encrypt (hex):", drop=True)
    ct_hex = response.strip().decode()
    iv_bytes = bytes.fromhex(ct_hex)[:16]
    return int.from_bytes(iv_bytes, 'big')

def solve():
    context.log_level = 'debug'  # 모든 데이터 출력

    progress = log.progress('서버에 연결 중')
    try:
        p = remote("stormcity-of-forceful-honor.gpn23.ctf.kitctf.de", "443", ssl=True)
        progress.success('연결 완료')
    except Exception as e:
        progress.failure(f'연결 실패: {e}')
        return

    # 1. 초기 정보 수집
    progress = log.progress('초기 암호화된 플래그 및 IV 수집')
    initial_output = p.recvuntil(b"Give me something to encrypt (hex):", drop=True)
    flag_ct_hex = initial_output.strip().decode()
    full_flag_ct = bytes.fromhex(flag_ct_hex)
    v0_bytes = full_flag_ct[:16]
    encrypted_flag_body = full_flag_ct[16:]
    v0_int_leaked = int.from_bytes(v0_bytes, 'big')
    progress.success('수집 완료')
    log.info(f"Encrypted flag body: {encrypted_flag_body.hex()}")
    log.info(f"Leaked v0 bytes:     {v0_bytes.hex()}")

    # 2. LCG 크랙을 위한 IV 수집
    progress = log.progress('LCG 크랙을 위한 IV 3개 수집')
    ivs = [get_iv(p, b'00') for _ in range(3)]
    s0, s1, s2 = ivs
    log.info(f"Collected IVs: {s0}, {s1}, {s2}")
    progress.success("수집 완료")

    # 3. LCG 파라미터 복구
    progress = log.progress('LCG 파라미터 (MUL, ADD) 복구')
    s1_minus_s0 = (s1 - s0) % MODULUS
    s2_minus_s1 = (s2 - s1) % MODULUS
    inv_s1_minus_s0 = pow(s1_minus_s0, -1, MODULUS)
    MUL = (s2_minus_s1 * inv_s1_minus_s0) % MODULUS
    ADD = (s1 - (s0 * MUL)) % MODULUS
    progress.success("복구 완료")
    log.info(f"Found MUL: {MUL}")
    log.info(f"Found ADD: {ADD}")

    lcg = lambda s: (s * MUL + ADD) % MODULUS
    MUL_INV = pow(MUL, -1, MODULUS)
    lcg_inv = lambda s: ((s - ADD) * MUL_INV) % MODULUS

    # 4. 원본 v0 역산 및 검증
    # s0 = lcg(v0) 관계를 이용
    v0_int_calculated = lcg_inv(s0)
    log.info(f"Calculated original v0: {v0_int_calculated}")
    if v0_int_calculated != v0_int_leaked:
        log.warning("Calculated v0 and leaked v0 mismatch. This is unexpected but can be handled.")
        # Leaked v0 is the ground truth
    v0_target = v0_int_leaked

    # 5. RNG 상태 조작을 위한 r1, r2 계산
    progress = log.progress('RNG 상태 조작을 위한 r1, r2 계산')
    # 현재 상태: 3번의 '00' 전송 후, RNG의 내부 상태는 lcg(s2)
    # 목표: 두번의 조작(r1, r2)을 통해 IV가 v0_target이 되도록.
    # 즉, lcg(lcg(lcg(s2) + r1) + r2) == v0_target
    state_before_r1 = lcg(s2)
    state_after_r1_iv = lcg(state_before_r1)

    r1, r2 = -1, -1
    for k in range(-5, 6):
        for r2_candidate in range(256):
            # We want: lcg(state_after_r1_iv + r1) + r2 == v0_target
            target_lcg_output = v0_target - r2_candidate
            # lcg(state_after_r1_iv + r1) == target_lcg_output
            required_input_to_lcg_base = lcg_inv(target_lcg_output)
            
            # (state_after_r1_iv + r1) can be > MODULUS due to reseed
            required_r1 = required_input_to_lcg_base - state_after_r1_iv + k * MODULUS
            
            if 0 <= required_r1 < 256:
                r1 = required_r1
                r2 = r2_candidate
                break
        if r1 != -1:
            break

    if r1 == -1:
        progress.failure("r1, r2를 찾을 수 없습니다.")
        p.close()
        return
    progress.success(f'r1={r1}, r2={r2} 발견')

    # 6. RNG 상태 조작 실행
    progress = log.progress('계산된 r1, r2로 RNG 상태 조작')
    get_iv(p, r1.to_bytes(1, 'big').hex())
    get_iv(p, r2.to_bytes(1, 'big').hex())
    progress.success('상태 조작 완료')

    # 7. 플래그 복호화
    progress = log.progress('복호화를 위해 암호화된 플래그 전송')
    p.sendline(encrypted_flag_body.hex())
    final_ct_hex = p.recvline().strip().decode()
    final_ct = bytes.fromhex(final_ct_hex)
    progress.success("응답 수신 완료")

    # 8. 결과 확인
    final_iv = final_ct[:16]
    log.info(f"수신된 최종 IV: {final_iv.hex()}")
    if final_iv != v0_target.to_bytes(16, 'big'):
        log.error("IV 조작 실패!")
        p.close()
        return

    padded_flag = final_ct[16 : 16 + len(encrypted_flag_body)]
    flag = unpad(padded_flag)

    log.success(f"Flag: {flag.decode()}")
    p.close()

if __name__ == "__main__":
    solve() 