// gcc -o ls_program ls_program.c

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

    // Check if the input contains ";"
    if (strstr(buf, ";") != NULL) {
        printf("No hack -_-\n");
        exit(0);
    }


   // Construct the command
    char command[120];
    snprintf(command, sizeof(command), "ls -al %s", buf);



    printf("Executing system(\"%s\");\n", command);
    // Execute the command using system
    system(command);
    
    return 0;
}