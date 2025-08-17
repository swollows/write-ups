// SPDX-License-Identifier: Unlicense
pragma solidity ^0.8.13;

import "../src/Solve.sol";
import {Script} from "forge-std/Script.sol";
import {RLPWriter} from "./RLPWriter.sol";
import "forge-std/console.sol";

contract Deploy is Script {
    address deployer = 0xB267C5f8279A939062A20d29CA9b185b61380f10;
    address target;
    uint256 nonce = 1;  // hint: 'After deploying the first token contract' -> nonce 값이 1

    function calculateAddress(address _deployer, uint256 _nonce) 
        public
        pure
        returns (address)
    {
        // 1. 각 항목을 개별적으로 RLP 인코딩
        // 주소(address)는 바이트(bytes)로 변환하여 인코딩
        bytes memory encodedAddress = RLPWriter.writeBytes(abi.encodePacked(_deployer));
        bytes memory encodedNonce = RLPWriter.writeUint(_nonce);

        // 2. 인코딩된 항목들을 하나로 합쳐 리스트의 '페이로드(payload)' 생성
        bytes memory payload = abi.encodePacked(encodedAddress, encodedNonce);

        // 3. 페이로드 길이를 기반으로 RLP 리스트의 '접두사(prefix)' 생성
        bytes memory rlpPrefix = _getRLPListPrefix(payload.length);

        // 4. 접두사와 페이로드를 합쳐 최종 RLP 인코딩된 리스트 생성
        bytes memory rlpEncodedList = abi.encodePacked(rlpPrefix, payload);

        // 5. RLP 인코딩된 결과에 keccak256 해시 적용
        bytes32 hashed = keccak256(rlpEncodedList);

        // 6. 해시 결과(32바이트)를 주소(20바이트)로 변환
        return address(uint160(uint256(hashed)));
    }

    function _getRLPListPrefix(uint256 len)
        private
        pure
        returns (bytes memory)
    {
        // 페이로드 길이가 55바이트 이하인 경우
        if (len < 56) {
            // 접두사는 0xc0 + 길이 입니다.
            return abi.encodePacked(uint8(len + 192));
        }
        // 페이로드 길이가 55바이트를 초과하는 경우
        else {
            // 길이를 표현하는 데 필요한 바이트 수를 계산합니다.
            bytes memory lenAsBytes = RLPWriter.writeUint(len);
            
            // 접두사는 (0xf7 + 길이의 바이트 수) + 길이값 입니다.
            return abi.encodePacked(uint8(lenAsBytes.length + 247), lenAsBytes);
        }
    }

    function run() external {
        vm.startBroadcast();

        target = calculateAddress(deployer, nonce);

        Solve solve = new Solve(target);

        console.log("Calculated Contract Address:", address(target));
        console.log("Solve Contract Address:", address(solve));

        solve.attack();

        vm.stopBroadcast();
    }
}