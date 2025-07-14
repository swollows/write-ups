#include <cstdio>

int main() {
    int n, h, a, b;
    
    // 첫 번째 숫자만 읽어보기
    if (scanf("%d", &n) != 1) {
        printf("Failed to read n\n");
        return 1;
    }
    
    // n이 이상한 값인지 확인
    if (n < 0 || n > 100000) {
        printf("n is out of range: %d\n", n);
        return 1;
    }
    
    // 나머지 값들 읽기
    if (scanf("%d %d %d", &h, &a, &b) != 3) {
        printf("Failed to read h, a, b\n");
        return 1;
    }
    
    // 간단한 경우만 처리
    if (n == 0) {
        printf("0\n");
        return 0;
    }
    
    // 일단 0 출력
    printf("0\n");
    
    return 0;
} 