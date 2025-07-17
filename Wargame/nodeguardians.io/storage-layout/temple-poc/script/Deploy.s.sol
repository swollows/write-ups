// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

import "../src/Solve.sol";
import {Script} from "forge-std/Script.sol";
import "forge-std/console.sol";

contract Deploy is Script {
    address target = 0x18054A493792f2266c6b336775c06aa5AC98d3F3;

    function run() external {
        vm.startBroadcast();

        Solve solve = new Solve(target);

        console.log("Solve Contract Address:", address(solve));
        console.log("Target balance:", target.balance);

        solve.attack();

        vm.stopBroadcast();
    }
}