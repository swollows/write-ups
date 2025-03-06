// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import "./Controller.sol";
import "./facets/DiamondCutFacet.sol";
import "./facets/DiamondLoupeFacet.sol";
import "./facets/OwnershipFacet.sol";
import "./facets/MessageVaultFacet.sol";
import "./interfaces/IDiamondCut.sol";

contract Challenge {
    DiamondCutFacet diamondCutFacet;
    DiamondLoupeFacet diamondLoupeFacet;
    OwnershipFacet ownershipFacet;
    MessageVaultFacet messageVaultFacet;
    Controller controller;
    address challenger;
    bool initialized;

    event Register(address indexed challenger, bool indexed initialized);

    modifier isInitialized() {
        require(!initialized, "Challenge already initialized");
        _;
    }

    constructor() payable {
        diamondCutFacet = new DiamondCutFacet();
        diamondLoupeFacet = new DiamondLoupeFacet();
        ownershipFacet = new OwnershipFacet();
        messageVaultFacet = new MessageVaultFacet();

        controller = new Controller{value: 5 ether}(address(this), address(diamondCutFacet));

        IDiamondCut.facet_diamond_cut[] memory cut = new IDiamondCut.facet_diamond_cut[](3);

        bytes4[] memory loupeSelectors = new bytes4[](5);
        loupeSelectors[0] = DiamondLoupeFacet.get_facets.selector;
        loupeSelectors[1] = DiamondLoupeFacet.get_facet_func_selectors.selector;
        loupeSelectors[2] = DiamondLoupeFacet.facetAddresses.selector;
        loupeSelectors[3] = DiamondLoupeFacet.getFacetAddress.selector;
        loupeSelectors[4] = DiamondLoupeFacet.supportsInterface.selector;
        cut[0] = IDiamondCut.facet_diamond_cut({
            facetAddress: address(diamondLoupeFacet),
            action: IDiamondCut.facet_diamond_cut_action.Add,
            functionSelectors: loupeSelectors
        });

        bytes4[] memory ownershipSelectors = new bytes4[](2);
        ownershipSelectors[0] = OwnershipFacet.transferOwnership.selector;
        ownershipSelectors[1] = OwnershipFacet.owner.selector;
        cut[1] = IDiamondCut.facet_diamond_cut({
            facetAddress: address(ownershipFacet),
            action: IDiamondCut.facet_diamond_cut_action.Add,
            functionSelectors: ownershipSelectors
        });

        bytes4[] memory messageVaultSelectors = new bytes4[](10);
        messageVaultSelectors[0] = MessageVaultFacet.deposit_eth_and_sendMsg.selector;
        messageVaultSelectors[1] = MessageVaultFacet.withdraw_eth_and_sendMsg.selector;
        messageVaultSelectors[2] = MessageVaultFacet.getContractBalance.selector;
        messageVaultSelectors[3] = MessageVaultFacet.only_sendMsg.selector;
        messageVaultSelectors[4] = MessageVaultFacet.withdraw_all_eth_and_sendMsg.selector;
        messageVaultSelectors[5] = MessageVaultFacet.deposit_eth_and_sendMsg_For.selector;
        messageVaultSelectors[6] = MessageVaultFacet.setFee.selector;
        messageVaultSelectors[7] = MessageVaultFacet.getFee.selector;
        messageVaultSelectors[8] = MessageVaultFacet.balanceOf.selector;
        messageVaultSelectors[9] = MessageVaultFacet.totalSupply.selector;

        cut[2] = IDiamondCut.facet_diamond_cut({
            facetAddress: address(messageVaultFacet),
            action: IDiamondCut.facet_diamond_cut_action.Add,
            functionSelectors: messageVaultSelectors
        });

        IDiamondCut(address(controller)).diamond_facet_cut(cut, address(0), "");

        MessageVaultFacet(address(controller)).deposit_eth_and_sendMsg{value: 5 ether}("INIT_DEPLOYER_ETH_NO_FEE:5ETH");
        MessageVaultFacet(address(controller)).setFee(8000);
        OwnershipFacet(address(controller)).transferOwnership(msg.sender);
    }

    function register() external isInitialized returns (bool) {
        initialized = true;
        challenger = msg.sender;
        emit Register(challenger, initialized);
        return true;
    }

    function isSolved() external view returns (bool) {
        require(address(challenger) != address(0), "Challenge not registered");
        address owner = OwnershipFacet(address(controller)).owner();
        uint256 solver_native_balance = payable(challenger).balance;
        if (owner != challenger || solver_native_balance < 10 ether) {
            return false;
        }
        return true;
    }
}
