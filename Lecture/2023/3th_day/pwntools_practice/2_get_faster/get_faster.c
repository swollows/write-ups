#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <unistd.h>

#define MAX_ROUNDS 10
#define TIMEOUT_SECONDS 1

int main() {
    setvbuf(stdout, NULL, _IONBF, 0);
    setvbuf(stdin, NULL, _IONBF, 0);
    setvbuf(stderr, NULL, _IONBF, 0);
    
    
    srand(time(NULL));
    int i;
    int number;
    char input[100];
    int success = 1;

    printf("Enter the same number within %d second(s): \n", TIMEOUT_SECONDS);
    // Generate and display random numbers
    for (i = 0; i < MAX_ROUNDS; i++) {
        number = rand();
        printf("%d\n", number);

        // Set the timer
        time_t start_time = time(NULL);
        int elapsed_seconds = 0;

        fgets(input, sizeof(input), stdin);
        if (atoi(input) != number) {
            printf("Failed to match the number. Exiting...\n");
            success = 0;
            break;
        }
        elapsed_seconds = time(NULL) - start_time;
        // Break the loop if failed to match the number within the timeout
        if (elapsed_seconds >= TIMEOUT_SECONDS) {
            printf("Failed to match the number within the given time. Exiting...\n");
            success = 0;
            break;
        }
    }

    // Check if the user was successful
    if (success) {
        // Read and print the contents of the "flag" file
        FILE* file = fopen("flag", "r");
        if (file != NULL) {
            printf("\nContents of the 'flag' file:\n");
            char ch;
            while ((ch = fgetc(file)) != EOF) {
                putchar(ch);
            }
            fclose(file);
        } else {
            printf("Failed to open the 'flag' file.\n");
        }
    }

    return 0;
}
