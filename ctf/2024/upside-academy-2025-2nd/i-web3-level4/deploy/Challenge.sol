// SPDX-License-Identifier: MIT
pragma solidity >=0.8.0;

import "./GovernanceToken.sol";
import "./GovernorAlpha.sol";
import "./Timelock.sol";

contract Challenge {
    uint256 public solved;

    GovernanceToken token;
    Timelock timelock;
    GovernorAlpha gov;

    uint token_sale_count;

    constructor() {
        token = new GovernanceToken();
        timelock = new Timelock(address(this), 5 minutes);
        gov = new GovernorAlpha(address(timelock), address(token), address(0));
        timelock.setAdmin(address(gov));
        token.setAdmin(address(timelock));
    }

    function buy() external payable {
        require(msg.value >= 1 ether, "insufficient funds");
        require(token_sale_count < 5, "sold out");
        token_sale_count++;
        token.transfer(msg.sender, 1);
    }

    function getAddresses() external view returns (address, address, address) {
        return (address(token), address(timelock), address(gov));
    }

    function flag() external returns (bool) {
        if (token.balanceOf(tx.origin) >= token.INITIAL_SUPPLY() * 10) {
            solved = 1;
            return true;
        }
        return false;
    }
}
