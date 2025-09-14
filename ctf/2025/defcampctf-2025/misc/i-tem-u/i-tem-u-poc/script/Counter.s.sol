// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import {Script, console} from "forge-std/Script.sol";

interface iTemU {
    struct Listing {
        uint256 id;
        address seller;
        uint256 itemId;
        uint256 quantity;
        uint256 price;
        bool active;
    }

    function showListings() external view returns (Listing[] memory);
}

contract CounterScript is Script {
    address target = 0x89E5010e53d8ee5b29E72d7C96ADC688e086A0FA;
    iTemU.Listing[] lists;

    function setUp() public {}

    function run() public {
        vm.startBroadcast();

        // iTemU 컨트랙트로부터 showListings 호출 결과 반환
        lists = iTemU(target).showListings();

        // lists에서 읽어온 모든 데이터를 형식에 맞춰서 console.log로 출력하기
        console.log("Total listings:", lists.length);
        
        for (uint256 i = 0; i < lists.length; i++) {
            console.log("--- Listing", i, "---");
            console.log("ID:", lists[i].id);
            console.log("Seller:", lists[i].seller);
            console.log("Item ID:", lists[i].itemId);
            console.log("Quantity:", lists[i].quantity);
            console.log("Price:", lists[i].price);
            console.log("Active:", lists[i].active);
            console.log("");
        }

        vm.stopBroadcast();
    }
}
