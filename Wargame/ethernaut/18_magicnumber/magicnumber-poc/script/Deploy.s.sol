// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

import "../src/Solve.sol";
import "../src/Solver.sol";
import {Script} from "forge-std/Script.sol";
import "forge-std/console.sol";

contract Deploy is Script {
    address target = 0xeC4cFde48EAdca2bC63E94BB437BbeAcE1371bF3;

    function run() external {
        vm.startBroadcast();

        Solver solver = new Solver();
        Solve solve = new Solve(target, address(solver));

        console.log("Solve Contract Address:", address(solve));
        console.log("Solver Contract Address:", address(solver));

        solve.attack();

        vm.stopBroadcast();
    }
}