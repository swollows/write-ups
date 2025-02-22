// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface PuzzleProxy {
    function proposeNewAdmin(address _newAdmin) external;
    function approveNewAdmin(address _expectedAdmin) external;
    function upgradeTo(address _newImplementation) external;
}
interface PuzzleWallet {
    function init(uint256 _maxBalance) external;
    function setMaxBalance(uint256 _maxBalance) external;
    function addToWhitelsit(address addr) external;
    function deposit() external payable;
    function execute(address to, uint256 value, bytes calldata data) external payable;
    function multicall(bytes[] calldata data) external payable;
}

contract PuzzleWalletAttack {
    PuzzleWallet public pwContract;
    address public pwAddress;

    constructor(address _pwAddress) {
        pwAddress = _pwAddress;
        pwContract = PuzzleWallet(pwAddress);
    }
}
