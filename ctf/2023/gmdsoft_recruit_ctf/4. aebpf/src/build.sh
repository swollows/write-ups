#!/bin/bash

if [ -f ../flag ]; then
    cp ../flag buildroot/flag
    echo "Injected flag file into Docker build context."
else 
    echo "DH{fake_flag}" > buildroot/flag
    echo "Injected fake flag into Docker build context."
fi

echo "Building Docker image..."

IMAGE_DIGEST=$(docker build -q buildroot)
CONTAINER_DIGEST=$(docker create $IMAGE_DIGEST)

echo "Image Digest:     $IMAGE_DIGEST"
echo "Container Digest: $CONTAINER_DIGEST"

echo "Starting build..."
docker start -ai $CONTAINER_DIGEST

echo "Completed build. Copying files..."
mkdir -p output
docker cp $CONTAINER_DIGEST:/output/Image.gz                ./output/
docker cp $CONTAINER_DIGEST:/output/rootfs_public.cpio.gz   ./output/
docker cp $CONTAINER_DIGEST:/output/rootfs_deploy.cpio.gz   ./output/

echo "Completed copy. Removing artifacts..."
docker rm $CONTAINER_DIGEST
docker rmi $IMAGE_DIGEST
rm buildroot/flag

cd output; ls -alF
