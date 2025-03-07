// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

import {Test} from "../lib/forge-std/src/Test.sol";
import {console} from "../lib/forge-std/src/console.sol";

contract UniswapV2Test is Test {
    address public owner = address(0x01);
    address public hacker = address(0x02);

    function setUp() public {
        // Setup
        vm.deal(hacker, 100 ether);

        vm.startPrank(owner);
        factory = new UniswapV2Factory(address(0));
        tokenA = new UpsideToken("A", "a");
        tokenB = new UpsideToken("B", "b");
        pair = UniswapV2Pair(factory.createPair(address(tokenA), address(tokenB)));

        tokenA.mint(address(pair), 100 ether);
        tokenB.mint(address(pair), 100 ether);
        
        pair.mint(address(this));

        // Airdrop
        tokenA.mint(address(this), 1 ether);
        tokenB.mint(address(this), 1 ether);

        vm.stopPrank();
    }

    function testInitialSetup() public {
        assertEq(tokenA.balanceOf(address(pair)), 100 ether, "Incorrect tokenA balance in pair");
        assertEq(tokenB.balanceOf(address(pair)), 100 ether, "Incorrect tokenB balance in pair");
        assertEq(tokenA.balanceOf(address(this)), 1 ether, "Incorrect tokenA airdrop amount");
        assertEq(tokenB.balanceOf(address(this)), 1 ether, "Incorrect tokenB airdrop amount");
    }
} 