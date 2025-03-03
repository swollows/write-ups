// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import "./Prover.sol";
import "forge-std/console.sol";
contract ProverAttack {
    address prover;
    
    constructor(address _prover) {
        prover = _prover;
    }

    function submitSolver() external {
        Prover(prover).submitSolver(msg.sender);
    }

    function solve() external {
        for(uint8 i = 0; i <= 0xff; i++) {
            console.log("i : ", i);
            ISolver(prover).submit(uint256(i));
//            Prover(prover).prove(uint256(i));
        }
    }
}