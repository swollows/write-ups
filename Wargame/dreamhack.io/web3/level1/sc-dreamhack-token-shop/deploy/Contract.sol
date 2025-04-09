// SPDX-License-Identifier: MIT
pragma solidity ^0.6.0;

contract Level {
    mapping(address => mapping(string => uint)) public inventory;
    mapping(string => uint) public tokenCost;
    mapping(address => bool) public hasReceivedFreeMoney;
    mapping(address => uint) public balance;

    uint immutable fee;

    constructor () public {
        tokenCost["amo"] = 9254;
        tokenCost["boko"] = 6553;
        tokenCost["nando"] = 2178;

        fee = 0x10;
    }

    function getFreeMoney() public returns (bool) {
        if (hasReceivedFreeMoney[msg.sender])
            return false;
        
        hasReceivedFreeMoney[msg.sender] = true;
        balance[msg.sender] += 0x10000;
        return true;
    }

    function checkOverflow(uint costPerItem, uint amount) private view {
        require(costPerItem != 0, "There is no such token");
        require(amount != 0, "You need to buy at least one item");

        uint totalCost = costPerItem * amount;
        require(totalCost / amount == costPerItem, "No overflow in multiplication :(");
        require(balance[msg.sender] >= totalCost, "You do not have enough money :(");
    }

    function buyToken(string memory tokenName, uint amount) public {
        uint costPerItem = tokenCost[tokenName];
        checkOverflow(costPerItem, amount);

        balance[msg.sender] -= costPerItem * amount + fee;
        inventory[msg.sender][tokenName] += amount;
    }
}
