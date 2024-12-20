// SPDX-License-Identifier: MIT
pragma solidity >= 0.7.0 < 0.9.0;

contract Safe {
    address public owner;
    string private flag =  "bisc2023{FAKE_FLAG}";

    constructor() {
        owner = msg.sender;
    }

    function opensafe() public view returns (string memory) {
        if(owner == msg.sender){
            return flag;
        }
        else {
            return "Your not owner!!";
        }
    }

    function changeOwner(address _owner) public {
        require(owner == msg.sender, "Your not owner!!");
        owner = _owner;
    }
}



