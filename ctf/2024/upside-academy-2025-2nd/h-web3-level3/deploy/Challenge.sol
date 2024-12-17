// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

interface IL3 {
    function [***REDACTED***](uint ans1, bytes calldata ans2, uint ans3) external payable returns (bool);
    function check(uint) external returns (uint256);
}

contract Challenge {
    uint256 public solved;

    function [***REDACTED***](uint ans1, bytes calldata ans2, uint ans3) external payable returns (bool) {
        require(msg.sender != tx.origin, "msg.sender == tx.origin");
        require(ans1 == 31337 * 10, "ans1 != ?");
        require(keccak256(abi.encodePacked(ans2[0])) == hex"d1e8aeb79500496ef3dc2e57ba746a8315d048b7a664a2bf948db4fa91960483", "ans2[0] != ?");
        require(keccak256(abi.encodePacked(ans2[1])) == hex"6a0d259bd4fb907339fd7c65a133083c1e9554f2ca6325b806612c8df6d7df22", "ans2[1] != ?");
        require(keccak256(abi.encodePacked(ans2[2])) == hex"3ac225168df54212a25c1c01fd35bebfea408fdac2e31ddd6f80a4bbf9a5f1cb", "ans2[2] != ?");
        require(keccak256(abi.encodePacked(ans2[3])) == hex"14bcc435f49d130d189737f9762feb25c44ef5b886bef833e31a702af6be4748", "ans2[3] != ?");
        require(ans2.length == 345, "magic 0");
        require(msg.value == 9999, "magic 3");
        try IL3(address(this)).check(ans3) returns (uint256) {

        } catch {
            solved = 1;
        }
        return true;
    }

    function check(uint a) public returns (uint256) {
        return a + 1;
    }
}
