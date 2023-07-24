#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <stdint.h>

void win() {
    system("cat flag"); // cat flag
}

int main() {
    setvbuf(stdout, NULL, _IONBF, 0);
    setvbuf(stdin, NULL, _IONBF, 0);
    setvbuf(stderr, NULL, _IONBF, 0);

    unsigned int a;
    unsigned int b;
    printf("Enter your numbers: ");
    scanf("%u %u", &a, &b);

    printf("a + b = %u\n", a + b);
    printf("a = %u\n", a);
    
    if( a+b < a){
        win();
    }
    printf("no overflow...\n");
   
    return 0;
}