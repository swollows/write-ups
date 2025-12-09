// SPDX-License-Identifier: MIT
pragma solidity 0.8.30;

interface HelloEthernaut {
    function info() external returns (string memory);
    function info1() external returns (string memory);
    function info2(string memory) external returns (string memory);
    function infoNum() external returns (uint256);
    function info42() external returns (string memory);
    function theMethodName() external returns (string memory);
    function method7123949() external returns (string memory);
    function password() external returns (string memory);
    function authenticate(string memory) external;
    function getCleared() external returns (bool);
}