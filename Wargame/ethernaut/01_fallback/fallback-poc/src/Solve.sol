// SPDX-License-Identifier: MIT
pragma solidity 0.8.30;

interface IFallout {
    function contribute() external payable;
    function getContribution() external returns (uint256);
    function withdraw() external;
}