// SPDX-License-Identifier: MIT
pragma solidity ^0.8.13;

import "forge-std/Test.sol";
import "../src/Prover.sol";
import "../src/ProverAttack.sol";

contract ProveAttackTest is Test {
    Prover prover;
    ProverAttack proverAttack;

    function setUp() public {
        prover = new Prover(bytes1(uint8(0x3f)));
        proverAttack = new ProverAttack(address(prover));
    }

    function test_solve() public {
        proverAttack.submitSolver();

        proverAttack.solve();
        assertEq(prover.solved(), 1);
    }
}