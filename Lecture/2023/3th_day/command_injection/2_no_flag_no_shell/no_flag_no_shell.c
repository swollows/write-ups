// gcc -o no_flag_no_shell no_flag_no_shell.c

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    setvbuf(stdout, NULL, _IONBF, 0);
    setvbuf(stdin, NULL, _IONBF, 0);
    setvbuf(stderr, NULL, _IONBF, 0);


    char buf[100];
    printf("Enter a command: ");
    fgets(buf, sizeof(buf), stdin);
    
    // erase "\n"
    buf[strlen(buf)-1] = 0;

    // Check if the input contains "flag", "/", or "bin"
    if (strstr(buf, "flag") != NULL || strstr(buf, "/") != NULL || strstr(buf, "bin") != NULL) {
        printf("No hack -_-\n");
        exit(0);
    }
    
    printf("Executing system(\"%s\");\n", buf); 
    // Execute the command using system    
    system(buf);
    
    return 0;
}