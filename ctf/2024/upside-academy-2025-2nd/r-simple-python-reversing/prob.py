#!/usr/bin/env python3

import hashlib


def generate_password(secret: str):
    modified_secret = "".join(chr(max((ord(c) * 3) % 123, 33)) for c in secret)
    hashed_password = hashlib.sha256(modified_secret.encode()).hexdigest()
    return hashed_password


def main():
    secret_value = "UP UP GO GO!"
    hashed_password = generate_password(secret_value)

    print("Welcome to the password challenge!")
    print("Enter the correct password to get the flag.")

    user_input = input("Password: ").strip()

    if hashlib.sha256(user_input.encode()).hexdigest() == hashed_password:
        print("Correct! Here is your flag:")
        flag = (
            "DH{"
            + hashlib.sha256(secret_value.encode() + b"UPUP").hexdigest()[:64]
            + "}"
        )
        print(flag)
    else:
        print("Wrong password. Try again!")


if __name__ == "__main__":
    main()
