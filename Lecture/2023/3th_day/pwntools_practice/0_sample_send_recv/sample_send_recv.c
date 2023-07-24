#include <stdio.h>
#include <stdlib.h>

int main() {
    setvbuf(stdout, NULL, _IONBF, 0);
    setvbuf(stdin, NULL, _IONBF, 0);
    setvbuf(stderr, NULL, _IONBF, 0);


    int i;
    char input[100];

    // Receive input from the user 3 times
    for (i = 0; i < 3; i++) {
        printf("Enter input %d: ", i + 1);
        fgets(input, sizeof(input), stdin);
        printf("You entered: %s", input);
    }

    // Read and print the contents of the "flag" file
    FILE* file = fopen("./flag", "r");
    if (file != NULL) {
        printf("\nContents of the 'flag' file:\n");
        char ch;
        while ((ch = fgetc(file)) != EOF) {
            putchar(ch);
        }
        putchar('\n');
        fclose(file);
    } else {
        printf("Failed to open the 'flag' file.\n");
    }

    return 0;
}
