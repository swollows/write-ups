#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>

int main() {
    setvbuf(stdout, NULL, _IONBF, 0);
    setvbuf(stdin, NULL, _IONBF, 0);
    setvbuf(stderr, NULL, _IONBF, 0);

    int command_len;
    printf("How long is your command: ");
    scanf("%d",&command_len);

    if (command_len > 5){
        printf("Too long!\n");
        return 1;
    }    

    char buf[100];
    printf("Enter a command: ");
    read(0, buf, (unsigned)command_len+1); 

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