#!/bin/bash
set -e

# .env 파일 로드 후 export
set -a  # 이후 정의되는 모든 변수를 자동 export
source ../../.env
set +a

echo "========== Running Deploy to Exploit =========="
forge script script/Deploy.s.sol:Deploy \
    --rpc-url $WEB3_PROVIDER_URI \
    --skip-simulation \
    --timeout 120 \
    --broadcast

echo "========== Deploy Complete! =========="