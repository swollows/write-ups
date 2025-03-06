// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import {IErrors} from "../interfaces/IErrors.sol";

contract MessageVaultFacet {
    event ETHDeposited(address indexed owner, uint256 amount, bytes msg);
    event ETHWithdrawn(address indexed owner, uint256 amount, bytes msg);
    event SetFee(uint256 indexed feePercentage);
    event OnlySendMsg(bytes msg);

    bytes32 constant DIAMOND_STAND_STORE_POS = 0xc8fcad8db84d3cc18b4c41d551ea0ee66dd599cde068d998e57d5e09332c131c; // diamond.standard.diamond.storage
    bytes32 constant MSG_VAULT_STORE_POS = 0xdffd15b7cbcb32988993bef560e47934f70e45a5a0e6f674728a009bbec74eb3; // diamond.standard.vault.storage
    bytes32 constant MSG_VAULT_SECURITY_POS = 0x1bebb02875ae29ae4ff4aa79c31b214d9445e1377e8b8e4f493d043d473dcb57; // diamond.standard.vault.security.storage
    uint256 constant MAGIC_OFFSET = 0xc0;
    uint256 constant LAYOUT_MEM_OFFSET = 0x20;
    uint256 constant MSG_LEN_MAX = 0x12c;
    uint256 constant MSG_LEN_MIN = 0x40;
    uint256 constant MSG_SYM = 0x757073696465;

    struct Re_entrancy_security {
        bool entered;
    }

    struct VaultStorage {
        mapping(address => uint256) balances;
        uint256 totalSupply;
        uint256 feePercentage;
    }

    struct facet_addr_and_selector_pos {
        address facetAddress;
        uint96 selectorPosition;
    }

    struct DiamondStorage {
        mapping(bytes4 => facet_addr_and_selector_pos) facet_addr_and_selector_pos;
        address[] facetAddresses;
        mapping(bytes4 => bool) supportedInterfaces;
        address contractOwner;
    }

    function deposit_eth_and_sendMsg(bytes calldata _msg) external payable {
        if (msg.value == 0) {
            revert IErrors.DepositAmountMustBeGreaterThanZero();
        }
        VaultStorage storage vs = vaultStorage();
        uint256 fee = (msg.value * vs.feePercentage) / 10000;
        uint256 netAmount = msg.value - fee;
        vs.balances[msg.sender] += netAmount;
        vs.totalSupply += msg.value;
        emit ETHDeposited(msg.sender, netAmount, _msg);
    }

    function withdraw_eth_and_sendMsg(uint256 _amount, bytes calldata _msg) external {
        uint256 saveFreePtr = getFreePtr();
        non_re_entrant_before();
        VaultStorage storage vs = vaultStorage();
        if (_amount == 0) {
            revert IErrors.WithdrawalAmountMustBeGreaterThanZero();
        }
        if (vs.balances[msg.sender] < _amount) {
            revert IErrors.InsufficientBalance();
        }
        uint256 fee = (_amount * vs.feePercentage) / 10000;
        uint256 netAmount = _amount - fee;
        vs.balances[msg.sender] -= _amount;
        vs.totalSupply -= _amount;
        (bool success,) = payable(msg.sender).call{value: netAmount}("");
        if (!success) {
            revert IErrors.TransferFailed();
        }
        non_reentrant_after();
        restoreFreePtr(saveFreePtr);
        emit ETHWithdrawn(msg.sender, netAmount, _msg);
    }

    function getContractBalance() external view returns (uint256) {
        VaultStorage storage vs = vaultStorage();
        return vs.totalSupply;
    }

    function only_sendMsg(bytes calldata _msg) external {
        uint256 saveFreePtr = getFreePtr();
        non_re_entrant_before();
        validateMessage(_msg);
        bytes memory message = _msg;

        address msg_ca;
        assembly {
            msg_ca := create(0, add(message, 0x20), mload(message))
        }
        if (msg_ca == address(0)) {
            revert IErrors.ContractDeploymentFailed();
        }
        (bool success, bytes memory __msg) = (msg_ca).delegatecall("");
        if (!success) {
            revert IErrors.ContractExecutionFailed();
        }
        non_reentrant_after();
        restoreFreePtr(saveFreePtr);
        emit OnlySendMsg(__msg);
    }

    function withdraw_all_eth_and_sendMsg(bytes calldata _msg) external {
        uint256 saveFreePtr = getFreePtr();
        non_re_entrant_before();
        VaultStorage storage vs = vaultStorage();
        uint256 amount = vs.balances[msg.sender];
        if (amount == 0) {
            revert IErrors.NoBalanceToWithdraw();
        }
        uint256 fee = (amount * vs.feePercentage) / 10000;
        uint256 netAmount = amount - fee;
        vs.balances[msg.sender] = 0;
        vs.totalSupply -= amount;
        (bool success,) = payable(msg.sender).call{value: netAmount}("");
        if (!success) {
            revert IErrors.TransferFailed();
        }
        non_reentrant_after();
        restoreFreePtr(saveFreePtr);
        emit ETHWithdrawn(msg.sender, netAmount, _msg);
    }

    function deposit_eth_and_sendMsg_For(address _beneficiary, bytes calldata _msg) external payable {
        if (_beneficiary == address(0)) {
            revert IErrors.CannotDepositToZeroAddress();
        }
        if (msg.value == 0) {
            revert IErrors.DepositAmountMustBeGreaterThanZero();
        }
        VaultStorage storage vs = vaultStorage();
        uint256 fee = (msg.value * vs.feePercentage) / 10000;
        uint256 netAmount = msg.value - fee;
        vs.balances[_beneficiary] += netAmount;
        vs.totalSupply += msg.value;
        emit ETHDeposited(_beneficiary, netAmount, _msg);
    }

    function setFee(uint256 _feePercentage) external {
        IsContractOwner();
        if (_feePercentage < 3000) {
            revert IErrors.FeePercentageTooLow();
        }
        if (_feePercentage > 10000) {
            revert IErrors.FeePercentageTooHigh();
        }
        vaultStorage().feePercentage = _feePercentage;
        emit SetFee(_feePercentage);
    }

    function getFee() external view returns (uint256) {
        return vaultStorage().feePercentage;
    }

    function balanceOf(address _owner) external view returns (uint256) {
        return vaultStorage().balances[_owner];
    }

    function totalSupply() external view returns (uint256) {
        return vaultStorage().totalSupply;
    }

    function vaultStorage() internal pure returns (VaultStorage storage vs) {
        bytes32 pos = MSG_VAULT_STORE_POS;
        assembly {
            vs.slot := pos
        }
    }

    function diamondStorage() internal pure returns (DiamondStorage storage ds) {
        bytes32 pos = DIAMOND_STAND_STORE_POS;
        assembly {
            ds.slot := pos
        }
    }

    function IsContractOwner() internal view {
        if (msg.sender != diamondStorage().contractOwner) {
            revert IErrors.MustBeContractOwner();
        }
    }

    function validateMessage(bytes calldata _message) public view {
        uint256 msg_len = _message.length;

        if (msg_len > MSG_LEN_MAX || msg_len < MSG_LEN_MIN) {
            revert IErrors.InvalidPayload();
        }
        (address _owner) = _decode_data_owner(_message, MAGIC_OFFSET);

        if (_owner != msg.sender) {
            revert IErrors.InvalidOwner();
        }

        _data_sym_validation(_message, MAGIC_OFFSET);
    }

    function _decode_data_owner(bytes memory message, uint256 _offset) public pure returns (address owner) {
        bytes memory _msg = message;

        assembly {
            owner := mload(add(_msg, sub(_offset, LAYOUT_MEM_OFFSET)))
        }

        return (owner);
    }

    function _data_sym_validation(bytes memory message, uint256 _offset) public pure {
        bytes memory _msg = message;
        bytes memory symbol;
        assembly {
            symbol := mload(add(_msg, _offset))
            if iszero(eq(symbol, MSG_SYM)) { revert(0, 0) }
        }
    }

    function _re_entrancy_security() internal pure returns (Re_entrancy_security storage rs) {
        bytes32 pos = MSG_VAULT_SECURITY_POS;
        assembly {
            rs.slot := pos
        }
    }

    function non_re_entrant_before() internal {
        Re_entrancy_security storage _rs = _re_entrancy_security();
        if (_rs.entered) revert IErrors.ReentrantCall();
        _rs.entered = true;
    }

    function non_reentrant_after() internal {
        Re_entrancy_security storage _rs = _re_entrancy_security();
        _rs.entered = false;
    }

    function getFreePtr() internal pure returns (uint256 ptr) {
        assembly ("memory-safe") {
            ptr := mload(0x40)
        }
    }

    function restoreFreePtr(uint256 ptr) internal pure {
        assembly ("memory-safe") {
            mstore(0x40, ptr)
        }
    }
}
