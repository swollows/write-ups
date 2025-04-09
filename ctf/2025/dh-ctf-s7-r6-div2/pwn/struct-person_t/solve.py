from pwn import *

e = ELF('./deploy/chall')

print(e.got['get_shell'])