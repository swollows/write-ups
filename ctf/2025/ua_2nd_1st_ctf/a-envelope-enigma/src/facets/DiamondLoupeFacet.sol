// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

contract DiamondLoupeFacet {
    bytes32 constant DIAMOND_STAND_STORE_POS = 0xc8fcad8db84d3cc18b4c41d551ea0ee66dd599cde068d998e57d5e09332c131c; // diamond.standard.diamond.storage

    struct Facet {
        address facetAddress;
        bytes4[] func_selectors;
    }

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

    function get_facet_func_selectors(address _facet) external view returns (bytes4[] memory _facet_func_selectors) {
        DiamondStorage storage ds = diamondStorage();

        uint256 numSelectors;
        for (uint256 _selector_index; _selector_index < ~uint32(0); _selector_index++) {
            bytes4 selector = bytes4(keccak256(abi.encodePacked(_selector_index)));
            if (ds.facet_addr_and_selector_pos[selector].facetAddress == _facet) {
                numSelectors++;
            }
        }

        _facet_func_selectors = new bytes4[](numSelectors);

        uint256 selectorPosition;
        for (uint256 _selector_index; _selector_index < ~uint32(0); _selector_index++) {
            bytes4 selector = bytes4(keccak256(abi.encodePacked(_selector_index)));
            if (ds.facet_addr_and_selector_pos[selector].facetAddress == _facet) {
                _facet_func_selectors[selectorPosition] = selector;
                selectorPosition++;
                if (selectorPosition == numSelectors) break;
            }
        }
    }

    function facetAddresses() external view returns (address[] memory) {
        return diamondStorage().facetAddresses;
    }

    function getFacetAddress(bytes4 _functionSelector) external view returns (address) {
        return diamondStorage().facet_addr_and_selector_pos[_functionSelector].facetAddress;
    }

    function supportsInterface(bytes4 _interfaceId) external view returns (bool) {
        return diamondStorage().supportedInterfaces[_interfaceId];
    }

    function get_facets() external view returns (Facet[] memory facets_) {
        DiamondStorage storage ds = diamondStorage();
        uint256 numFacets = ds.facetAddresses.length;
        facets_ = new Facet[](numFacets);

        for (uint256 i; i < numFacets; i++) {
            address currentFacet = ds.facetAddresses[i];
            facets_[i].facetAddress = currentFacet;
            facets_[i].func_selectors = new bytes4[](0);
        }

        for (uint256 i; i < numFacets; i++) {
            address currentFacet = ds.facetAddresses[i];
            bytes4[] memory selectors = new bytes4[](0);
            uint256 selectorCount;

            for (uint256 _selector_index; _selector_index < ~uint32(0); _selector_index++) {
                bytes4 selector = bytes4(keccak256(abi.encodePacked(_selector_index)));
                if (ds.facet_addr_and_selector_pos[selector].facetAddress == currentFacet) {
                    selectorCount++;
                }
            }

            selectors = new bytes4[](selectorCount);

            uint256 selectorPosition;
            for (uint256 _selector_index; _selector_index < ~uint32(0); _selector_index++) {
                bytes4 selector = bytes4(keccak256(abi.encodePacked(_selector_index)));
                if (ds.facet_addr_and_selector_pos[selector].facetAddress == currentFacet) {
                    selectors[selectorPosition] = selector;
                    selectorPosition++;
                    if (selectorPosition == selectorCount) break;
                }
            }

            facets_[i].func_selectors = selectors;
        }
    }

    function diamondStorage() internal pure returns (DiamondStorage storage ds) {
        bytes32 pos = DIAMOND_STAND_STORE_POS;
        assembly {
            ds.slot := pos
        }
    }
}
