// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import {Script, console} from "forge-std/Script.sol";
import "../src/Solve.sol";

interface IDoubleEntryPoint {
    function forta() external returns (address);
    function delegateTransfer(address, uint256, address) external returns (bool);
}

contract Deploy is Script {
    Solve public solve;

    address target;

    function setUp() public {}

    function run() public {
        target = 0xB171D866832A106B680c555EE020De47fD62cae1;

        vm.startBroadcast();

        IDoubleEntryPoint dep = IDoubleEntryPoint(target);

        IForta forta = IForta(dep.forta());

        solve = new Solve(dep.forta());

        forta.setDetectionBot(address(solve));

        console.log("Deploy address:", address(this));

        vm.stopBroadcast();
    }
}