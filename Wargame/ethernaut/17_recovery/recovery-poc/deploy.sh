#!/opt/homebrew/bin/zsh
ENV_PATH="../../.env"

source "$ENV_PATH"

if [ "$1" = "txrun" ] && [ "$2" != "" ]; then
    cast run "$2" --rpc-url "$WEB3_PROVIDER_URI"
elif [ "$1" = "deploy" ] && [ "$2" = "" ]; then
    forge script script/Deploy.s.sol:Deploy --rpc-url "$WEB3_PROVIDER_URI" --private-key "$USER_PRIVATE_KEY" --broadcast
else
    echo "Usage: $0 {txrun 0xTxHash | deploy}"
fi