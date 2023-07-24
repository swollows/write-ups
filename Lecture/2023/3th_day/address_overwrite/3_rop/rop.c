#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <stdint.h>

char binsh[] = "/bin/sh";
char sh[] = "sh";

void no_win() {
    system("ls"); 
}



int main() {
    setvbuf(stdout, NULL, _IONBF, 0);
    setvbuf(stdin, NULL, _IONBF, 0);
    setvbuf(stderr, NULL, _IONBF, 0);

    no_win();
    
    char buf[0x30] = {0};    
    gets(buf);

    printf("no corruption...?\n");
   
    return 0;
}