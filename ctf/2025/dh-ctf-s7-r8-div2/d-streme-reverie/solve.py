# ── STREAM 클래스 원본 그대로 가져와 사용 ──────────────────────────
class STREAM:
    def __init__(self, seed, size=32):
        self.state = bin(seed)[2:].zfill(size)
        self.taps = (32, 22, 2, 1)

    def shift(self):
        new_bit = 0
        for tap in self.taps:
            new_bit ^= int(self.state[tap - 1])
        self.state = str(new_bit) + self.state[:-1]
        return new_bit             # str(0/1) → 나중에 int 변환

    def get_byte(self):
        b = 0
        for _ in range(8):
            b = (b << 1) | self.shift()
        return b

    def decrypt(self, ct: bytes) -> bytes:
        return bytes(c ^ self.get_byte() for c in ct)

# ── 32-비트 출력(4바이트)로 시드 복구하는 역연산 ──────────────────
def recover_seed(stream_bytes: bytes) -> int:
    # stream_bytes[0]‥[3] = s0‥s31 (MSB first)
    bits = [
        (byte >> i) & 1
        for byte in stream_bytes
        for i in range(7, -1, -1)
    ]                               # s0 … s31

    # S32 = s31 s30 … s0
    state = bits[::-1]

    # 역-시프트 32회 → S0
    for i in range(31, -1, -1):
        s_i = bits[i]
        prev = state[1:]            # 앞 31비트는 그대로 뒤로 밀림
        last = s_i ^ prev[21] ^ prev[1] ^ prev[0]   # tap XOR
        state = prev + [last]
    return int(''.join(map(str, state)), 2)

# ── 복호화 실행 ────────────────────────────────────────────────────
from binascii import unhexlify
C = unhexlify(
    "c615a6cbc4bbf37fe65af240813248140925f2afb31f6c6b5bf71cdfa151fcd5"
    "5999cf95e2eb9313fc75afe39d1bf836ef14931afe19e16a7c16a1bb41d5abe5"
    "d124991d"
)

known = b"DH{"
stream0_2 = bytes(c ^ p for c, p in zip(C[:3], known))  # 앞 24bit 키스트림

for last in range(256):                                  # 256 회 시도
    test_stream = stream0_2 + bytes([last])
    seed = recover_seed(test_stream)
    PT = STREAM(seed).decrypt(C)
    if PT.startswith(known) and PT.endswith(b"}"):
        print("★ 복호화 성공 ★")
        print("Seed =", hex(seed))
        print("Plain =", PT.decode())
        break