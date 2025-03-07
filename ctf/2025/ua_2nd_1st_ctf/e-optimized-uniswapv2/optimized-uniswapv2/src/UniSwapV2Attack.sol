// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

import "./Challenge.sol";
import "./UniswapV2Pair.sol";

contract UniSwapV2Attack {
    address public challenge;
    address public pair;

    constructor(address _challenge, address _pair) {
        challenge = _challenge;
        pair = _pair;
    }

    function attack() external {
        Challenge(challenge).airdrop();

        UniswapV2Pair(pair).swap(100 ether, 0, address(this), "");
    }

    function uniswapV2Call(
        address sender,
        uint256 amount0,
        uint256 amount1,
        bytes calldata data
    ) external {
        
    }
}