#!/bin/sh
qemu-system-aarch64 \
    -M virt \
    -m 128 \
    -cpu cortex-a72 \
    -smp 1 \
    -nographic \
    -initrd qemu/rootfs.cpio \
    -kernel qemu/kernel \
    -append "console=ttyAMA0 FLAG=$(cat /flag)" \
    -monitor /dev/null \
    -netdev user,id=eth0,hostfwd=tcp::8000-:8000 \
    -device virtio-net-pci,netdev=eth0
