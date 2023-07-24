#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/mman.h>

#define SHELLCODE_SIZE 0x100

int main() {
    char shellcode[SHELLCODE_SIZE];
    printf("Give your shellcode in %d bytes: ", SHELLCODE_SIZE);
    fgets(shellcode, SHELLCODE_SIZE, stdin);

    shellcode[strcspn(shellcode, "\n")] = '\0';

    void *executableMemory = mmap(NULL, SHELLCODE_SIZE, PROT_READ | PROT_WRITE | PROT_EXEC, MAP_ANONYMOUS | MAP_PRIVATE, -1, 0);
    if (executableMemory == MAP_FAILED) {
        perror("Failed to allocate executable memory");
        return 1;
    }

    memcpy(executableMemory, shellcode, strlen(shellcode));

    // 실행
    ((void (*)())executableMemory)();

    munmap(executableMemory, SHELLCODE_SIZE);

    return 0;
}
