#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>
#include <string.h>

unsigned long pac_secret = 0;

__attribute__((constructor))
void init_pac() {
    int fd = open("/dev/urandom", O_RDONLY);
    read(fd, &pac_secret, sizeof(pac_secret));
    close(fd);
}

static inline
void protect() {
    __asm__ ("ldr x8, %0" : : "m"(pac_secret): "x8");
    __asm__ ("eor lr, lr, x8");
    __asm__ ("str lr, [sp, #8]");
    __asm__ ("mov x8, xzr");
}

static inline
void unprotect() {
    __asm__ ("ldr lr, [sp, #8]");
    __asm__ ("ldr x8, %0" : : "m"(pac_secret): "x8");
    __asm__ ("eor lr, lr, x8");
    __asm__ ("str lr, [sp, #8]");
    __asm__ ("mov x8, xzr");
}

void warning_gets() {
    protect();
    puts("Note: gets has been deprecated since C11.");
    unprotect();
}

void warning_puts() {
    protect();
    puts("Note: puts is unsafe to use.");
    unprotect();
}

void warning_write() {
    protect();
    puts("Note: write is unsafe to use (even worse than puts!).");
    unprotect();
}

void debug_print_pac(int verbose) {
    protect();
    if (verbose == 0) {
        __asm__ ("ldr x1, [sp, #8]");
        printf("PAC value: %p\n");
    } else {
        __asm__ ("ldr x1, [sp, #8]");
        __asm__ ("ldr x2, %0" : : "m"(pac_secret): "x2");
        __asm__ ("eor x3, x1, x2");
        printf("PAC value (verbose): %p = %p ^ %p\n");
    }
    unprotect();
}

void setup() {
    protect();
    setvbuf(stdin, NULL, _IONBF, 0);
    setvbuf(stdout, NULL, _IONBF, 0);
    setvbuf(stderr, NULL, _IONBF, 0);
    unprotect();
}

void print_menu() {
    protect();
    puts("[1] Test PAC by executing vulnerable functions");
    puts("[2] Debug-print PAC value");
    puts("[3] Exit");
    unprotect();
}

void print_vulnerable_functions() {
    protect();
    puts("[1] gets");
    puts("[2] puts");
    puts("[3] read");
    puts("[4] write");
    unprotect();
}

long read_choice() {
    protect();
    char buf[0x20];
    fgets(buf, 0x20, stdin);
    long n = atol(buf);
    unprotect();
    return n;
}

void exec_vulnerable_functions() {
    protect();
    char buf[0x10];
    print_vulnerable_functions();
    printf("> ");
    long n = read_choice();
    if (n == 1) {
        warning_gets();
    } else if (n == 2) {
        warning_puts();
    } else if (n == 3) {
        read(0, buf, 0x100);
    } else if (n == 4) {
        warning_write();
    } else {
        puts("Invalid choice.");
    }
    unprotect();
}

void main_inner() {
    protect();
    while (1) {
        print_menu();
        printf("> ");
        long n = read_choice();
        if (n == 1) {
            exec_vulnerable_functions();
        } else if (n == 2) {
            puts("Note: Verbose mode is disabled in production builds.");
            debug_print_pac(0);
        } else {
            break;
        }
    }
    unprotect();
}

int main() {
    protect();
    setup();
    main_inner();
    unprotect();
    return 0;
}
