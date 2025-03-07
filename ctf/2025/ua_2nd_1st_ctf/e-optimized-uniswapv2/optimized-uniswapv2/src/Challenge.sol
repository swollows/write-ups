pragma solidity ^0.8.0;

import "./UniswapV2Factory.sol";
import "./UpsideToken.sol";

contract Challenge {
    UniswapV2Factory public factory;
    UniswapV2Pair public pair;
    UpsideToken public tokenA;
    UpsideToken public tokenB;
    bool airdropCompleted;

    constructor() {
        factory = new UniswapV2Factory(address(0));
        tokenA = new UpsideToken("A", "a");
        tokenB = new UpsideToken("B", "b");
        pair = UniswapV2Pair(factory.createPair(address(tokenA), address(tokenB)));

        tokenA.mint(address(pair), 100 ether);
        tokenB.mint(address(pair), 100 ether);
        
        pair.mint(address(this));
    }

    function airdrop() external {
        require(!airdropCompleted);
        airdropCompleted = true;
        tokenA.mint(msg.sender, 1 ether);
        tokenB.mint(msg.sender, 1 ether);
    }

    function isSolved() public view returns(uint256) {
        require(tokenA.balanceOf(address(pair)) <= 1 ether && tokenB.balanceOf(address(pair)) <= 1 ether);
        return 1;
    }
}