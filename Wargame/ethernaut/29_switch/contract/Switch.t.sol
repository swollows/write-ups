// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import {Test, console} from "forge-std/Test.sol";
import {Switch} from "../src/Switch.sol";

contract CounterTest is Test {
    Switch public swContract;

    function setUp() public {
        swContract = new Switch();
    }

    function test_CallData() public {
        bytes memory callData = abi.encodePacked(
            Switch.flipSwitch.selector,         // flipSwitch Selector (4 bytes)
            abi.encode(96),                     // Calldata offset (32 bytes)
            abi.encode(0x00),                   // DUMMY (32 bytes)
            abi.encode(Switch.turnSwitchOff.selector),      // turnSwitchOff Selector (4 bytes)
            abi.encode(4),                      // Real size of data (32 bytes)
            abi.encodeWithSelector(Switch.turnSwitchOn.selector)    // Calldata (4 bytes)
        );

        console.logBytes4(Switch.flipSwitch.selector);
        console.logBytes(abi.encode(96));
        console.logBytes(abi.encode(0x00));
        console.logBytes(abi.encode(Switch.turnSwitchOff.selector));
        console.logBytes(abi.encode(4));
        console.logBytes(abi.encode(Switch.turnSwitchOn.selector));
        console.logBytes(callData);
    }
}
