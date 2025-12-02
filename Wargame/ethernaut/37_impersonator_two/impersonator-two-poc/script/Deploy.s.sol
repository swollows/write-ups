// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import {Script} from "forge-std/Script.sol";
import "../src/Solve.sol";

contract Deploy is Script {
    // Constants from ImpersonatorTwoFactory
    address constant OWNER = 0x03E2cf81BBE61D1fD1421aFF98e8605a5A9e953a;
    address constant ADMIN = 0xADa4aFfe581d1A31d7F75E1c5a3A98b2D4C40f68;
    bytes32 constant R_SHARED = 0xe5648161e95dbf2bfc687b72b745269fa906031e2108118050aba59524a23c40;
    bytes32 constant S_SWITCHLOCK = 0x70026fc30e4e02a15468de57155b080f405bd5b88af05412a9c3217e028537e3;
    bytes32 constant S_SETADMIN  = 0x4c3ac03b268ae1d2aca1201e8a936adf578a8b95a49986d54de87cd0ccb68a79;

    // Secp256k1 curve order
    uint256 constant N = 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141;

    function setUp() public {}

    function run() public {
        address instance = 0x3E69aeCb6a5abAc2D87d6707649E2fB0173ee2Da;
        uint256 playerKey = vm.envUint("USER_PRIVATE_KEY");
        address player = vm.addr(playerKey);


        // 1) Reconstruct message digests used in factory with reused nonce (r collision)
        bytes memory m1 = abi.encodePacked("lock", "0");
        bytes32 z1 = ethSignedMessageHash(m1);

        bytes memory m2 = abi.encodePacked("admin", "1", ADMIN);
        bytes32 z2 = ethSignedMessageHash(m2);

        // 2) Recover owner's private key from (r, s1, s2, z1, z2)
        uint256 ownerPrivKey = derivePrivateKey(uint256(R_SHARED), uint256(S_SWITCHLOCK), uint256(S_SETADMIN), uint256(z1), uint256(z2));
        require(vm.addr(ownerPrivKey) == OWNER, "derived owner key mismatch");

        // 3) Start broadcast and deploy receiver
        vm.startBroadcast(playerKey);
        Solve solve = new Solve();

        // 4) Prepare signatures with correct sequential nonces and actual newAdmin (solve)
        uint256 currentNonce = IImpersonatorTwo(instance).nonce();
        bytes memory setAdminMsg = abi.encodePacked("admin", toString(currentNonce), address(solve));
        bytes32 setAdminHash = ethSignedMessageHash(setAdminMsg);
        (uint8 vA, bytes32 rA, bytes32 sA) = vm.sign(ownerPrivKey, setAdminHash);
        bytes memory setAdminSig = abi.encodePacked(rA, sA, vA);

        uint256 nextNonce = currentNonce + 1;
        bytes memory switchMsg = abi.encodePacked("lock", toString(nextNonce));
        bytes32 switchHash = ethSignedMessageHash(switchMsg);
        (uint8 vB, bytes32 rB, bytes32 sB) = vm.sign(ownerPrivKey, switchHash);
        bytes memory switchSig = abi.encodePacked(rB, sB, vB);

        // 5) Execute: set admin -> unlock -> withdraw -> sweep
        solve.setAdminWithSignature(instance, setAdminSig, address(solve));
        solve.switchLockWithSignature(instance, switchSig);
        solve.withdrawFrom(instance);
        solve.sweep(player);

        vm.stopBroadcast();
    }

    // --------- math & utils ----------
    function derivePrivateKey(uint256 r, uint256 s1, uint256 s2, uint256 z1, uint256 z2) internal pure returns (uint256) {
        // k = (z1 - z2) * (s1 - s2)^-1 mod N
        uint256 sDiff = modSub(s1, s2, N);
        uint256 zDiff = modSub(z1, z2, N);
        uint256 k = mulmod(zDiff, modInv(sDiff, N), N);
        // priv = (s1*k - z1) * r^-1 mod N
        uint256 rk = mulmod(s1, k, N);
        uint256 numerator = modSub(rk, z1, N);
        uint256 priv = mulmod(numerator, modInv(r % N, N), N);
        return priv;
    }

    function ethSignedMessageHash(bytes memory message) internal pure returns (bytes32) {
        return keccak256(abi.encodePacked("\x19Ethereum Signed Message:\n", toString(message.length), message));
    }

    function modSub(uint256 a, uint256 b, uint256 m) internal pure returns (uint256) {
        return addmod(a, m - (b % m), m);
    }

    function modInv(uint256 a, uint256 m) internal pure returns (uint256) {
        require(a % m != 0, "no inverse");
        return modPow(a, m - 2, m); // Fermat's little theorem (m is prime)
    }

    function modPow(uint256 base, uint256 exponent, uint256 modulus) internal pure returns (uint256 result) {
        if (modulus == 1) return 0;
        result = 1 % modulus;
        uint256 b = base % modulus;
        uint256 e = exponent;
        while (e > 0) {
            if (e & 1 == 1) {
                result = mulmod(result, b, modulus);
            }
            b = mulmod(b, b, modulus);
            e >>= 1;
        }
    }

    function toString(uint256 value) internal pure returns (string memory) {
        if (value == 0) {
            return "0";
        }
        uint256 temp = value;
        uint256 digits;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        bytes memory buffer = new bytes(digits);
        while (value != 0) {
            digits -= 1;
            buffer[digits] = bytes1(uint8(48 + uint256(value % 10)));
            value /= 10;
        }
        return string(buffer);
    }
}