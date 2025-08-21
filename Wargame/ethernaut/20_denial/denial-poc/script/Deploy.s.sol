// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

import "../src/Solve.sol";
import {Script} from "forge-std/Script.sol";
import "forge-std/console.sol";

contract Deploy is Script {
    address target = 0xf3eE3C4Ec25e8414838567818A30C90c7d62f834;

    function run() external {
        vm.startBroadcast();

        Solve solve = new Solve(target);

        console.log("Solve Contract Address:", address(solve));

        solve.attack();

        vm.stopBroadcast();
    }
}