#!/bin/sh

echo -e 'Booting...\n'

exec timeout -s SIGKILL 300 qemu-system-aarch64 \
  -initrd ./rootfs.cpio.gz -kernel Image.gz \
  -M virt -cpu max -smp cores=2,threads=1 \
  -append "console=ttyAMA0 root=/dev/ram oops=panic panic=1 panic_on_warn=1 quiet" \
  -no-reboot -monitor /dev/null -net none -vga none -nographic -m 64M
