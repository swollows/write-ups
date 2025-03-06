// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import {IDiamondCut} from "./interfaces/IDiamondCut.sol";
import {IErrors} from "./interfaces/IErrors.sol";

contract Controller {
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

    constructor(address _contract_owner, address _diamond_cut_facet) payable {
        if (_diamond_cut_facet == address(0)) {
            revert IErrors.zeroAddress();
        }

        if (_contract_owner == address(0)) {
            revert IErrors.zeroAddress();
        }

        _set_contract_owner(_contract_owner);
        DiamondStorage storage ds = diamondStorage();

        ds.supportedInterfaces[0x80ac58cd] = true;
        ds.supportedInterfaces[0x7f5828d0] = true;
        ds.supportedInterfaces[0x01ffc9a7] = true;

        IDiamondCut.facet_diamond_cut[] memory cut = new IDiamondCut.facet_diamond_cut[](1);
        bytes4[] memory selectors = new bytes4[](1);
        selectors[0] = IDiamondCut.diamond_facet_cut.selector;

        cut[0] = IDiamondCut.facet_diamond_cut({
            facetAddress: _diamond_cut_facet,
            action: IDiamondCut.facet_diamond_cut_action.Add,
            functionSelectors: selectors
        });

        diamond_facet_cut(cut, address(0), new bytes(0));
    }

    fallback() external payable {
        DiamondStorage storage ds;
        bytes32 _pos = DIAMOND_STAND_STORE_POS;

        assembly {
            ds.slot := _pos
        }

        address facet = ds.facet_addr_and_selector_pos[msg.sig].facetAddress;
        if (facet == address(0)) {
            revert IErrors.FunctionDoesNotExist();
        }

        assembly {
            calldatacopy(0, 0, calldatasize())

            let result := delegatecall(gas(), facet, 0, calldatasize(), 0, 0)

            returndatacopy(0, 0, returndatasize())

            switch result
            case 0 { revert(0, returndatasize()) }
            default { return(0, returndatasize()) }
        }
    }

    function diamondStorage() internal pure returns (DiamondStorage storage ds) {
        bytes32 position = DIAMOND_STAND_STORE_POS;
        assembly {
            ds.slot := position
        }
    }

    function _set_contract_owner(address _newOwner) internal {
        DiamondStorage storage ds = diamondStorage();
        address previousOwner = ds.contractOwner;
        ds.contractOwner = _newOwner;
        emit OwnershipTransferred(previousOwner, _newOwner);
    }

    function diamond_facet_cut(
        IDiamondCut.facet_diamond_cut[] memory _diamondCut,
        address _init,
        bytes memory _calldata
    ) internal {
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
        emit IDiamondCut.DiamondCut(_diamondCut, _init, _calldata);
        initialize_diamond_cut(_init, _calldata);
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
