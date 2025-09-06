
#define IS_INTERNAL_CODESIGNING 0

int16_t minivm_sys_getSystemSecret(minivm_t *vm, uint8_t sys_nr) {
#if IS_INTERNAL_CODESIGNING
    memcpy(&vm->memdata[2], "flag{fakeflagfortesting}", 25);
    return 0;
#else
    vm->running = false;
    vm->return_code = 0x4f4e;
    return 0;
#endif
}

void timeout_handler(int signum) {
    puts("Run time limit exceeded!");
    exit(1);
}


int main() {
    pkg_t pkg;
    minivm_t vm;

    setvbuf(stdin, NULL, _IONBF, 0);
    setvbuf(stdout, NULL, _IONBF, 0);
    setvbuf(stderr, NULL, _IONBF, 0);

    signal(SIGALRM, timeout_handler);

    fputs("Welcome to the SC-1 code signing server!\n"
        "Please send base64-encoded pkg: ", stdout);
    if (!base64_readl(&pkg, sizeof(pkg)))
        return 0;

    minivm_init(&vm);
    minivm_register_syscall(&vm, 0x53, &minivm_sys_getSystemSecret);

    puts("Analysing binary...");
    if (!pkg_load(&pkg, &vm)) {
        puts("Failed to load pkg!");
        return 0;
    }

    puts("Output:\n--------");
    alarm(5);
    minivm_run(&vm);
    alarm(0);
    puts("\n--------\nExited.");

    if (vm.return_code) {
        if (vm.return_code == 0x4f4e)
            puts("Sorry, only first party games can use restricted syscalls.");
        else
            puts("Something went wrong with your code!");
        return 1;
    }

    puts("Binary okay! Signing pkg...");
    pkg_sign(&pkg, &retail_privkey);

    fputs("Signed pkg: ", stdout);
    base64_print(&pkg, pkg_len(&pkg));

    return 0;
}
