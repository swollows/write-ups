// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface ISolver {
    function submit(uint256 answer) external;
}

contract Prover {
    address owner;
    /* gap */
    uint256 secret;
    uint256 public solved;
    address solver;

    constructor(bytes1 _secret) {
        secret = uint256(uint8(_secret));
        owner = msg.sender;
    }

    function submitSolver(address _solver) external {
        solver = _solver;
    }
    
    function prove(uint256 answer) external {
        require(msg.sender == solver);
        if(answer == secret) {
            solved = 1;
        }
    }
}
