// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract Dex {
    address public token1;
    address public token2;

    constructor() {}

    function setTokens(address _token1, address _token2) public {}

    function addLiquidity(address token_address, uint256 amount) public {}

    function swap(address from, address to, uint256 amount) public {}

    function getSwapPrice(address from, address to, uint256 amount) public view returns (uint256) {
        return 1;
    }

    function approve(address spender, uint256 amount) public {}

    function balanceOf(address token, address account) public view returns (uint256) {
        return 1;
    }
}