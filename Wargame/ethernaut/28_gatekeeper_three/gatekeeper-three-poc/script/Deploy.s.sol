// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import {Script, console} from "forge-std/Script.sol";
import "../src/Solve.sol";

contract Deploy is Script {
    Solve public solve;

    address target = 0x6A1B3C7624b69000D7848916fb4f42026409586C;

    function setUp() public {}

    function run() public {
        vm.startBroadcast();

        solve = new Solve{value: 0.0013 ether}(target);

        solve.attack();

        console.log("Attacker address:", address(solve));

        vm.stopBroadcast();
    }
}