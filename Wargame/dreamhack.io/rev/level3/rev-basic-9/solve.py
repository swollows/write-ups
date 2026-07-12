from __future__ import annotations

KEY = b"I_am_KEY"

ANSWER = bytes.fromhex(
    "7e7d9a8b252dd53d032b3898279f4fbc"
    "2a79007dc42a4f5800"
)

T = bytes.fromhex(
    "637c777bf26b6fc53001672bfed7ab76"
    "ca82c97dfa5947f0add4a2af9ca472c0"
    "b7fd9326363ff7cc34a5e5f171d83115"
    "04c723c31896059a071280e2eb27b275"
    "09832c1a1b6e5aa0523bd6b329e32f84"
    "53d100ed20fcb15b6acbbe394a4c58cf"
    "d0efaafb434d338545f9027f503c9fa8"
    "51a3408f929d38f5bcb6da2110fff3d2"
    "cd0c13ec5f974417c4a77e3d645d1973"
    "60814fdc222a908846eeb814de5e0bdb"
    "e0323a0a4906245cc2d3ac629195e479"
    "e7c8376d8dd54ea96c56f4ea657aae08"
    "ba78252e1ca6b4c6e8dd741f4bbd8b8a"
    "703eb5664803f60e613557b986c11d9e"
    "e1f8981169d98e949b1e87e9ce5528df"
    "8ca1890dbfe6426841992d0fb054bb16"
)


def ror8(x: int, n: int) -> int:
    x &= 0xFF
    return ((x >> n) | (x << (8 - n))) & 0xFF


def rol8(x: int, n: int) -> int:
    x &= 0xFF
    return ((x << n) | (x >> (8 - n))) & 0xFF


def enc_block(block: bytes) -> bytes:
    assert len(block) == 8
    s = bytearray(block)
    temp = s[0]

    for _ in range(16):
        for j in range(8):
            idx = (j + 1) & 7
            temp = ror8((s[idx] + T[KEY[j] ^ temp]) & 0xFF, 5)
            s[idx] = temp

    return bytes(s)


def dec_block(block: bytes) -> bytes:
    assert len(block) == 8
    s = bytearray(block)

    for _ in range(16):
        for j in range(7, -1, -1):
            idx = (j + 1) & 7

            # Forward temp before step j:
            #   j > 0: it is b[j], which has not been restored yet.
            #   j = 0: it is a[0], restored first by reversing j = 7.
            prev_temp = s[0] if j == 0 else s[j]
            s[idx] = (rol8(s[idx], 5) - T[KEY[j] ^ prev_temp]) & 0xFF

    return bytes(s)


def solve() -> bytes:
    # memcmp checks 25 bytes, but only the first 24 are transformed.
    # The final ANSWER[24] is the zero-filled byte after the NUL terminator.
    cipher = ANSWER[:24]
    plain = b"".join(dec_block(cipher[i:i + 8]) for i in range(0, len(cipher), 8))

    assert plain[-1] == 0, plain
    assert (len(plain[:-1]) + 1) % 8 == 0
    assert b"".join(enc_block(plain[i:i + 8]) for i in range(0, len(plain), 8)) == cipher
    assert ANSWER[24] == 0

    return plain[:-1]


if __name__ == "__main__":
    flag = solve()
    print(flag.decode("ascii"))
