import binascii
from hashlib import sha256
from pprint import pprint
from bitcoin import FLAG, calculate_merkle_root, hash2


def get_random_bytes():
    with open("/dev/urandom", "rb") as f:
        return f.read(2)


def make_tx_hashes():
    return [
        sha256(get_random_bytes()).digest()[::-1].hex()
        for i in range((get_random_bytes()[0] % 16) + 16)
    ]


def main():
    tx_hashes = make_tx_hashes()
    mr = calculate_merkle_root(tx_hashes)
    index = get_random_bytes()[0] % len(tx_hashes)
    tx_hashes[index] = "?" * 64
    ret = ""
    ret += str(("merkle_root:", mr))
    ret += "\n"
    ret += str("tx list:")
    ret += str(tx_hashes)
    return tx_hashes, mr, index, ret


if __name__ == "__main__":
    main()
