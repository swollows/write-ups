// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

import "../src/Solve.sol";
import {Script} from "forge-std/Script.sol";
import "forge-std/console.sol";

contract Deploy is Script {
    address target = 0x2e0331F1e8f1baEBA5A28F6C127c6f6aE8dEd3D5;

    function run() external {
        vm.startBroadcast();

        Solve solve = new Solve(target);

        console.log("Solve Contract Address:", address(solve));

        solve.attack();

        vm.stopBroadcast();
    }
}