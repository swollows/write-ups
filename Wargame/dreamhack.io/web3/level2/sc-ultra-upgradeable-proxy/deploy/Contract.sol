// SPDX-License-Identifier: MIT
pragma solidity >=0.8.0 <=0.8.23;

contract Level {
    // From keccak256("dreamhack.implementation") - 1
    bytes32 internal constant _IMPLEMENTATION_SLOT = 0xe42c5c6142bc82b8fa22c7919878f7ce9cd01d0030edebda258d89fa63c9f56f;

    struct AddressSlot {
        address value;
    }

    constructor (address addr) {
        _getAddressSlot(_IMPLEMENTATION_SLOT).value = addr;

        (bool success, ) = addr.delegatecall(abi.encodeWithSignature("initialize()"));
        require(success, "Failed to initialize");
    }


    function _getAddressSlot(bytes32 slot) internal pure returns (AddressSlot storage r) {
        assembly {
            r.slot := slot
        }
    }

    fallback(bytes calldata data) external payable returns (bytes memory) {
        address addr = _getAddressSlot(_IMPLEMENTATION_SLOT).value;
        (bool success, bytes memory ret) = addr.delegatecall(data);
        require(success, "Failed to delegatecall");
        return ret;
    }
}

contract UltraUPS {
    // From keccak256("dreamhack.implementation") - 1
    bytes32 internal constant _IMPLEMENTATION_SLOT = 0xe42c5c6142bc82b8fa22c7919878f7ce9cd01d0030edebda258d89fa63c9f56f;

    address proxyOwner;
    bool initialized;

    struct AddressSlot {
        address value;
    }

    function _getAddressSlot(bytes32 slot) internal pure returns (AddressSlot storage r) {
        assembly {
            r.slot := slot
        }
    }

    function ping() external pure returns (string memory) {
        return "pong";
    }

    function initialize() external {
        require(!initialized, "Already initialized");
        proxyOwner = msg.sender;
        initialized = true;
    }

    function upgradeToAndCall(address newAddress, bytes memory data) external payable {
        require(proxyOwner == msg.sender, "You are not owner");
        _getAddressSlot(_IMPLEMENTATION_SLOT).value = newAddress;

        if (data.length > 0) {
            (bool success, ) = newAddress.delegatecall(data);
            require(success, "Failed to setup new implementation");
        } else {
            require(msg.value == 0, "This is non-payable");
        }
    }
}
