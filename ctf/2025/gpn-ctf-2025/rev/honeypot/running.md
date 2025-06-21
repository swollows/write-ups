# How to run this challenge

*Running it is not required to solve the challenge*

To run this challenge, you'll need the following:
- Kernel >= 6.12
- Java >= 22 on your PATH (or adjust `run.sh` to point to it)
- libbpf
- Root permissions

then run `run.sh honeypot.jar`

### Virtme-ng

A very nice tool to provide isolation from your system or run a newer kernel is [`virtme-ng`](https://github.com/arighi/virtme-ng).

`virtme-ng -r v6.12 --user root -- ./run.sh honeypot.jar` (if your system's kernel is already >= 6.12,
you can omit the `v6.12` and don't have to download a kernel)
