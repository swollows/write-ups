#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>


#define BUFFER_SIZE 100

int main() {
    setvbuf(stdout, NULL, _IONBF, 0);
    setvbuf(stdin, NULL, _IONBF, 0);
    setvbuf(stderr, NULL, _IONBF, 0);

    srand(time(NULL));

    int fd_flag = open("./flag", O_RDONLY);
    if (fd_flag < 0) {
        perror("Failed to open ./flag");
        return 1;
    }

    unsigned char flag[4];

    while (1){
        int read_len = read(fd_flag, &flag, 4);
        if (read_len <= 0){
            break;
        }

        for (int i = 0; i < rand() % 4000; i++) {
            printf("%1x",rand() % 256);
        }
        putchar(':');
        write(1, flag, read_len);
    }

    return 0;
}
