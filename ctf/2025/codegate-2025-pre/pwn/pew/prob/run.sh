qemu-system-x86_64 \
    -kernel bzImage \
    -cpu kvm64,+smep,+smap,+rdrand \
    -m 256M \
    -initrd $1 \
    -append "console=ttyS0 quiet loglevel=3 oops=panic panic_on_warn=1 panic=-1 pti=on page_alloc.shuffle=1" \
    -monitor /dev/null \
    -nographic \
    -no-reboot
