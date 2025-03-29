#!/bin/python3
from string import ascii_lowercase, ascii_uppercase, digits
from random import choices
import os
import sys
import base64
import uuid
import hashlib

filename = str(uuid.uuid4())

def write(x):
    sys.stdout.write(x)
    sys.stdout.flush()


def readline():
    write("> ")
    return sys.stdin.readline().rstrip("\n")


def randstr(k):
    return ''.join(choices(ascii_lowercase+ascii_uppercase+digits, k=k))

def pow():
    x = os.urandom(16)
    target = hashlib.md5(x).hexdigest()
    write(f"MD5(X = {x[:13].hex()} + {'?' * 6}) = " + target + "\n")
    try:
        write("Give me X: ")
        if bytes.fromhex(readline()) == x:
            return
        else:
            write("[-] pow failed\n")
            exit()
    except:
        write("[-] pow failed\n")
        exit()

def bridge():
    write("[+] Input Base64 encoded ELF\n")
    data = readline()

    if not data:
        write("[-] Error!\n")
        exit()

    try:
        elf = base64.b64decode(data)
    except:
        write("[-] decode error!\n")
        exit()

    write("[+] Copying ELF ..\n")
    workdir = "/tmp/%s" % filename
    os.mkdir(workdir)
    open(workdir+"/exploit", "wb+").write(elf)
    return workdir


def run(workdir):
    try:
        write("[+] Setting up Environment ..\n")
        os.chdir(workdir)
        os.mkdir("rootfs")
        os.system("cd rootfs && zcat /home/ctf/rootfs.img.gz | cpio --extract")
        os.system("cp exploit rootfs/home/ctf/exploit")
        os.system("chmod 0777 rootfs/home/ctf/exploit")
        os.system("cd rootfs && find . | cpio -H newc -o | gzip > ../rootfs.img.gz")
        os.chdir("/home/ctf")
        write("[+] Booting QEMU ..\n")
        os.system("./run.sh %s/rootfs.img.gz && rm -r %s" % (workdir, workdir))
        os.system(f"rm -rf {workdir}")
        write("Bye!\n")
        exit()
    except:
        os.system(f"rm -rf {workdir}")
        exit()


if __name__ == "__main__":
    pow()
    run(bridge())

