// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.19;

import {IDiamondCut} from "../interfaces/IDiamondCut.sol";
import {IErrors} from "../interfaces/IErrors.sol";

contract DiamondCutFacet is IDiamondCut {
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

    function diamond_facet_cut(
        IDiamondCut.facet_diamond_cut[] memory _diamondCut,
        address _init,
        bytes memory _calldata
    ) external {
        IsContractOwner();
        for (uint256 facetIndex; facetIndex < _diamondCut.length; facetIndex++) {
            IDiamondCut.facet_diamond_cut_action action = _diamondCut[facetIndex].action;
            if (action == IDiamondCut.facet_diamond_cut_action.Add) {
                add_diamond_facet_functions(
                    _diamondCut[facetIndex].facetAddress, _diamondCut[facetIndex].functionSelectors
                );
            } else if (action == IDiamondCut.facet_diamond_cut_action.Remove) {
                remove_diamond_facet_functions(
                    _diamondCut[facetIndex].facetAddress, _diamondCut[facetIndex].functionSelectors
                );
            } else if (action == IDiamondCut.facet_diamond_cut_action.Replace) {
                replace_diamond_facet_functions(
                    _diamondCut[facetIndex].facetAddress, _diamondCut[facetIndex].functionSelectors
                );
            } else {
                revert IErrors.IncorrectFacetDiamondCutAction();
            }
        }
        initialize_diamond_cut(_init, _calldata);
        emit IDiamondCut.DiamondCut(_diamondCut, _init, _calldata);
    }

    function add_diamond_facet_functions(address _facetAddress, bytes4[] memory _functionSelectors) internal {
        if (_facetAddress == address(0)) {
            revert IErrors.AddFacetCanNotBeZeroAddress();
        }
        DiamondStorage storage ds = diamondStorage();
        uint96 selectorPosition = uint96(ds.facetAddresses.length);

        bool facetAddressExists;
        for (uint256 i; i < ds.facetAddresses.length; i++) {
            if (ds.facetAddresses[i] == _facetAddress) {
                facetAddressExists = true;
                break;
            }
        }
        if (!facetAddressExists) {
            ds.facetAddresses.push(_facetAddress);
        }

        for (uint256 selectorIndex; selectorIndex < _functionSelectors.length; selectorIndex++) {
            bytes4 selector = _functionSelectors[selectorIndex];
            address oldFacetAddress = ds.facet_addr_and_selector_pos[selector].facetAddress;
            if (oldFacetAddress != address(0)) {
                revert IErrors.CanNotAddFunctionThatAlreadyExists();
            }
            ds.facet_addr_and_selector_pos[selector] = facet_addr_and_selector_pos(_facetAddress, selectorPosition);
            selectorPosition++;
        }
    }

    function replace_diamond_facet_functions(address _facetAddress, bytes4[] memory _functionSelectors) internal {
        if (_facetAddress == address(0)) {
            revert IErrors.ReplaceFacetCanNotBeZeroAddress();
        }
        DiamondStorage storage ds = diamondStorage();
        uint96 selectorPosition = uint96(ds.facetAddresses.length);

        bool facetAddressExists;
        for (uint256 i; i < ds.facetAddresses.length; i++) {
            if (ds.facetAddresses[i] == _facetAddress) {
                facetAddressExists = true;
                break;
            }
        }
        if (!facetAddressExists) {
            ds.facetAddresses.push(_facetAddress);
        }

        for (uint256 selectorIndex; selectorIndex < _functionSelectors.length; selectorIndex++) {
            bytes4 selector = _functionSelectors[selectorIndex];
            address oldFacetAddress = ds.facet_addr_and_selector_pos[selector].facetAddress;
            if (oldFacetAddress == _facetAddress) {
                revert IErrors.CanNotReplaceFunctionWithSameFunction();
            }
            if (oldFacetAddress == address(0)) {
                revert IErrors.CanNotReplaceFunctionThatDoesNotExist();
            }
            ds.facet_addr_and_selector_pos[selector] = facet_addr_and_selector_pos(_facetAddress, selectorPosition);
            selectorPosition++;
        }
    }

    function remove_diamond_facet_functions(address _facetAddress, bytes4[] memory _functionSelectors) internal {
        if (_facetAddress != address(0)) {
            revert IErrors.RemoveFacetAddressMustBeZeroAddress();
        }
        DiamondStorage storage ds = diamondStorage();
        uint256 selectorCount = _functionSelectors.length;
        for (uint256 selectorIndex; selectorIndex < selectorCount; selectorIndex++) {
            bytes4 selector = _functionSelectors[selectorIndex];
            facet_addr_and_selector_pos memory oldFacetAddress = ds.facet_addr_and_selector_pos[selector];
            if (oldFacetAddress.facetAddress == address(0)) {
                revert IErrors.CanNotRemoveFunctionThatDoesNotExist();
            }
            delete ds.facet_addr_and_selector_pos[selector];
        }
    }

    function initialize_diamond_cut(address _init, bytes memory _calldata) internal {
        if (_init == address(0)) {
            if (_calldata.length != 0) {
                revert IErrors.InitIsZeroAddressButCalldataIsNotEmpty();
            }
        } else {
            if (_calldata.length == 0) {
                revert IErrors.CalldataIsEmptyButInitIsNotZeroAddress();
            }
            if (_init != address(this)) {
                enforceHasContractCode(_init);
            }
            (bool success, bytes memory error) = _init.delegatecall(_calldata);
            if (!success) {
                if (error.length > 0) {
                    revert(string(error));
                } else {
                    revert IErrors.InitFunctionReverted();
                }
            }
        }
    }

    function enforceHasContractCode(address _contract) internal view {
        uint256 contractSize;
        assembly {
            contractSize := extcodesize(_contract)
        }
        if (contractSize == 0) {
            revert IErrors.InitAddressHasNoCode();
        }
    }
}
