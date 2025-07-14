FROM nixos/nix AS build

RUN mkdir -p /build
WORKDIR /build

COPY flag.txt flake.nix flake.lock /build/
COPY ./init /build/init/
RUN nix --extra-experimental-features nix-command --extra-experimental-features flakes build

FROM gcr.io/kctf-docker/challenge@sha256:9f15314c26bd681a043557c9f136e7823414e9e662c08dde54d14a6bfd0b619f

RUN apt-get update && apt-get install -y qemu-system-x86

WORKDIR /
COPY --from=build /build/result/bzImage /build/result/initrd.gz /
COPY run_qemu /
CMD kctf_setup && \
    chmod 0777 /dev/kvm && \
    chmod 0777 /dev/vhost-vsock && \
    kctf_drop_privs \
    socat \
      TCP-LISTEN:1337,reuseaddr,fork \
      EXEC:"kctf_pow /run_qemu"
