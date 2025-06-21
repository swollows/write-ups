/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.AddressLayout
 *  java.lang.foreign.ValueLayout$OfByte
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.foreign.ValueLayout$OfLong
 *  java.lang.foreign.ValueLayout$OfShort
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.ValueLayout;
import me.bechberger.ebpf.bpf.raw.Lib;
import me.bechberger.ebpf.bpf.raw.Lib_4;

public class Lib_3
extends Lib_4 {
    private static final int ENCODING_MANCHESTER = 5;
    private static final int PARITY_DEFAULT = 0;
    private static final int PARITY_NONE = 1;
    private static final int PARITY_CRC16_PR0 = 2;
    private static final int PARITY_CRC16_PR1 = 3;
    private static final int PARITY_CRC16_PR0_CCITT = 4;
    private static final int PARITY_CRC16_PR1_CCITT = 5;
    private static final int PARITY_CRC32_PR0_CCITT = 6;
    private static final int PARITY_CRC32_PR1_CCITT = 7;
    private static final int LMI_DEFAULT = 0;
    private static final int LMI_NONE = 1;
    private static final int LMI_ANSI = 2;
    private static final int LMI_CCITT = 3;
    private static final int LMI_CISCO = 4;
    private static final int IF_GET_IFACE = 1;
    private static final int IF_GET_PROTO = 2;
    private static final int IF_IFACE_V35 = 4096;
    private static final int IF_IFACE_V24 = 4097;
    private static final int IF_IFACE_X21 = 4098;
    private static final int IF_IFACE_T1 = 4099;
    private static final int IF_IFACE_E1 = 4100;
    private static final int IF_IFACE_SYNC_SERIAL = 4101;
    private static final int IF_IFACE_X21D = 4102;
    private static final int IF_PROTO_HDLC = 8192;
    private static final int IF_PROTO_PPP = 8193;
    private static final int IF_PROTO_CISCO = 8194;
    private static final int IF_PROTO_FR = 8195;
    private static final int IF_PROTO_FR_ADD_PVC = 8196;
    private static final int IF_PROTO_FR_DEL_PVC = 8197;
    private static final int IF_PROTO_X25 = 8198;
    private static final int IF_PROTO_HDLC_ETH = 8199;
    private static final int IF_PROTO_FR_ADD_ETH_PVC = 8200;
    private static final int IF_PROTO_FR_DEL_ETH_PVC = 8201;
    private static final int IF_PROTO_FR_PVC = 8202;
    private static final int IF_PROTO_FR_ETH_PVC = 8203;
    private static final int IF_PROTO_RAW = 8204;
    private static final int IFHWADDRLEN = 6;
    private static final int ICMP_ECHOREPLY = 0;
    private static final int ICMP_DEST_UNREACH = 3;
    private static final int ICMP_SOURCE_QUENCH = 4;
    private static final int ICMP_REDIRECT = 5;
    private static final int ICMP_ECHO = 8;
    private static final int ICMP_TIME_EXCEEDED = 11;
    private static final int ICMP_PARAMETERPROB = 12;
    private static final int ICMP_TIMESTAMP = 13;
    private static final int ICMP_TIMESTAMPREPLY = 14;
    private static final int ICMP_INFO_REQUEST = 15;
    private static final int ICMP_INFO_REPLY = 16;
    private static final int ICMP_ADDRESS = 17;
    private static final int ICMP_ADDRESSREPLY = 18;
    private static final int NR_ICMP_TYPES = 18;
    private static final int ICMP_NET_UNREACH = 0;
    private static final int ICMP_HOST_UNREACH = 1;
    private static final int ICMP_PROT_UNREACH = 2;
    private static final int ICMP_PORT_UNREACH = 3;
    private static final int ICMP_FRAG_NEEDED = 4;
    private static final int ICMP_SR_FAILED = 5;
    private static final int ICMP_NET_UNKNOWN = 6;
    private static final int ICMP_HOST_UNKNOWN = 7;
    private static final int ICMP_HOST_ISOLATED = 8;
    private static final int ICMP_NET_ANO = 9;
    private static final int ICMP_HOST_ANO = 10;
    private static final int ICMP_NET_UNR_TOS = 11;
    private static final int ICMP_HOST_UNR_TOS = 12;
    private static final int ICMP_PKT_FILTERED = 13;
    private static final int ICMP_PREC_VIOLATION = 14;
    private static final int ICMP_PREC_CUTOFF = 15;
    private static final int NR_ICMP_UNREACH = 15;
    private static final int ICMP_REDIR_NET = 0;
    private static final int ICMP_REDIR_HOST = 1;
    private static final int ICMP_REDIR_NETTOS = 2;
    private static final int ICMP_REDIR_HOSTTOS = 3;
    private static final int ICMP_EXC_TTL = 0;
    private static final int ICMP_EXC_FRAGTIME = 1;
    private static final int ICMP_EXT_ECHO = 42;
    private static final int ICMP_EXT_ECHOREPLY = 43;
    private static final int ICMP_EXT_CODE_MAL_QUERY = 1;
    private static final int ICMP_EXT_CODE_NO_IF = 2;
    private static final int ICMP_EXT_CODE_NO_TABLE_ENT = 3;
    private static final int ICMP_EXT_CODE_MULT_IFS = 4;
    private static final int ICMP_EXT_ECHOREPLY_IPV6 = 1;
    private static final int ICMP_EXT_ECHO_CTYPE_NAME = 1;
    private static final int ICMP_EXT_ECHO_CTYPE_INDEX = 2;
    private static final int ICMP_EXT_ECHO_CTYPE_ADDR = 3;
    private static final int ICMP_AFI_IP = 1;
    private static final int ICMP_AFI_IP6 = 2;
    private static final int ICMP_FILTER = 1;
    private static final int ICMPV6_ROUTER_PREF_LOW = 3;
    private static final int ICMPV6_ROUTER_PREF_MEDIUM = 0;
    private static final int ICMPV6_ROUTER_PREF_HIGH = 1;
    private static final int ICMPV6_ROUTER_PREF_INVALID = 2;
    private static final int ICMPV6_DEST_UNREACH = 1;
    private static final int ICMPV6_PKT_TOOBIG = 2;
    private static final int ICMPV6_TIME_EXCEED = 3;
    private static final int ICMPV6_PARAMPROB = 4;
    private static final int ICMPV6_ERRMSG_MAX = 127;
    private static final int ICMPV6_INFOMSG_MASK = 128;
    private static final int ICMPV6_ECHO_REQUEST = 128;
    private static final int ICMPV6_ECHO_REPLY = 129;
    private static final int ICMPV6_MGM_QUERY = 130;
    private static final int ICMPV6_MGM_REPORT = 131;
    private static final int ICMPV6_MGM_REDUCTION = 132;
    private static final int ICMPV6_NI_QUERY = 139;
    private static final int ICMPV6_NI_REPLY = 140;
    private static final int ICMPV6_MLD2_REPORT = 143;
    private static final int ICMPV6_DHAAD_REQUEST = 144;
    private static final int ICMPV6_DHAAD_REPLY = 145;
    private static final int ICMPV6_MOBILE_PREFIX_SOL = 146;
    private static final int ICMPV6_MOBILE_PREFIX_ADV = 147;
    private static final int ICMPV6_MRDISC_ADV = 151;
    private static final int ICMPV6_MRDISC_SOL = 152;
    private static final int ICMPV6_MSG_MAX = 255;
    private static final int ICMPV6_NOROUTE = 0;
    private static final int ICMPV6_ADM_PROHIBITED = 1;
    private static final int ICMPV6_NOT_NEIGHBOUR = 2;
    private static final int ICMPV6_ADDR_UNREACH = 3;
    private static final int ICMPV6_PORT_UNREACH = 4;
    private static final int ICMPV6_POLICY_FAIL = 5;
    private static final int ICMPV6_REJECT_ROUTE = 6;
    private static final int ICMPV6_EXC_HOPLIMIT = 0;
    private static final int ICMPV6_EXC_FRAGTIME = 1;
    private static final int ICMPV6_HDR_FIELD = 0;
    private static final int ICMPV6_UNK_NEXTHDR = 1;
    private static final int ICMPV6_UNK_OPTION = 2;
    private static final int ICMPV6_HDR_INCOMP = 3;
    private static final int ICMPV6_EXT_ECHO_REQUEST = 160;
    private static final int ICMPV6_EXT_ECHO_REPLY = 161;
    private static final int ICMPV6_FILTER = 1;
    private static final int ICMPV6_FILTER_BLOCK = 1;
    private static final int ICMPV6_FILTER_PASS = 2;
    private static final int ICMPV6_FILTER_BLOCKOTHERS = 3;
    private static final int ICMPV6_FILTER_PASSONLY = 4;
    private static final int MLD2_MODE_IS_INCLUDE = 1;
    private static final int MLD2_MODE_IS_EXCLUDE = 2;
    private static final int MLD2_CHANGE_TO_INCLUDE = 3;
    private static final int MLD2_CHANGE_TO_EXCLUDE = 4;
    private static final int MLD2_ALLOW_NEW_SOURCES = 5;
    private static final int MLD2_BLOCK_OLD_SOURCES = 6;
    private static final int UDP_CORK = 1;
    private static final int UDP_ENCAP = 100;
    private static final int UDP_NO_CHECK6_TX = 101;
    private static final int UDP_NO_CHECK6_RX = 102;
    private static final int UDP_SEGMENT = 103;
    private static final int UDP_GRO = 104;
    private static final int UDP_ENCAP_ESPINUDP_NON_IKE = 1;
    private static final int UDP_ENCAP_ESPINUDP = 2;
    private static final int UDP_ENCAP_L2TPINUDP = 3;
    private static final int UDP_ENCAP_GTP0 = 4;
    private static final int UDP_ENCAP_GTP1U = 5;
    private static final int UDP_ENCAP_RXRPC = 6;
    private static final int TCP_ENCAP_ESPINTCP = 7;
    private static final int TCP_NODELAY = 1;
    private static final int TCP_MAXSEG = 2;
    private static final int TCP_CORK = 3;
    private static final int TCP_KEEPIDLE = 4;
    private static final int TCP_KEEPINTVL = 5;
    private static final int TCP_KEEPCNT = 6;
    private static final int TCP_SYNCNT = 7;
    private static final int TCP_LINGER2 = 8;
    private static final int TCP_DEFER_ACCEPT = 9;
    private static final int TCP_WINDOW_CLAMP = 10;
    private static final int TCP_INFO = 11;
    private static final int TCP_QUICKACK = 12;
    private static final int TCP_CONGESTION = 13;
    private static final int TCP_MD5SIG = 14;
    private static final int TCP_THIN_LINEAR_TIMEOUTS = 16;
    private static final int TCP_THIN_DUPACK = 17;
    private static final int TCP_USER_TIMEOUT = 18;
    private static final int TCP_REPAIR = 19;
    private static final int TCP_REPAIR_QUEUE = 20;
    private static final int TCP_QUEUE_SEQ = 21;
    private static final int TCP_REPAIR_OPTIONS = 22;
    private static final int TCP_FASTOPEN = 23;
    private static final int TCP_TIMESTAMP = 24;
    private static final int TCP_NOTSENT_LOWAT = 25;
    private static final int TCP_CC_INFO = 26;
    private static final int TCP_SAVE_SYN = 27;
    private static final int TCP_SAVED_SYN = 28;
    private static final int TCP_REPAIR_WINDOW = 29;
    private static final int TCP_FASTOPEN_CONNECT = 30;
    private static final int TCP_ULP = 31;
    private static final int TCP_MD5SIG_EXT = 32;
    private static final int TCP_FASTOPEN_KEY = 33;
    private static final int TCP_FASTOPEN_NO_COOKIE = 34;
    private static final int TCP_ZEROCOPY_RECEIVE = 35;
    private static final int TCP_INQ = 36;
    private static final int TCP_TX_DELAY = 37;
    private static final int TCP_AO_ADD_KEY = 38;
    private static final int TCP_AO_DEL_KEY = 39;
    private static final int TCP_AO_INFO = 40;
    private static final int TCP_AO_GET_KEYS = 41;
    private static final int TCP_AO_REPAIR = 42;
    private static final int TCP_IS_MPTCP = 43;
    private static final int TCP_REPAIR_ON = 1;
    private static final int TCP_REPAIR_OFF = 0;
    private static final int TCPI_OPT_TIMESTAMPS = 1;
    private static final int TCPI_OPT_SACK = 2;
    private static final int TCPI_OPT_WSCALE = 4;
    private static final int TCPI_OPT_ECN = 8;
    private static final int TCPI_OPT_ECN_SEEN = 16;
    private static final int TCPI_OPT_SYN_DATA = 32;
    private static final int TCPI_OPT_USEC_TS = 64;
    private static final int TCP_MD5SIG_MAXKEYLEN = 80;
    private static final int TCP_MD5SIG_FLAG_PREFIX = 1;
    private static final int TCP_MD5SIG_FLAG_IFINDEX = 2;
    private static final int TCP_AO_MAXKEYLEN = 80;
    private static final int TCP_RECEIVE_ZEROCOPY_FLAG_TLB_CLEAN_HINT = 1;
    private static final int IP_TOS = 1;
    private static final int IP_TTL = 2;
    private static final int IP_HDRINCL = 3;
    private static final int IP_OPTIONS = 4;
    private static final int IP_ROUTER_ALERT = 5;
    private static final int IP_RECVOPTS = 6;
    private static final int IP_RETOPTS = 7;
    private static final int IP_PKTINFO = 8;
    private static final int IP_PKTOPTIONS = 9;
    private static final int IP_MTU_DISCOVER = 10;
    private static final int IP_RECVERR = 11;
    private static final int IP_RECVTTL = 12;
    private static final int IP_RECVTOS = 13;
    private static final int IP_MTU = 14;
    private static final int IP_FREEBIND = 15;
    private static final int IP_IPSEC_POLICY = 16;
    private static final int IP_XFRM_POLICY = 17;
    private static final int IP_PASSSEC = 18;
    private static final int IP_TRANSPARENT = 19;
    private static final int IP_ORIGDSTADDR = 20;
    private static final int IP_MINTTL = 21;
    private static final int IP_NODEFRAG = 22;
    private static final int IP_CHECKSUM = 23;
    private static final int IP_BIND_ADDRESS_NO_PORT = 24;
    private static final int IP_RECVFRAGSIZE = 25;
    private static final int IP_RECVERR_RFC4884 = 26;
    private static final int IP_PMTUDISC_DONT = 0;
    private static final int IP_PMTUDISC_WANT = 1;
    private static final int IP_PMTUDISC_DO = 2;
    private static final int IP_PMTUDISC_PROBE = 3;
    private static final int IP_PMTUDISC_INTERFACE = 4;
    private static final int IP_PMTUDISC_OMIT = 5;
    private static final int IP_MULTICAST_IF = 32;
    private static final int IP_MULTICAST_TTL = 33;
    private static final int IP_MULTICAST_LOOP = 34;
    private static final int IP_ADD_MEMBERSHIP = 35;
    private static final int IP_DROP_MEMBERSHIP = 36;
    private static final int IP_UNBLOCK_SOURCE = 37;
    private static final int IP_BLOCK_SOURCE = 38;
    private static final int IP_ADD_SOURCE_MEMBERSHIP = 39;
    private static final int IP_DROP_SOURCE_MEMBERSHIP = 40;
    private static final int IP_MSFILTER = 41;
    private static final int MCAST_JOIN_GROUP = 42;
    private static final int MCAST_BLOCK_SOURCE = 43;
    private static final int MCAST_UNBLOCK_SOURCE = 44;
    private static final int MCAST_LEAVE_GROUP = 45;
    private static final int MCAST_JOIN_SOURCE_GROUP = 46;
    private static final int MCAST_LEAVE_SOURCE_GROUP = 47;
    private static final int MCAST_MSFILTER = 48;
    private static final int IP_MULTICAST_ALL = 49;
    private static final int IP_UNICAST_IF = 50;
    private static final int IP_LOCAL_PORT_RANGE = 51;
    private static final int IP_PROTOCOL = 52;
    private static final int MCAST_EXCLUDE = 0;
    private static final int MCAST_INCLUDE = 1;
    private static final int IP_DEFAULT_MULTICAST_TTL = 1;
    private static final int IP_DEFAULT_MULTICAST_LOOP = 1;
    private static final int __SOCK_SIZE__ = 16;
    private static final int IN_CLASSA_NSHIFT = 24;
    private static final int IN_CLASSA_MAX = 128;
    private static final int IN_CLASSB_NSHIFT = 16;
    private static final int IN_CLASSB_MAX = 65536;
    private static final int IN_CLASSC_NSHIFT = 8;
    private static final int IN_CLASSE_NSHIFT = 0;
    private static final int IN_LOOPBACKNET = 127;
    private static final int INADDR_LOOPBACK = 2130706433;
    private static final int _SCHED_H = 1;
    private static final int _BITS_SCHED_H = 1;
    private static final int SCHED_OTHER = 0;
    private static final int SCHED_FIFO = 1;
    private static final int SCHED_RR = 2;
    private static final int _BITS_TYPES_STRUCT_SCHED_PARAM = 1;
    private static final int _BITS_CPU_SET_H = 1;
    private static final int __CPU_SETSIZE = 1024;
    private static final int _SYSCALL_H = 1;
    private static final int __X32_SYSCALL_BIT = 0x40000000;
    private static final int __NR_read = 0;
    private static final int __NR_write = 1;
    private static final int __NR_open = 2;
    private static final int __NR_close = 3;
    private static final int __NR_stat = 4;
    private static final int __NR_fstat = 5;
    private static final int __NR_lstat = 6;
    private static final int __NR_poll = 7;
    private static final int __NR_lseek = 8;
    private static final int __NR_mmap = 9;
    private static final int __NR_mprotect = 10;
    private static final int __NR_munmap = 11;
    private static final int __NR_brk = 12;
    private static final int __NR_rt_sigaction = 13;
    private static final int __NR_rt_sigprocmask = 14;
    private static final int __NR_rt_sigreturn = 15;
    private static final int __NR_ioctl = 16;
    private static final int __NR_pread64 = 17;
    private static final int __NR_pwrite64 = 18;
    private static final int __NR_readv = 19;
    private static final int __NR_writev = 20;
    private static final int __NR_access = 21;
    private static final int __NR_pipe = 22;
    private static final int __NR_select = 23;
    private static final int __NR_sched_yield = 24;
    private static final int __NR_mremap = 25;
    private static final int __NR_msync = 26;
    private static final int __NR_mincore = 27;
    private static final int __NR_madvise = 28;
    private static final int __NR_shmget = 29;
    private static final int __NR_shmat = 30;
    private static final int __NR_shmctl = 31;
    private static final int __NR_dup = 32;
    private static final int __NR_dup2 = 33;
    private static final int __NR_pause = 34;
    private static final int __NR_nanosleep = 35;
    private static final int __NR_getitimer = 36;
    private static final int __NR_alarm = 37;
    private static final int __NR_setitimer = 38;
    private static final int __NR_getpid = 39;
    private static final int __NR_sendfile = 40;
    private static final int __NR_socket = 41;
    private static final int __NR_connect = 42;
    private static final int __NR_accept = 43;
    private static final int __NR_sendto = 44;
    private static final int __NR_recvfrom = 45;
    private static final int __NR_sendmsg = 46;
    private static final int __NR_recvmsg = 47;
    private static final int __NR_shutdown = 48;
    private static final int __NR_bind = 49;
    private static final int __NR_listen = 50;
    private static final int __NR_getsockname = 51;
    private static final int __NR_getpeername = 52;
    private static final int __NR_socketpair = 53;
    private static final int __NR_setsockopt = 54;
    private static final int __NR_getsockopt = 55;
    private static final int __NR_clone = 56;
    private static final int __NR_fork = 57;
    private static final int __NR_vfork = 58;
    private static final int __NR_execve = 59;
    private static final int __NR_exit = 60;
    private static final int __NR_wait4 = 61;
    private static final int __NR_kill = 62;
    private static final int __NR_uname = 63;
    private static final int __NR_semget = 64;
    private static final int __NR_semop = 65;
    private static final int __NR_semctl = 66;
    private static final int __NR_shmdt = 67;
    private static final int __NR_msgget = 68;
    private static final int __NR_msgsnd = 69;
    private static final int __NR_msgrcv = 70;
    private static final int __NR_msgctl = 71;
    private static final int __NR_fcntl = 72;
    private static final int __NR_flock = 73;
    private static final int __NR_fsync = 74;
    private static final int __NR_fdatasync = 75;
    private static final int __NR_truncate = 76;
    private static final int __NR_ftruncate = 77;
    private static final int __NR_getdents = 78;
    private static final int __NR_getcwd = 79;
    private static final int __NR_chdir = 80;
    private static final int __NR_fchdir = 81;
    private static final int __NR_rename = 82;
    private static final int __NR_mkdir = 83;
    private static final int __NR_rmdir = 84;
    private static final int __NR_creat = 85;
    private static final int __NR_link = 86;
    private static final int __NR_unlink = 87;
    private static final int __NR_symlink = 88;
    private static final int __NR_readlink = 89;
    private static final int __NR_chmod = 90;
    private static final int __NR_fchmod = 91;
    private static final int __NR_chown = 92;
    private static final int __NR_fchown = 93;
    private static final int __NR_lchown = 94;
    private static final int __NR_umask = 95;
    private static final int __NR_gettimeofday = 96;
    private static final int __NR_getrlimit = 97;
    private static final int __NR_getrusage = 98;
    private static final int __NR_sysinfo = 99;
    private static final int __NR_times = 100;
    private static final int __NR_ptrace = 101;
    private static final int __NR_getuid = 102;
    private static final int __NR_syslog = 103;
    private static final int __NR_getgid = 104;
    private static final int __NR_setuid = 105;
    private static final int __NR_setgid = 106;
    private static final int __NR_geteuid = 107;
    private static final int __NR_getegid = 108;
    private static final int __NR_setpgid = 109;
    private static final int __NR_getppid = 110;
    private static final int __NR_getpgrp = 111;
    private static final int __NR_setsid = 112;
    private static final int __NR_setreuid = 113;
    private static final int __NR_setregid = 114;
    private static final int __NR_getgroups = 115;
    private static final int __NR_setgroups = 116;
    private static final int __NR_setresuid = 117;
    private static final int __NR_getresuid = 118;
    private static final int __NR_setresgid = 119;
    private static final int __NR_getresgid = 120;
    private static final int __NR_getpgid = 121;
    private static final int __NR_setfsuid = 122;
    private static final int __NR_setfsgid = 123;
    private static final int __NR_getsid = 124;
    private static final int __NR_capget = 125;
    private static final int __NR_capset = 126;
    private static final int __NR_rt_sigpending = 127;
    private static final int __NR_rt_sigtimedwait = 128;
    private static final int __NR_rt_sigqueueinfo = 129;
    private static final int __NR_rt_sigsuspend = 130;
    private static final int __NR_sigaltstack = 131;
    private static final int __NR_utime = 132;
    private static final int __NR_mknod = 133;
    private static final int __NR_uselib = 134;
    private static final int __NR_personality = 135;
    private static final int __NR_ustat = 136;
    private static final int __NR_statfs = 137;
    private static final int __NR_fstatfs = 138;
    private static final int __NR_sysfs = 139;
    private static final int __NR_getpriority = 140;
    private static final int __NR_setpriority = 141;
    private static final int __NR_sched_setparam = 142;
    private static final int __NR_sched_getparam = 143;
    private static final int __NR_sched_setscheduler = 144;
    private static final int __NR_sched_getscheduler = 145;
    private static final int __NR_sched_get_priority_max = 146;
    private static final int __NR_sched_get_priority_min = 147;
    private static final int __NR_sched_rr_get_interval = 148;
    private static final int __NR_mlock = 149;
    private static final int __NR_munlock = 150;
    private static final int __NR_mlockall = 151;
    private static final int __NR_munlockall = 152;
    private static final int __NR_vhangup = 153;
    private static final int __NR_modify_ldt = 154;
    private static final int __NR_pivot_root = 155;
    private static final int __NR__sysctl = 156;
    private static final int __NR_prctl = 157;
    private static final int __NR_arch_prctl = 158;
    private static final int __NR_adjtimex = 159;
    private static final int __NR_setrlimit = 160;
    private static final int __NR_chroot = 161;
    private static final int __NR_sync = 162;
    private static final int __NR_acct = 163;
    private static final int __NR_settimeofday = 164;
    private static final int __NR_mount = 165;
    private static final int __NR_umount2 = 166;
    private static final int __NR_swapon = 167;
    private static final int __NR_swapoff = 168;
    private static final int __NR_reboot = 169;
    private static final int __NR_sethostname = 170;
    private static final int __NR_setdomainname = 171;
    private static final int __NR_iopl = 172;
    private static final int __NR_ioperm = 173;
    private static final int __NR_create_module = 174;
    private static final int __NR_init_module = 175;
    private static final int __NR_delete_module = 176;
    private static final int __NR_get_kernel_syms = 177;
    private static final int __NR_query_module = 178;
    private static final int __NR_quotactl = 179;
    private static final int __NR_nfsservctl = 180;
    private static final int __NR_getpmsg = 181;
    private static final int __NR_putpmsg = 182;
    private static final int __NR_afs_syscall = 183;
    private static final int __NR_tuxcall = 184;
    private static final int __NR_security = 185;
    private static final int __NR_gettid = 186;
    private static final int __NR_readahead = 187;
    private static final int __NR_setxattr = 188;
    private static final int __NR_lsetxattr = 189;
    private static final int __NR_fsetxattr = 190;
    private static final int __NR_getxattr = 191;
    private static final int __NR_lgetxattr = 192;
    private static final int __NR_fgetxattr = 193;
    private static final int __NR_listxattr = 194;
    private static final int __NR_llistxattr = 195;
    private static final int __NR_flistxattr = 196;
    private static final int __NR_removexattr = 197;
    private static final int __NR_lremovexattr = 198;
    private static final int __NR_fremovexattr = 199;
    private static final int __NR_tkill = 200;
    private static final int __NR_time = 201;
    private static final int __NR_futex = 202;
    private static final int __NR_sched_setaffinity = 203;
    private static final int __NR_sched_getaffinity = 204;
    private static final int __NR_set_thread_area = 205;
    private static final int __NR_io_setup = 206;
    private static final int __NR_io_destroy = 207;
    private static final int __NR_io_getevents = 208;
    private static final int __NR_io_submit = 209;
    private static final int __NR_io_cancel = 210;
    private static final int __NR_get_thread_area = 211;
    private static final int __NR_lookup_dcookie = 212;
    private static final int __NR_epoll_create = 213;
    private static final int __NR_epoll_ctl_old = 214;
    private static final int __NR_epoll_wait_old = 215;
    private static final int __NR_remap_file_pages = 216;
    private static final int __NR_getdents64 = 217;
    private static final int __NR_set_tid_address = 218;
    private static final int __NR_restart_syscall = 219;
    private static final int __NR_semtimedop = 220;
    private static final int __NR_fadvise64 = 221;
    private static final int __NR_timer_create = 222;
    private static final int __NR_timer_settime = 223;
    private static final int __NR_timer_gettime = 224;
    private static final int __NR_timer_getoverrun = 225;
    private static final int __NR_timer_delete = 226;
    private static final int __NR_clock_settime = 227;
    private static final int __NR_clock_gettime = 228;
    private static final int __NR_clock_getres = 229;
    private static final int __NR_clock_nanosleep = 230;
    private static final int __NR_exit_group = 231;
    private static final int __NR_epoll_wait = 232;
    private static final int __NR_epoll_ctl = 233;
    private static final int __NR_tgkill = 234;
    private static final int __NR_utimes = 235;
    private static final int __NR_vserver = 236;
    private static final int __NR_mbind = 237;
    private static final int __NR_set_mempolicy = 238;
    private static final int __NR_get_mempolicy = 239;
    private static final int __NR_mq_open = 240;
    private static final int __NR_mq_unlink = 241;
    private static final int __NR_mq_timedsend = 242;
    private static final int __NR_mq_timedreceive = 243;
    private static final int __NR_mq_notify = 244;
    private static final int __NR_mq_getsetattr = 245;
    private static final int __NR_kexec_load = 246;
    private static final int __NR_waitid = 247;
    private static final int __NR_add_key = 248;
    private static final int __NR_request_key = 249;
    private static final int __NR_keyctl = 250;
    private static final int __NR_ioprio_set = 251;
    private static final int __NR_ioprio_get = 252;
    private static final int __NR_inotify_init = 253;
    private static final int __NR_inotify_add_watch = 254;
    private static final int __NR_inotify_rm_watch = 255;
    private static final int __NR_migrate_pages = 256;
    private static final int __NR_openat = 257;
    private static final int __NR_mkdirat = 258;
    private static final int __NR_mknodat = 259;
    private static final int __NR_fchownat = 260;
    private static final int __NR_futimesat = 261;
    private static final int __NR_newfstatat = 262;
    private static final int __NR_unlinkat = 263;
    private static final int __NR_renameat = 264;
    private static final int __NR_linkat = 265;
    private static final int __NR_symlinkat = 266;
    private static final int __NR_readlinkat = 267;
    private static final int __NR_fchmodat = 268;
    private static final int __NR_faccessat = 269;
    private static final int __NR_pselect6 = 270;
    private static final int __NR_ppoll = 271;
    private static final int __NR_unshare = 272;
    private static final int __NR_set_robust_list = 273;
    private static final int __NR_get_robust_list = 274;
    private static final int __NR_splice = 275;
    private static final int __NR_tee = 276;
    private static final int __NR_sync_file_range = 277;
    private static final int __NR_vmsplice = 278;
    private static final int __NR_move_pages = 279;
    private static final int __NR_utimensat = 280;
    private static final int __NR_epoll_pwait = 281;
    private static final int __NR_signalfd = 282;
    private static final int __NR_timerfd_create = 283;
    private static final int __NR_eventfd = 284;
    private static final int __NR_fallocate = 285;
    private static final int __NR_timerfd_settime = 286;
    private static final int __NR_timerfd_gettime = 287;
    private static final int __NR_accept4 = 288;
    private static final int __NR_signalfd4 = 289;
    private static final int __NR_eventfd2 = 290;
    private static final int __NR_epoll_create1 = 291;
    private static final int __NR_dup3 = 292;
    private static final int __NR_pipe2 = 293;
    private static final int __NR_inotify_init1 = 294;
    private static final int __NR_preadv = 295;
    private static final int __NR_pwritev = 296;
    private static final int __NR_rt_tgsigqueueinfo = 297;
    private static final int __NR_perf_event_open = 298;
    private static final int __NR_recvmmsg = 299;
    private static final int __NR_fanotify_init = 300;
    private static final int __NR_fanotify_mark = 301;
    private static final int __NR_prlimit64 = 302;
    private static final int __NR_name_to_handle_at = 303;
    private static final int __NR_open_by_handle_at = 304;
    private static final int __NR_clock_adjtime = 305;
    private static final int __NR_syncfs = 306;
    private static final int __NR_sendmmsg = 307;
    private static final int __NR_setns = 308;
    private static final int __NR_getcpu = 309;
    private static final int __NR_process_vm_readv = 310;
    private static final int __NR_process_vm_writev = 311;
    private static final int __NR_kcmp = 312;
    private static final int __NR_finit_module = 313;
    private static final int __NR_sched_setattr = 314;
    private static final int __NR_sched_getattr = 315;
    private static final int __NR_renameat2 = 316;
    private static final int __NR_seccomp = 317;
    private static final int __NR_getrandom = 318;
    private static final int __NR_memfd_create = 319;
    private static final int __NR_kexec_file_load = 320;
    private static final int __NR_bpf = 321;
    private static final int __NR_execveat = 322;
    private static final int __NR_userfaultfd = 323;
    private static final int __NR_membarrier = 324;
    private static final int __NR_mlock2 = 325;
    private static final int __NR_copy_file_range = 326;
    private static final int __NR_preadv2 = 327;
    private static final int __NR_pwritev2 = 328;
    private static final int __NR_pkey_mprotect = 329;
    private static final int __NR_pkey_alloc = 330;
    private static final int __NR_pkey_free = 331;
    private static final int __NR_statx = 332;
    private static final int __NR_io_pgetevents = 333;
    private static final int __NR_rseq = 334;
    private static final int __NR_uretprobe = 335;
    private static final int __NR_pidfd_send_signal = 424;
    private static final int __NR_io_uring_setup = 425;
    private static final int __NR_io_uring_enter = 426;
    private static final int __NR_io_uring_register = 427;
    private static final int __NR_open_tree = 428;
    private static final int __NR_move_mount = 429;
    private static final int __NR_fsopen = 430;
    private static final int __NR_fsconfig = 431;
    private static final int __NR_fsmount = 432;
    private static final int __NR_fspick = 433;
    private static final int __NR_pidfd_open = 434;
    private static final int __NR_clone3 = 435;
    private static final int __NR_close_range = 436;
    private static final int __NR_openat2 = 437;
    private static final int __NR_pidfd_getfd = 438;
    private static final int __NR_faccessat2 = 439;
    private static final int __NR_process_madvise = 440;
    private static final int __NR_epoll_pwait2 = 441;
    private static final int __NR_mount_setattr = 442;
    private static final int __NR_quotactl_fd = 443;
    private static final int __NR_landlock_create_ruleset = 444;
    private static final int __NR_landlock_add_rule = 445;
    private static final int __NR_landlock_restrict_self = 446;
    private static final int __NR_memfd_secret = 447;
    private static final int __NR_process_mrelease = 448;
    private static final int __NR_futex_waitv = 449;
    private static final int __NR_set_mempolicy_home_node = 450;
    private static final int __NR_cachestat = 451;
    private static final int __NR_fchmodat2 = 452;
    private static final int __NR_map_shadow_stack = 453;
    private static final int __NR_futex_wake = 454;
    private static final int __NR_futex_wait = 455;
    private static final int __NR_futex_requeue = 456;
    private static final int __NR_statmount = 457;
    private static final int __NR_listmount = 458;
    private static final int __NR_lsm_get_self_attr = 459;
    private static final int __NR_lsm_set_self_attr = 460;
    private static final int __NR_lsm_list_modules = 461;
    private static final int __NR_mseal = 462;
    private static final int __NR_setxattrat = 463;
    private static final int __NR_getxattrat = 464;
    private static final int __NR_listxattrat = 465;
    private static final int __NR_removexattrat = 466;
    private static final int __GLIBC_LINUX_VERSION_CODE = 396288;
    public static final ValueLayout.OfByte __s8 = Lib.C_CHAR;
    public static final ValueLayout.OfByte __u8 = Lib.C_CHAR;
    public static final ValueLayout.OfShort __s16 = Lib.C_SHORT;
    public static final ValueLayout.OfShort __u16 = Lib.C_SHORT;
    public static final ValueLayout.OfInt __s32 = Lib.C_INT;
    public static final ValueLayout.OfInt __u32 = Lib.C_INT;
    public static final ValueLayout.OfLong __s64 = Lib.C_LONG_LONG;
    public static final ValueLayout.OfLong __u64 = Lib.C_LONG_LONG;
    public static final ValueLayout.OfInt __kernel_key_t = Lib.C_INT;
    public static final ValueLayout.OfInt __kernel_mqd_t = Lib.C_INT;
    public static final ValueLayout.OfShort __kernel_old_uid_t = Lib.C_SHORT;
    public static final ValueLayout.OfShort __kernel_old_gid_t = Lib.C_SHORT;
    public static final ValueLayout.OfLong __kernel_old_dev_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __kernel_long_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __kernel_ulong_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __kernel_ino_t = Lib.C_LONG;
    public static final ValueLayout.OfInt __kernel_mode_t = Lib.C_INT;
    public static final ValueLayout.OfInt __kernel_pid_t = Lib.C_INT;
    public static final ValueLayout.OfInt __kernel_ipc_pid_t = Lib.C_INT;
    public static final ValueLayout.OfInt __kernel_uid_t = Lib.C_INT;
    public static final ValueLayout.OfInt __kernel_gid_t = Lib.C_INT;
    public static final ValueLayout.OfLong __kernel_suseconds_t = Lib.C_LONG;
    public static final ValueLayout.OfInt __kernel_daddr_t = Lib.C_INT;
    public static final ValueLayout.OfInt __kernel_uid32_t = Lib.C_INT;
    public static final ValueLayout.OfInt __kernel_gid32_t = Lib.C_INT;
    public static final ValueLayout.OfLong __kernel_size_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __kernel_ssize_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __kernel_ptrdiff_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __kernel_off_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __kernel_loff_t = Lib.C_LONG_LONG;
    public static final ValueLayout.OfLong __kernel_old_time_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __kernel_time_t = Lib.C_LONG;
    public static final ValueLayout.OfLong __kernel_time64_t = Lib.C_LONG_LONG;
    public static final ValueLayout.OfLong __kernel_clock_t = Lib.C_LONG;
    public static final ValueLayout.OfInt __kernel_timer_t = Lib.C_INT;
    public static final ValueLayout.OfInt __kernel_clockid_t = Lib.C_INT;
    public static final AddressLayout __kernel_caddr_t = Lib.C_POINTER;
    public static final ValueLayout.OfShort __kernel_uid16_t = Lib.C_SHORT;
    public static final ValueLayout.OfShort __kernel_gid16_t = Lib.C_SHORT;
    public static final ValueLayout.OfShort __le16 = Lib.C_SHORT;
    public static final ValueLayout.OfShort __be16 = Lib.C_SHORT;
    public static final ValueLayout.OfInt __le32 = Lib.C_INT;
    public static final ValueLayout.OfInt __be32 = Lib.C_INT;
    public static final ValueLayout.OfLong __le64 = Lib.C_LONG_LONG;
    public static final ValueLayout.OfLong __be64 = Lib.C_LONG_LONG;
    public static final ValueLayout.OfShort __sum16 = Lib.C_SHORT;
    public static final ValueLayout.OfInt __wsum = Lib.C_INT;
    public static final ValueLayout.OfInt __poll_t = Lib.C_INT;
    private static final int BPF_MAY_GOTO = 0;
    private static final int BPF_REG_0 = 0;
    private static final int BPF_REG_1 = 1;
    private static final int BPF_REG_2 = 2;
    private static final int BPF_REG_3 = 3;
    private static final int BPF_REG_4 = 4;
    private static final int BPF_REG_5 = 5;
    private static final int BPF_REG_6 = 6;
    private static final int BPF_REG_7 = 7;
    private static final int BPF_REG_8 = 8;
    private static final int BPF_REG_9 = 9;
    private static final int BPF_REG_10 = 10;
    private static final int __MAX_BPF_REG = 11;
    private static final int BPF_CGROUP_ITER_ORDER_UNSPEC = 0;
    private static final int BPF_CGROUP_ITER_SELF_ONLY = 1;
    private static final int BPF_CGROUP_ITER_DESCENDANTS_PRE = 2;
    private static final int BPF_CGROUP_ITER_DESCENDANTS_POST = 3;
    private static final int BPF_CGROUP_ITER_ANCESTORS_UP = 4;
    private static final int BPF_MAP_CREATE = 0;
    private static final int BPF_MAP_LOOKUP_ELEM = 1;
    private static final int BPF_MAP_UPDATE_ELEM = 2;
    private static final int BPF_MAP_DELETE_ELEM = 3;
    private static final int BPF_MAP_GET_NEXT_KEY = 4;
    private static final int BPF_PROG_LOAD = 5;
    private static final int BPF_OBJ_PIN = 6;
    private static final int BPF_OBJ_GET = 7;
    private static final int BPF_PROG_ATTACH = 8;
    private static final int BPF_PROG_DETACH = 9;
    private static final int BPF_PROG_TEST_RUN = 10;
    private static final int BPF_PROG_RUN = 10;
    private static final int BPF_PROG_GET_NEXT_ID = 11;
    private static final int BPF_MAP_GET_NEXT_ID = 12;
    private static final int BPF_PROG_GET_FD_BY_ID = 13;
    private static final int BPF_MAP_GET_FD_BY_ID = 14;
    private static final int BPF_OBJ_GET_INFO_BY_FD = 15;
    private static final int BPF_PROG_QUERY = 16;
    private static final int BPF_RAW_TRACEPOINT_OPEN = 17;
    private static final int BPF_BTF_LOAD = 18;
    private static final int BPF_BTF_GET_FD_BY_ID = 19;
    private static final int BPF_TASK_FD_QUERY = 20;
    private static final int BPF_MAP_LOOKUP_AND_DELETE_ELEM = 21;
    private static final int BPF_MAP_FREEZE = 22;
    private static final int BPF_BTF_GET_NEXT_ID = 23;
    private static final int BPF_MAP_LOOKUP_BATCH = 24;
    private static final int BPF_MAP_LOOKUP_AND_DELETE_BATCH = 25;
    private static final int BPF_MAP_UPDATE_BATCH = 26;
    private static final int BPF_MAP_DELETE_BATCH = 27;
    private static final int BPF_LINK_CREATE = 28;
    private static final int BPF_LINK_UPDATE = 29;
    private static final int BPF_LINK_GET_FD_BY_ID = 30;
    private static final int BPF_LINK_GET_NEXT_ID = 31;
    private static final int BPF_ENABLE_STATS = 32;
    private static final int BPF_ITER_CREATE = 33;
    private static final int BPF_LINK_DETACH = 34;
    private static final int BPF_PROG_BIND_MAP = 35;
    private static final int BPF_TOKEN_CREATE = 36;
    private static final int __MAX_BPF_CMD = 37;
    private static final int BPF_MAP_TYPE_UNSPEC = 0;
    private static final int BPF_MAP_TYPE_HASH = 1;
    private static final int BPF_MAP_TYPE_ARRAY = 2;
    private static final int BPF_MAP_TYPE_PROG_ARRAY = 3;
    private static final int BPF_MAP_TYPE_PERF_EVENT_ARRAY = 4;
    private static final int BPF_MAP_TYPE_PERCPU_HASH = 5;
    private static final int BPF_MAP_TYPE_PERCPU_ARRAY = 6;
    private static final int BPF_MAP_TYPE_STACK_TRACE = 7;
    private static final int BPF_MAP_TYPE_CGROUP_ARRAY = 8;
    private static final int BPF_MAP_TYPE_LRU_HASH = 9;
    private static final int BPF_MAP_TYPE_LRU_PERCPU_HASH = 10;
    private static final int BPF_MAP_TYPE_LPM_TRIE = 11;
    private static final int BPF_MAP_TYPE_ARRAY_OF_MAPS = 12;
    private static final int BPF_MAP_TYPE_HASH_OF_MAPS = 13;
    private static final int BPF_MAP_TYPE_DEVMAP = 14;
    private static final int BPF_MAP_TYPE_SOCKMAP = 15;
    private static final int BPF_MAP_TYPE_CPUMAP = 16;
    private static final int BPF_MAP_TYPE_XSKMAP = 17;
    private static final int BPF_MAP_TYPE_SOCKHASH = 18;
    private static final int BPF_MAP_TYPE_CGROUP_STORAGE_DEPRECATED = 19;
    private static final int BPF_MAP_TYPE_CGROUP_STORAGE = 19;
    private static final int BPF_MAP_TYPE_REUSEPORT_SOCKARRAY = 20;
    private static final int BPF_MAP_TYPE_PERCPU_CGROUP_STORAGE_DEPRECATED = 21;
    private static final int BPF_MAP_TYPE_PERCPU_CGROUP_STORAGE = 21;
    private static final int BPF_MAP_TYPE_QUEUE = 22;
    private static final int BPF_MAP_TYPE_STACK = 23;
    private static final int BPF_MAP_TYPE_SK_STORAGE = 24;
    private static final int BPF_MAP_TYPE_DEVMAP_HASH = 25;
    private static final int BPF_MAP_TYPE_STRUCT_OPS = 26;
    private static final int BPF_MAP_TYPE_RINGBUF = 27;
    private static final int BPF_MAP_TYPE_INODE_STORAGE = 28;
    private static final int BPF_MAP_TYPE_TASK_STORAGE = 29;
    private static final int BPF_MAP_TYPE_BLOOM_FILTER = 30;
    private static final int BPF_MAP_TYPE_USER_RINGBUF = 31;
    private static final int BPF_MAP_TYPE_CGRP_STORAGE = 32;
    private static final int BPF_MAP_TYPE_ARENA = 33;
    private static final int __MAX_BPF_MAP_TYPE = 34;
    private static final int BPF_PROG_TYPE_UNSPEC = 0;
    private static final int BPF_PROG_TYPE_SOCKET_FILTER = 1;
    private static final int BPF_PROG_TYPE_KPROBE = 2;
    private static final int BPF_PROG_TYPE_SCHED_CLS = 3;
    private static final int BPF_PROG_TYPE_SCHED_ACT = 4;
    private static final int BPF_PROG_TYPE_TRACEPOINT = 5;
    private static final int BPF_PROG_TYPE_XDP = 6;
    private static final int BPF_PROG_TYPE_PERF_EVENT = 7;
    private static final int BPF_PROG_TYPE_CGROUP_SKB = 8;
    private static final int BPF_PROG_TYPE_CGROUP_SOCK = 9;
    private static final int BPF_PROG_TYPE_LWT_IN = 10;
    private static final int BPF_PROG_TYPE_LWT_OUT = 11;
    private static final int BPF_PROG_TYPE_LWT_XMIT = 12;
    private static final int BPF_PROG_TYPE_SOCK_OPS = 13;
    private static final int BPF_PROG_TYPE_SK_SKB = 14;
    private static final int BPF_PROG_TYPE_CGROUP_DEVICE = 15;
    private static final int BPF_PROG_TYPE_SK_MSG = 16;
    private static final int BPF_PROG_TYPE_RAW_TRACEPOINT = 17;
    private static final int BPF_PROG_TYPE_CGROUP_SOCK_ADDR = 18;
    private static final int BPF_PROG_TYPE_LWT_SEG6LOCAL = 19;
    private static final int BPF_PROG_TYPE_LIRC_MODE2 = 20;
    private static final int BPF_PROG_TYPE_SK_REUSEPORT = 21;
    private static final int BPF_PROG_TYPE_FLOW_DISSECTOR = 22;
    private static final int BPF_PROG_TYPE_CGROUP_SYSCTL = 23;
    private static final int BPF_PROG_TYPE_RAW_TRACEPOINT_WRITABLE = 24;
    private static final int BPF_PROG_TYPE_CGROUP_SOCKOPT = 25;
    private static final int BPF_PROG_TYPE_TRACING = 26;
    private static final int BPF_PROG_TYPE_STRUCT_OPS = 27;
    private static final int BPF_PROG_TYPE_EXT = 28;
    private static final int BPF_PROG_TYPE_LSM = 29;
    private static final int BPF_PROG_TYPE_SK_LOOKUP = 30;
    private static final int BPF_PROG_TYPE_SYSCALL = 31;
    private static final int BPF_PROG_TYPE_NETFILTER = 32;
    private static final int __MAX_BPF_PROG_TYPE = 33;
    private static final int BPF_CGROUP_INET_INGRESS = 0;
    private static final int BPF_CGROUP_INET_EGRESS = 1;
    private static final int BPF_CGROUP_INET_SOCK_CREATE = 2;
    private static final int BPF_CGROUP_SOCK_OPS = 3;
    private static final int BPF_SK_SKB_STREAM_PARSER = 4;
    private static final int BPF_SK_SKB_STREAM_VERDICT = 5;
    private static final int BPF_CGROUP_DEVICE = 6;
    private static final int BPF_SK_MSG_VERDICT = 7;
    private static final int BPF_CGROUP_INET4_BIND = 8;
    private static final int BPF_CGROUP_INET6_BIND = 9;
    private static final int BPF_CGROUP_INET4_CONNECT = 10;
    private static final int BPF_CGROUP_INET6_CONNECT = 11;
    private static final int BPF_CGROUP_INET4_POST_BIND = 12;
    private static final int BPF_CGROUP_INET6_POST_BIND = 13;
    private static final int BPF_CGROUP_UDP4_SENDMSG = 14;
    private static final int BPF_CGROUP_UDP6_SENDMSG = 15;
    private static final int BPF_LIRC_MODE2 = 16;
    private static final int BPF_FLOW_DISSECTOR = 17;
    private static final int BPF_CGROUP_SYSCTL = 18;
    private static final int BPF_CGROUP_UDP4_RECVMSG = 19;
    private static final int BPF_CGROUP_UDP6_RECVMSG = 20;
    private static final int BPF_CGROUP_GETSOCKOPT = 21;
    private static final int BPF_CGROUP_SETSOCKOPT = 22;
    private static final int BPF_TRACE_RAW_TP = 23;
    private static final int BPF_TRACE_FENTRY = 24;
    private static final int BPF_TRACE_FEXIT = 25;
    private static final int BPF_MODIFY_RETURN = 26;
    private static final int BPF_LSM_MAC = 27;
    private static final int BPF_TRACE_ITER = 28;
    private static final int BPF_CGROUP_INET4_GETPEERNAME = 29;
    private static final int BPF_CGROUP_INET6_GETPEERNAME = 30;
    private static final int BPF_CGROUP_INET4_GETSOCKNAME = 31;
    private static final int BPF_CGROUP_INET6_GETSOCKNAME = 32;
    private static final int BPF_XDP_DEVMAP = 33;
    private static final int BPF_CGROUP_INET_SOCK_RELEASE = 34;
    private static final int BPF_XDP_CPUMAP = 35;
    private static final int BPF_SK_LOOKUP = 36;
    private static final int BPF_XDP = 37;
    private static final int BPF_SK_SKB_VERDICT = 38;
    private static final int BPF_SK_REUSEPORT_SELECT = 39;
    private static final int BPF_SK_REUSEPORT_SELECT_OR_MIGRATE = 40;
    private static final int BPF_PERF_EVENT = 41;
    private static final int BPF_TRACE_KPROBE_MULTI = 42;
    private static final int BPF_LSM_CGROUP = 43;
    private static final int BPF_STRUCT_OPS = 44;
    private static final int BPF_NETFILTER = 45;
    private static final int BPF_TCX_INGRESS = 46;
    private static final int BPF_TCX_EGRESS = 47;
    private static final int BPF_TRACE_UPROBE_MULTI = 48;
    private static final int BPF_CGROUP_UNIX_CONNECT = 49;
    private static final int BPF_CGROUP_UNIX_SENDMSG = 50;
    private static final int BPF_CGROUP_UNIX_RECVMSG = 51;
    private static final int BPF_CGROUP_UNIX_GETPEERNAME = 52;
    private static final int BPF_CGROUP_UNIX_GETSOCKNAME = 53;
    private static final int BPF_NETKIT_PRIMARY = 54;
    private static final int BPF_NETKIT_PEER = 55;
    private static final int BPF_TRACE_KPROBE_SESSION = 56;
    private static final int BPF_TRACE_UPROBE_SESSION = 57;
    private static final int __MAX_BPF_ATTACH_TYPE = 58;
    private static final int BPF_LINK_TYPE_UNSPEC = 0;
    private static final int BPF_LINK_TYPE_RAW_TRACEPOINT = 1;
    private static final int BPF_LINK_TYPE_TRACING = 2;
    private static final int BPF_LINK_TYPE_CGROUP = 3;
    private static final int BPF_LINK_TYPE_ITER = 4;
    private static final int BPF_LINK_TYPE_NETNS = 5;
    private static final int BPF_LINK_TYPE_XDP = 6;
    private static final int BPF_LINK_TYPE_PERF_EVENT = 7;
    private static final int BPF_LINK_TYPE_KPROBE_MULTI = 8;
    private static final int BPF_LINK_TYPE_STRUCT_OPS = 9;
    private static final int BPF_LINK_TYPE_NETFILTER = 10;
    private static final int BPF_LINK_TYPE_TCX = 11;
    private static final int BPF_LINK_TYPE_UPROBE_MULTI = 12;
    private static final int BPF_LINK_TYPE_NETKIT = 13;
    private static final int BPF_LINK_TYPE_SOCKMAP = 14;
    private static final int __MAX_BPF_LINK_TYPE = 15;
    private static final int BPF_PERF_EVENT_UNSPEC = 0;
    private static final int BPF_PERF_EVENT_UPROBE = 1;
    private static final int BPF_PERF_EVENT_URETPROBE = 2;
    private static final int BPF_PERF_EVENT_KPROBE = 3;
    private static final int BPF_PERF_EVENT_KRETPROBE = 4;
    private static final int BPF_PERF_EVENT_TRACEPOINT = 5;
    private static final int BPF_PERF_EVENT_EVENT = 6;
    private static final int BPF_F_KPROBE_MULTI_RETURN = 1;
    private static final int BPF_F_UPROBE_MULTI_RETURN = 1;
    private static final int BPF_ADDR_SPACE_CAST = 1;
    private static final int BPF_ANY = 0;
    private static final int BPF_NOEXIST = 1;
    private static final int BPF_EXIST = 2;
    private static final int BPF_F_LOCK = 4;
    private static final int BPF_F_NO_PREALLOC = 1;
    private static final int BPF_F_NO_COMMON_LRU = 2;
    private static final int BPF_F_NUMA_NODE = 4;
    private static final int BPF_F_RDONLY = 8;
    private static final int BPF_F_WRONLY = 16;
    private static final int BPF_F_STACK_BUILD_ID = 32;
    private static final int BPF_F_ZERO_SEED = 64;
    private static final int BPF_F_RDONLY_PROG = 128;
    private static final int BPF_F_WRONLY_PROG = 256;
    private static final int BPF_F_CLONE = 512;
    private static final int BPF_F_MMAPABLE = 1024;
    private static final int BPF_F_PRESERVE_ELEMS = 2048;
    private static final int BPF_F_INNER_MAP = 4096;
    private static final int BPF_F_LINK = 8192;
    private static final int BPF_F_PATH_FD = 16384;
    private static final int BPF_F_VTYPE_BTF_OBJ_FD = 32768;
    private static final int BPF_F_TOKEN_FD = 65536;
    private static final int BPF_F_SEGV_ON_FAULT = 131072;
    private static final int BPF_F_NO_USER_CONV = 262144;
    private static final int BPF_STATS_RUN_TIME = 0;
    private static final int BPF_STACK_BUILD_ID_EMPTY = 0;
    private static final int BPF_STACK_BUILD_ID_VALID = 1;
    private static final int BPF_STACK_BUILD_ID_IP = 2;
    private static final int BPF_FUNC_unspec = 0;
    private static final int BPF_FUNC_map_lookup_elem = 1;
    private static final int BPF_FUNC_map_update_elem = 2;
    private static final int BPF_FUNC_map_delete_elem = 3;
    private static final int BPF_FUNC_probe_read = 4;
    private static final int BPF_FUNC_ktime_get_ns = 5;
    private static final int BPF_FUNC_trace_printk = 6;
    private static final int BPF_FUNC_get_prandom_u32 = 7;
    private static final int BPF_FUNC_get_smp_processor_id = 8;
    private static final int BPF_FUNC_skb_store_bytes = 9;
    private static final int BPF_FUNC_l3_csum_replace = 10;
    private static final int BPF_FUNC_l4_csum_replace = 11;
    private static final int BPF_FUNC_tail_call = 12;
    private static final int BPF_FUNC_clone_redirect = 13;
    private static final int BPF_FUNC_get_current_pid_tgid = 14;
    private static final int BPF_FUNC_get_current_uid_gid = 15;
    private static final int BPF_FUNC_get_current_comm = 16;
    private static final int BPF_FUNC_get_cgroup_classid = 17;
    private static final int BPF_FUNC_skb_vlan_push = 18;
    private static final int BPF_FUNC_skb_vlan_pop = 19;
    private static final int BPF_FUNC_skb_get_tunnel_key = 20;
    private static final int BPF_FUNC_skb_set_tunnel_key = 21;
    private static final int BPF_FUNC_perf_event_read = 22;
    private static final int BPF_FUNC_redirect = 23;
    private static final int BPF_FUNC_get_route_realm = 24;
    private static final int BPF_FUNC_perf_event_output = 25;
    private static final int BPF_FUNC_skb_load_bytes = 26;
    private static final int BPF_FUNC_get_stackid = 27;
    private static final int BPF_FUNC_csum_diff = 28;
    private static final int BPF_FUNC_skb_get_tunnel_opt = 29;
    private static final int BPF_FUNC_skb_set_tunnel_opt = 30;
    private static final int BPF_FUNC_skb_change_proto = 31;
    private static final int BPF_FUNC_skb_change_type = 32;
    private static final int BPF_FUNC_skb_under_cgroup = 33;
    private static final int BPF_FUNC_get_hash_recalc = 34;
    private static final int BPF_FUNC_get_current_task = 35;
    private static final int BPF_FUNC_probe_write_user = 36;
    private static final int BPF_FUNC_current_task_under_cgroup = 37;
    private static final int BPF_FUNC_skb_change_tail = 38;
    private static final int BPF_FUNC_skb_pull_data = 39;
    private static final int BPF_FUNC_csum_update = 40;
    private static final int BPF_FUNC_set_hash_invalid = 41;
    private static final int BPF_FUNC_get_numa_node_id = 42;
    private static final int BPF_FUNC_skb_change_head = 43;
    private static final int BPF_FUNC_xdp_adjust_head = 44;
    private static final int BPF_FUNC_probe_read_str = 45;
    private static final int BPF_FUNC_get_socket_cookie = 46;
    private static final int BPF_FUNC_get_socket_uid = 47;
    private static final int BPF_FUNC_set_hash = 48;

    Lib_3() {
    }

    public static int ENCODING_MANCHESTER() {
        return 5;
    }

    public static int PARITY_DEFAULT() {
        return 0;
    }

    public static int PARITY_NONE() {
        return 1;
    }

    public static int PARITY_CRC16_PR0() {
        return 2;
    }

    public static int PARITY_CRC16_PR1() {
        return 3;
    }

    public static int PARITY_CRC16_PR0_CCITT() {
        return 4;
    }

    public static int PARITY_CRC16_PR1_CCITT() {
        return 5;
    }

    public static int PARITY_CRC32_PR0_CCITT() {
        return 6;
    }

    public static int PARITY_CRC32_PR1_CCITT() {
        return 7;
    }

    public static int LMI_DEFAULT() {
        return 0;
    }

    public static int LMI_NONE() {
        return 1;
    }

    public static int LMI_ANSI() {
        return 2;
    }

    public static int LMI_CCITT() {
        return 3;
    }

    public static int LMI_CISCO() {
        return 4;
    }

    public static int IF_GET_IFACE() {
        return 1;
    }

    public static int IF_GET_PROTO() {
        return 2;
    }

    public static int IF_IFACE_V35() {
        return 4096;
    }

    public static int IF_IFACE_V24() {
        return 4097;
    }

    public static int IF_IFACE_X21() {
        return 4098;
    }

    public static int IF_IFACE_T1() {
        return 4099;
    }

    public static int IF_IFACE_E1() {
        return 4100;
    }

    public static int IF_IFACE_SYNC_SERIAL() {
        return 4101;
    }

    public static int IF_IFACE_X21D() {
        return 4102;
    }

    public static int IF_PROTO_HDLC() {
        return 8192;
    }

    public static int IF_PROTO_PPP() {
        return 8193;
    }

    public static int IF_PROTO_CISCO() {
        return 8194;
    }

    public static int IF_PROTO_FR() {
        return 8195;
    }

    public static int IF_PROTO_FR_ADD_PVC() {
        return 8196;
    }

    public static int IF_PROTO_FR_DEL_PVC() {
        return 8197;
    }

    public static int IF_PROTO_X25() {
        return 8198;
    }

    public static int IF_PROTO_HDLC_ETH() {
        return 8199;
    }

    public static int IF_PROTO_FR_ADD_ETH_PVC() {
        return 8200;
    }

    public static int IF_PROTO_FR_DEL_ETH_PVC() {
        return 8201;
    }

    public static int IF_PROTO_FR_PVC() {
        return 8202;
    }

    public static int IF_PROTO_FR_ETH_PVC() {
        return 8203;
    }

    public static int IF_PROTO_RAW() {
        return 8204;
    }

    public static int IFHWADDRLEN() {
        return 6;
    }

    public static int ICMP_ECHOREPLY() {
        return 0;
    }

    public static int ICMP_DEST_UNREACH() {
        return 3;
    }

    public static int ICMP_SOURCE_QUENCH() {
        return 4;
    }

    public static int ICMP_REDIRECT() {
        return 5;
    }

    public static int ICMP_ECHO() {
        return 8;
    }

    public static int ICMP_TIME_EXCEEDED() {
        return 11;
    }

    public static int ICMP_PARAMETERPROB() {
        return 12;
    }

    public static int ICMP_TIMESTAMP() {
        return 13;
    }

    public static int ICMP_TIMESTAMPREPLY() {
        return 14;
    }

    public static int ICMP_INFO_REQUEST() {
        return 15;
    }

    public static int ICMP_INFO_REPLY() {
        return 16;
    }

    public static int ICMP_ADDRESS() {
        return 17;
    }

    public static int ICMP_ADDRESSREPLY() {
        return 18;
    }

    public static int NR_ICMP_TYPES() {
        return 18;
    }

    public static int ICMP_NET_UNREACH() {
        return 0;
    }

    public static int ICMP_HOST_UNREACH() {
        return 1;
    }

    public static int ICMP_PROT_UNREACH() {
        return 2;
    }

    public static int ICMP_PORT_UNREACH() {
        return 3;
    }

    public static int ICMP_FRAG_NEEDED() {
        return 4;
    }

    public static int ICMP_SR_FAILED() {
        return 5;
    }

    public static int ICMP_NET_UNKNOWN() {
        return 6;
    }

    public static int ICMP_HOST_UNKNOWN() {
        return 7;
    }

    public static int ICMP_HOST_ISOLATED() {
        return 8;
    }

    public static int ICMP_NET_ANO() {
        return 9;
    }

    public static int ICMP_HOST_ANO() {
        return 10;
    }

    public static int ICMP_NET_UNR_TOS() {
        return 11;
    }

    public static int ICMP_HOST_UNR_TOS() {
        return 12;
    }

    public static int ICMP_PKT_FILTERED() {
        return 13;
    }

    public static int ICMP_PREC_VIOLATION() {
        return 14;
    }

    public static int ICMP_PREC_CUTOFF() {
        return 15;
    }

    public static int NR_ICMP_UNREACH() {
        return 15;
    }

    public static int ICMP_REDIR_NET() {
        return 0;
    }

    public static int ICMP_REDIR_HOST() {
        return 1;
    }

    public static int ICMP_REDIR_NETTOS() {
        return 2;
    }

    public static int ICMP_REDIR_HOSTTOS() {
        return 3;
    }

    public static int ICMP_EXC_TTL() {
        return 0;
    }

    public static int ICMP_EXC_FRAGTIME() {
        return 1;
    }

    public static int ICMP_EXT_ECHO() {
        return 42;
    }

    public static int ICMP_EXT_ECHOREPLY() {
        return 43;
    }

    public static int ICMP_EXT_CODE_MAL_QUERY() {
        return 1;
    }

    public static int ICMP_EXT_CODE_NO_IF() {
        return 2;
    }

    public static int ICMP_EXT_CODE_NO_TABLE_ENT() {
        return 3;
    }

    public static int ICMP_EXT_CODE_MULT_IFS() {
        return 4;
    }

    public static int ICMP_EXT_ECHOREPLY_IPV6() {
        return 1;
    }

    public static int ICMP_EXT_ECHO_CTYPE_NAME() {
        return 1;
    }

    public static int ICMP_EXT_ECHO_CTYPE_INDEX() {
        return 2;
    }

    public static int ICMP_EXT_ECHO_CTYPE_ADDR() {
        return 3;
    }

    public static int ICMP_AFI_IP() {
        return 1;
    }

    public static int ICMP_AFI_IP6() {
        return 2;
    }

    public static int ICMP_FILTER() {
        return 1;
    }

    public static int ICMPV6_ROUTER_PREF_LOW() {
        return 3;
    }

    public static int ICMPV6_ROUTER_PREF_MEDIUM() {
        return 0;
    }

    public static int ICMPV6_ROUTER_PREF_HIGH() {
        return 1;
    }

    public static int ICMPV6_ROUTER_PREF_INVALID() {
        return 2;
    }

    public static int ICMPV6_DEST_UNREACH() {
        return 1;
    }

    public static int ICMPV6_PKT_TOOBIG() {
        return 2;
    }

    public static int ICMPV6_TIME_EXCEED() {
        return 3;
    }

    public static int ICMPV6_PARAMPROB() {
        return 4;
    }

    public static int ICMPV6_ERRMSG_MAX() {
        return 127;
    }

    public static int ICMPV6_INFOMSG_MASK() {
        return 128;
    }

    public static int ICMPV6_ECHO_REQUEST() {
        return 128;
    }

    public static int ICMPV6_ECHO_REPLY() {
        return 129;
    }

    public static int ICMPV6_MGM_QUERY() {
        return 130;
    }

    public static int ICMPV6_MGM_REPORT() {
        return 131;
    }

    public static int ICMPV6_MGM_REDUCTION() {
        return 132;
    }

    public static int ICMPV6_NI_QUERY() {
        return 139;
    }

    public static int ICMPV6_NI_REPLY() {
        return 140;
    }

    public static int ICMPV6_MLD2_REPORT() {
        return 143;
    }

    public static int ICMPV6_DHAAD_REQUEST() {
        return 144;
    }

    public static int ICMPV6_DHAAD_REPLY() {
        return 145;
    }

    public static int ICMPV6_MOBILE_PREFIX_SOL() {
        return 146;
    }

    public static int ICMPV6_MOBILE_PREFIX_ADV() {
        return 147;
    }

    public static int ICMPV6_MRDISC_ADV() {
        return 151;
    }

    public static int ICMPV6_MRDISC_SOL() {
        return 152;
    }

    public static int ICMPV6_MSG_MAX() {
        return 255;
    }

    public static int ICMPV6_NOROUTE() {
        return 0;
    }

    public static int ICMPV6_ADM_PROHIBITED() {
        return 1;
    }

    public static int ICMPV6_NOT_NEIGHBOUR() {
        return 2;
    }

    public static int ICMPV6_ADDR_UNREACH() {
        return 3;
    }

    public static int ICMPV6_PORT_UNREACH() {
        return 4;
    }

    public static int ICMPV6_POLICY_FAIL() {
        return 5;
    }

    public static int ICMPV6_REJECT_ROUTE() {
        return 6;
    }

    public static int ICMPV6_EXC_HOPLIMIT() {
        return 0;
    }

    public static int ICMPV6_EXC_FRAGTIME() {
        return 1;
    }

    public static int ICMPV6_HDR_FIELD() {
        return 0;
    }

    public static int ICMPV6_UNK_NEXTHDR() {
        return 1;
    }

    public static int ICMPV6_UNK_OPTION() {
        return 2;
    }

    public static int ICMPV6_HDR_INCOMP() {
        return 3;
    }

    public static int ICMPV6_EXT_ECHO_REQUEST() {
        return 160;
    }

    public static int ICMPV6_EXT_ECHO_REPLY() {
        return 161;
    }

    public static int ICMPV6_FILTER() {
        return 1;
    }

    public static int ICMPV6_FILTER_BLOCK() {
        return 1;
    }

    public static int ICMPV6_FILTER_PASS() {
        return 2;
    }

    public static int ICMPV6_FILTER_BLOCKOTHERS() {
        return 3;
    }

    public static int ICMPV6_FILTER_PASSONLY() {
        return 4;
    }

    public static int MLD2_MODE_IS_INCLUDE() {
        return 1;
    }

    public static int MLD2_MODE_IS_EXCLUDE() {
        return 2;
    }

    public static int MLD2_CHANGE_TO_INCLUDE() {
        return 3;
    }

    public static int MLD2_CHANGE_TO_EXCLUDE() {
        return 4;
    }

    public static int MLD2_ALLOW_NEW_SOURCES() {
        return 5;
    }

    public static int MLD2_BLOCK_OLD_SOURCES() {
        return 6;
    }

    public static int UDP_CORK() {
        return 1;
    }

    public static int UDP_ENCAP() {
        return 100;
    }

    public static int UDP_NO_CHECK6_TX() {
        return 101;
    }

    public static int UDP_NO_CHECK6_RX() {
        return 102;
    }

    public static int UDP_SEGMENT() {
        return 103;
    }

    public static int UDP_GRO() {
        return 104;
    }

    public static int UDP_ENCAP_ESPINUDP_NON_IKE() {
        return 1;
    }

    public static int UDP_ENCAP_ESPINUDP() {
        return 2;
    }

    public static int UDP_ENCAP_L2TPINUDP() {
        return 3;
    }

    public static int UDP_ENCAP_GTP0() {
        return 4;
    }

    public static int UDP_ENCAP_GTP1U() {
        return 5;
    }

    public static int UDP_ENCAP_RXRPC() {
        return 6;
    }

    public static int TCP_ENCAP_ESPINTCP() {
        return 7;
    }

    public static int TCP_NODELAY() {
        return 1;
    }

    public static int TCP_MAXSEG() {
        return 2;
    }

    public static int TCP_CORK() {
        return 3;
    }

    public static int TCP_KEEPIDLE() {
        return 4;
    }

    public static int TCP_KEEPINTVL() {
        return 5;
    }

    public static int TCP_KEEPCNT() {
        return 6;
    }

    public static int TCP_SYNCNT() {
        return 7;
    }

    public static int TCP_LINGER2() {
        return 8;
    }

    public static int TCP_DEFER_ACCEPT() {
        return 9;
    }

    public static int TCP_WINDOW_CLAMP() {
        return 10;
    }

    public static int TCP_INFO() {
        return 11;
    }

    public static int TCP_QUICKACK() {
        return 12;
    }

    public static int TCP_CONGESTION() {
        return 13;
    }

    public static int TCP_MD5SIG() {
        return 14;
    }

    public static int TCP_THIN_LINEAR_TIMEOUTS() {
        return 16;
    }

    public static int TCP_THIN_DUPACK() {
        return 17;
    }

    public static int TCP_USER_TIMEOUT() {
        return 18;
    }

    public static int TCP_REPAIR() {
        return 19;
    }

    public static int TCP_REPAIR_QUEUE() {
        return 20;
    }

    public static int TCP_QUEUE_SEQ() {
        return 21;
    }

    public static int TCP_REPAIR_OPTIONS() {
        return 22;
    }

    public static int TCP_FASTOPEN() {
        return 23;
    }

    public static int TCP_TIMESTAMP() {
        return 24;
    }

    public static int TCP_NOTSENT_LOWAT() {
        return 25;
    }

    public static int TCP_CC_INFO() {
        return 26;
    }

    public static int TCP_SAVE_SYN() {
        return 27;
    }

    public static int TCP_SAVED_SYN() {
        return 28;
    }

    public static int TCP_REPAIR_WINDOW() {
        return 29;
    }

    public static int TCP_FASTOPEN_CONNECT() {
        return 30;
    }

    public static int TCP_ULP() {
        return 31;
    }

    public static int TCP_MD5SIG_EXT() {
        return 32;
    }

    public static int TCP_FASTOPEN_KEY() {
        return 33;
    }

    public static int TCP_FASTOPEN_NO_COOKIE() {
        return 34;
    }

    public static int TCP_ZEROCOPY_RECEIVE() {
        return 35;
    }

    public static int TCP_INQ() {
        return 36;
    }

    public static int TCP_TX_DELAY() {
        return 37;
    }

    public static int TCP_AO_ADD_KEY() {
        return 38;
    }

    public static int TCP_AO_DEL_KEY() {
        return 39;
    }

    public static int TCP_AO_INFO() {
        return 40;
    }

    public static int TCP_AO_GET_KEYS() {
        return 41;
    }

    public static int TCP_AO_REPAIR() {
        return 42;
    }

    public static int TCP_IS_MPTCP() {
        return 43;
    }

    public static int TCP_REPAIR_ON() {
        return 1;
    }

    public static int TCP_REPAIR_OFF() {
        return 0;
    }

    public static int TCPI_OPT_TIMESTAMPS() {
        return 1;
    }

    public static int TCPI_OPT_SACK() {
        return 2;
    }

    public static int TCPI_OPT_WSCALE() {
        return 4;
    }

    public static int TCPI_OPT_ECN() {
        return 8;
    }

    public static int TCPI_OPT_ECN_SEEN() {
        return 16;
    }

    public static int TCPI_OPT_SYN_DATA() {
        return 32;
    }

    public static int TCPI_OPT_USEC_TS() {
        return 64;
    }

    public static int TCP_MD5SIG_MAXKEYLEN() {
        return 80;
    }

    public static int TCP_MD5SIG_FLAG_PREFIX() {
        return 1;
    }

    public static int TCP_MD5SIG_FLAG_IFINDEX() {
        return 2;
    }

    public static int TCP_AO_MAXKEYLEN() {
        return 80;
    }

    public static int TCP_RECEIVE_ZEROCOPY_FLAG_TLB_CLEAN_HINT() {
        return 1;
    }

    public static int IP_TOS() {
        return 1;
    }

    public static int IP_TTL() {
        return 2;
    }

    public static int IP_HDRINCL() {
        return 3;
    }

    public static int IP_OPTIONS() {
        return 4;
    }

    public static int IP_ROUTER_ALERT() {
        return 5;
    }

    public static int IP_RECVOPTS() {
        return 6;
    }

    public static int IP_RETOPTS() {
        return 7;
    }

    public static int IP_PKTINFO() {
        return 8;
    }

    public static int IP_PKTOPTIONS() {
        return 9;
    }

    public static int IP_MTU_DISCOVER() {
        return 10;
    }

    public static int IP_RECVERR() {
        return 11;
    }

    public static int IP_RECVTTL() {
        return 12;
    }

    public static int IP_RECVTOS() {
        return 13;
    }

    public static int IP_MTU() {
        return 14;
    }

    public static int IP_FREEBIND() {
        return 15;
    }

    public static int IP_IPSEC_POLICY() {
        return 16;
    }

    public static int IP_XFRM_POLICY() {
        return 17;
    }

    public static int IP_PASSSEC() {
        return 18;
    }

    public static int IP_TRANSPARENT() {
        return 19;
    }

    public static int IP_ORIGDSTADDR() {
        return 20;
    }

    public static int IP_MINTTL() {
        return 21;
    }

    public static int IP_NODEFRAG() {
        return 22;
    }

    public static int IP_CHECKSUM() {
        return 23;
    }

    public static int IP_BIND_ADDRESS_NO_PORT() {
        return 24;
    }

    public static int IP_RECVFRAGSIZE() {
        return 25;
    }

    public static int IP_RECVERR_RFC4884() {
        return 26;
    }

    public static int IP_PMTUDISC_DONT() {
        return 0;
    }

    public static int IP_PMTUDISC_WANT() {
        return 1;
    }

    public static int IP_PMTUDISC_DO() {
        return 2;
    }

    public static int IP_PMTUDISC_PROBE() {
        return 3;
    }

    public static int IP_PMTUDISC_INTERFACE() {
        return 4;
    }

    public static int IP_PMTUDISC_OMIT() {
        return 5;
    }

    public static int IP_MULTICAST_IF() {
        return 32;
    }

    public static int IP_MULTICAST_TTL() {
        return 33;
    }

    public static int IP_MULTICAST_LOOP() {
        return 34;
    }

    public static int IP_ADD_MEMBERSHIP() {
        return 35;
    }

    public static int IP_DROP_MEMBERSHIP() {
        return 36;
    }

    public static int IP_UNBLOCK_SOURCE() {
        return 37;
    }

    public static int IP_BLOCK_SOURCE() {
        return 38;
    }

    public static int IP_ADD_SOURCE_MEMBERSHIP() {
        return 39;
    }

    public static int IP_DROP_SOURCE_MEMBERSHIP() {
        return 40;
    }

    public static int IP_MSFILTER() {
        return 41;
    }

    public static int MCAST_JOIN_GROUP() {
        return 42;
    }

    public static int MCAST_BLOCK_SOURCE() {
        return 43;
    }

    public static int MCAST_UNBLOCK_SOURCE() {
        return 44;
    }

    public static int MCAST_LEAVE_GROUP() {
        return 45;
    }

    public static int MCAST_JOIN_SOURCE_GROUP() {
        return 46;
    }

    public static int MCAST_LEAVE_SOURCE_GROUP() {
        return 47;
    }

    public static int MCAST_MSFILTER() {
        return 48;
    }

    public static int IP_MULTICAST_ALL() {
        return 49;
    }

    public static int IP_UNICAST_IF() {
        return 50;
    }

    public static int IP_LOCAL_PORT_RANGE() {
        return 51;
    }

    public static int IP_PROTOCOL() {
        return 52;
    }

    public static int MCAST_EXCLUDE() {
        return 0;
    }

    public static int MCAST_INCLUDE() {
        return 1;
    }

    public static int IP_DEFAULT_MULTICAST_TTL() {
        return 1;
    }

    public static int IP_DEFAULT_MULTICAST_LOOP() {
        return 1;
    }

    public static int __SOCK_SIZE__() {
        return 16;
    }

    public static int IN_CLASSA_NSHIFT() {
        return 24;
    }

    public static int IN_CLASSA_MAX() {
        return 128;
    }

    public static int IN_CLASSB_NSHIFT() {
        return 16;
    }

    public static int IN_CLASSB_MAX() {
        return 65536;
    }

    public static int IN_CLASSC_NSHIFT() {
        return 8;
    }

    public static int IN_CLASSE_NSHIFT() {
        return 0;
    }

    public static int IN_LOOPBACKNET() {
        return 127;
    }

    public static int INADDR_LOOPBACK() {
        return 2130706433;
    }

    public static int _SCHED_H() {
        return 1;
    }

    public static int _BITS_SCHED_H() {
        return 1;
    }

    public static int SCHED_OTHER() {
        return 0;
    }

    public static int SCHED_FIFO() {
        return 1;
    }

    public static int SCHED_RR() {
        return 2;
    }

    public static int _BITS_TYPES_STRUCT_SCHED_PARAM() {
        return 1;
    }

    public static int _BITS_CPU_SET_H() {
        return 1;
    }

    public static int __CPU_SETSIZE() {
        return 1024;
    }

    public static int _SYSCALL_H() {
        return 1;
    }

    public static int __X32_SYSCALL_BIT() {
        return 0x40000000;
    }

    public static int __NR_read() {
        return 0;
    }

    public static int __NR_write() {
        return 1;
    }

    public static int __NR_open() {
        return 2;
    }

    public static int __NR_close() {
        return 3;
    }

    public static int __NR_stat() {
        return 4;
    }

    public static int __NR_fstat() {
        return 5;
    }

    public static int __NR_lstat() {
        return 6;
    }

    public static int __NR_poll() {
        return 7;
    }

    public static int __NR_lseek() {
        return 8;
    }

    public static int __NR_mmap() {
        return 9;
    }

    public static int __NR_mprotect() {
        return 10;
    }

    public static int __NR_munmap() {
        return 11;
    }

    public static int __NR_brk() {
        return 12;
    }

    public static int __NR_rt_sigaction() {
        return 13;
    }

    public static int __NR_rt_sigprocmask() {
        return 14;
    }

    public static int __NR_rt_sigreturn() {
        return 15;
    }

    public static int __NR_ioctl() {
        return 16;
    }

    public static int __NR_pread64() {
        return 17;
    }

    public static int __NR_pwrite64() {
        return 18;
    }

    public static int __NR_readv() {
        return 19;
    }

    public static int __NR_writev() {
        return 20;
    }

    public static int __NR_access() {
        return 21;
    }

    public static int __NR_pipe() {
        return 22;
    }

    public static int __NR_select() {
        return 23;
    }

    public static int __NR_sched_yield() {
        return 24;
    }

    public static int __NR_mremap() {
        return 25;
    }

    public static int __NR_msync() {
        return 26;
    }

    public static int __NR_mincore() {
        return 27;
    }

    public static int __NR_madvise() {
        return 28;
    }

    public static int __NR_shmget() {
        return 29;
    }

    public static int __NR_shmat() {
        return 30;
    }

    public static int __NR_shmctl() {
        return 31;
    }

    public static int __NR_dup() {
        return 32;
    }

    public static int __NR_dup2() {
        return 33;
    }

    public static int __NR_pause() {
        return 34;
    }

    public static int __NR_nanosleep() {
        return 35;
    }

    public static int __NR_getitimer() {
        return 36;
    }

    public static int __NR_alarm() {
        return 37;
    }

    public static int __NR_setitimer() {
        return 38;
    }

    public static int __NR_getpid() {
        return 39;
    }

    public static int __NR_sendfile() {
        return 40;
    }

    public static int __NR_socket() {
        return 41;
    }

    public static int __NR_connect() {
        return 42;
    }

    public static int __NR_accept() {
        return 43;
    }

    public static int __NR_sendto() {
        return 44;
    }

    public static int __NR_recvfrom() {
        return 45;
    }

    public static int __NR_sendmsg() {
        return 46;
    }

    public static int __NR_recvmsg() {
        return 47;
    }

    public static int __NR_shutdown() {
        return 48;
    }

    public static int __NR_bind() {
        return 49;
    }

    public static int __NR_listen() {
        return 50;
    }

    public static int __NR_getsockname() {
        return 51;
    }

    public static int __NR_getpeername() {
        return 52;
    }

    public static int __NR_socketpair() {
        return 53;
    }

    public static int __NR_setsockopt() {
        return 54;
    }

    public static int __NR_getsockopt() {
        return 55;
    }

    public static int __NR_clone() {
        return 56;
    }

    public static int __NR_fork() {
        return 57;
    }

    public static int __NR_vfork() {
        return 58;
    }

    public static int __NR_execve() {
        return 59;
    }

    public static int __NR_exit() {
        return 60;
    }

    public static int __NR_wait4() {
        return 61;
    }

    public static int __NR_kill() {
        return 62;
    }

    public static int __NR_uname() {
        return 63;
    }

    public static int __NR_semget() {
        return 64;
    }

    public static int __NR_semop() {
        return 65;
    }

    public static int __NR_semctl() {
        return 66;
    }

    public static int __NR_shmdt() {
        return 67;
    }

    public static int __NR_msgget() {
        return 68;
    }

    public static int __NR_msgsnd() {
        return 69;
    }

    public static int __NR_msgrcv() {
        return 70;
    }

    public static int __NR_msgctl() {
        return 71;
    }

    public static int __NR_fcntl() {
        return 72;
    }

    public static int __NR_flock() {
        return 73;
    }

    public static int __NR_fsync() {
        return 74;
    }

    public static int __NR_fdatasync() {
        return 75;
    }

    public static int __NR_truncate() {
        return 76;
    }

    public static int __NR_ftruncate() {
        return 77;
    }

    public static int __NR_getdents() {
        return 78;
    }

    public static int __NR_getcwd() {
        return 79;
    }

    public static int __NR_chdir() {
        return 80;
    }

    public static int __NR_fchdir() {
        return 81;
    }

    public static int __NR_rename() {
        return 82;
    }

    public static int __NR_mkdir() {
        return 83;
    }

    public static int __NR_rmdir() {
        return 84;
    }

    public static int __NR_creat() {
        return 85;
    }

    public static int __NR_link() {
        return 86;
    }

    public static int __NR_unlink() {
        return 87;
    }

    public static int __NR_symlink() {
        return 88;
    }

    public static int __NR_readlink() {
        return 89;
    }

    public static int __NR_chmod() {
        return 90;
    }

    public static int __NR_fchmod() {
        return 91;
    }

    public static int __NR_chown() {
        return 92;
    }

    public static int __NR_fchown() {
        return 93;
    }

    public static int __NR_lchown() {
        return 94;
    }

    public static int __NR_umask() {
        return 95;
    }

    public static int __NR_gettimeofday() {
        return 96;
    }

    public static int __NR_getrlimit() {
        return 97;
    }

    public static int __NR_getrusage() {
        return 98;
    }

    public static int __NR_sysinfo() {
        return 99;
    }

    public static int __NR_times() {
        return 100;
    }

    public static int __NR_ptrace() {
        return 101;
    }

    public static int __NR_getuid() {
        return 102;
    }

    public static int __NR_syslog() {
        return 103;
    }

    public static int __NR_getgid() {
        return 104;
    }

    public static int __NR_setuid() {
        return 105;
    }

    public static int __NR_setgid() {
        return 106;
    }

    public static int __NR_geteuid() {
        return 107;
    }

    public static int __NR_getegid() {
        return 108;
    }

    public static int __NR_setpgid() {
        return 109;
    }

    public static int __NR_getppid() {
        return 110;
    }

    public static int __NR_getpgrp() {
        return 111;
    }

    public static int __NR_setsid() {
        return 112;
    }

    public static int __NR_setreuid() {
        return 113;
    }

    public static int __NR_setregid() {
        return 114;
    }

    public static int __NR_getgroups() {
        return 115;
    }

    public static int __NR_setgroups() {
        return 116;
    }

    public static int __NR_setresuid() {
        return 117;
    }

    public static int __NR_getresuid() {
        return 118;
    }

    public static int __NR_setresgid() {
        return 119;
    }

    public static int __NR_getresgid() {
        return 120;
    }

    public static int __NR_getpgid() {
        return 121;
    }

    public static int __NR_setfsuid() {
        return 122;
    }

    public static int __NR_setfsgid() {
        return 123;
    }

    public static int __NR_getsid() {
        return 124;
    }

    public static int __NR_capget() {
        return 125;
    }

    public static int __NR_capset() {
        return 126;
    }

    public static int __NR_rt_sigpending() {
        return 127;
    }

    public static int __NR_rt_sigtimedwait() {
        return 128;
    }

    public static int __NR_rt_sigqueueinfo() {
        return 129;
    }

    public static int __NR_rt_sigsuspend() {
        return 130;
    }

    public static int __NR_sigaltstack() {
        return 131;
    }

    public static int __NR_utime() {
        return 132;
    }

    public static int __NR_mknod() {
        return 133;
    }

    public static int __NR_uselib() {
        return 134;
    }

    public static int __NR_personality() {
        return 135;
    }

    public static int __NR_ustat() {
        return 136;
    }

    public static int __NR_statfs() {
        return 137;
    }

    public static int __NR_fstatfs() {
        return 138;
    }

    public static int __NR_sysfs() {
        return 139;
    }

    public static int __NR_getpriority() {
        return 140;
    }

    public static int __NR_setpriority() {
        return 141;
    }

    public static int __NR_sched_setparam() {
        return 142;
    }

    public static int __NR_sched_getparam() {
        return 143;
    }

    public static int __NR_sched_setscheduler() {
        return 144;
    }

    public static int __NR_sched_getscheduler() {
        return 145;
    }

    public static int __NR_sched_get_priority_max() {
        return 146;
    }

    public static int __NR_sched_get_priority_min() {
        return 147;
    }

    public static int __NR_sched_rr_get_interval() {
        return 148;
    }

    public static int __NR_mlock() {
        return 149;
    }

    public static int __NR_munlock() {
        return 150;
    }

    public static int __NR_mlockall() {
        return 151;
    }

    public static int __NR_munlockall() {
        return 152;
    }

    public static int __NR_vhangup() {
        return 153;
    }

    public static int __NR_modify_ldt() {
        return 154;
    }

    public static int __NR_pivot_root() {
        return 155;
    }

    public static int __NR__sysctl() {
        return 156;
    }

    public static int __NR_prctl() {
        return 157;
    }

    public static int __NR_arch_prctl() {
        return 158;
    }

    public static int __NR_adjtimex() {
        return 159;
    }

    public static int __NR_setrlimit() {
        return 160;
    }

    public static int __NR_chroot() {
        return 161;
    }

    public static int __NR_sync() {
        return 162;
    }

    public static int __NR_acct() {
        return 163;
    }

    public static int __NR_settimeofday() {
        return 164;
    }

    public static int __NR_mount() {
        return 165;
    }

    public static int __NR_umount2() {
        return 166;
    }

    public static int __NR_swapon() {
        return 167;
    }

    public static int __NR_swapoff() {
        return 168;
    }

    public static int __NR_reboot() {
        return 169;
    }

    public static int __NR_sethostname() {
        return 170;
    }

    public static int __NR_setdomainname() {
        return 171;
    }

    public static int __NR_iopl() {
        return 172;
    }

    public static int __NR_ioperm() {
        return 173;
    }

    public static int __NR_create_module() {
        return 174;
    }

    public static int __NR_init_module() {
        return 175;
    }

    public static int __NR_delete_module() {
        return 176;
    }

    public static int __NR_get_kernel_syms() {
        return 177;
    }

    public static int __NR_query_module() {
        return 178;
    }

    public static int __NR_quotactl() {
        return 179;
    }

    public static int __NR_nfsservctl() {
        return 180;
    }

    public static int __NR_getpmsg() {
        return 181;
    }

    public static int __NR_putpmsg() {
        return 182;
    }

    public static int __NR_afs_syscall() {
        return 183;
    }

    public static int __NR_tuxcall() {
        return 184;
    }

    public static int __NR_security() {
        return 185;
    }

    public static int __NR_gettid() {
        return 186;
    }

    public static int __NR_readahead() {
        return 187;
    }

    public static int __NR_setxattr() {
        return 188;
    }

    public static int __NR_lsetxattr() {
        return 189;
    }

    public static int __NR_fsetxattr() {
        return 190;
    }

    public static int __NR_getxattr() {
        return 191;
    }

    public static int __NR_lgetxattr() {
        return 192;
    }

    public static int __NR_fgetxattr() {
        return 193;
    }

    public static int __NR_listxattr() {
        return 194;
    }

    public static int __NR_llistxattr() {
        return 195;
    }

    public static int __NR_flistxattr() {
        return 196;
    }

    public static int __NR_removexattr() {
        return 197;
    }

    public static int __NR_lremovexattr() {
        return 198;
    }

    public static int __NR_fremovexattr() {
        return 199;
    }

    public static int __NR_tkill() {
        return 200;
    }

    public static int __NR_time() {
        return 201;
    }

    public static int __NR_futex() {
        return 202;
    }

    public static int __NR_sched_setaffinity() {
        return 203;
    }

    public static int __NR_sched_getaffinity() {
        return 204;
    }

    public static int __NR_set_thread_area() {
        return 205;
    }

    public static int __NR_io_setup() {
        return 206;
    }

    public static int __NR_io_destroy() {
        return 207;
    }

    public static int __NR_io_getevents() {
        return 208;
    }

    public static int __NR_io_submit() {
        return 209;
    }

    public static int __NR_io_cancel() {
        return 210;
    }

    public static int __NR_get_thread_area() {
        return 211;
    }

    public static int __NR_lookup_dcookie() {
        return 212;
    }

    public static int __NR_epoll_create() {
        return 213;
    }

    public static int __NR_epoll_ctl_old() {
        return 214;
    }

    public static int __NR_epoll_wait_old() {
        return 215;
    }

    public static int __NR_remap_file_pages() {
        return 216;
    }

    public static int __NR_getdents64() {
        return 217;
    }

    public static int __NR_set_tid_address() {
        return 218;
    }

    public static int __NR_restart_syscall() {
        return 219;
    }

    public static int __NR_semtimedop() {
        return 220;
    }

    public static int __NR_fadvise64() {
        return 221;
    }

    public static int __NR_timer_create() {
        return 222;
    }

    public static int __NR_timer_settime() {
        return 223;
    }

    public static int __NR_timer_gettime() {
        return 224;
    }

    public static int __NR_timer_getoverrun() {
        return 225;
    }

    public static int __NR_timer_delete() {
        return 226;
    }

    public static int __NR_clock_settime() {
        return 227;
    }

    public static int __NR_clock_gettime() {
        return 228;
    }

    public static int __NR_clock_getres() {
        return 229;
    }

    public static int __NR_clock_nanosleep() {
        return 230;
    }

    public static int __NR_exit_group() {
        return 231;
    }

    public static int __NR_epoll_wait() {
        return 232;
    }

    public static int __NR_epoll_ctl() {
        return 233;
    }

    public static int __NR_tgkill() {
        return 234;
    }

    public static int __NR_utimes() {
        return 235;
    }

    public static int __NR_vserver() {
        return 236;
    }

    public static int __NR_mbind() {
        return 237;
    }

    public static int __NR_set_mempolicy() {
        return 238;
    }

    public static int __NR_get_mempolicy() {
        return 239;
    }

    public static int __NR_mq_open() {
        return 240;
    }

    public static int __NR_mq_unlink() {
        return 241;
    }

    public static int __NR_mq_timedsend() {
        return 242;
    }

    public static int __NR_mq_timedreceive() {
        return 243;
    }

    public static int __NR_mq_notify() {
        return 244;
    }

    public static int __NR_mq_getsetattr() {
        return 245;
    }

    public static int __NR_kexec_load() {
        return 246;
    }

    public static int __NR_waitid() {
        return 247;
    }

    public static int __NR_add_key() {
        return 248;
    }

    public static int __NR_request_key() {
        return 249;
    }

    public static int __NR_keyctl() {
        return 250;
    }

    public static int __NR_ioprio_set() {
        return 251;
    }

    public static int __NR_ioprio_get() {
        return 252;
    }

    public static int __NR_inotify_init() {
        return 253;
    }

    public static int __NR_inotify_add_watch() {
        return 254;
    }

    public static int __NR_inotify_rm_watch() {
        return 255;
    }

    public static int __NR_migrate_pages() {
        return 256;
    }

    public static int __NR_openat() {
        return 257;
    }

    public static int __NR_mkdirat() {
        return 258;
    }

    public static int __NR_mknodat() {
        return 259;
    }

    public static int __NR_fchownat() {
        return 260;
    }

    public static int __NR_futimesat() {
        return 261;
    }

    public static int __NR_newfstatat() {
        return 262;
    }

    public static int __NR_unlinkat() {
        return 263;
    }

    public static int __NR_renameat() {
        return 264;
    }

    public static int __NR_linkat() {
        return 265;
    }

    public static int __NR_symlinkat() {
        return 266;
    }

    public static int __NR_readlinkat() {
        return 267;
    }

    public static int __NR_fchmodat() {
        return 268;
    }

    public static int __NR_faccessat() {
        return 269;
    }

    public static int __NR_pselect6() {
        return 270;
    }

    public static int __NR_ppoll() {
        return 271;
    }

    public static int __NR_unshare() {
        return 272;
    }

    public static int __NR_set_robust_list() {
        return 273;
    }

    public static int __NR_get_robust_list() {
        return 274;
    }

    public static int __NR_splice() {
        return 275;
    }

    public static int __NR_tee() {
        return 276;
    }

    public static int __NR_sync_file_range() {
        return 277;
    }

    public static int __NR_vmsplice() {
        return 278;
    }

    public static int __NR_move_pages() {
        return 279;
    }

    public static int __NR_utimensat() {
        return 280;
    }

    public static int __NR_epoll_pwait() {
        return 281;
    }

    public static int __NR_signalfd() {
        return 282;
    }

    public static int __NR_timerfd_create() {
        return 283;
    }

    public static int __NR_eventfd() {
        return 284;
    }

    public static int __NR_fallocate() {
        return 285;
    }

    public static int __NR_timerfd_settime() {
        return 286;
    }

    public static int __NR_timerfd_gettime() {
        return 287;
    }

    public static int __NR_accept4() {
        return 288;
    }

    public static int __NR_signalfd4() {
        return 289;
    }

    public static int __NR_eventfd2() {
        return 290;
    }

    public static int __NR_epoll_create1() {
        return 291;
    }

    public static int __NR_dup3() {
        return 292;
    }

    public static int __NR_pipe2() {
        return 293;
    }

    public static int __NR_inotify_init1() {
        return 294;
    }

    public static int __NR_preadv() {
        return 295;
    }

    public static int __NR_pwritev() {
        return 296;
    }

    public static int __NR_rt_tgsigqueueinfo() {
        return 297;
    }

    public static int __NR_perf_event_open() {
        return 298;
    }

    public static int __NR_recvmmsg() {
        return 299;
    }

    public static int __NR_fanotify_init() {
        return 300;
    }

    public static int __NR_fanotify_mark() {
        return 301;
    }

    public static int __NR_prlimit64() {
        return 302;
    }

    public static int __NR_name_to_handle_at() {
        return 303;
    }

    public static int __NR_open_by_handle_at() {
        return 304;
    }

    public static int __NR_clock_adjtime() {
        return 305;
    }

    public static int __NR_syncfs() {
        return 306;
    }

    public static int __NR_sendmmsg() {
        return 307;
    }

    public static int __NR_setns() {
        return 308;
    }

    public static int __NR_getcpu() {
        return 309;
    }

    public static int __NR_process_vm_readv() {
        return 310;
    }

    public static int __NR_process_vm_writev() {
        return 311;
    }

    public static int __NR_kcmp() {
        return 312;
    }

    public static int __NR_finit_module() {
        return 313;
    }

    public static int __NR_sched_setattr() {
        return 314;
    }

    public static int __NR_sched_getattr() {
        return 315;
    }

    public static int __NR_renameat2() {
        return 316;
    }

    public static int __NR_seccomp() {
        return 317;
    }

    public static int __NR_getrandom() {
        return 318;
    }

    public static int __NR_memfd_create() {
        return 319;
    }

    public static int __NR_kexec_file_load() {
        return 320;
    }

    public static int __NR_bpf() {
        return 321;
    }

    public static int __NR_execveat() {
        return 322;
    }

    public static int __NR_userfaultfd() {
        return 323;
    }

    public static int __NR_membarrier() {
        return 324;
    }

    public static int __NR_mlock2() {
        return 325;
    }

    public static int __NR_copy_file_range() {
        return 326;
    }

    public static int __NR_preadv2() {
        return 327;
    }

    public static int __NR_pwritev2() {
        return 328;
    }

    public static int __NR_pkey_mprotect() {
        return 329;
    }

    public static int __NR_pkey_alloc() {
        return 330;
    }

    public static int __NR_pkey_free() {
        return 331;
    }

    public static int __NR_statx() {
        return 332;
    }

    public static int __NR_io_pgetevents() {
        return 333;
    }

    public static int __NR_rseq() {
        return 334;
    }

    public static int __NR_uretprobe() {
        return 335;
    }

    public static int __NR_pidfd_send_signal() {
        return 424;
    }

    public static int __NR_io_uring_setup() {
        return 425;
    }

    public static int __NR_io_uring_enter() {
        return 426;
    }

    public static int __NR_io_uring_register() {
        return 427;
    }

    public static int __NR_open_tree() {
        return 428;
    }

    public static int __NR_move_mount() {
        return 429;
    }

    public static int __NR_fsopen() {
        return 430;
    }

    public static int __NR_fsconfig() {
        return 431;
    }

    public static int __NR_fsmount() {
        return 432;
    }

    public static int __NR_fspick() {
        return 433;
    }

    public static int __NR_pidfd_open() {
        return 434;
    }

    public static int __NR_clone3() {
        return 435;
    }

    public static int __NR_close_range() {
        return 436;
    }

    public static int __NR_openat2() {
        return 437;
    }

    public static int __NR_pidfd_getfd() {
        return 438;
    }

    public static int __NR_faccessat2() {
        return 439;
    }

    public static int __NR_process_madvise() {
        return 440;
    }

    public static int __NR_epoll_pwait2() {
        return 441;
    }

    public static int __NR_mount_setattr() {
        return 442;
    }

    public static int __NR_quotactl_fd() {
        return 443;
    }

    public static int __NR_landlock_create_ruleset() {
        return 444;
    }

    public static int __NR_landlock_add_rule() {
        return 445;
    }

    public static int __NR_landlock_restrict_self() {
        return 446;
    }

    public static int __NR_memfd_secret() {
        return 447;
    }

    public static int __NR_process_mrelease() {
        return 448;
    }

    public static int __NR_futex_waitv() {
        return 449;
    }

    public static int __NR_set_mempolicy_home_node() {
        return 450;
    }

    public static int __NR_cachestat() {
        return 451;
    }

    public static int __NR_fchmodat2() {
        return 452;
    }

    public static int __NR_map_shadow_stack() {
        return 453;
    }

    public static int __NR_futex_wake() {
        return 454;
    }

    public static int __NR_futex_wait() {
        return 455;
    }

    public static int __NR_futex_requeue() {
        return 456;
    }

    public static int __NR_statmount() {
        return 457;
    }

    public static int __NR_listmount() {
        return 458;
    }

    public static int __NR_lsm_get_self_attr() {
        return 459;
    }

    public static int __NR_lsm_set_self_attr() {
        return 460;
    }

    public static int __NR_lsm_list_modules() {
        return 461;
    }

    public static int __NR_mseal() {
        return 462;
    }

    public static int __NR_setxattrat() {
        return 463;
    }

    public static int __NR_getxattrat() {
        return 464;
    }

    public static int __NR_listxattrat() {
        return 465;
    }

    public static int __NR_removexattrat() {
        return 466;
    }

    public static int __GLIBC_LINUX_VERSION_CODE() {
        return 396288;
    }

    public static int BPF_MAY_GOTO() {
        return 0;
    }

    public static int BPF_REG_0() {
        return 0;
    }

    public static int BPF_REG_1() {
        return 1;
    }

    public static int BPF_REG_2() {
        return 2;
    }

    public static int BPF_REG_3() {
        return 3;
    }

    public static int BPF_REG_4() {
        return 4;
    }

    public static int BPF_REG_5() {
        return 5;
    }

    public static int BPF_REG_6() {
        return 6;
    }

    public static int BPF_REG_7() {
        return 7;
    }

    public static int BPF_REG_8() {
        return 8;
    }

    public static int BPF_REG_9() {
        return 9;
    }

    public static int BPF_REG_10() {
        return 10;
    }

    public static int __MAX_BPF_REG() {
        return 11;
    }

    public static int BPF_CGROUP_ITER_ORDER_UNSPEC() {
        return 0;
    }

    public static int BPF_CGROUP_ITER_SELF_ONLY() {
        return 1;
    }

    public static int BPF_CGROUP_ITER_DESCENDANTS_PRE() {
        return 2;
    }

    public static int BPF_CGROUP_ITER_DESCENDANTS_POST() {
        return 3;
    }

    public static int BPF_CGROUP_ITER_ANCESTORS_UP() {
        return 4;
    }

    public static int BPF_MAP_CREATE() {
        return 0;
    }

    public static int BPF_MAP_LOOKUP_ELEM() {
        return 1;
    }

    public static int BPF_MAP_UPDATE_ELEM() {
        return 2;
    }

    public static int BPF_MAP_DELETE_ELEM() {
        return 3;
    }

    public static int BPF_MAP_GET_NEXT_KEY() {
        return 4;
    }

    public static int BPF_PROG_LOAD() {
        return 5;
    }

    public static int BPF_OBJ_PIN() {
        return 6;
    }

    public static int BPF_OBJ_GET() {
        return 7;
    }

    public static int BPF_PROG_ATTACH() {
        return 8;
    }

    public static int BPF_PROG_DETACH() {
        return 9;
    }

    public static int BPF_PROG_TEST_RUN() {
        return 10;
    }

    public static int BPF_PROG_RUN() {
        return 10;
    }

    public static int BPF_PROG_GET_NEXT_ID() {
        return 11;
    }

    public static int BPF_MAP_GET_NEXT_ID() {
        return 12;
    }

    public static int BPF_PROG_GET_FD_BY_ID() {
        return 13;
    }

    public static int BPF_MAP_GET_FD_BY_ID() {
        return 14;
    }

    public static int BPF_OBJ_GET_INFO_BY_FD() {
        return 15;
    }

    public static int BPF_PROG_QUERY() {
        return 16;
    }

    public static int BPF_RAW_TRACEPOINT_OPEN() {
        return 17;
    }

    public static int BPF_BTF_LOAD() {
        return 18;
    }

    public static int BPF_BTF_GET_FD_BY_ID() {
        return 19;
    }

    public static int BPF_TASK_FD_QUERY() {
        return 20;
    }

    public static int BPF_MAP_LOOKUP_AND_DELETE_ELEM() {
        return 21;
    }

    public static int BPF_MAP_FREEZE() {
        return 22;
    }

    public static int BPF_BTF_GET_NEXT_ID() {
        return 23;
    }

    public static int BPF_MAP_LOOKUP_BATCH() {
        return 24;
    }

    public static int BPF_MAP_LOOKUP_AND_DELETE_BATCH() {
        return 25;
    }

    public static int BPF_MAP_UPDATE_BATCH() {
        return 26;
    }

    public static int BPF_MAP_DELETE_BATCH() {
        return 27;
    }

    public static int BPF_LINK_CREATE() {
        return 28;
    }

    public static int BPF_LINK_UPDATE() {
        return 29;
    }

    public static int BPF_LINK_GET_FD_BY_ID() {
        return 30;
    }

    public static int BPF_LINK_GET_NEXT_ID() {
        return 31;
    }

    public static int BPF_ENABLE_STATS() {
        return 32;
    }

    public static int BPF_ITER_CREATE() {
        return 33;
    }

    public static int BPF_LINK_DETACH() {
        return 34;
    }

    public static int BPF_PROG_BIND_MAP() {
        return 35;
    }

    public static int BPF_TOKEN_CREATE() {
        return 36;
    }

    public static int __MAX_BPF_CMD() {
        return 37;
    }

    public static int BPF_MAP_TYPE_UNSPEC() {
        return 0;
    }

    public static int BPF_MAP_TYPE_HASH() {
        return 1;
    }

    public static int BPF_MAP_TYPE_ARRAY() {
        return 2;
    }

    public static int BPF_MAP_TYPE_PROG_ARRAY() {
        return 3;
    }

    public static int BPF_MAP_TYPE_PERF_EVENT_ARRAY() {
        return 4;
    }

    public static int BPF_MAP_TYPE_PERCPU_HASH() {
        return 5;
    }

    public static int BPF_MAP_TYPE_PERCPU_ARRAY() {
        return 6;
    }

    public static int BPF_MAP_TYPE_STACK_TRACE() {
        return 7;
    }

    public static int BPF_MAP_TYPE_CGROUP_ARRAY() {
        return 8;
    }

    public static int BPF_MAP_TYPE_LRU_HASH() {
        return 9;
    }

    public static int BPF_MAP_TYPE_LRU_PERCPU_HASH() {
        return 10;
    }

    public static int BPF_MAP_TYPE_LPM_TRIE() {
        return 11;
    }

    public static int BPF_MAP_TYPE_ARRAY_OF_MAPS() {
        return 12;
    }

    public static int BPF_MAP_TYPE_HASH_OF_MAPS() {
        return 13;
    }

    public static int BPF_MAP_TYPE_DEVMAP() {
        return 14;
    }

    public static int BPF_MAP_TYPE_SOCKMAP() {
        return 15;
    }

    public static int BPF_MAP_TYPE_CPUMAP() {
        return 16;
    }

    public static int BPF_MAP_TYPE_XSKMAP() {
        return 17;
    }

    public static int BPF_MAP_TYPE_SOCKHASH() {
        return 18;
    }

    public static int BPF_MAP_TYPE_CGROUP_STORAGE_DEPRECATED() {
        return 19;
    }

    public static int BPF_MAP_TYPE_CGROUP_STORAGE() {
        return 19;
    }

    public static int BPF_MAP_TYPE_REUSEPORT_SOCKARRAY() {
        return 20;
    }

    public static int BPF_MAP_TYPE_PERCPU_CGROUP_STORAGE_DEPRECATED() {
        return 21;
    }

    public static int BPF_MAP_TYPE_PERCPU_CGROUP_STORAGE() {
        return 21;
    }

    public static int BPF_MAP_TYPE_QUEUE() {
        return 22;
    }

    public static int BPF_MAP_TYPE_STACK() {
        return 23;
    }

    public static int BPF_MAP_TYPE_SK_STORAGE() {
        return 24;
    }

    public static int BPF_MAP_TYPE_DEVMAP_HASH() {
        return 25;
    }

    public static int BPF_MAP_TYPE_STRUCT_OPS() {
        return 26;
    }

    public static int BPF_MAP_TYPE_RINGBUF() {
        return 27;
    }

    public static int BPF_MAP_TYPE_INODE_STORAGE() {
        return 28;
    }

    public static int BPF_MAP_TYPE_TASK_STORAGE() {
        return 29;
    }

    public static int BPF_MAP_TYPE_BLOOM_FILTER() {
        return 30;
    }

    public static int BPF_MAP_TYPE_USER_RINGBUF() {
        return 31;
    }

    public static int BPF_MAP_TYPE_CGRP_STORAGE() {
        return 32;
    }

    public static int BPF_MAP_TYPE_ARENA() {
        return 33;
    }

    public static int __MAX_BPF_MAP_TYPE() {
        return 34;
    }

    public static int BPF_PROG_TYPE_UNSPEC() {
        return 0;
    }

    public static int BPF_PROG_TYPE_SOCKET_FILTER() {
        return 1;
    }

    public static int BPF_PROG_TYPE_KPROBE() {
        return 2;
    }

    public static int BPF_PROG_TYPE_SCHED_CLS() {
        return 3;
    }

    public static int BPF_PROG_TYPE_SCHED_ACT() {
        return 4;
    }

    public static int BPF_PROG_TYPE_TRACEPOINT() {
        return 5;
    }

    public static int BPF_PROG_TYPE_XDP() {
        return 6;
    }

    public static int BPF_PROG_TYPE_PERF_EVENT() {
        return 7;
    }

    public static int BPF_PROG_TYPE_CGROUP_SKB() {
        return 8;
    }

    public static int BPF_PROG_TYPE_CGROUP_SOCK() {
        return 9;
    }

    public static int BPF_PROG_TYPE_LWT_IN() {
        return 10;
    }

    public static int BPF_PROG_TYPE_LWT_OUT() {
        return 11;
    }

    public static int BPF_PROG_TYPE_LWT_XMIT() {
        return 12;
    }

    public static int BPF_PROG_TYPE_SOCK_OPS() {
        return 13;
    }

    public static int BPF_PROG_TYPE_SK_SKB() {
        return 14;
    }

    public static int BPF_PROG_TYPE_CGROUP_DEVICE() {
        return 15;
    }

    public static int BPF_PROG_TYPE_SK_MSG() {
        return 16;
    }

    public static int BPF_PROG_TYPE_RAW_TRACEPOINT() {
        return 17;
    }

    public static int BPF_PROG_TYPE_CGROUP_SOCK_ADDR() {
        return 18;
    }

    public static int BPF_PROG_TYPE_LWT_SEG6LOCAL() {
        return 19;
    }

    public static int BPF_PROG_TYPE_LIRC_MODE2() {
        return 20;
    }

    public static int BPF_PROG_TYPE_SK_REUSEPORT() {
        return 21;
    }

    public static int BPF_PROG_TYPE_FLOW_DISSECTOR() {
        return 22;
    }

    public static int BPF_PROG_TYPE_CGROUP_SYSCTL() {
        return 23;
    }

    public static int BPF_PROG_TYPE_RAW_TRACEPOINT_WRITABLE() {
        return 24;
    }

    public static int BPF_PROG_TYPE_CGROUP_SOCKOPT() {
        return 25;
    }

    public static int BPF_PROG_TYPE_TRACING() {
        return 26;
    }

    public static int BPF_PROG_TYPE_STRUCT_OPS() {
        return 27;
    }

    public static int BPF_PROG_TYPE_EXT() {
        return 28;
    }

    public static int BPF_PROG_TYPE_LSM() {
        return 29;
    }

    public static int BPF_PROG_TYPE_SK_LOOKUP() {
        return 30;
    }

    public static int BPF_PROG_TYPE_SYSCALL() {
        return 31;
    }

    public static int BPF_PROG_TYPE_NETFILTER() {
        return 32;
    }

    public static int __MAX_BPF_PROG_TYPE() {
        return 33;
    }

    public static int BPF_CGROUP_INET_INGRESS() {
        return 0;
    }

    public static int BPF_CGROUP_INET_EGRESS() {
        return 1;
    }

    public static int BPF_CGROUP_INET_SOCK_CREATE() {
        return 2;
    }

    public static int BPF_CGROUP_SOCK_OPS() {
        return 3;
    }

    public static int BPF_SK_SKB_STREAM_PARSER() {
        return 4;
    }

    public static int BPF_SK_SKB_STREAM_VERDICT() {
        return 5;
    }

    public static int BPF_CGROUP_DEVICE() {
        return 6;
    }

    public static int BPF_SK_MSG_VERDICT() {
        return 7;
    }

    public static int BPF_CGROUP_INET4_BIND() {
        return 8;
    }

    public static int BPF_CGROUP_INET6_BIND() {
        return 9;
    }

    public static int BPF_CGROUP_INET4_CONNECT() {
        return 10;
    }

    public static int BPF_CGROUP_INET6_CONNECT() {
        return 11;
    }

    public static int BPF_CGROUP_INET4_POST_BIND() {
        return 12;
    }

    public static int BPF_CGROUP_INET6_POST_BIND() {
        return 13;
    }

    public static int BPF_CGROUP_UDP4_SENDMSG() {
        return 14;
    }

    public static int BPF_CGROUP_UDP6_SENDMSG() {
        return 15;
    }

    public static int BPF_LIRC_MODE2() {
        return 16;
    }

    public static int BPF_FLOW_DISSECTOR() {
        return 17;
    }

    public static int BPF_CGROUP_SYSCTL() {
        return 18;
    }

    public static int BPF_CGROUP_UDP4_RECVMSG() {
        return 19;
    }

    public static int BPF_CGROUP_UDP6_RECVMSG() {
        return 20;
    }

    public static int BPF_CGROUP_GETSOCKOPT() {
        return 21;
    }

    public static int BPF_CGROUP_SETSOCKOPT() {
        return 22;
    }

    public static int BPF_TRACE_RAW_TP() {
        return 23;
    }

    public static int BPF_TRACE_FENTRY() {
        return 24;
    }

    public static int BPF_TRACE_FEXIT() {
        return 25;
    }

    public static int BPF_MODIFY_RETURN() {
        return 26;
    }

    public static int BPF_LSM_MAC() {
        return 27;
    }

    public static int BPF_TRACE_ITER() {
        return 28;
    }

    public static int BPF_CGROUP_INET4_GETPEERNAME() {
        return 29;
    }

    public static int BPF_CGROUP_INET6_GETPEERNAME() {
        return 30;
    }

    public static int BPF_CGROUP_INET4_GETSOCKNAME() {
        return 31;
    }

    public static int BPF_CGROUP_INET6_GETSOCKNAME() {
        return 32;
    }

    public static int BPF_XDP_DEVMAP() {
        return 33;
    }

    public static int BPF_CGROUP_INET_SOCK_RELEASE() {
        return 34;
    }

    public static int BPF_XDP_CPUMAP() {
        return 35;
    }

    public static int BPF_SK_LOOKUP() {
        return 36;
    }

    public static int BPF_XDP() {
        return 37;
    }

    public static int BPF_SK_SKB_VERDICT() {
        return 38;
    }

    public static int BPF_SK_REUSEPORT_SELECT() {
        return 39;
    }

    public static int BPF_SK_REUSEPORT_SELECT_OR_MIGRATE() {
        return 40;
    }

    public static int BPF_PERF_EVENT() {
        return 41;
    }

    public static int BPF_TRACE_KPROBE_MULTI() {
        return 42;
    }

    public static int BPF_LSM_CGROUP() {
        return 43;
    }

    public static int BPF_STRUCT_OPS() {
        return 44;
    }

    public static int BPF_NETFILTER() {
        return 45;
    }

    public static int BPF_TCX_INGRESS() {
        return 46;
    }

    public static int BPF_TCX_EGRESS() {
        return 47;
    }

    public static int BPF_TRACE_UPROBE_MULTI() {
        return 48;
    }

    public static int BPF_CGROUP_UNIX_CONNECT() {
        return 49;
    }

    public static int BPF_CGROUP_UNIX_SENDMSG() {
        return 50;
    }

    public static int BPF_CGROUP_UNIX_RECVMSG() {
        return 51;
    }

    public static int BPF_CGROUP_UNIX_GETPEERNAME() {
        return 52;
    }

    public static int BPF_CGROUP_UNIX_GETSOCKNAME() {
        return 53;
    }

    public static int BPF_NETKIT_PRIMARY() {
        return 54;
    }

    public static int BPF_NETKIT_PEER() {
        return 55;
    }

    public static int BPF_TRACE_KPROBE_SESSION() {
        return 56;
    }

    public static int BPF_TRACE_UPROBE_SESSION() {
        return 57;
    }

    public static int __MAX_BPF_ATTACH_TYPE() {
        return 58;
    }

    public static int BPF_LINK_TYPE_UNSPEC() {
        return 0;
    }

    public static int BPF_LINK_TYPE_RAW_TRACEPOINT() {
        return 1;
    }

    public static int BPF_LINK_TYPE_TRACING() {
        return 2;
    }

    public static int BPF_LINK_TYPE_CGROUP() {
        return 3;
    }

    public static int BPF_LINK_TYPE_ITER() {
        return 4;
    }

    public static int BPF_LINK_TYPE_NETNS() {
        return 5;
    }

    public static int BPF_LINK_TYPE_XDP() {
        return 6;
    }

    public static int BPF_LINK_TYPE_PERF_EVENT() {
        return 7;
    }

    public static int BPF_LINK_TYPE_KPROBE_MULTI() {
        return 8;
    }

    public static int BPF_LINK_TYPE_STRUCT_OPS() {
        return 9;
    }

    public static int BPF_LINK_TYPE_NETFILTER() {
        return 10;
    }

    public static int BPF_LINK_TYPE_TCX() {
        return 11;
    }

    public static int BPF_LINK_TYPE_UPROBE_MULTI() {
        return 12;
    }

    public static int BPF_LINK_TYPE_NETKIT() {
        return 13;
    }

    public static int BPF_LINK_TYPE_SOCKMAP() {
        return 14;
    }

    public static int __MAX_BPF_LINK_TYPE() {
        return 15;
    }

    public static int BPF_PERF_EVENT_UNSPEC() {
        return 0;
    }

    public static int BPF_PERF_EVENT_UPROBE() {
        return 1;
    }

    public static int BPF_PERF_EVENT_URETPROBE() {
        return 2;
    }

    public static int BPF_PERF_EVENT_KPROBE() {
        return 3;
    }

    public static int BPF_PERF_EVENT_KRETPROBE() {
        return 4;
    }

    public static int BPF_PERF_EVENT_TRACEPOINT() {
        return 5;
    }

    public static int BPF_PERF_EVENT_EVENT() {
        return 6;
    }

    public static int BPF_F_KPROBE_MULTI_RETURN() {
        return 1;
    }

    public static int BPF_F_UPROBE_MULTI_RETURN() {
        return 1;
    }

    public static int BPF_ADDR_SPACE_CAST() {
        return 1;
    }

    public static int BPF_ANY() {
        return 0;
    }

    public static int BPF_NOEXIST() {
        return 1;
    }

    public static int BPF_EXIST() {
        return 2;
    }

    public static int BPF_F_LOCK() {
        return 4;
    }

    public static int BPF_F_NO_PREALLOC() {
        return 1;
    }

    public static int BPF_F_NO_COMMON_LRU() {
        return 2;
    }

    public static int BPF_F_NUMA_NODE() {
        return 4;
    }

    public static int BPF_F_RDONLY() {
        return 8;
    }

    public static int BPF_F_WRONLY() {
        return 16;
    }

    public static int BPF_F_STACK_BUILD_ID() {
        return 32;
    }

    public static int BPF_F_ZERO_SEED() {
        return 64;
    }

    public static int BPF_F_RDONLY_PROG() {
        return 128;
    }

    public static int BPF_F_WRONLY_PROG() {
        return 256;
    }

    public static int BPF_F_CLONE() {
        return 512;
    }

    public static int BPF_F_MMAPABLE() {
        return 1024;
    }

    public static int BPF_F_PRESERVE_ELEMS() {
        return 2048;
    }

    public static int BPF_F_INNER_MAP() {
        return 4096;
    }

    public static int BPF_F_LINK() {
        return 8192;
    }

    public static int BPF_F_PATH_FD() {
        return 16384;
    }

    public static int BPF_F_VTYPE_BTF_OBJ_FD() {
        return 32768;
    }

    public static int BPF_F_TOKEN_FD() {
        return 65536;
    }

    public static int BPF_F_SEGV_ON_FAULT() {
        return 131072;
    }

    public static int BPF_F_NO_USER_CONV() {
        return 262144;
    }

    public static int BPF_STATS_RUN_TIME() {
        return 0;
    }

    public static int BPF_STACK_BUILD_ID_EMPTY() {
        return 0;
    }

    public static int BPF_STACK_BUILD_ID_VALID() {
        return 1;
    }

    public static int BPF_STACK_BUILD_ID_IP() {
        return 2;
    }

    public static int BPF_FUNC_unspec() {
        return 0;
    }

    public static int BPF_FUNC_map_lookup_elem() {
        return 1;
    }

    public static int BPF_FUNC_map_update_elem() {
        return 2;
    }

    public static int BPF_FUNC_map_delete_elem() {
        return 3;
    }

    public static int BPF_FUNC_probe_read() {
        return 4;
    }

    public static int BPF_FUNC_ktime_get_ns() {
        return 5;
    }

    public static int BPF_FUNC_trace_printk() {
        return 6;
    }

    public static int BPF_FUNC_get_prandom_u32() {
        return 7;
    }

    public static int BPF_FUNC_get_smp_processor_id() {
        return 8;
    }

    public static int BPF_FUNC_skb_store_bytes() {
        return 9;
    }

    public static int BPF_FUNC_l3_csum_replace() {
        return 10;
    }

    public static int BPF_FUNC_l4_csum_replace() {
        return 11;
    }

    public static int BPF_FUNC_tail_call() {
        return 12;
    }

    public static int BPF_FUNC_clone_redirect() {
        return 13;
    }

    public static int BPF_FUNC_get_current_pid_tgid() {
        return 14;
    }

    public static int BPF_FUNC_get_current_uid_gid() {
        return 15;
    }

    public static int BPF_FUNC_get_current_comm() {
        return 16;
    }

    public static int BPF_FUNC_get_cgroup_classid() {
        return 17;
    }

    public static int BPF_FUNC_skb_vlan_push() {
        return 18;
    }

    public static int BPF_FUNC_skb_vlan_pop() {
        return 19;
    }

    public static int BPF_FUNC_skb_get_tunnel_key() {
        return 20;
    }

    public static int BPF_FUNC_skb_set_tunnel_key() {
        return 21;
    }

    public static int BPF_FUNC_perf_event_read() {
        return 22;
    }

    public static int BPF_FUNC_redirect() {
        return 23;
    }

    public static int BPF_FUNC_get_route_realm() {
        return 24;
    }

    public static int BPF_FUNC_perf_event_output() {
        return 25;
    }

    public static int BPF_FUNC_skb_load_bytes() {
        return 26;
    }

    public static int BPF_FUNC_get_stackid() {
        return 27;
    }

    public static int BPF_FUNC_csum_diff() {
        return 28;
    }

    public static int BPF_FUNC_skb_get_tunnel_opt() {
        return 29;
    }

    public static int BPF_FUNC_skb_set_tunnel_opt() {
        return 30;
    }

    public static int BPF_FUNC_skb_change_proto() {
        return 31;
    }

    public static int BPF_FUNC_skb_change_type() {
        return 32;
    }

    public static int BPF_FUNC_skb_under_cgroup() {
        return 33;
    }

    public static int BPF_FUNC_get_hash_recalc() {
        return 34;
    }

    public static int BPF_FUNC_get_current_task() {
        return 35;
    }

    public static int BPF_FUNC_probe_write_user() {
        return 36;
    }

    public static int BPF_FUNC_current_task_under_cgroup() {
        return 37;
    }

    public static int BPF_FUNC_skb_change_tail() {
        return 38;
    }

    public static int BPF_FUNC_skb_pull_data() {
        return 39;
    }

    public static int BPF_FUNC_csum_update() {
        return 40;
    }

    public static int BPF_FUNC_set_hash_invalid() {
        return 41;
    }

    public static int BPF_FUNC_get_numa_node_id() {
        return 42;
    }

    public static int BPF_FUNC_skb_change_head() {
        return 43;
    }

    public static int BPF_FUNC_xdp_adjust_head() {
        return 44;
    }

    public static int BPF_FUNC_probe_read_str() {
        return 45;
    }

    public static int BPF_FUNC_get_socket_cookie() {
        return 46;
    }

    public static int BPF_FUNC_get_socket_uid() {
        return 47;
    }

    public static int BPF_FUNC_set_hash() {
        return 48;
    }
}

