// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface IDiamondCut {
    enum facet_diamond_cut_action {
        Add,
        Replace,
        Remove
    }

    struct facet_diamond_cut {
        address facetAddress;
        facet_diamond_cut_action action;
        bytes4[] functionSelectors;
    }

    function diamond_facet_cut(facet_diamond_cut[] calldata _diamondCut, address _init, bytes calldata _calldata)
        external;

    event DiamondCut(facet_diamond_cut[] _diamondCut, address _init, bytes _calldata);
}
