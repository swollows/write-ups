// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface IEllipticToken {
    function owner() external view returns (address);
    function balanceOf(address) external view returns (uint256);
    function transferFrom(address, address, uint256) external returns (bool);
    function permit(uint256 amount, address spender, bytes calldata tokenOwnerSignature, bytes calldata spenderSignature) external;
}

contract Solve {
    IEllipticToken public target;
    address public constant ALICE = 0xA11CE84AcB91Ac59B0A4E2945C9157eF3Ab17D4e;

    constructor(address _target) {
        target = IEllipticToken(_target);
    }

    function attack(uint256 amount, address spender, bytes calldata aliceSpoofedSignature, bytes calldata spenderSignature) external {
        target.permit(amount, spender, aliceSpoofedSignature, spenderSignature);
    }
}