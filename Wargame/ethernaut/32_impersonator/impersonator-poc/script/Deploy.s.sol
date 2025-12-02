// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import {Script} from "forge-std/Script.sol";
import "../src/Solve.sol";

contract Deploy is Script {
    address target = 0xaf4181d7208912b151d1BA11d22EA4e24FF500ce;

    function setUp() public {}

    function run() public {
        vm.startBroadcast();

        Solve solve = new Solve(target);
        solve.attack();

        vm.stopBroadcast();
    }
}