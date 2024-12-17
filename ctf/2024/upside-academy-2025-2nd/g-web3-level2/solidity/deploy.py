from solcx import compile_standard, install_solc
import json

with open("./ExternalContract.sol", "r") as f:
    ExternalContract = f.read()

install_solc("0.8.0")
compiled_sol = compile_standard(
	{
    	"language": "Solidity",
    	"sources": {"ExternalContract.sol": {"content": ExternalContract}},
        "settings":{
        	"outputSelection": {
            	"*": {
                	"*": ["abi", "metadata", "evm.bytecode", "evm.sourceMap"]}
			}
        }, 
    }
)

with open("compiled_code.json", "w") as f:
    json.dump(compiled_sol, f)