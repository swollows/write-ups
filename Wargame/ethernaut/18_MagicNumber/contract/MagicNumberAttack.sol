// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

contract MagicNumberAttack {
    constructor() {
        assembly {
            mstore(0, 0x602a60005260206000F3)
            return(0x16, 0x0a)
        }
    }
}
