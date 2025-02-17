// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

import "forge-std/Script.sol";
import "../src/coin_flip_attack.sol";

contract DeployScript is Script {
    function run() external {
        vm.startBroadcast();

        // 기존 CoinFlip 컨트랙트 주소
        address coinFlipAddress = 0x8dAF17A20c9DBA35f005b6324F493785D239719d;
        
        // 공격 컨트랙트 배포
        CoinFlipAttack attackContract = new CoinFlipAttack(CoinFlip(coinFlipAddress));
        
        console.log("CoinFlipAttack deployed at:", address(attackContract));

        vm.stopBroadcast();
    }
}
