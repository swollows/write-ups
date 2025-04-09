// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract Level {
    mapping(uint => mapping(uint => mapping(uint => bool))) private safe;
    bool public triggered = false;
    bool public opened = false;

    constructor (bytes memory value) {
        // This is hidden :P
    }

    modifier onlyOnce() {
        require(triggered == false, "You cannot try again!");
        triggered = true;
        _;
    }

    function open(uint key) public onlyOnce {
        require (0 <= key && key <= 999, "Key must be 3-digit");
        uint a = key % 10;
        uint b = (key / 10) % 10;
        uint c = (key / 100) % 10;
        if (safe[a][b][c]) {
            opened = true;
        }
    }
}
