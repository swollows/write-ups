// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import {Script, console} from "forge-std/Script.sol";
import "../src/Solve.sol";

contract Deploy is Script {
    Solve public solve;

    address target = 0x212fdfCfCC22db97DeB3AC3260414909282BB4EE;

    function setUp() public {}

    function run() public {
        vm.startBroadcast();

        solve = new Solve(target);

        solve.attack();

        console.log("Attacker address:", address(solve));

        vm.stopBroadcast();
    }
}