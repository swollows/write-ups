#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>


void null_sub(void* a, void *b, void* c, void* d, void* e, void* f){
    return ;
}

int main(int argc, char *argv[]) {
    setvbuf(stdin, NULL, _IONBF, 0);
    setvbuf(stdout, NULL, _IONBF, 0);

    char buf[16];

    printf("stdout: %p\n", stdout);
    printf("buf: ");
    read(0, buf, 120);
    
    null_sub(0,0,0,0,0,0);
    return 0;
}
