package main

import (
	"fmt"
)

func getMultiplicativeGroup(n uint) (group []uint, generators []uint) {
	// gcd 함수: 유클리드 알고리즘을 사용
	gcd := func(a, b uint) uint {
		for b != 0 {
			a, b = b, a%b
		}
		return a
	}

	// 1부터 n-1까지 돌면서, n과 서로소인 수들을 group에 추가
	for i := uint(1); i < n; i++ {
		if gcd(i, n) == 1 {
			group = append(group, i)
		}
	}

	// 그룹의 크기는 오일러 피 함수 φ(n)과 동일 (즉, 그룹의 위수)
	phi := uint(len(group))

	// 각 원소 g에 대해, g의 순서를 구하여 만약 순서(order)가 phi와 같다면 생성원임
	for _, g := range group {
		res := uint(1)
		order := uint(0)
		// g^order mod n 계산 (초기값 res = 1, order = 0)
		for {
			order++
			res = (res * g) % n
			if res == 1 {
				break
			}
			// 안전장치: order가 phi를 초과하면 탈출
			if order > phi {
				break
			}
		}
		// 만약 g의 순서가 전체 그룹의 위수와 같다면, g는 생성원
		if order == phi {
			generators = append(generators, g)
		}
	}

	return group, generators
}

func main() {
	n := uint(11)
	group, gens := getMultiplicativeGroup(n)
	fmt.Printf("n = %d\n", n)
	fmt.Printf("Multiplicative Group: %v\n", group)
	fmt.Printf("Generators: %v\n", gens)
}
