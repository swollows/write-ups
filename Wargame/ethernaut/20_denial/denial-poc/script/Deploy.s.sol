// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

import "../src/Solve.sol";
import {Script} from "forge-std/Script.sol";
import "forge-std/console.sol";

contract Deploy is Script {
    address target = 0x46682cA783d96a4A65390211934D5714CDb788E4;

    function run() external {
        vm.startBroadcast();

        Solve solve = new Solve(target);

        console.log("Solve Contract Address:", address(solve));

        solve.attack();

        vm.stopBroadcast();
    }
}