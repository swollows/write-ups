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

    unsigned int a = 0x20;
    unsigned int b;
    unsigned int c = 0x30;
    char buf[0x40];

    printf("Enter your number: ");
    scanf("%u", &b);

    printf("a + b = %u\n", a + b);
    
    if( a+b < 0x30){
        read(0, buf, b);
    }
    if (!strncmp(&buf[0x30],"AAAAAAAAAAAAAAAA", 0x10)) {
        win();
        exit(0);
    }
    printf("no corruption...\n");
   
    return 0;
}