// SPDX-License-Identifier: MIT
pragma solidity >=0.8.0;

import {Challenge} from "../abi/src/Challenge.sol";

contract ChallengeAttack {
    Challenge public challenge;

    constructor(address _challenge) {
        challenge = Challenge(_challenge);
    }
    
    function solve() external {
        uint256[] memory array = new uint256[](5);
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        uint256[][] memory array2d = new uint256[][](3);
        array2d[0] = new uint256[](2);
        array2d[0][0] = 1;
        array2d[0][1] = 2;
        array2d[1] = new uint256[](2);
        array2d[1][0] = 3;
        array2d[1][1] = 4;
        array2d[2] = new uint256[](2);
        array2d[2][0] = 5;
        array2d[2][1] = 6;

        challenge.f(
            type(uint64).max,
            true,
            array2d,
            type(int256).min,
            type(uint16).max,
            bytes3(0x414243),
            type(uint256).max,
            0x1234567890123456789012345678901234567890,
            type(uint32).max,
            "Hello",
            type(uint128).max,
            type(uint8).max,
            array
        );
    }
}