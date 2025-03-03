// SPDX-License-Identifier: MIT
pragma solidity >=0.8.0;

contract Challenge {
    uint256 public solved;

    bool private constant HARDCODED_BOOL = true;
    uint8 private constant HARDCODED_UINT8 = 255;
    uint16 private constant HARDCODED_UINT16 = type(uint16).max;
    uint32 private constant HARDCODED_UINT32 = type(uint32).max;
    uint64 private constant HARDCODED_UINT64 = type(uint64).max;
    uint128 private constant HARDCODED_UINT128 = type(uint128).max;
    address private constant HARDCODED_ADDRESS = 0x1234567890123456789012345678901234567890;
    uint256 private constant HARDCODED_UINT256 = type(uint256).max;
    int256 private constant HARDCODED_INT256 = type(int256).min;
    bytes3 private constant HARDCODED_BYTES3 = 0x414243;
    string private constant HARDCODED_STRING = "Hello";
    uint256[] private HARDCODED_ARRAY = [1, 2, 3, 4, 5];
    uint256[][] private HARDCODED_2D_ARRAY = [[1, 2], [3, 4], [5, 6]];

    function f(
        uint64 _uint64,
        bool _bool,
        uint256[][] memory _2dArray,
        int256 _int256,
        uint16 _uint16,
        bytes3 _bytes3,
        uint256 _uint256,
        address _address,
        uint32 _uint32,
        string memory _string,
        uint128 _uint128,
        uint8 _uint8,
        uint256[] memory _array
    ) external  {
        if (_uint32 != HARDCODED_UINT32) revert("1");
        if (_int256 != HARDCODED_INT256) revert("2");
        if (_bool != HARDCODED_BOOL) revert("3");
        if (_uint16 != HARDCODED_UINT16) revert("4");
        if (keccak256(abi.encodePacked(_string)) != keccak256(abi.encodePacked(HARDCODED_STRING))) revert("5");
        if (_uint64 != HARDCODED_UINT64) revert("6");
        if (_address != HARDCODED_ADDRESS) revert("7");
        if (_uint8 != HARDCODED_UINT8) revert("8");
        if (_bytes3 != HARDCODED_BYTES3) revert("9");
        if (_uint128 != HARDCODED_UINT128) revert("10");
        if (_uint256 != HARDCODED_UINT256) revert("11");

        if (_array.length != HARDCODED_ARRAY.length) revert("12");
        for (uint i = 0; i < _array.length; i++) {
            if (_array[i] != HARDCODED_ARRAY[i]) revert("13");
        }

        if (_2dArray.length != HARDCODED_2D_ARRAY.length) revert("14");
        for (uint i = 0; i < _2dArray.length; i++) {
            if (_2dArray[i].length != HARDCODED_2D_ARRAY[i].length) revert("15");
            for (uint j = 0; j < _2dArray[i].length; j++) {
                if (_2dArray[i][j] != HARDCODED_2D_ARRAY[i][j]) revert("16");
            }
        }

        solved = 1;
    }
}
