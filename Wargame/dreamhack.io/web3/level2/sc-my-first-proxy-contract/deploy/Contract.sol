// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract Level {
    address public proxyOwner;
    address public implementation;

    constructor (address addr) {
        proxyOwner = msg.sender;
        implementation = addr;

        (bool success, ) = implementation.delegatecall(abi.encodeWithSignature("initialize()"));
        require(success, "Failed to initialize");
    }

    modifier onlyOwner() {
        require(proxyOwner == msg.sender, "Not owner");
        _;
    }

    function setImplementation(address addr) public onlyOwner {
        implementation = addr;
    }

    function setOwner(address addr) public onlyOwner {
        proxyOwner = addr;
    }

    fallback(bytes calldata data) external payable returns (bytes memory) {
        (bool success, bytes memory ret) = implementation.delegatecall(data);
        require(success, "Failed to delegatecall");
        return ret;
    }
}

contract KingofDreamhackV2 {
    uint public currentValue;
    address public king;
    mapping(address => uint) unclaimed;

    bool initialized;

    function initialize() external {
        require(!initialized, "Already initialized");
        currentValue = 0; // Whoever first takes will be the king
        initialized = true;
    }

    function claim() external {
        uint amount = unclaimed[msg.sender];
        if (amount > 0) {
            unclaimed[msg.sender] = 0;
            (bool success, ) = msg.sender.call{value: amount}("");
            require(success, "Failed to send, give me more gas");
        }
    }

    receive() external payable {
        require(msg.value > currentValue, "Give me more money");
        bool success = payable(king).send(currentValue);
        if (!success) {
            unclaimed[king] = currentValue;
        }
        currentValue = msg.value;
        king = msg.sender;
    }
}
