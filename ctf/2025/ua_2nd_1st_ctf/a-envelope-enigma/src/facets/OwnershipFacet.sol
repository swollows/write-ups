// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import {Controller} from "../Controller.sol";
import {IErrors} from "../interfaces/IErrors.sol";

contract OwnershipFacet {
    bytes32 constant DIAMOND_STAND_STORE_POS = 0xc8fcad8db84d3cc18b4c41d551ea0ee66dd599cde068d998e57d5e09332c131c; // diamond.standard.diamond.storage

    struct facet_addr_and_selector_pos {
        address facetAddress;
        uint96 selectorPosition;
    }

    struct DiamondStorage {
        mapping(bytes4 => facet_addr_and_selector_pos) facet_addr_and_selector_pos;
        address[] facetAddresses;
        mapping(bytes4 => bool) supportedInterfaces;
        address contractOwner;
    }

    event OwnershipTransferred(address indexed previousOwner, address indexed newOwner);

    function owner() external view returns (address owner_) {
        owner_ = contractOwner();
    }

    function transferOwnership(address _newOwner) external {
        if (_newOwner == address(0)) {
            revert IErrors.MustNotBeZeroAddress();
        }
        IsContractOwner();
        _set_contract_owner(_newOwner);
    }

    function diamondStorage() internal pure returns (DiamondStorage storage ds) {
        bytes32 pos = DIAMOND_STAND_STORE_POS;
        assembly {
            ds.slot := pos
        }
    }

    function contractOwner() internal view returns (address) {
        return diamondStorage().contractOwner;
    }

    function IsContractOwner() internal view {
        if (msg.sender != diamondStorage().contractOwner) {
            revert IErrors.MustBeContractOwner();
        }
    }

    function _set_contract_owner(address _newOwner) internal {
        DiamondStorage storage ds = diamondStorage();
        address previousOwner = ds.contractOwner;
        ds.contractOwner = _newOwner;
        emit OwnershipTransferred(previousOwner, _newOwner);
    }
}
