// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import "forge-std/Script.sol";
import "../src/force_attack.sol";

contract ForceAttackScript is Script {
    ForceAttack public attackContract;

    function setUp() public {}

    function run() public {
        vm.startBroadcast();

        address forceAddress = 0x94099942864EA81cCF197E9D71ac53310b1468D8;

        attackContract = new ForceAttack(Force(forceAddress));

        vm.stopBroadcast();
    }
}
