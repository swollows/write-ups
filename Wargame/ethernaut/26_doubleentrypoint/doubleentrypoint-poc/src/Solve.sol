// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface IForta {
    function setDetectionBot(address detectionBotAddress) external;
    function notify(address user, bytes calldata msgData) external;
    function raiseAlert(address user) external;
}

interface IDetectionBot {
    function handleTransaction(address user, bytes calldata msgData) external;
}

contract Solve is IDetectionBot  {
    IForta public forta;

    constructor(address _forta) {
        forta = IForta(_forta);
    }

    function handleTransaction(address user, bytes calldata msgData) external {
        forta.raiseAlert(user);
    }
}