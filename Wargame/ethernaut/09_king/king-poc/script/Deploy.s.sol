// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

import "../src/Solve.sol";
import {Script} from "forge-std/Script.sol";
import "forge-std/console.sol";

contract Deploy is Script {
    address target = 0x553BED26A78b94862e53945941e4ad6E4F2497da;

    function run() external {
        vm.startBroadcast();

        Solve solve = new Solve(target);

        solve.attack{value:0.0011}();

        vm.stopBroadcast();
    }
}