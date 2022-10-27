// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.9;

import {ERC721} from "@openzeppelin/contracts/token/ERC721/ERC721.sol";
import {IERC20} from "@openzeppelin/contracts/token/ERC20/IERC20.sol";
import {Ownable} from "@openzeppelin/contracts/access/Ownable.sol";

contract FlagNft is ERC721("FlagNft", "FN"), Ownable {
    event BuyFlagNft();

    address public token;
    uint256 public price;
    string public flag;

    constructor(address _token, uint256 _price) {
        token = _token;
        price = _price;
    }

    function buyFlagNft() external {
        require(_exists(0) == false, "FlagNft: already exists");
        IERC20(token).transferFrom(_msgSender(), address(this), price);
        _safeMint(_msgSender(), 0, "");

        emit BuyFlagNft();
    }

    function setFlag(string memory _flag) external onlyOwner {
        flag = _flag;
    }
}
