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
    address level = vm.envAddress("ETHERNAUT_LEVEL_00");
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

        // 1. call function info()
        vm.broadcast(playerPk);
        console.log("Return of info():", HelloEthernaut(target).info());

        // 2. call function info1()
        vm.broadcast(playerPk);
        console.log("Return of info1():", HelloEthernaut(target).info1());

        // 2. call function info2('hello')
        vm.broadcast(playerPk);
        console.log("Return of info2('hello'):", HelloEthernaut(target).info2("hello"));

        // 3. call function infoNum()
        vm.broadcast(playerPk);
        console.log("Return of infoNum():", HelloEthernaut(target).infoNum());

        // 4. call function info42()
        vm.broadcast(playerPk);
        console.log("Return of info42():", HelloEthernaut(target).info42());

        // 5. call function theMethodName()
        vm.broadcast(playerPk);
        console.log("Return of theMethodName():", HelloEthernaut(target).theMethodName());

        // 6. call function method7123949()
        vm.broadcast(playerPk);
        console.log("Return of method7123949():", HelloEthernaut(target).method7123949());

        // 7. call function password()
        vm.broadcast(playerPk);
        console.log("Return of password():", HelloEthernaut(target).password());

        // 7. call function authenticate('ethernaut0')
        vm.broadcast(playerPk);
        HelloEthernaut(target).authenticate("ethernaut0");

        // 8. Check Level Cleared
        vm.broadcast(playerPk);
        result = HelloEthernaut(target).getCleared();

        if (result)
            console.log("Level HelloEthernaut Cleared!");
        else {
            revert("Failed... Try Again...");
        }
        
        // 9. Submit Level Instance
        result = submitInstance(playerPk, target);

        if (result) {
            console.log("Level completed!");
        } else {
            revert("Level failed...");
        }
    }
}