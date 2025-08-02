// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

import "../src/Solve.sol";
import {Script} from "forge-std/Script.sol";
import "forge-std/console.sol";

contract Deploy is Script {
    address target = 0x541Dfe503202b78c5d78FaCd6CDB0a04D4b35634;

    function run() external {
        vm.startBroadcast();

        Solve solve = new Solve(target);

        console.log("Solve Contract Address:", address(solve));

        solve.attack();

        vm.stopBroadcast();
    }
}