// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.9;

import {Ownable} from "@openzeppelin/contracts/access/Ownable.sol";
import {SafeMath} from "@openzeppelin/contracts/utils/math/SafeMath.sol";
import {Governance} from "./Governance.sol";

contract Committee is Ownable {
    using SafeMath for uint256;

    event CastVote(uint256 agendaId, address voter, bool vote);
    event NewAgenda(uint256 agendaId);
    event ExecuteAgenda(uint256 agendaId);

    struct VotingInfo {
        bool isVoter;
        bool hasVoted;
    }

    struct Agenda {
        address[] targets;
        bytes[] functionBytecodes;
        uint256 executeStartFrom;
        uint256 countingYes;
        uint256 countingNo;
        bool executed;
    }

    Governance public governance;

    address[] candidates;
    Agenda[] internal agendas;

    uint256 providerCount;
    mapping(address => bool) public providers;

    mapping(uint256 => mapping(address => VotingInfo)) votingInfo;

    constructor() {
        governance = new Governance();
    }

    modifier validAgenda(uint256 _agendaID) {
        require(_agendaID < agendas.length, "Committee: invalid agenda id");
        _;
    }

    modifier onlyGovernance() {
        require(
            _msgSender() == address(governance),
            "Committee: only governance"
        );
        _;
    }

    function initialize(address[] memory _candidates) external {
        require(providerCount == 0, "Committee: already initialized");

        for (uint256 i = 0; i < _candidates.length; i++) {
            candidates.push(_candidates[i]);
        }

        providers[_candidates[0]] = true;
        providerCount += 1;
    }

    function addProvider(address account) external onlyGovernance {
        require(
            providers[account] == false,
            "Committee: accounts already set as a provider"
        );
        providers[account] = true;
        providerCount += 1;
    }

    function removeProvider(address account) external onlyGovernance {
        require(
            providers[account] == true,
            "Committee: accounts is not a provider"
        );
        providers[account] = false;
        providerCount -= 1;
    }

    function newAgenda(
        address[] calldata _targets,
        bytes[] calldata _functionBytecodes
    ) external returns (uint256 agendaID) {
        require(providers[_msgSender()] == true, "Committee: only provider");
        agendaID = agendas.length;

        Agenda memory agenda;
        agendas.push(agenda);

        for (uint256 i = 0; i < _targets.length; i++) {
            agendas[agendaID].targets.push(_targets[i]);
            agendas[agendaID].functionBytecodes.push(_functionBytecodes[i]);
        }

        for (uint256 i = 0; i < candidates.length; i++) {
            votingInfo[agendaID][candidates[i]].isVoter = true;
            votingInfo[agendaID][candidates[i]].hasVoted = false;
        }

        emit NewAgenda(agendaID);
    }

    function castVote(uint256 _agendaID, bool _vote)
        external
        validAgenda(_agendaID)
    {
        Agenda storage agenda = agendas[_agendaID];
        VotingInfo storage info = votingInfo[_agendaID][_msgSender()];
        require(info.hasVoted == false, "Committee: already voted");
        require(info.isVoter == true, "Committee: only voter");

        if (_vote == false) {
            agenda.countingNo = agenda.countingNo.add(1);
        } else {
            agenda.countingYes = agenda.countingYes.add(1);
        }

        info.hasVoted = true;

        emit CastVote(_agendaID, _msgSender(), _vote);
    }

    function _call(
        address target,
        uint256 paramLength,
        bytes memory param
    ) private returns (bool) {
        bool result;
        assembly {
            let data := add(param, 32)
            result := call(
                sub(gas(), 40000),
                target,
                0,
                data,
                paramLength,
                0,
                0
            )
        }

        return result;
    }

    function isExecutable(uint256 _agendaID)
        external
        view
        validAgenda(_agendaID)
        returns (bool)
    {
        Agenda storage agenda = agendas[_agendaID];
        if (agenda.executed == true) return false;

        uint256 votingCount = agenda.countingNo + agenda.countingYes;
        if (votingCount != candidates.length) return false;
        if (agenda.countingYes <= agenda.countingNo) return false;

        return true;
    }

    function executeAgenda(uint256 _agendaID) external validAgenda(_agendaID) {
        Agenda storage agenda = agendas[_agendaID];
        require(agenda.executed == false, "Committee: already executed");

        uint256 votingCount = agenda.countingNo + agenda.countingYes;
        require(
            votingCount == candidates.length,
            "Committee: not enough quorum"
        );
        require(
            agenda.countingYes > agenda.countingNo,
            "Committee: rejected agenda"
        );

        for (
            uint256 i = agenda.executeStartFrom;
            i < agenda.targets.length;
            i++
        ) {
            bool result = _call(
                agenda.targets[i],
                agenda.functionBytecodes[i].length,
                agenda.functionBytecodes[i]
            );
            require(result == true, "Committee: failed to execute agenda");
        }

        agenda.executed = true;

        emit ExecuteAgenda(_agendaID);
    }

    function setExecuteCount(uint256 _agendaID, uint256 _count)
        external
        validAgenda(_agendaID)
    {
        Agenda storage agenda = agendas[_agendaID];
        agenda.executeStartFrom = agenda.executeStartFrom.add(_count);
    }
}
