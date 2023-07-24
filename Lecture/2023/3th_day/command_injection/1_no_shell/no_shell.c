// gcc -o no_shell no_shell.c

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


    // Check if the input contains "bin", "sh", or "/"
    if (strstr(buf, "bin") != NULL || strstr(buf, "sh") != NULL || strstr(buf, "/") != NULL) {
        printf("No hack -_-\n");
        exit(0);
    }
    
    printf("Executing system(\"%s\");\n", buf); 
    // Execute the command using system
    system(buf);
    
    return 0;
}