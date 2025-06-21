/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf.raw;

import me.bechberger.ebpf.bpf.raw.Lib_1;

public class Lib
extends Lib_1 {
    private static final int IPOPT_LSRR = 131;
    private static final int IPOPT_TIMESTAMP = 68;
    private static final int IPOPT_CIPSO = 134;
    private static final int IPOPT_RR = 7;
    private static final int IPOPT_SID = 136;
    private static final int IPOPT_SSRR = 137;
    private static final int IPOPT_RA = 148;
    private static final int IPOPT_NOP = 1;
    private static final int IPOPT_EOL = 0;
    private static final int IPOPT_TS = 68;
    private static final int IPV4_DEVCONF_MAX = 33;
    private static final int IPV6_RECVORIGDSTADDR = 74;
    private static final int SOCK_BUF_LOCK_MASK = 3;
    private static final int PF_UNIX = 1;
    private static final int PF_FILE = 1;
    private static final int PF_ROUTE = 16;
    private static final int AF_UNSPEC = 0;
    private static final int AF_LOCAL = 1;
    private static final int AF_UNIX = 1;
    private static final int AF_FILE = 1;
    private static final int AF_INET = 2;
    private static final int AF_AX25 = 3;
    private static final int AF_IPX = 4;
    private static final int AF_APPLETALK = 5;
    private static final int AF_NETROM = 6;
    private static final int AF_BRIDGE = 7;
    private static final int AF_ATMPVC = 8;
    private static final int AF_X25 = 9;
    private static final int AF_INET6 = 10;
    private static final int AF_ROSE = 11;
    private static final int AF_DECnet = 12;
    private static final int AF_NETBEUI = 13;
    private static final int AF_SECURITY = 14;
    private static final int AF_KEY = 15;
    private static final int AF_NETLINK = 16;
    private static final int AF_ROUTE = 16;
    private static final int AF_PACKET = 17;
    private static final int AF_ASH = 18;
    private static final int AF_ECONET = 19;
    private static final int AF_ATMSVC = 20;
    private static final int AF_RDS = 21;
    private static final int AF_SNA = 22;
    private static final int AF_IRDA = 23;
    private static final int AF_PPPOX = 24;
    private static final int AF_WANPIPE = 25;
    private static final int AF_LLC = 26;
    private static final int AF_IB = 27;
    private static final int AF_MPLS = 28;
    private static final int AF_CAN = 29;
    private static final int AF_TIPC = 30;
    private static final int AF_BLUETOOTH = 31;
    private static final int AF_IUCV = 32;
    private static final int AF_RXRPC = 33;
    private static final int AF_ISDN = 34;
    private static final int AF_PHONET = 35;
    private static final int AF_IEEE802154 = 36;
    private static final int AF_CAIF = 37;
    private static final int AF_ALG = 38;
    private static final int AF_NFC = 39;
    private static final int AF_VSOCK = 40;
    private static final int AF_KCM = 41;
    private static final int AF_QIPCRTR = 42;
    private static final int AF_SMC = 43;
    private static final int AF_XDP = 44;
    private static final int AF_MCTP = 45;
    private static final int AF_MAX = 46;
    private static final long __SOCKADDR_COMMON_SIZE = 2L;
    private static final long _SS_PADSIZE = 118L;
    private static final int SO_GET_FILTER = 26;
    private static final int SCM_WIFI_STATUS = 41;
    private static final int SO_DETACH_BPF = 27;
    private static final int SCM_TXTIME = 61;
    private static final int SCM_DEVMEM_LINEAR = 78;
    private static final int SCM_DEVMEM_DMABUF = 79;
    private static final int SO_TIMESTAMP = 29;
    private static final int SO_TIMESTAMPNS = 35;
    private static final int SO_TIMESTAMPING = 37;
    private static final int SO_RCVTIMEO = 20;
    private static final int SO_SNDTIMEO = 21;
    private static final int SCM_TIMESTAMP = 29;
    private static final int SCM_TIMESTAMPNS = 35;
    private static final int SCM_TIMESTAMPING = 37;
    private static final int IFF_VOLATILE = 461914;
    private static final int ICMP_EXT_ECHOREPLY_ACTIVE = 4;
    private static final int ICMP_EXT_ECHOREPLY_IPV4 = 2;
    private static final int TCP_MSS_DEFAULT = 536;
    private static final int TCP_MSS_DESIRED = 1220;
    private static final int TCP_CM_INQ = 36;
    private static final int TCP_REPAIR_OFF_NO_WP = -1;
    private static final int TCPF_CA_Open = 1;
    private static final int TCPF_CA_Disorder = 2;
    private static final int TCPF_CA_CWR = 4;
    private static final int TCPF_CA_Recovery = 8;
    private static final int TCPF_CA_Loss = 16;
    private static final int TCP_AO_KEYF_IFINDEX = 1;
    private static final int TCP_AO_KEYF_EXCLUDE_OPT = 2;
    private static final int IP_RECVRETOPTS = 7;
    private static final int IP_RECVORIGDSTADDR = 20;
    private static final int IN_CLASSA_NET = -16777216;
    private static final int IN_CLASSA_HOST = 0xFFFFFF;
    private static final int IN_CLASSB_NET = -65536;
    private static final int IN_CLASSB_HOST = 65535;
    private static final int IN_CLASSC_NET = -256;
    private static final int IN_CLASSC_HOST = 255;
    private static final int IN_MULTICAST_NET = -536870912;
    private static final int IN_CLASSE_NET = -1;
    private static final long INADDR_ANY = 0L;
    private static final long INADDR_BROADCAST = 0xFFFFFFFFL;
    private static final long INADDR_NONE = 0xFFFFFFFFL;
    private static final long INADDR_DUMMY = 0xC0000008L;
    private static final int INADDR_UNSPEC_GROUP = -536870912;
    private static final int INADDR_ALLHOSTS_GROUP = -536870911;
    private static final int INADDR_ALLRTRS_GROUP = -536870910;
    private static final int INADDR_ALLSNOOPERS_GROUP = -536870806;
    private static final int INADDR_MAX_LOCAL_GROUP = -536870657;
    private static final long __NCPUBITS = 64L;
    private static final int SYS__sysctl = 156;
    private static final int SYS_accept = 43;
    private static final int SYS_accept4 = 288;
    private static final int SYS_access = 21;
    private static final int SYS_acct = 163;
    private static final int SYS_add_key = 248;
    private static final int SYS_adjtimex = 159;
    private static final int SYS_afs_syscall = 183;
    private static final int SYS_alarm = 37;
    private static final int SYS_arch_prctl = 158;
    private static final int SYS_bind = 49;
    private static final int SYS_bpf = 321;
    private static final int SYS_brk = 12;
    private static final int SYS_cachestat = 451;
    private static final int SYS_capget = 125;
    private static final int SYS_capset = 126;
    private static final int SYS_chdir = 80;
    private static final int SYS_chmod = 90;
    private static final int SYS_chown = 92;
    private static final int SYS_chroot = 161;
    private static final int SYS_clock_adjtime = 305;
    private static final int SYS_clock_getres = 229;
    private static final int SYS_clock_gettime = 228;
    private static final int SYS_clock_nanosleep = 230;
    private static final int SYS_clock_settime = 227;
    private static final int SYS_clone = 56;
    private static final int SYS_clone3 = 435;
    private static final int SYS_close = 3;
    private static final int SYS_close_range = 436;
    private static final int SYS_connect = 42;
    private static final int SYS_copy_file_range = 326;
    private static final int SYS_creat = 85;
    private static final int SYS_create_module = 174;
    private static final int SYS_delete_module = 176;
    private static final int SYS_dup = 32;
    private static final int SYS_dup2 = 33;
    private static final int SYS_dup3 = 292;
    private static final int SYS_epoll_create = 213;
    private static final int SYS_epoll_create1 = 291;
    private static final int SYS_epoll_ctl = 233;
    private static final int SYS_epoll_ctl_old = 214;
    private static final int SYS_epoll_pwait = 281;
    private static final int SYS_epoll_pwait2 = 441;
    private static final int SYS_epoll_wait = 232;
    private static final int SYS_epoll_wait_old = 215;
    private static final int SYS_eventfd = 284;
    private static final int SYS_eventfd2 = 290;
    private static final int SYS_execve = 59;
    private static final int SYS_execveat = 322;
    private static final int SYS_exit = 60;
    private static final int SYS_exit_group = 231;
    private static final int SYS_faccessat = 269;
    private static final int SYS_faccessat2 = 439;
    private static final int SYS_fadvise64 = 221;
    private static final int SYS_fallocate = 285;
    private static final int SYS_fanotify_init = 300;
    private static final int SYS_fanotify_mark = 301;
    private static final int SYS_fchdir = 81;
    private static final int SYS_fchmod = 91;
    private static final int SYS_fchmodat = 268;
    private static final int SYS_fchmodat2 = 452;
    private static final int SYS_fchown = 93;
    private static final int SYS_fchownat = 260;
    private static final int SYS_fcntl = 72;
    private static final int SYS_fdatasync = 75;
    private static final int SYS_fgetxattr = 193;
    private static final int SYS_finit_module = 313;
    private static final int SYS_flistxattr = 196;
    private static final int SYS_flock = 73;
    private static final int SYS_fork = 57;
    private static final int SYS_fremovexattr = 199;
    private static final int SYS_fsconfig = 431;
    private static final int SYS_fsetxattr = 190;
    private static final int SYS_fsmount = 432;
    private static final int SYS_fsopen = 430;
    private static final int SYS_fspick = 433;
    private static final int SYS_fstat = 5;
    private static final int SYS_fstatfs = 138;
    private static final int SYS_fsync = 74;
    private static final int SYS_ftruncate = 77;
    private static final int SYS_futex = 202;
    private static final int SYS_futex_requeue = 456;
    private static final int SYS_futex_wait = 455;
    private static final int SYS_futex_waitv = 449;
    private static final int SYS_futex_wake = 454;
    private static final int SYS_futimesat = 261;
    private static final int SYS_get_kernel_syms = 177;
    private static final int SYS_get_mempolicy = 239;
    private static final int SYS_get_robust_list = 274;
    private static final int SYS_get_thread_area = 211;
    private static final int SYS_getcpu = 309;
    private static final int SYS_getcwd = 79;
    private static final int SYS_getdents = 78;
    private static final int SYS_getdents64 = 217;
    private static final int SYS_getegid = 108;
    private static final int SYS_geteuid = 107;
    private static final int SYS_getgid = 104;
    private static final int SYS_getgroups = 115;
    private static final int SYS_getitimer = 36;
    private static final int SYS_getpeername = 52;
    private static final int SYS_getpgid = 121;
    private static final int SYS_getpgrp = 111;
    private static final int SYS_getpid = 39;
    private static final int SYS_getpmsg = 181;
    private static final int SYS_getppid = 110;
    private static final int SYS_getpriority = 140;
    private static final int SYS_getrandom = 318;
    private static final int SYS_getresgid = 120;
    private static final int SYS_getresuid = 118;
    private static final int SYS_getrlimit = 97;
    private static final int SYS_getrusage = 98;
    private static final int SYS_getsid = 124;
    private static final int SYS_getsockname = 51;
    private static final int SYS_getsockopt = 55;
    private static final int SYS_gettid = 186;
    private static final int SYS_gettimeofday = 96;
    private static final int SYS_getuid = 102;
    private static final int SYS_getxattr = 191;
    private static final int SYS_init_module = 175;
    private static final int SYS_inotify_add_watch = 254;
    private static final int SYS_inotify_init = 253;
    private static final int SYS_inotify_init1 = 294;
    private static final int SYS_inotify_rm_watch = 255;
    private static final int SYS_io_cancel = 210;
    private static final int SYS_io_destroy = 207;
    private static final int SYS_io_getevents = 208;
    private static final int SYS_io_pgetevents = 333;
    private static final int SYS_io_setup = 206;
    private static final int SYS_io_submit = 209;
    private static final int SYS_io_uring_enter = 426;
    private static final int SYS_io_uring_register = 427;
    private static final int SYS_io_uring_setup = 425;
    private static final int SYS_ioctl = 16;
    private static final int SYS_ioperm = 173;
    private static final int SYS_iopl = 172;
    private static final int SYS_ioprio_get = 252;
    private static final int SYS_ioprio_set = 251;
    private static final int SYS_kcmp = 312;
    private static final int SYS_kexec_file_load = 320;
    private static final int SYS_kexec_load = 246;
    private static final int SYS_keyctl = 250;
    private static final int SYS_kill = 62;
    private static final int SYS_landlock_add_rule = 445;
    private static final int SYS_landlock_create_ruleset = 444;
    private static final int SYS_landlock_restrict_self = 446;
    private static final int SYS_lchown = 94;
    private static final int SYS_lgetxattr = 192;
    private static final int SYS_link = 86;
    private static final int SYS_linkat = 265;
    private static final int SYS_listen = 50;
    private static final int SYS_listmount = 458;
    private static final int SYS_listxattr = 194;
    private static final int SYS_llistxattr = 195;
    private static final int SYS_lookup_dcookie = 212;
    private static final int SYS_lremovexattr = 198;
    private static final int SYS_lseek = 8;
    private static final int SYS_lsetxattr = 189;
    private static final int SYS_lsm_get_self_attr = 459;
    private static final int SYS_lsm_list_modules = 461;
    private static final int SYS_lsm_set_self_attr = 460;
    private static final int SYS_lstat = 6;
    private static final int SYS_madvise = 28;
    private static final int SYS_map_shadow_stack = 453;
    private static final int SYS_mbind = 237;
    private static final int SYS_membarrier = 324;
    private static final int SYS_memfd_create = 319;
    private static final int SYS_memfd_secret = 447;
    private static final int SYS_migrate_pages = 256;
    private static final int SYS_mincore = 27;
    private static final int SYS_mkdir = 83;
    private static final int SYS_mkdirat = 258;
    private static final int SYS_mknod = 133;
    private static final int SYS_mknodat = 259;
    private static final int SYS_mlock = 149;
    private static final int SYS_mlock2 = 325;
    private static final int SYS_mlockall = 151;
    private static final int SYS_mmap = 9;
    private static final int SYS_modify_ldt = 154;
    private static final int SYS_mount = 165;
    private static final int SYS_mount_setattr = 442;
    private static final int SYS_move_mount = 429;
    private static final int SYS_move_pages = 279;
    private static final int SYS_mprotect = 10;
    private static final int SYS_mq_getsetattr = 245;
    private static final int SYS_mq_notify = 244;
    private static final int SYS_mq_open = 240;
    private static final int SYS_mq_timedreceive = 243;
    private static final int SYS_mq_timedsend = 242;
    private static final int SYS_mq_unlink = 241;
    private static final int SYS_mremap = 25;
    private static final int SYS_mseal = 462;
    private static final int SYS_msgctl = 71;
    private static final int SYS_msgget = 68;
    private static final int SYS_msgrcv = 70;
    private static final int SYS_msgsnd = 69;
    private static final int SYS_msync = 26;
    private static final int SYS_munlock = 150;
    private static final int SYS_munlockall = 152;
    private static final int SYS_munmap = 11;
    private static final int SYS_name_to_handle_at = 303;
    private static final int SYS_nanosleep = 35;
    private static final int SYS_newfstatat = 262;
    private static final int SYS_nfsservctl = 180;
    private static final int SYS_open = 2;
    private static final int SYS_open_by_handle_at = 304;
    private static final int SYS_open_tree = 428;
    private static final int SYS_openat = 257;
    private static final int SYS_openat2 = 437;
    private static final int SYS_pause = 34;
    private static final int SYS_perf_event_open = 298;
    private static final int SYS_personality = 135;
    private static final int SYS_pidfd_getfd = 438;
    private static final int SYS_pidfd_open = 434;
    private static final int SYS_pidfd_send_signal = 424;
    private static final int SYS_pipe = 22;
    private static final int SYS_pipe2 = 293;
    private static final int SYS_pivot_root = 155;
    private static final int SYS_pkey_alloc = 330;
    private static final int SYS_pkey_free = 331;
    private static final int SYS_pkey_mprotect = 329;
    private static final int SYS_poll = 7;
    private static final int SYS_ppoll = 271;
    private static final int SYS_prctl = 157;
    private static final int SYS_pread64 = 17;
    private static final int SYS_preadv = 295;
    private static final int SYS_preadv2 = 327;
    private static final int SYS_prlimit64 = 302;
    private static final int SYS_process_madvise = 440;
    private static final int SYS_process_mrelease = 448;
    private static final int SYS_process_vm_readv = 310;
    private static final int SYS_process_vm_writev = 311;
    private static final int SYS_pselect6 = 270;
    private static final int SYS_ptrace = 101;
    private static final int SYS_putpmsg = 182;
    private static final int SYS_pwrite64 = 18;
    private static final int SYS_pwritev = 296;
    private static final int SYS_pwritev2 = 328;
    private static final int SYS_query_module = 178;
    private static final int SYS_quotactl = 179;
    private static final int SYS_quotactl_fd = 443;
    private static final int SYS_read = 0;
    private static final int SYS_readahead = 187;
    private static final int SYS_readlink = 89;
    private static final int SYS_readlinkat = 267;
    private static final int SYS_readv = 19;
    private static final int SYS_reboot = 169;
    private static final int SYS_recvfrom = 45;
    private static final int SYS_recvmmsg = 299;
    private static final int SYS_recvmsg = 47;
    private static final int SYS_remap_file_pages = 216;
    private static final int SYS_removexattr = 197;
    private static final int SYS_rename = 82;
    private static final int SYS_renameat = 264;
    private static final int SYS_renameat2 = 316;
    private static final int SYS_request_key = 249;
    private static final int SYS_restart_syscall = 219;
    private static final int SYS_rmdir = 84;
    private static final int SYS_rseq = 334;
    private static final int SYS_rt_sigaction = 13;
    private static final int SYS_rt_sigpending = 127;
    private static final int SYS_rt_sigprocmask = 14;
    private static final int SYS_rt_sigqueueinfo = 129;
    private static final int SYS_rt_sigreturn = 15;
    private static final int SYS_rt_sigsuspend = 130;
    private static final int SYS_rt_sigtimedwait = 128;
    private static final int SYS_rt_tgsigqueueinfo = 297;
    private static final int SYS_sched_get_priority_max = 146;
    private static final int SYS_sched_get_priority_min = 147;
    private static final int SYS_sched_getaffinity = 204;
    private static final int SYS_sched_getattr = 315;
    private static final int SYS_sched_getparam = 143;
    private static final int SYS_sched_getscheduler = 145;
    private static final int SYS_sched_rr_get_interval = 148;
    private static final int SYS_sched_setaffinity = 203;
    private static final int SYS_sched_setattr = 314;
    private static final int SYS_sched_setparam = 142;
    private static final int SYS_sched_setscheduler = 144;
    private static final int SYS_sched_yield = 24;
    private static final int SYS_seccomp = 317;
    private static final int SYS_security = 185;
    private static final int SYS_select = 23;
    private static final int SYS_semctl = 66;
    private static final int SYS_semget = 64;
    private static final int SYS_semop = 65;
    private static final int SYS_semtimedop = 220;
    private static final int SYS_sendfile = 40;
    private static final int SYS_sendmmsg = 307;
    private static final int SYS_sendmsg = 46;
    private static final int SYS_sendto = 44;
    private static final int SYS_set_mempolicy = 238;
    private static final int SYS_set_mempolicy_home_node = 450;
    private static final int SYS_set_robust_list = 273;
    private static final int SYS_set_thread_area = 205;
    private static final int SYS_set_tid_address = 218;
    private static final int SYS_setdomainname = 171;
    private static final int SYS_setfsgid = 123;
    private static final int SYS_setfsuid = 122;
    private static final int SYS_setgid = 106;
    private static final int SYS_setgroups = 116;
    private static final int SYS_sethostname = 170;
    private static final int SYS_setitimer = 38;
    private static final int SYS_setns = 308;
    private static final int SYS_setpgid = 109;
    private static final int SYS_setpriority = 141;
    private static final int SYS_setregid = 114;
    private static final int SYS_setresgid = 119;
    private static final int SYS_setresuid = 117;
    private static final int SYS_setreuid = 113;
    private static final int SYS_setrlimit = 160;
    private static final int SYS_setsid = 112;
    private static final int SYS_setsockopt = 54;
    private static final int SYS_settimeofday = 164;
    private static final int SYS_setuid = 105;
    private static final int SYS_setxattr = 188;
    private static final int SYS_shmat = 30;
    private static final int SYS_shmctl = 31;
    private static final int SYS_shmdt = 67;
    private static final int SYS_shmget = 29;
    private static final int SYS_shutdown = 48;
    private static final int SYS_sigaltstack = 131;
    private static final int SYS_signalfd = 282;
    private static final int SYS_signalfd4 = 289;
    private static final int SYS_socket = 41;
    private static final int SYS_socketpair = 53;
    private static final int SYS_splice = 275;
    private static final int SYS_stat = 4;
    private static final int SYS_statfs = 137;
    private static final int SYS_statmount = 457;
    private static final int SYS_statx = 332;
    private static final int SYS_swapoff = 168;
    private static final int SYS_swapon = 167;
    private static final int SYS_symlink = 88;
    private static final int SYS_symlinkat = 266;
    private static final int SYS_sync = 162;
    private static final int SYS_sync_file_range = 277;
    private static final int SYS_syncfs = 306;
    private static final int SYS_sysfs = 139;
    private static final int SYS_sysinfo = 99;
    private static final int SYS_syslog = 103;
    private static final int SYS_tee = 276;
    private static final int SYS_tgkill = 234;
    private static final int SYS_time = 201;
    private static final int SYS_timer_create = 222;
    private static final int SYS_timer_delete = 226;
    private static final int SYS_timer_getoverrun = 225;
    private static final int SYS_timer_gettime = 224;
    private static final int SYS_timer_settime = 223;
    private static final int SYS_timerfd_create = 283;
    private static final int SYS_timerfd_gettime = 287;
    private static final int SYS_timerfd_settime = 286;
    private static final int SYS_times = 100;
    private static final int SYS_tkill = 200;
    private static final int SYS_truncate = 76;
    private static final int SYS_tuxcall = 184;
    private static final int SYS_umask = 95;
    private static final int SYS_umount2 = 166;
    private static final int SYS_uname = 63;
    private static final int SYS_unlink = 87;
    private static final int SYS_unlinkat = 263;
    private static final int SYS_unshare = 272;
    private static final int SYS_uretprobe = 335;
    private static final int SYS_uselib = 134;
    private static final int SYS_userfaultfd = 323;
    private static final int SYS_ustat = 136;
    private static final int SYS_utime = 132;
    private static final int SYS_utimensat = 280;
    private static final int SYS_utimes = 235;
    private static final int SYS_vfork = 58;
    private static final int SYS_vhangup = 153;
    private static final int SYS_vmsplice = 278;
    private static final int SYS_vserver = 236;
    private static final int SYS_wait4 = 61;
    private static final int SYS_waitid = 247;
    private static final int SYS_write = 1;
    private static final int SYS_writev = 20;

    Lib() {
    }

    public static int IPOPT_LSRR() {
        return 131;
    }

    public static int IPOPT_TIMESTAMP() {
        return 68;
    }

    public static int IPOPT_CIPSO() {
        return 134;
    }

    public static int IPOPT_RR() {
        return 7;
    }

    public static int IPOPT_SID() {
        return 136;
    }

    public static int IPOPT_SSRR() {
        return 137;
    }

    public static int IPOPT_RA() {
        return 148;
    }

    public static int IPOPT_NOP() {
        return 1;
    }

    public static int IPOPT_EOL() {
        return 0;
    }

    public static int IPOPT_TS() {
        return 68;
    }

    public static int IPV4_DEVCONF_MAX() {
        return 33;
    }

    public static int IPV6_RECVORIGDSTADDR() {
        return 74;
    }

    public static int SOCK_BUF_LOCK_MASK() {
        return 3;
    }

    public static int PF_UNIX() {
        return 1;
    }

    public static int PF_FILE() {
        return 1;
    }

    public static int PF_ROUTE() {
        return 16;
    }

    public static int AF_UNSPEC() {
        return 0;
    }

    public static int AF_LOCAL() {
        return 1;
    }

    public static int AF_UNIX() {
        return 1;
    }

    public static int AF_FILE() {
        return 1;
    }

    public static int AF_INET() {
        return 2;
    }

    public static int AF_AX25() {
        return 3;
    }

    public static int AF_IPX() {
        return 4;
    }

    public static int AF_APPLETALK() {
        return 5;
    }

    public static int AF_NETROM() {
        return 6;
    }

    public static int AF_BRIDGE() {
        return 7;
    }

    public static int AF_ATMPVC() {
        return 8;
    }

    public static int AF_X25() {
        return 9;
    }

    public static int AF_INET6() {
        return 10;
    }

    public static int AF_ROSE() {
        return 11;
    }

    public static int AF_DECnet() {
        return 12;
    }

    public static int AF_NETBEUI() {
        return 13;
    }

    public static int AF_SECURITY() {
        return 14;
    }

    public static int AF_KEY() {
        return 15;
    }

    public static int AF_NETLINK() {
        return 16;
    }

    public static int AF_ROUTE() {
        return 16;
    }

    public static int AF_PACKET() {
        return 17;
    }

    public static int AF_ASH() {
        return 18;
    }

    public static int AF_ECONET() {
        return 19;
    }

    public static int AF_ATMSVC() {
        return 20;
    }

    public static int AF_RDS() {
        return 21;
    }

    public static int AF_SNA() {
        return 22;
    }

    public static int AF_IRDA() {
        return 23;
    }

    public static int AF_PPPOX() {
        return 24;
    }

    public static int AF_WANPIPE() {
        return 25;
    }

    public static int AF_LLC() {
        return 26;
    }

    public static int AF_IB() {
        return 27;
    }

    public static int AF_MPLS() {
        return 28;
    }

    public static int AF_CAN() {
        return 29;
    }

    public static int AF_TIPC() {
        return 30;
    }

    public static int AF_BLUETOOTH() {
        return 31;
    }

    public static int AF_IUCV() {
        return 32;
    }

    public static int AF_RXRPC() {
        return 33;
    }

    public static int AF_ISDN() {
        return 34;
    }

    public static int AF_PHONET() {
        return 35;
    }

    public static int AF_IEEE802154() {
        return 36;
    }

    public static int AF_CAIF() {
        return 37;
    }

    public static int AF_ALG() {
        return 38;
    }

    public static int AF_NFC() {
        return 39;
    }

    public static int AF_VSOCK() {
        return 40;
    }

    public static int AF_KCM() {
        return 41;
    }

    public static int AF_QIPCRTR() {
        return 42;
    }

    public static int AF_SMC() {
        return 43;
    }

    public static int AF_XDP() {
        return 44;
    }

    public static int AF_MCTP() {
        return 45;
    }

    public static int AF_MAX() {
        return 46;
    }

    public static long __SOCKADDR_COMMON_SIZE() {
        return 2L;
    }

    public static long _SS_PADSIZE() {
        return 118L;
    }

    public static int SO_GET_FILTER() {
        return 26;
    }

    public static int SCM_WIFI_STATUS() {
        return 41;
    }

    public static int SO_DETACH_BPF() {
        return 27;
    }

    public static int SCM_TXTIME() {
        return 61;
    }

    public static int SCM_DEVMEM_LINEAR() {
        return 78;
    }

    public static int SCM_DEVMEM_DMABUF() {
        return 79;
    }

    public static int SO_TIMESTAMP() {
        return 29;
    }

    public static int SO_TIMESTAMPNS() {
        return 35;
    }

    public static int SO_TIMESTAMPING() {
        return 37;
    }

    public static int SO_RCVTIMEO() {
        return 20;
    }

    public static int SO_SNDTIMEO() {
        return 21;
    }

    public static int SCM_TIMESTAMP() {
        return 29;
    }

    public static int SCM_TIMESTAMPNS() {
        return 35;
    }

    public static int SCM_TIMESTAMPING() {
        return 37;
    }

    public static int IFF_VOLATILE() {
        return 461914;
    }

    public static int ICMP_EXT_ECHOREPLY_ACTIVE() {
        return 4;
    }

    public static int ICMP_EXT_ECHOREPLY_IPV4() {
        return 2;
    }

    public static int TCP_MSS_DEFAULT() {
        return 536;
    }

    public static int TCP_MSS_DESIRED() {
        return 1220;
    }

    public static int TCP_CM_INQ() {
        return 36;
    }

    public static int TCP_REPAIR_OFF_NO_WP() {
        return -1;
    }

    public static int TCPF_CA_Open() {
        return 1;
    }

    public static int TCPF_CA_Disorder() {
        return 2;
    }

    public static int TCPF_CA_CWR() {
        return 4;
    }

    public static int TCPF_CA_Recovery() {
        return 8;
    }

    public static int TCPF_CA_Loss() {
        return 16;
    }

    public static int TCP_AO_KEYF_IFINDEX() {
        return 1;
    }

    public static int TCP_AO_KEYF_EXCLUDE_OPT() {
        return 2;
    }

    public static int IP_RECVRETOPTS() {
        return 7;
    }

    public static int IP_RECVORIGDSTADDR() {
        return 20;
    }

    public static int IN_CLASSA_NET() {
        return -16777216;
    }

    public static int IN_CLASSA_HOST() {
        return 0xFFFFFF;
    }

    public static int IN_CLASSB_NET() {
        return -65536;
    }

    public static int IN_CLASSB_HOST() {
        return 65535;
    }

    public static int IN_CLASSC_NET() {
        return -256;
    }

    public static int IN_CLASSC_HOST() {
        return 255;
    }

    public static int IN_MULTICAST_NET() {
        return -536870912;
    }

    public static int IN_CLASSE_NET() {
        return -1;
    }

    public static long INADDR_ANY() {
        return 0L;
    }

    public static long INADDR_BROADCAST() {
        return 0xFFFFFFFFL;
    }

    public static long INADDR_NONE() {
        return 0xFFFFFFFFL;
    }

    public static long INADDR_DUMMY() {
        return 0xC0000008L;
    }

    public static int INADDR_UNSPEC_GROUP() {
        return -536870912;
    }

    public static int INADDR_ALLHOSTS_GROUP() {
        return -536870911;
    }

    public static int INADDR_ALLRTRS_GROUP() {
        return -536870910;
    }

    public static int INADDR_ALLSNOOPERS_GROUP() {
        return -536870806;
    }

    public static int INADDR_MAX_LOCAL_GROUP() {
        return -536870657;
    }

    public static long __NCPUBITS() {
        return 64L;
    }

    public static int SYS__sysctl() {
        return 156;
    }

    public static int SYS_accept() {
        return 43;
    }

    public static int SYS_accept4() {
        return 288;
    }

    public static int SYS_access() {
        return 21;
    }

    public static int SYS_acct() {
        return 163;
    }

    public static int SYS_add_key() {
        return 248;
    }

    public static int SYS_adjtimex() {
        return 159;
    }

    public static int SYS_afs_syscall() {
        return 183;
    }

    public static int SYS_alarm() {
        return 37;
    }

    public static int SYS_arch_prctl() {
        return 158;
    }

    public static int SYS_bind() {
        return 49;
    }

    public static int SYS_bpf() {
        return 321;
    }

    public static int SYS_brk() {
        return 12;
    }

    public static int SYS_cachestat() {
        return 451;
    }

    public static int SYS_capget() {
        return 125;
    }

    public static int SYS_capset() {
        return 126;
    }

    public static int SYS_chdir() {
        return 80;
    }

    public static int SYS_chmod() {
        return 90;
    }

    public static int SYS_chown() {
        return 92;
    }

    public static int SYS_chroot() {
        return 161;
    }

    public static int SYS_clock_adjtime() {
        return 305;
    }

    public static int SYS_clock_getres() {
        return 229;
    }

    public static int SYS_clock_gettime() {
        return 228;
    }

    public static int SYS_clock_nanosleep() {
        return 230;
    }

    public static int SYS_clock_settime() {
        return 227;
    }

    public static int SYS_clone() {
        return 56;
    }

    public static int SYS_clone3() {
        return 435;
    }

    public static int SYS_close() {
        return 3;
    }

    public static int SYS_close_range() {
        return 436;
    }

    public static int SYS_connect() {
        return 42;
    }

    public static int SYS_copy_file_range() {
        return 326;
    }

    public static int SYS_creat() {
        return 85;
    }

    public static int SYS_create_module() {
        return 174;
    }

    public static int SYS_delete_module() {
        return 176;
    }

    public static int SYS_dup() {
        return 32;
    }

    public static int SYS_dup2() {
        return 33;
    }

    public static int SYS_dup3() {
        return 292;
    }

    public static int SYS_epoll_create() {
        return 213;
    }

    public static int SYS_epoll_create1() {
        return 291;
    }

    public static int SYS_epoll_ctl() {
        return 233;
    }

    public static int SYS_epoll_ctl_old() {
        return 214;
    }

    public static int SYS_epoll_pwait() {
        return 281;
    }

    public static int SYS_epoll_pwait2() {
        return 441;
    }

    public static int SYS_epoll_wait() {
        return 232;
    }

    public static int SYS_epoll_wait_old() {
        return 215;
    }

    public static int SYS_eventfd() {
        return 284;
    }

    public static int SYS_eventfd2() {
        return 290;
    }

    public static int SYS_execve() {
        return 59;
    }

    public static int SYS_execveat() {
        return 322;
    }

    public static int SYS_exit() {
        return 60;
    }

    public static int SYS_exit_group() {
        return 231;
    }

    public static int SYS_faccessat() {
        return 269;
    }

    public static int SYS_faccessat2() {
        return 439;
    }

    public static int SYS_fadvise64() {
        return 221;
    }

    public static int SYS_fallocate() {
        return 285;
    }

    public static int SYS_fanotify_init() {
        return 300;
    }

    public static int SYS_fanotify_mark() {
        return 301;
    }

    public static int SYS_fchdir() {
        return 81;
    }

    public static int SYS_fchmod() {
        return 91;
    }

    public static int SYS_fchmodat() {
        return 268;
    }

    public static int SYS_fchmodat2() {
        return 452;
    }

    public static int SYS_fchown() {
        return 93;
    }

    public static int SYS_fchownat() {
        return 260;
    }

    public static int SYS_fcntl() {
        return 72;
    }

    public static int SYS_fdatasync() {
        return 75;
    }

    public static int SYS_fgetxattr() {
        return 193;
    }

    public static int SYS_finit_module() {
        return 313;
    }

    public static int SYS_flistxattr() {
        return 196;
    }

    public static int SYS_flock() {
        return 73;
    }

    public static int SYS_fork() {
        return 57;
    }

    public static int SYS_fremovexattr() {
        return 199;
    }

    public static int SYS_fsconfig() {
        return 431;
    }

    public static int SYS_fsetxattr() {
        return 190;
    }

    public static int SYS_fsmount() {
        return 432;
    }

    public static int SYS_fsopen() {
        return 430;
    }

    public static int SYS_fspick() {
        return 433;
    }

    public static int SYS_fstat() {
        return 5;
    }

    public static int SYS_fstatfs() {
        return 138;
    }

    public static int SYS_fsync() {
        return 74;
    }

    public static int SYS_ftruncate() {
        return 77;
    }

    public static int SYS_futex() {
        return 202;
    }

    public static int SYS_futex_requeue() {
        return 456;
    }

    public static int SYS_futex_wait() {
        return 455;
    }

    public static int SYS_futex_waitv() {
        return 449;
    }

    public static int SYS_futex_wake() {
        return 454;
    }

    public static int SYS_futimesat() {
        return 261;
    }

    public static int SYS_get_kernel_syms() {
        return 177;
    }

    public static int SYS_get_mempolicy() {
        return 239;
    }

    public static int SYS_get_robust_list() {
        return 274;
    }

    public static int SYS_get_thread_area() {
        return 211;
    }

    public static int SYS_getcpu() {
        return 309;
    }

    public static int SYS_getcwd() {
        return 79;
    }

    public static int SYS_getdents() {
        return 78;
    }

    public static int SYS_getdents64() {
        return 217;
    }

    public static int SYS_getegid() {
        return 108;
    }

    public static int SYS_geteuid() {
        return 107;
    }

    public static int SYS_getgid() {
        return 104;
    }

    public static int SYS_getgroups() {
        return 115;
    }

    public static int SYS_getitimer() {
        return 36;
    }

    public static int SYS_getpeername() {
        return 52;
    }

    public static int SYS_getpgid() {
        return 121;
    }

    public static int SYS_getpgrp() {
        return 111;
    }

    public static int SYS_getpid() {
        return 39;
    }

    public static int SYS_getpmsg() {
        return 181;
    }

    public static int SYS_getppid() {
        return 110;
    }

    public static int SYS_getpriority() {
        return 140;
    }

    public static int SYS_getrandom() {
        return 318;
    }

    public static int SYS_getresgid() {
        return 120;
    }

    public static int SYS_getresuid() {
        return 118;
    }

    public static int SYS_getrlimit() {
        return 97;
    }

    public static int SYS_getrusage() {
        return 98;
    }

    public static int SYS_getsid() {
        return 124;
    }

    public static int SYS_getsockname() {
        return 51;
    }

    public static int SYS_getsockopt() {
        return 55;
    }

    public static int SYS_gettid() {
        return 186;
    }

    public static int SYS_gettimeofday() {
        return 96;
    }

    public static int SYS_getuid() {
        return 102;
    }

    public static int SYS_getxattr() {
        return 191;
    }

    public static int SYS_init_module() {
        return 175;
    }

    public static int SYS_inotify_add_watch() {
        return 254;
    }

    public static int SYS_inotify_init() {
        return 253;
    }

    public static int SYS_inotify_init1() {
        return 294;
    }

    public static int SYS_inotify_rm_watch() {
        return 255;
    }

    public static int SYS_io_cancel() {
        return 210;
    }

    public static int SYS_io_destroy() {
        return 207;
    }

    public static int SYS_io_getevents() {
        return 208;
    }

    public static int SYS_io_pgetevents() {
        return 333;
    }

    public static int SYS_io_setup() {
        return 206;
    }

    public static int SYS_io_submit() {
        return 209;
    }

    public static int SYS_io_uring_enter() {
        return 426;
    }

    public static int SYS_io_uring_register() {
        return 427;
    }

    public static int SYS_io_uring_setup() {
        return 425;
    }

    public static int SYS_ioctl() {
        return 16;
    }

    public static int SYS_ioperm() {
        return 173;
    }

    public static int SYS_iopl() {
        return 172;
    }

    public static int SYS_ioprio_get() {
        return 252;
    }

    public static int SYS_ioprio_set() {
        return 251;
    }

    public static int SYS_kcmp() {
        return 312;
    }

    public static int SYS_kexec_file_load() {
        return 320;
    }

    public static int SYS_kexec_load() {
        return 246;
    }

    public static int SYS_keyctl() {
        return 250;
    }

    public static int SYS_kill() {
        return 62;
    }

    public static int SYS_landlock_add_rule() {
        return 445;
    }

    public static int SYS_landlock_create_ruleset() {
        return 444;
    }

    public static int SYS_landlock_restrict_self() {
        return 446;
    }

    public static int SYS_lchown() {
        return 94;
    }

    public static int SYS_lgetxattr() {
        return 192;
    }

    public static int SYS_link() {
        return 86;
    }

    public static int SYS_linkat() {
        return 265;
    }

    public static int SYS_listen() {
        return 50;
    }

    public static int SYS_listmount() {
        return 458;
    }

    public static int SYS_listxattr() {
        return 194;
    }

    public static int SYS_llistxattr() {
        return 195;
    }

    public static int SYS_lookup_dcookie() {
        return 212;
    }

    public static int SYS_lremovexattr() {
        return 198;
    }

    public static int SYS_lseek() {
        return 8;
    }

    public static int SYS_lsetxattr() {
        return 189;
    }

    public static int SYS_lsm_get_self_attr() {
        return 459;
    }

    public static int SYS_lsm_list_modules() {
        return 461;
    }

    public static int SYS_lsm_set_self_attr() {
        return 460;
    }

    public static int SYS_lstat() {
        return 6;
    }

    public static int SYS_madvise() {
        return 28;
    }

    public static int SYS_map_shadow_stack() {
        return 453;
    }

    public static int SYS_mbind() {
        return 237;
    }

    public static int SYS_membarrier() {
        return 324;
    }

    public static int SYS_memfd_create() {
        return 319;
    }

    public static int SYS_memfd_secret() {
        return 447;
    }

    public static int SYS_migrate_pages() {
        return 256;
    }

    public static int SYS_mincore() {
        return 27;
    }

    public static int SYS_mkdir() {
        return 83;
    }

    public static int SYS_mkdirat() {
        return 258;
    }

    public static int SYS_mknod() {
        return 133;
    }

    public static int SYS_mknodat() {
        return 259;
    }

    public static int SYS_mlock() {
        return 149;
    }

    public static int SYS_mlock2() {
        return 325;
    }

    public static int SYS_mlockall() {
        return 151;
    }

    public static int SYS_mmap() {
        return 9;
    }

    public static int SYS_modify_ldt() {
        return 154;
    }

    public static int SYS_mount() {
        return 165;
    }

    public static int SYS_mount_setattr() {
        return 442;
    }

    public static int SYS_move_mount() {
        return 429;
    }

    public static int SYS_move_pages() {
        return 279;
    }

    public static int SYS_mprotect() {
        return 10;
    }

    public static int SYS_mq_getsetattr() {
        return 245;
    }

    public static int SYS_mq_notify() {
        return 244;
    }

    public static int SYS_mq_open() {
        return 240;
    }

    public static int SYS_mq_timedreceive() {
        return 243;
    }

    public static int SYS_mq_timedsend() {
        return 242;
    }

    public static int SYS_mq_unlink() {
        return 241;
    }

    public static int SYS_mremap() {
        return 25;
    }

    public static int SYS_mseal() {
        return 462;
    }

    public static int SYS_msgctl() {
        return 71;
    }

    public static int SYS_msgget() {
        return 68;
    }

    public static int SYS_msgrcv() {
        return 70;
    }

    public static int SYS_msgsnd() {
        return 69;
    }

    public static int SYS_msync() {
        return 26;
    }

    public static int SYS_munlock() {
        return 150;
    }

    public static int SYS_munlockall() {
        return 152;
    }

    public static int SYS_munmap() {
        return 11;
    }

    public static int SYS_name_to_handle_at() {
        return 303;
    }

    public static int SYS_nanosleep() {
        return 35;
    }

    public static int SYS_newfstatat() {
        return 262;
    }

    public static int SYS_nfsservctl() {
        return 180;
    }

    public static int SYS_open() {
        return 2;
    }

    public static int SYS_open_by_handle_at() {
        return 304;
    }

    public static int SYS_open_tree() {
        return 428;
    }

    public static int SYS_openat() {
        return 257;
    }

    public static int SYS_openat2() {
        return 437;
    }

    public static int SYS_pause() {
        return 34;
    }

    public static int SYS_perf_event_open() {
        return 298;
    }

    public static int SYS_personality() {
        return 135;
    }

    public static int SYS_pidfd_getfd() {
        return 438;
    }

    public static int SYS_pidfd_open() {
        return 434;
    }

    public static int SYS_pidfd_send_signal() {
        return 424;
    }

    public static int SYS_pipe() {
        return 22;
    }

    public static int SYS_pipe2() {
        return 293;
    }

    public static int SYS_pivot_root() {
        return 155;
    }

    public static int SYS_pkey_alloc() {
        return 330;
    }

    public static int SYS_pkey_free() {
        return 331;
    }

    public static int SYS_pkey_mprotect() {
        return 329;
    }

    public static int SYS_poll() {
        return 7;
    }

    public static int SYS_ppoll() {
        return 271;
    }

    public static int SYS_prctl() {
        return 157;
    }

    public static int SYS_pread64() {
        return 17;
    }

    public static int SYS_preadv() {
        return 295;
    }

    public static int SYS_preadv2() {
        return 327;
    }

    public static int SYS_prlimit64() {
        return 302;
    }

    public static int SYS_process_madvise() {
        return 440;
    }

    public static int SYS_process_mrelease() {
        return 448;
    }

    public static int SYS_process_vm_readv() {
        return 310;
    }

    public static int SYS_process_vm_writev() {
        return 311;
    }

    public static int SYS_pselect6() {
        return 270;
    }

    public static int SYS_ptrace() {
        return 101;
    }

    public static int SYS_putpmsg() {
        return 182;
    }

    public static int SYS_pwrite64() {
        return 18;
    }

    public static int SYS_pwritev() {
        return 296;
    }

    public static int SYS_pwritev2() {
        return 328;
    }

    public static int SYS_query_module() {
        return 178;
    }

    public static int SYS_quotactl() {
        return 179;
    }

    public static int SYS_quotactl_fd() {
        return 443;
    }

    public static int SYS_read() {
        return 0;
    }

    public static int SYS_readahead() {
        return 187;
    }

    public static int SYS_readlink() {
        return 89;
    }

    public static int SYS_readlinkat() {
        return 267;
    }

    public static int SYS_readv() {
        return 19;
    }

    public static int SYS_reboot() {
        return 169;
    }

    public static int SYS_recvfrom() {
        return 45;
    }

    public static int SYS_recvmmsg() {
        return 299;
    }

    public static int SYS_recvmsg() {
        return 47;
    }

    public static int SYS_remap_file_pages() {
        return 216;
    }

    public static int SYS_removexattr() {
        return 197;
    }

    public static int SYS_rename() {
        return 82;
    }

    public static int SYS_renameat() {
        return 264;
    }

    public static int SYS_renameat2() {
        return 316;
    }

    public static int SYS_request_key() {
        return 249;
    }

    public static int SYS_restart_syscall() {
        return 219;
    }

    public static int SYS_rmdir() {
        return 84;
    }

    public static int SYS_rseq() {
        return 334;
    }

    public static int SYS_rt_sigaction() {
        return 13;
    }

    public static int SYS_rt_sigpending() {
        return 127;
    }

    public static int SYS_rt_sigprocmask() {
        return 14;
    }

    public static int SYS_rt_sigqueueinfo() {
        return 129;
    }

    public static int SYS_rt_sigreturn() {
        return 15;
    }

    public static int SYS_rt_sigsuspend() {
        return 130;
    }

    public static int SYS_rt_sigtimedwait() {
        return 128;
    }

    public static int SYS_rt_tgsigqueueinfo() {
        return 297;
    }

    public static int SYS_sched_get_priority_max() {
        return 146;
    }

    public static int SYS_sched_get_priority_min() {
        return 147;
    }

    public static int SYS_sched_getaffinity() {
        return 204;
    }

    public static int SYS_sched_getattr() {
        return 315;
    }

    public static int SYS_sched_getparam() {
        return 143;
    }

    public static int SYS_sched_getscheduler() {
        return 145;
    }

    public static int SYS_sched_rr_get_interval() {
        return 148;
    }

    public static int SYS_sched_setaffinity() {
        return 203;
    }

    public static int SYS_sched_setattr() {
        return 314;
    }

    public static int SYS_sched_setparam() {
        return 142;
    }

    public static int SYS_sched_setscheduler() {
        return 144;
    }

    public static int SYS_sched_yield() {
        return 24;
    }

    public static int SYS_seccomp() {
        return 317;
    }

    public static int SYS_security() {
        return 185;
    }

    public static int SYS_select() {
        return 23;
    }

    public static int SYS_semctl() {
        return 66;
    }

    public static int SYS_semget() {
        return 64;
    }

    public static int SYS_semop() {
        return 65;
    }

    public static int SYS_semtimedop() {
        return 220;
    }

    public static int SYS_sendfile() {
        return 40;
    }

    public static int SYS_sendmmsg() {
        return 307;
    }

    public static int SYS_sendmsg() {
        return 46;
    }

    public static int SYS_sendto() {
        return 44;
    }

    public static int SYS_set_mempolicy() {
        return 238;
    }

    public static int SYS_set_mempolicy_home_node() {
        return 450;
    }

    public static int SYS_set_robust_list() {
        return 273;
    }

    public static int SYS_set_thread_area() {
        return 205;
    }

    public static int SYS_set_tid_address() {
        return 218;
    }

    public static int SYS_setdomainname() {
        return 171;
    }

    public static int SYS_setfsgid() {
        return 123;
    }

    public static int SYS_setfsuid() {
        return 122;
    }

    public static int SYS_setgid() {
        return 106;
    }

    public static int SYS_setgroups() {
        return 116;
    }

    public static int SYS_sethostname() {
        return 170;
    }

    public static int SYS_setitimer() {
        return 38;
    }

    public static int SYS_setns() {
        return 308;
    }

    public static int SYS_setpgid() {
        return 109;
    }

    public static int SYS_setpriority() {
        return 141;
    }

    public static int SYS_setregid() {
        return 114;
    }

    public static int SYS_setresgid() {
        return 119;
    }

    public static int SYS_setresuid() {
        return 117;
    }

    public static int SYS_setreuid() {
        return 113;
    }

    public static int SYS_setrlimit() {
        return 160;
    }

    public static int SYS_setsid() {
        return 112;
    }

    public static int SYS_setsockopt() {
        return 54;
    }

    public static int SYS_settimeofday() {
        return 164;
    }

    public static int SYS_setuid() {
        return 105;
    }

    public static int SYS_setxattr() {
        return 188;
    }

    public static int SYS_shmat() {
        return 30;
    }

    public static int SYS_shmctl() {
        return 31;
    }

    public static int SYS_shmdt() {
        return 67;
    }

    public static int SYS_shmget() {
        return 29;
    }

    public static int SYS_shutdown() {
        return 48;
    }

    public static int SYS_sigaltstack() {
        return 131;
    }

    public static int SYS_signalfd() {
        return 282;
    }

    public static int SYS_signalfd4() {
        return 289;
    }

    public static int SYS_socket() {
        return 41;
    }

    public static int SYS_socketpair() {
        return 53;
    }

    public static int SYS_splice() {
        return 275;
    }

    public static int SYS_stat() {
        return 4;
    }

    public static int SYS_statfs() {
        return 137;
    }

    public static int SYS_statmount() {
        return 457;
    }

    public static int SYS_statx() {
        return 332;
    }

    public static int SYS_swapoff() {
        return 168;
    }

    public static int SYS_swapon() {
        return 167;
    }

    public static int SYS_symlink() {
        return 88;
    }

    public static int SYS_symlinkat() {
        return 266;
    }

    public static int SYS_sync() {
        return 162;
    }

    public static int SYS_sync_file_range() {
        return 277;
    }

    public static int SYS_syncfs() {
        return 306;
    }

    public static int SYS_sysfs() {
        return 139;
    }

    public static int SYS_sysinfo() {
        return 99;
    }

    public static int SYS_syslog() {
        return 103;
    }

    public static int SYS_tee() {
        return 276;
    }

    public static int SYS_tgkill() {
        return 234;
    }

    public static int SYS_time() {
        return 201;
    }

    public static int SYS_timer_create() {
        return 222;
    }

    public static int SYS_timer_delete() {
        return 226;
    }

    public static int SYS_timer_getoverrun() {
        return 225;
    }

    public static int SYS_timer_gettime() {
        return 224;
    }

    public static int SYS_timer_settime() {
        return 223;
    }

    public static int SYS_timerfd_create() {
        return 283;
    }

    public static int SYS_timerfd_gettime() {
        return 287;
    }

    public static int SYS_timerfd_settime() {
        return 286;
    }

    public static int SYS_times() {
        return 100;
    }

    public static int SYS_tkill() {
        return 200;
    }

    public static int SYS_truncate() {
        return 76;
    }

    public static int SYS_tuxcall() {
        return 184;
    }

    public static int SYS_umask() {
        return 95;
    }

    public static int SYS_umount2() {
        return 166;
    }

    public static int SYS_uname() {
        return 63;
    }

    public static int SYS_unlink() {
        return 87;
    }

    public static int SYS_unlinkat() {
        return 263;
    }

    public static int SYS_unshare() {
        return 272;
    }

    public static int SYS_uretprobe() {
        return 335;
    }

    public static int SYS_uselib() {
        return 134;
    }

    public static int SYS_userfaultfd() {
        return 323;
    }

    public static int SYS_ustat() {
        return 136;
    }

    public static int SYS_utime() {
        return 132;
    }

    public static int SYS_utimensat() {
        return 280;
    }

    public static int SYS_utimes() {
        return 235;
    }

    public static int SYS_vfork() {
        return 58;
    }

    public static int SYS_vhangup() {
        return 153;
    }

    public static int SYS_vmsplice() {
        return 278;
    }

    public static int SYS_vserver() {
        return 236;
    }

    public static int SYS_wait4() {
        return 61;
    }

    public static int SYS_waitid() {
        return 247;
    }

    public static int SYS_write() {
        return 1;
    }

    public static int SYS_writev() {
        return 20;
    }
}

