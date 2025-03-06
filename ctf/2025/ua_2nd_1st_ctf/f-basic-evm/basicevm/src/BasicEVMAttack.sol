// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

contract BasicEVMAttack {
      constructor() {
        assembly {
            mstore(0, 0x617A6960005260206000F3)
            return(0x15, 0x0b)
        }
    }
}