// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import "forge-std/Script.sol";
import "../src/king_attack.sol";

contract KingAttackScript is Script {
    KingAttack public attackContract;

    function setUp() public {}

    function run() public {
        vm.startBroadcast();

        address kingAddress = 0x8e80FFe6Dc044F4A766Afd6e5a8732Fe0977A493;

        attackContract = new KingAttack(kingAddress);

        vm.stopBroadcast();
    }
}
