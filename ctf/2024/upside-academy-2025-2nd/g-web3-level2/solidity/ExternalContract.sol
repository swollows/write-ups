// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.0;

// Uncomment this line to use console.log
// import "hardhat/console.sol";
interface Icontract {
    function giveMeFlag(uint ans1, bytes calldata ans2) external returns (bool);
}

contract ExternalContract  {
    address public challengeContractAddress;

    constructor(address _challengeContractAddress) {
        challengeContractAddress = _challengeContractAddress;
    }

    function callGiveMeFlag(uint ans1, bytes calldata ans2) public {
        Icontract(challengeContractAddress).giveMeFlag(ans1, ans2);
    }
}