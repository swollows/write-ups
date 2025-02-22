// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import {Script, console} from "forge-std/Script.sol";
import {Switch} from "../src/switch.sol";

contract switchScript is Script {
    Switch public swContract;

    function setUp() public {}

    function run() public {
        vm.startBroadcast();

        swContract = new Switch();

        vm.stopBroadcast();
    }
}
