// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import {Script} from "forge-std/Script.sol";
import "../src/Solve.sol";

contract Deploy is Script {
    address target = 0xBD340b050E6F0d33Ed12b5057c93b4187592AD82;

    function setUp() public {}

    function run() public {
        vm.startBroadcast();

        Solve solve = new Solve(target);
        solve.attack();

        vm.stopBroadcast();
    }
}