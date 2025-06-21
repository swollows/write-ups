export ANVIL_RPC_URL=http://127.0.0.1:8545
export PRIVATE_KEY=0xac0974bec39a17e36ba4a6b4d238ff944bacb478cbed5efcae784d7bf4f2ff80

deploy: create-contracts

create-contracts: create-uniswap-factory
	forge script script/Deploy.s.sol:Deploy --rpc-url $(ANVIL_RPC_URL) --private-key $(PRIVATE_KEY) --broadcast "$(V)"

create-uniswap-factory:
	rm -rf broadcast/* && forge create src/uniswap-v2/UniswapV2Factory.sol:UniswapV2Factory \
		--rpc-url $(ANVIL_RPC_URL) \
		--private-key $(PRIVATE_KEY) \
		--broadcast \
		--constructor-args 0000000000000000000000000000000000000000 

