// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

interface IErrors {
    error zeroAddress();
    error MustBeContractOwner();
    error IncorrectFacetDiamondCutAction();
    error AddFacetCanNotBeZeroAddress();
    error CanNotAddFunctionThatAlreadyExists();
    error ReplaceFacetCanNotBeZeroAddress();
    error CanNotReplaceFunctionWithSameFunction();
    error CanNotReplaceFunctionThatDoesNotExist();
    error RemoveFacetAddressMustBeZeroAddress();
    error CanNotRemoveFunctionThatDoesNotExist();
    error InitIsZeroAddressButCalldataIsNotEmpty();
    error CalldataIsEmptyButInitIsNotZeroAddress();
    error InitAddressHasNoCode();
    error InitFunctionReverted();
    error FunctionDoesNotExist();
    error ContractDeploymentFailed();
    error ContractExecutionFailed();
    error InvalidPayload();
    error InvalidOwner();
    error DepositAmountMustBeGreaterThanZero();
    error WithdrawalAmountMustBeGreaterThanZero();
    error InsufficientBalance();
    error NoBalanceToWithdraw();
    error CannotDepositToZeroAddress();
    error FeePercentageTooHigh();
    error ReentrantCall();
    error TransferFailed();
    error FeePercentageTooLow();
    error MustNotBeZeroAddress();
}
