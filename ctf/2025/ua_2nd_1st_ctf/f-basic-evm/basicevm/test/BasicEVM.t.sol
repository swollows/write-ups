// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

import "forge-std/Test.sol";
import "../src/BasicEVM.sol";
import "../src/BasicEVMAttack.sol";

contract BasicEVMTest is Test {
    BasicEVM basicEVM;
    BasicEVMAttack basicEVMAttack;

    function setUp() public {
        basicEVM = new BasicEVM();
        basicEVMAttack = new BasicEVMAttack();
    }

    function testBasicEVM() public {
        uint256 result;

        basicEVM.setSolver(address(basicEVMAttack));
        result = basicEVM.isSolved();
        console.log("result: %s", result);
    }

    function testBasicEVMAttack() public {
        Solver solver = Solver(address(basicEVMAttack));
        bytes32 code = solver.check();
        console.logBytes32(code);

        uint256 size;
        assembly {
            size := extcodesize(solver)
        }
        console.log("size: %s", size);
    }
}
