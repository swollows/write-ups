#!/bin/zsh
ENV_PATH="../../.env"

source "$ENV_PATH"

if [ "$1" = "deploy" ] && [ "$2" = "" ]; then
    echo "$USER_PRIVATE_KEY"
    forge script script/Deploy.s.sol:Deploy --rpc-url "$WEB3_PROVIDER_URI" --private-key "$USER_PRIVATE_KEY" --broadcast
else
    echo "Usage: $0 {deploy}"
fi