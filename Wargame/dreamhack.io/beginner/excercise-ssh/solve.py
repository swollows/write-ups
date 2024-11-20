from pwn import *

r = ssh("chall", "host3.dreamhack.games", port=11834, password="dhbgssh")

r.interactive()