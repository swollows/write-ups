// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

contract MagicNumberAttack {
    function check() public view returns (bytes32) {
        assembly {
            mstore(0, 0x617A6960005260206000F3)
            return(0x16, 0x0a)
        }
    }
}