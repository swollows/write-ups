// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;
interface Solver {
    function check() external view returns (bytes32);
}

contract BasicEVM {
    address public solver;

    function setSolver(address _solver) public {
        solver = _solver;
    }

    function isSolved() public view returns (uint256) {
        Solver solver_ = Solver(solver);

        bytes32 code = solver_.check();
        if (uint256(code) != 31337) return 0;

        uint256 size;
        assembly {
            size := extcodesize(solver_)
        }
        if (size > 11) return 0;

        return 1;
    }
}