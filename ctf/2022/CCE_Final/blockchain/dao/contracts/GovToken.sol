// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.9;

import {Ownable} from "@openzeppelin/contracts/access/Ownable.sol";
import {ERC20} from "@openzeppelin/contracts/token/ERC20/ERC20.sol";

contract GovToken is ERC20("GovToken", "GT"), Ownable {
    event Mint(address account, uint256 amount);

    function mint(address account, uint256 amount) external onlyOwner {
        _mint(account, amount);

        emit Mint(account, amount);
    }
}
