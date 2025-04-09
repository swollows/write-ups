// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

// Welcome to King of Dreamhack!!!
contract Level {
    address public king;

    constructor () payable {
        king = msg.sender;
    }

    receive() external payable {
        uint prevBalance = address(this).balance - msg.value;
        require(msg.value > prevBalance, "Give me more money");
        payable(king).transfer(prevBalance);
        king = msg.sender;
    }
}
