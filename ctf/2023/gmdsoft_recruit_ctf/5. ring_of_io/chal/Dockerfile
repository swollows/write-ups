FROM alpine:3.17@sha256:f271e74b17ced29b915d351685fd4644785c6d1559dd1f2d4189a5e851ef753a

ENV user ring_of_io
ENV port 31337

# Install dependencies w/ qemu version pinned
COPY deploy/qemu-system-aarch64-7.1.0-r7.apk /
RUN apk add --no-cache socat /qemu-system-aarch64-7.1.0-r7.apk \
 && rm qemu-system-aarch64-7.1.0-r7.apk

# Change tmp permissions
RUN chmod 1733 /tmp /var/tmp /dev/shm

# Add user
RUN adduser -D -g "" $user \
 && chown -R root:root /home/$user

# Add files
COPY --chown=root:$user deploy/Image.gz \
  deploy/rootfs.cpio.gz deploy/run.sh /home/$user/

# chown & chmod files
WORKDIR /home/$user
RUN chmod 755 run.sh \
 && chmod 644 Image.gz rootfs.cpio.gz

# Run server
# Note: Only 1 connection recommended due to chal VM memory constraints.
CMD socat TCP-LISTEN:$port,reuseaddr,fork EXEC:./run.sh,su=$user
EXPOSE $port
