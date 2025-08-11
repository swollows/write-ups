// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

/* 목표
 * 10 바이트 이내의 바이트코드로 10진수 42(16진수 2a)를 반환하는 컨트랙트 제작하기
 * 
 * 공격 방식
 * 1. https://www.evm.codes/playground 에서 bytecode로 보면 이런 코드가 있음. 604260005260206000F3 
 * 2. 바이트 코드를 분석하면 아래와 같음
 *   - 60 42 : PUSH1 0x42 (반환 값)
 *   - 60 00 : PUSH1 0x00 (메모리 주소 등록)
 *   - 52 : MSTORE (스택에 올렸던 2개의 값을 꺼내서 MSTORE(주소, 값) 형태로 메모리에 저장)
 *   - 60 20 : PUSH1 0x20 (반환할 데이터 길이)
 *   - 60 00 : PUSH1 0x00 (반환할 데이터의 시작 메모리 주소)
 *   - F3 : RETURN (스택에 올렸던 2개의 값을 꺼내서 RETURN(주소, 길이) 형태로 메모리 데이터 반환)
 * 3. 2번의 코드를 10진수 42를 반환할 수 있도록 0x42 -> 0x2a로 변경
 * 4. 3번에서 완성된 코드를 setSolver에 등록후 바이트 코드 실행 시 런타임 코드를 가져올 수 있도록 생성자에 직접 등록
 */

interface MagicNum {
    function setSolver(address) external;
}

contract Solve {
    address target;
    address solver;

    constructor(address _target, address _solver) {
        target = _target;
        solver = _solver;
    }

    function attack() public {
        MagicNum(target).setSolver(solver);
    }
}