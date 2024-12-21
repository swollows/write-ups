package main

import (
	"bytes"
	"github.com/consensys/gnark-crypto/ecc"
	"github.com/consensys/gnark/backend/groth16"
	"github.com/consensys/gnark/frontend"
	"os"
)

type Circuit struct {
	Secret    frontend.Variable
	Nullifier frontend.Variable `gnark:",public"`

	WalletIndex  frontend.Variable `gnark:",public"`
	WalletSanity frontend.Variable
}

func (circuit *Circuit) Define(api frontend.API) error {
	api.AssertIsEqual(api.Mul(api.Mul(api.Mul(api.Mul(circuit.Secret, circuit.Secret), circuit.Secret), circuit.Secret), circuit.Secret), circuit.Nullifier)
	api.AssertIsEqual(api.Mul(circuit.Secret, circuit.WalletIndex), circuit.Nullifier)    // wallet index
	api.AssertIsEqual(api.Add(circuit.WalletIndex, circuit.WalletSanity), circuit.Secret) // wallet index / sanity check
	return nil
}

func main() {
	var _ Circuit
	vkBytes, err := os.ReadFile("./verifying.key")
	if err != nil {
		panic(err)
	}

	vk := groth16.NewVerifyingKey(ecc.BN254)
	vk.ReadFrom(bytes.NewReader(vkBytes))

	file, err := os.Create("verifier.sol")
	if err != nil {
		panic(err)
	}
	defer file.Close()
	err = vk.ExportSolidity(file)
	if err != nil {
		panic(err)
	}
}
