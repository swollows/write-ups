// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.9;

import {Ownable} from "@openzeppelin/contracts/access/Ownable.sol";
import {GovToken} from "./GovToken.sol";
import {Committee} from "./Committee.sol";

contract Governance is Ownable {
    event AddProvider(address account);
    event RemoveProvider(address account);
    event ClaimProviderReward(address account);
    event Message(string message);

    GovToken public govToken;
    Committee public committee;

    constructor() {
        govToken = new GovToken();
        committee = Committee(_msgSender());
    }

    modifier onlyCommittee() {
        require(
            _msgSender() == address(committee),
            "Governance: only committee"
        );
        _;
    }

    function addProvider(address account) external onlyCommittee {
        committee.addProvider(account);
        emit AddProvider(account);
    }

    function removeProvider(address account) external onlyCommittee {
        committee.removeProvider(account);
        emit RemoveProvider(account);
    }

    function message(address provider, string memory _message)
        external
        onlyCommittee
    {
        claimProviderReward(provider);

        emit Message(_message);
    }

    function claimProviderReward(address account) private {
        govToken.mint(account, 1000 * 1e18);
    }
}
