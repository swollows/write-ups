// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract Challenge {
    uint256 public solved;

    function submit(uint input) external {
        require(input == 31337, "input != 31337");
        solved = 1;
    }
}
