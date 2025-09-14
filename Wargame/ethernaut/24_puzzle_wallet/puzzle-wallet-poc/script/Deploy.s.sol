// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

import "../src/Solve.sol";
import {Script} from "forge-std/Script.sol";
import "forge-std/console.sol";

contract Deploy is Script {
    address target = 0x8Ba41269ed69496c07bea886c300016A0BA8FB5E;

    function run() external {
        vm.startBroadcast();

        Solve solve = new Solve{value: 0.002 ether}(target);

        console.log("Solve Contract Address:", address(solve));

        solve.attack();

        vm.stopBroadcast();
    }
}