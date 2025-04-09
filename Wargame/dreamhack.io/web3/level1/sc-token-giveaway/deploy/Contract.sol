// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract Level {
    mapping(address => uint) public amoTokenBalance;
    mapping(address => bool) alreadyTaken;
    address owner;

    constructor () {
        owner = msg.sender;
        amoTokenBalance[owner] = 2**255; // I'm rich
    }

    modifier onlyOnce() {
        require(alreadyTaken[msg.sender] == false, "Already taken!");
        alreadyTaken[msg.sender] = true;
        _;
    }

    function giveaway() public onlyOnce {
        amoTokenBalance[owner] -= 100; // Sad
        amoTokenBalance[tx.origin] += 100;
    }
}
