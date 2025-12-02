// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import {Script} from "forge-std/Script.sol";
import "../src/Solve.sol";

contract Deploy is Script {
    address target = 0x3fA4E6e03Fbd434A577387924aF39efd3b4b50F2; // EllipticToken instance
    address constant ALICE = 0xA11CE84AcB91Ac59B0A4E2945C9157eF3Ab17D4e;

    function setUp() public {}

    function run() public {
        uint256 playerKey = vm.envUint("USER_PRIVATE_KEY");
        address player = vm.addr(playerKey);

        vm.startBroadcast(playerKey);

        Solve solve = new Solve(target);

        // Spoofed signature for Alice over bytes32(amount)
        bytes32 r = 0xd3433fe216c991674d4c7e2186460a412b91c976c44569433a0985dffc099b02;
        bytes32 s = 0x16417451991575e0cdfc4aaff865deb0843abf95f606aed775fda4e40e047e14;
        uint8 v = 27;
        uint256 amount = uint256(0x59e540931475e32e9ace9d434a5667767f569cd3c8316ea28398398bac06df55);
        bytes memory aliceSpoofedSignature = abi.encodePacked(r, s, v);

        // Spender acceptance signature: keccak256(abi.encodePacked(tokenOwner, spender, amount))
        bytes32 permitAcceptHash = keccak256(abi.encodePacked(ALICE, player, amount));
        (uint8 v2, bytes32 r2, bytes32 s2) = vm.sign(playerKey, permitAcceptHash);
        bytes memory playerPermitAcceptanceSignature = abi.encodePacked(r2, s2, v2);

        // Approve allowance from Alice to player via broken permit
        solve.attack(amount, player, aliceSpoofedSignature, playerPermitAcceptanceSignature);

        // Drain Alice's balance
        IEllipticToken(target).transferFrom(ALICE, player, 10 ether);

        vm.stopBroadcast();
    }
}