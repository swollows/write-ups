#!/bin/bash

BUILDROOT=$(pwd)

# Build kernel & rootfs
make

# Copy kernel image into /output
mkdir -p /output
cp $BUILDROOT/output/images/Image.gz /output/Image.gz

# Trim rootfs
mkdir /rootfs
cd /rootfs
gunzip -c $BUILDROOT/output/images/rootfs.cpio.gz | cpio -vid

# Copy init script & mdev.conf into rootfs
cp /init init && chmod 755 init
cp /mdev.conf etc/mdev.conf && chmod 644 etc/mdev.conf

# Create rootfs with fake flag (public)
echo 'DH{fake_flag}' > flag
chmod 400 flag
find . | cpio -H newc --owner root -o | gzip > /output/rootfs_public.cpio.gz

# Create rootfs with real flag (deploy)
cp -f /flag flag
chmod 400 flag
find . | cpio -H newc --owner root -o | gzip > /output/rootfs_deploy.cpio.gz

cd /output
rm -rf /rootfs

pwd && ls -alF
echo 'Done!'
