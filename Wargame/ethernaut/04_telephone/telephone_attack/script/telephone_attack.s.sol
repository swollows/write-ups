// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import "forge-std/Script.sol";
import "../src/telephone_attack.sol";

contract TelephoneAttackScript is Script {
    TelephoneAttack public attackContract;

    function run() public {
        vm.startBroadcast();

        address telephoneAddress = 0x9bd03768a7DCc129555dE410FF8E85528A4F88b5;
        address attackerAddress = 0xf39Fd6e51aad88F6F4ce6aB8827279cffFb92266;

        attackContract = new TelephoneAttack(Telephone(telephoneAddress), attackerAddress);

        console.log("CoinFlipAttack deployed at:", address(attackContract));

        vm.stopBroadcast();
    }
}
