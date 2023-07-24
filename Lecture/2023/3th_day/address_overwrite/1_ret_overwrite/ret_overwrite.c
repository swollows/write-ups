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

    
    char buf[0x30] = {0};    
    gets(buf);

    printf("no corruption...?\n");
   
    return 0;
}