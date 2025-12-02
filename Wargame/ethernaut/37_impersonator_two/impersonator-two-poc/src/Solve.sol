// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface IImpersonatorTwo {
    function admin() external view returns (address);
    function owner() external view returns (address);
    function nonce() external view returns (uint256);
    function hash_message(string memory message) external pure returns (bytes32);
    function setAdmin(bytes calldata signature, address newAdmin) external;
    function switchLock(bytes calldata signature) external;
    function withdraw() external;
}

contract Solve {
    receive() external payable {}

    function setAdminWithSignature(address target, bytes calldata signature, address newAdmin) external {
        IImpersonatorTwo(target).setAdmin(signature, newAdmin);
    }

    function switchLockWithSignature(address target, bytes calldata signature) external {
        IImpersonatorTwo(target).switchLock(signature);
    }

    function withdrawFrom(address target) external {
        IImpersonatorTwo(target).withdraw();
    }

    function sweep(address to) external {
        (bool ok, ) = to.call{value: address(this).balance}("");
        require(ok, "sweep failed");
    }
}