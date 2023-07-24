import random
import string

key_len = 32

key = "".join([random.choice(string.ascii_lowercase) for _ in range(key_len)])


def ensure_perfect_secrecy(data):
    assert all([len(c) <= key_len for c in data])


def encrypt(word, key):
    shifts = [ord(k) - ord('a') for k in key]
    pt = [ord(c) - ord('a') for c in word]
    return ''.join([chr(((p + shifts[i]) % len(string.ascii_lowercase)) + ord('a')) for i, p in enumerate(pt)])

def encrypt_data(data, key):
    return " ".join([encrypt(word, key) for word in data])

def main():
    key = "".join([random.choice(string.ascii_lowercase) for _ in range(key_len)])
    print(key)
    data = open("data.txt", "rb").read().decode().lower().split(" ")
    print(data)
    open('output.txt', 'ab').write(encrypt_data(data, key).encode())

main()
