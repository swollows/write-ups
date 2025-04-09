// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

import "forge-std/console.sol";

contract Level {
    address owner;

    uint constant VOTE_AMO = 0;
    uint constant VOTE_BOKO = 1;
    uint constant VOTE_NANDO = 2;

    bool finished;
    address[] voterStack;
    uint[3] voteCounter;

    constructor() {
        owner = tx.origin;
    }

    modifier onlyOwner() {
        require(tx.origin == owner, "Not owner");
        _;
    }

    modifier onlyEOA() {
        require(tx.origin == msg.sender, "Not EOA");
        _;
    }

    modifier voteNotStartedYet() {
        require(!finished, "Vote is already finished");
        _;
    }

    modifier voteFinished() {
        require(finished, "Vote is not finished");
        _;
    }

    function register(address voter) public payable voteNotStartedYet {
        require(msg.value == 1 ether, "Give me exactly 1 ether");
        voterStack.push(voter);
    }

    function runVote() public onlyOwner voteNotStartedYet {
        while (voterStack.length > 0) {
            address toCall = voterStack[voterStack.length - 1];
            // Need to handle a wrong contract which does not implements vote()
            (bool success, bytes memory data) = toCall.call(abi.encodeWithSignature("vote()"));

            console.log(success);
            console.log(abi.decode(data, (uint)));

            if (success) {
                uint value = abi.decode(data, (uint));

                if (value <= 2)
                    voteCounter[value]++;
            }
            if (voterStack.length > 0)
                voterStack.pop();
        }
        finished = true;
    }

    function getResult() public view voteFinished returns (string memory) {
        if (voteCounter[VOTE_NANDO] >= voteCounter[VOTE_AMO] && voteCounter[VOTE_NANDO] >= voteCounter[VOTE_BOKO])
            return "Nando";
        else if (voteCounter[VOTE_AMO] >= voteCounter[VOTE_NANDO] && voteCounter[VOTE_AMO] >= voteCounter[VOTE_BOKO])
            return "Amo";
        else
            return "Boko";
    }

    function getVoteCounter() public view voteFinished returns (uint, uint, uint) {
        return (voteCounter[0], voteCounter[1], voteCounter[2]);
    }

    function deposit() public onlyEOA onlyOwner {
        // Yummy!
        payable(owner).transfer(address(this).balance);
    }
}

contract AmoVoter {
    uint constant VOTE_AMO = 0;
    uint constant VOTE_BOKO = 1;
    uint constant VOTE_NANDO = 2;

    function vote() external pure returns (uint) {
        return VOTE_AMO;
    }
}

contract BokoVoter {
    uint constant VOTE_AMO = 0;
    uint constant VOTE_BOKO = 1;
    uint constant VOTE_NANDO = 2;

    function vote() external pure returns (uint) {
        return VOTE_BOKO;
    }
}

contract NandoVoter {
    uint constant VOTE_AMO = 0;
    uint constant VOTE_BOKO = 1;
    uint constant VOTE_NANDO = 2;

    function vote() external pure returns (uint) {
        return VOTE_NANDO;
    }
}
