pragma solidity ^0.8.0;

import "../lib/openzeppelin-contracts/contracts/token/ERC20/ERC20.sol";

contract UpsideToken is ERC20 {
    address owner;
    constructor(string memory name_, string memory symbol_) ERC20(name_, symbol_){
        owner = msg.sender;
    }

    function mint(address user, uint256 amount) external returns(bool) {
        require(msg.sender == owner);
        _mint(user, amount);
        return true;
    }
}