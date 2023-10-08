FROM ubuntu:22.04

RUN sed -i "s/http:\/\/archive.ubuntu.com/http:\/\/mirror.kakao.com/g" /etc/apt/sources.list \
 && apt-get update \
 && DEBIAN_FRONTEND=noninteractive \
    apt-get install --no-install-recommends -y \
      sed make binutils build-essential diffutils gcc g++ \
      bash patch gzip bzip2 perl tar cpio unzip rsync file bc wget \
      python3 libncurses5-dev libelf-dev libssl-dev ca-certificates \
 && rm -rf /var/lib/apt/lists/*

RUN wget -qO- https://buildroot.org/downloads/buildroot-2022.11.tar.gz | tar xvz

COPY configs/buildroot.config               /buildroot-2022.11/.config
COPY configs/busybox.config                 /buildroot-2022.11/package/busybox/busybox.config
COPY configs/linux.config                   /buildroot-2022.11/board/qemu/aarch64-virt/linux.config
COPY sharr-syscall.patch                    /buildroot-2022.11/sharr-syscall.patch
COPY init mdev.conf flag /

COPY build_script.sh /build_script.sh
RUN chmod +x /build_script.sh

WORKDIR /buildroot-2022.11/
CMD /build_script.sh
